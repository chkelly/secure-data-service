/**
 *
 */
package org.slc.sli.ingestion.xml.idref;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

/**
 * @author okrook
 *
 */
public final class SnippetFile implements Closeable {

    private File snippet;
    private RandomAccessFile raf;
    private FileChannel fileChannel;
    private Map<String, SnippetBlock> snippets;

    /**
     * @author okrook
     *
     */
    class SnippetBlock {
        protected long position;
        protected long size;
    }

    private SnippetFile() {
    }

    public static SnippetFile create(String prefix, String suffix, File directory) throws IOException {
        SnippetFile inst = new SnippetFile();

        inst.snippet = File.createTempFile(prefix, suffix, directory);
        inst.raf = new RandomAccessFile(inst.snippet, "rw");
        inst.fileChannel = inst.raf.getChannel();
        inst.fileChannel.position(0);
        inst.snippets = new HashMap<String, SnippetBlock>();

        return inst;
    }

    @Override
    public void close() {
        IOUtils.closeQuietly(raf);

        raf = null;
        fileChannel = null;
    }

    public void delete() {
        close();

        FileUtils.deleteQuietly(snippet);

        snippet = null;
    }

    public boolean contains(String id) {
        return snippets.containsKey(id);
    }

    public InputStream get(String id) throws IOException {
        if (!contains(id) || snippets.get(id).size == 0) {
            return null;
        }

        return new ByteBufferBackedInputStream(fileChannel.map(MapMode.READ_ONLY, snippets.get(id).position, snippets.get(id).size));
    }

    public OutputStream allocateOutputStream(String id) throws IOException {
        SnippetBlock sb = new SnippetBlock();
        sb.position = fileChannel.size();
        snippets.put(id, sb);

        return new NonClosingOutputStream(Channels.newOutputStream(fileChannel));
    }

    public void commitSnippet(String id) throws IOException {
        snippets.get(id).size = fileChannel.size() - snippets.get(id).position;
    }

    public void rollbackSnippet(String id) throws IOException {
        snippets.get(id).size = 0;
    }
}
