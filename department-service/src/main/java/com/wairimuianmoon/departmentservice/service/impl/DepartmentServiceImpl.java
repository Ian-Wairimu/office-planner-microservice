package com.wairimuianmoon.departmentservice.service.impl;

import com.wairimuianmoon.departmentservice.repository.DepartmentDomainRepository;
import com.wairimuianmoon.departmentservice.service.DepartmentService;
import org.springframework.stereotype.Service;

@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentDomainRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentDomainRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }
}
