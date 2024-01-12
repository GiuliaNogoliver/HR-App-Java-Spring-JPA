package br.com.AppHR.AppHR;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DataConfiguration {
	@Bean
	DataSource datasource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/AppHR"); //AppHR?serverTimezone=true&serverTimezone=UTC
		dataSource.setUsername("root");
		dataSource.setPassword("162607");
		return dataSource;
		              
	}
}