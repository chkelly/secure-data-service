package org.slc.sli.api.service;

import org.slc.sli.domain.Student;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

/**
 * A fake service that is secured with RBAC.
 * 
 * @author Sean Melody <smelody@wgen.net>
 * 
 */

@Service
public interface SecureFakeService {
    
    // @PreAuthorize("hasRole('student') and (#student.studentId == principal.student.id)")
    @PreAuthorize("hasPermission(#student, 'WRITE') ")
    public void foo(Student student);
    
}
