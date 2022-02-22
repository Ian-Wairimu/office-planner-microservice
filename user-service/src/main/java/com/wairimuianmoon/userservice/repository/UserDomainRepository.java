package com.wairimuianmoon.userservice.repository;

import com.wairimuianmoon.userservice.entity.UserDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDomainRepository extends JpaRepository<UserDomain, Long> {

}