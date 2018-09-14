package Jakub.SpringApp.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private BCryptPasswordEncoder bcp;
	
	@Autowired
	private DataSource ds;
	
	@Value ("${spring.queries.users-query")
	private String usersQuery;
	
	@Value ("${spring.queries.users-query")
	private String rolesQuery;
	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
	}
}
