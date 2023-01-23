package com.example.demo.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;


@Configuration
public class SecurityConfig extends WebSecurityConfiguration{

	protected void configurer(HttpSecurity http) throws Exception {
		http
			.httpBasic()
				.and()
					.authorizeRequests().an
		
	}
}
