package com.server;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().ignoringAntMatchers("/eureka/**");

        super.configure(http);
//        http.csrf().disable();
//        http.authorizeHttpRequests()
//                .anyRequest().authenticated().and().httpBasic();

//        http.authorizeRequests()
//                .anyRequest().permitAll().and().logout().permitAll();
    }
}
