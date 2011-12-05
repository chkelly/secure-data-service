package org.slc.sli.api.service;

import org.slc.sli.api.representation.EntityBody;


/**
 * Class to validate new or modified entities.
 * 
 * @author nbrown
 * 
 */
public interface Validator {
    /**
     * Determine whether or not the given entity is valid
     * 
     * @param entity
     *            the entity to validate
     * @return true iff the entity is valid
     */
    public boolean validate(EntityBody entity);
}
