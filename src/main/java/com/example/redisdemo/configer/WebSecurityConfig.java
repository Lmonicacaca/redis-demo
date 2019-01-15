package com.example.redisdemo.configer;

import com.example.redisdemo.component.MyAccessDeniedHandler;
import com.example.redisdemo.service.impl.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private UserDetailsServiceImpl userDetailsService;
    @Autowired
    private MyAccessDeniedHandler myAccessDeniedHandler;
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
                .exceptionHandling()
                .accessDeniedHandler(myAccessDeniedHandler);
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
