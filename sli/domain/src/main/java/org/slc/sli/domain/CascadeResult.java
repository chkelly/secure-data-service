/*
 * Copyright 2012-2013 inBloom, Inc. and its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * This class represents the result of a step in a database operation that
 * cascades recursively across referring objects.  It is meant to act both
 * as an accumulator (e.g. count of objects, errors encountered, etc.) as
 * well as the composition of the final result of the operation.
 */
package org.slc.sli.domain;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.codehaus.jackson.map.ObjectMapper;

public class CascadeResult {

    public enum Status {
        SUCCESS,
        MAX_OBJECTS_EXCEEDED,
        ACCESS_DENIED,
        DATABASE_ERROR,
        CHILD_DATA_EXISTS,
        MAX_DEPTH_EXCEEDED
    }

    private int nObjects;		    // Number of objects affected
    private int	   depth;			// Furthest depth examined
    private Status status;			// Current/overall status of the operation

    Set<String> deletedIds;         // ids of deleted entities - not set for dryrun

    private String message;          // Status message e.g. error text - null on SUCCESS

    // Used to identify the error object for ACCESS_DENIED and CHILD_DATA_EXISTS status
    private String objectType;
    private String objectId;

    private static final String TREE_KEY_TYPE = "type";
    private static final String TREE_KEY_ID = "id";
    private static final String TREE_KEY_REF = "ref";

    /* Maintain a tree (accumulated during dry run, and only when cascade is enable)
     * of all the objects encountered in the cascade, organized by child referring
     * field.  This can then be used as an exploratory tool, and also for detailed
     * logging of the child data that would be left orphaned if cascade is off, and
     * is causing the CHILD_DATA_EXISTS error.
     *
     * Each node in the tree is an object, represented by a  map with keys (type, id, ref), where type and ID
     * are that of the object, and ref is an optional map, keyed on child referring field of the form "childType.childField",
     * and whose values are lists of nodes representing the child instances.  If a child reference type exists but
     * has no instance data, we still put in an empty list in the map to denote explicitly the lack of children
     * for that referring field.
     *
     */
    private Map<String, Object> idTree;

    public CascadeResult() {
        nObjects = 0;
        depth = 0;
        status = Status.SUCCESS; // Until further notice
        message = null;
        objectType = null;
        objectId = null;
        idTree = null;
    }

    public CascadeResult(int nObjects, int depth, Status status, String message, String objectId, String objectType) {
        this.nObjects = nObjects;
        this.depth = depth;
        this.status = status;
        this.message = message;
        this.objectId = objectId;
        this.objectType = objectType;
    }

    public CascadeResult setFields(int nObjects, int depth, Status status, String message, String objectId, String objectType) {
        this.nObjects = nObjects;
        this.depth = depth;
        this.status = status;
        this.message = message;
        this.objectId = objectId;
        this.objectType = objectType;
        return this;
    }

    public Set<String> getDeletedIds() {
        return deletedIds;
    }

    public void setDeletedIds(Set<String> deletedIds) {
        this.deletedIds = deletedIds;
    }

    // Return true if the operation is a success
	public boolean success() {
		return status == Status.SUCCESS;
	}

    public int getnObjects() {
        return nObjects;
    }

    public void setnObjects(int nObjects) {
        this.nObjects = nObjects;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public void incrementDepth() {
        depth++;
    }

    public int getDepth() {
        return depth;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public Map<String, Object> getIdTree() {
    	return idTree;
    }

    // idTree
    public void initIdTree(String type, String id) {
    	if ( null == idTree ) {
    		idTree = new HashMap<String, Object>();
    	}
    	idTree.put(TREE_KEY_TYPE, type);
    	idTree.put(TREE_KEY_ID, id);
    }

    // Add an entry in the child ref map, initialized with an empty list of child objects
    public List<Map<String, Object>> addRefField(String childRefField) {
    	Map<String, Object> map = (Map<String, Object>) (idTree.get(TREE_KEY_REF));
    	if ( null == map ) {
    		map = new HashMap<String, Object>();
    		idTree.put(TREE_KEY_REF,  map);
    	}
    	List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
    	map.put(childRefField, result);
    	return result;
    }

    public String getIdTreeAsJSON() {
    	return objectToJSON(idTree);
    }

    @Override
	public String toString() {
    	return objectToJSON(this);
    }

    // Convert object to JSON
    private String objectToJSON(Object ob) {
        ObjectMapper mapper = new ObjectMapper();
        StringWriter writer = new StringWriter();
        try {
            mapper.writeValue(writer, ob);
        } catch (Exception e) {
            return "{\"error\": \"JSON conversion error\"";
        }
        return writer.getBuffer().toString();
    }
}
