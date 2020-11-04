package com.coldchain.service;

import org.springframework.security.core.Authentication;

public interface IAdminAuthenticationFacade {
    Authentication getAuthentication();
}
