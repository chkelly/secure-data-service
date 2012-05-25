package org.slc.sli.api.security.context;

import java.util.Collection;

import org.slc.sli.api.security.context.resolver.AllowAllEntityContextResolver;
import org.slc.sli.api.security.context.resolver.DenyAllContextResolver;
import org.slc.sli.api.security.context.resolver.EntityContextResolver;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Stores context based permission resolvers.
 * Can determine if a principal entity has permission to access a request entity.
 */
@Component
public class ContextResolverStore implements ApplicationContextAware {
    
    private static final DenyAllContextResolver DENY_ALL_CONTEXT_RESOLVER = new DenyAllContextResolver();
    
    private Collection<EntityContextResolver> resolvers;
    
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        resolvers = applicationContext.getBeansOfType(EntityContextResolver.class).values();
    }
    
    /**
     * Locates a resolver that can naviage the security context path from source entity type to
     * target entity type
     * 
     * @param fromEntityType
     * @param toEntityType
     * @return
     * @throws IllegalStateException
     */
    public EntityContextResolver findResolver(String fromEntityType, String toEntityType) throws IllegalStateException {
        
        EntityContextResolver found = null;
        for (EntityContextResolver resolver : resolvers) {
            if (resolver.canResolve(fromEntityType, toEntityType)) {
                found = resolver;
                break;
            }
        }
        
        if (found == null) {
            // TODO enable
            // found = denyAllContextResolver;
            found = new AllowAllEntityContextResolver();
            warn("No path resolver defined for {} -> {}. Returning deny-all resolver.", fromEntityType, toEntityType);
        }
        
        return found;
    }
}
