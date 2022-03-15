package com.sha.springbootmicroservice3gateway.security.jwt;

import com.sha.springbootmicroservice3gateway.security.UserPrincipal;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

public interface IJwtProvider {

    Authentication getAuthentication(HttpServletRequest request);

    boolean validateToken(HttpServletRequest request);

    String generateToken(UserPrincipal authentication);
}
