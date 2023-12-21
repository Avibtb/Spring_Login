package com.avinash.login.security.jwt;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.util.WebUtils;

public class JwtUtils {
    private static  final Logger logger = LoggerFactory.getLogger(JwtUtils.class);

    @Value("${avinash.app.jwtSecret}")
    private String jwtSecret;

    @Value("${avinash.app.jwtExpirationMs}")
    private int jwtExpirationMs;

    @Value("${avinash.app.jwtCookieName}")
    private String jwtCookies;

    public String getJwtFromCookies(HttpServletRequest request){
        Cookie cookie = WebUtils.getCookie(request,jwtCookies);
        if(cookie != null){
            return cookie.getValue();
        }else{
            return null;
        }
    }


}
