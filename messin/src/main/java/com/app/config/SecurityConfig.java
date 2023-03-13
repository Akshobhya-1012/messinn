package com.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


@SuppressWarnings("deprecation")
@EnableWebSecurity
@Configuration
public class SecurityConfig {
	//dep : password encoder
	@Autowired
	private PasswordEncoder enc;
	
//	@Autowired
//	private CustomerServiceImpl customer;
	
//	@Bean
//	public UserDetailsService users() {
//		AuthenticationManager mgr;
//		
//		List<Customer> allCustomer=customer.findAll();
//		for(Customer c:allCustomer) {
//			new Customer(c.getFirstName(), c.getLastName(), c.getEmail(), c.getPassword(), c.getRole());
//		}
//		User customer=new User("Rama",enc.encode("12345"), List.of(new SimpleGrantedAuthority("ROLE_ADMIN")));
//		User admin=new User("Kiran",enc.encode("2345"), List.of(new SimpleGrantedAuthority("ROLE_CUSTOMER")));
//		
//		return new InMemoryUserDetailsManager(customer,admin);
//	}
	@Bean
	public SecurityFilterChain authorizeRequests(HttpSecurity http) throws Exception
	{
		
		http
		.cors().and()
		.csrf().disable()
		.authorizeRequests()
//		.antMatchers(HttpMethod.GET,"/**").permitAll()
		.antMatchers("/mess","/","/mess/getbyid/**").permitAll()
		.antMatchers("/**").permitAll()
//		.antMatchers("/customer").hasRole("CUSTOMER")
//		.antMatchers("/**").hasRole("ADMIN")
//		.antMatchers("/owner").hasRole("OWNER")
		.anyRequest().authenticated()
		.and()
		.formLogin()
		.defaultSuccessUrl("http://localhost:3000");
//		.usernameParameter("email");
		return http.build();
	}
	
	
	
}
