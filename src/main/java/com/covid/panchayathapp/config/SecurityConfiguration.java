package com.covid.panchayathapp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.Http403ForbiddenEntryPoint;

import com.covid.panchayathapp.security.filter.JWTAuthenticationFilter;
import com.covid.panchayathapp.security.filter.JWTAuthorizationFilter;
import com.covid.panchayathapp.service.BaseUseDetailsService;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
	 //ivate final DatabaseUserDetailsService databaseUserDetailsService;
	@Autowired
	private BaseUseDetailsService userDetailsService;
	
	@Autowired
	private PasswordEncoder bCryptPasswordEncoder;
	
	@Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder);
    }
	  
	  @Override
	  protected void configure(HttpSecurity httpSecurity) throws Exception {
		  httpSecurity.exceptionHandling().authenticationEntryPoint(new Http403ForbiddenEntryPoint());
	    httpSecurity
	        .csrf()
	        .disable()
	        .authorizeRequests()
	        .antMatchers("/web/v1/user/register")
	        .permitAll()
	        .anyRequest()
	        .authenticated()
	        .and()
	          .addFilter(new JWTAuthenticationFilter(authenticationManager()))
	          .addFilter(new JWTAuthorizationFilter(authenticationManager()))
              // this disables session creation on Spring Security
              .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);

	    httpSecurity.headers().frameOptions().disable();
	    
	  }

	  
	  


}
