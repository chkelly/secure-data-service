package org.slc.sli.api.service;

import java.util.Map;

/**
 * Interface for objects used to transform entities between their database representations and their
 * exposed representations on the ReST URI.
 * 
 * The following invarients must hold:
 * --Treatment.toStored(Transformer.toExposed(object)).equals(object)
 * --Treatment.toExposed(Transformer.toStored(object)).equals(object)
 * 
 * @author nbrown
 * 
 */
public interface Treatment {
    
    /**
     * Transform from an exposed entity to a stored entity
     * 
     * @param exposed
     *            The entity in the form it is exposed via ReST
     * @return The entity in the form it is stored in the DB
     */
    public Map<String, Object> toStored(Map<String, Object> exposed, Map<String, String> context);
    
    /**
     * Transform from a stored entity to an exposed entity
     * 
     * @param exposed
     *            The entity in the form it is stored in the DB
     * @return The entity in the form it is exposed via ReST
     */
    public Map<String, Object> toExposed(Map<String, Object> stored, Map<String, String> context);
    
}
