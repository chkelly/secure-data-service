package org.slc.sli.api.security;

import java.security.Principal;

public class SLIPrincipal implements Principal {
    
    private String id;
    private String name;
    private String state;
    
    @Override
    public String getName() {
        return null;
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getState() {
        return state;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
}
