package com.wairimuianmoon.userservice.services.impl;

import com.wairimuianmoon.userservice.repository.UserDomainRepository;
import com.wairimuianmoon.userservice.services.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    private final UserDomainRepository userDomainRepository;

    public UserServiceImpl(UserDomainRepository userDomainRepository) {
        this.userDomainRepository = userDomainRepository;
    }
}
