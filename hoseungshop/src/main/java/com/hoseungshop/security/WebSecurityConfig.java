package com.hoseungshop.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	

		/*
	    * 스프링 시큐리티 룰을 무시하게 하는 Url 규칙.
	    */
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring()
	    	.antMatchers(	    		
	    		"/css/**",
	   	    	"/fonts/**",
	   	    	"/img/**",
	   	        "/img/*",
	   	        "/js/*",
	   	        "/js/*/*",
	   	        "/lib/**",
	   	        "/upload/**",
	   	        "/sass/**",
	   	        "/Source/**",
	   	        "/error_check.html");
	}
	   
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
				.antMatchers("/**", "/login").permitAll()
				.anyRequest().authenticated()
				.and()
			.csrf()
				.disable()
			.formLogin()
				.loginPage("/login")
				.loginProcessingUrl("/doLogin")
				.usernameParameter("username")
				.passwordParameter("password")
				.successHandler(new MyLoginSuccessHandler())
//				.permitAll()
				.and()
			.logout()
				.logoutUrl("/doLogout")
				.logoutSuccessUrl("/");
//				.permitAll();
	}
	

}