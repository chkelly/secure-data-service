package org.slc.sli.api.config;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.slc.sli.dal.repository.EntityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Default implementation of the entity definition store
 * 
 * @author nbrown
 * 
 */
@Component
public class BasicDefinitionStore implements EntityDefinitionStore {
    private static final Logger LOG = LoggerFactory.getLogger(BasicDefinitionStore.class);
    
    private Map<String, EntityDefinition> mapping = new HashMap<String, EntityDefinition>();
    private Map<EntityDefinition, Collection<EntityDefinition>> links = new HashMap<EntityDefinition, Collection<EntityDefinition>>();
    
    @Autowired
    private EntityRepository defaultRepo;
    
    @Override
    public EntityDefinition lookupByResourceName(String resourceName) {
        return mapping.get(resourceName);
    }
    
    @Override
    public Collection<EntityDefinition> getLinked(EntityDefinition defn) {
        return links.get(defn);
    }
    
    @PostConstruct
    @Override
    public void init() {
        EntityDefinition.setDefaultRepo(defaultRepo);
        EntityDefinition student = EntityDefinition.makeEntity("student").exposeAs("students").build();
        addDefinition(student);
        EntityDefinition school = EntityDefinition.makeEntity("school").exposeAs("schools").build();
        addDefinition(school);
        AssociationDefinition studentEnroll = AssociationDefinition.makeAssoc("studentEnrollment")
                .exposeAs("student-enrollments").from(student).to(school).build();
        addAssocDefinition(studentEnroll);
        AssociationDefinition schoolEnroll = AssociationDefinition.makeAssoc("schoolEnrollment")
                .exposeAs("school-enrollments").from(school).to(student).build();
        addAssocDefinition(schoolEnroll);
    }
    
    private void add(EntityDefinition defn) {
        mapping.put(defn.getResourceName(), defn);
    }
    
    private void addDefinition(EntityDefinition defn) {
        LOG.debug("adding definition for {}", defn.getResourceName());
        add(defn);
        links.put(defn, new LinkedHashSet<EntityDefinition>());
    }
    
    private void addAssocDefinition(AssociationDefinition defn) {
        LOG.debug("adding assoc for {}", defn.getResourceName());
        add(defn);
        EntityDefinition sourceEntity = defn.getSourceEntity();
        EntityDefinition targetEntity = defn.getTargetEntity();
        links.put(defn, Arrays.asList(sourceEntity, targetEntity));
        links.get(targetEntity).add(defn);
        links.get(sourceEntity).add(defn);
    }
    
}
