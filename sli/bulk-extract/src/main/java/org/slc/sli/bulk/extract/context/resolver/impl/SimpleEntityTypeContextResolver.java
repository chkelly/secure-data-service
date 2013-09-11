/**
 *
 */
package org.slc.sli.bulk.extract.context.resolver.impl;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

import org.slc.sli.common.constants.EntityNames;
import org.slc.sli.domain.Entity;
import org.slc.sli.domain.NeutralCriteria;
import org.slc.sli.domain.NeutralQuery;

/**
 * Context Resolver for Simple Entity Type as listed below:
 * LearningObjective
 * LearningStandard
 * CompetencyLevelDescriptor
 * StudentCompetencyObjective
 * Program
 * 
 * @author lchen
 * 
 */
@Component
public class SimpleEntityTypeContextResolver extends ReferrableResolver {
    
    private final Set<String> cache = new HashSet<String>();
    
    /**
     * @param args
     */
    
    private void init() {
        
        synchronized (cache) {
            if (cache.isEmpty()) {
                NeutralQuery query = new NeutralQuery(new NeutralCriteria("type", NeutralCriteria.OPERATOR_EQUAL,
                        "stateEducationAgency", false));
                
                Iterable<Entity> edOrgs = getRepo().findAll(EntityNames.EDUCATION_ORGANIZATION, EntityNames.EDUCATION_ORGANIZATION, query);
                
                for (Entity edOrg : edOrgs) {
                    cache.add(edOrg.getEntityId());
                }
            }
        }
    }
    
    @Override
    public Set<String> findGoverningEdOrgs(Entity entity) {
        if (entity == null) {
            return Collections.emptySet();
        }
        
        if (cache.isEmpty()) {
            init();
        }
        
        return cache;
        
    }
    
    @Override
    protected Set<String> resolve(Entity entity) {
        
        return null;
    }
    
    @Override
    public String getCollection() {
        return EntityNames.EDUCATION_ORGANIZATION;
    }
}
