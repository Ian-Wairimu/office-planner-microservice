package com.wairimuianmoon.departmentservice.repository;

import com.wairimuianmoon.departmentservice.entity.DepartmentDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentDomainRepository extends JpaRepository<DepartmentDomain, Long> {
}