package com.example.redisdemo.configer;

import com.example.redisdemo.component.AccessDecisionManagerImpl;
import com.example.redisdemo.component.FilterInvocationSecurityMetadataSourceImpl;
import com.example.redisdemo.service.impl.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.config.annotation.ObjectPostProcessor;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private UserDetailsServiceImpl userDetailsService;
    @Autowired
    private FilterInvocationSecurityMetadataSourceImpl filterInvocationSecurityMetadataSource;
    @Autowired
    private AccessDecisionManager accessDecisionManager;
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                // 过滤掉的路径
                .antMatchers("/","/home").permitAll()
                .anyRequest()
                .access("@rbacPermission.hasPermission(request, authentication)")
                .and()
                .formLogin()
                .loginPage("/login").permitAll()
                .usernameParameter("username")
                .passwordParameter("password")
                .successForwardUrl("/index")
                .and()
                .logout()
                .permitAll()
                .and()
                .csrf()
                .disable()
                .exceptionHandling();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
    }

    public static String encodePassword(String password){
        BCryptPasswordEncoder encoder =new BCryptPasswordEncoder();
        String encode = encoder.encode(password);
        return encode;
    }

    public static void main(String[] args) {
        String s = encodePassword("lilin");
        System.out.println(s);
    }

}
