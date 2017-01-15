package com.perry.config;

import java.net.URI;
import java.net.URISyntaxException;

import javax.inject.Inject;
import javax.inject.Qualifier;
import javax.sql.DataSource;

import org.apache.catalina.security.SecurityUtil;
import org.apache.tomcat.util.codec.DecoderException;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class DatabaseConfig {

	@Inject
	private Environment env;

	private HikariDataSource perryDataSource = null;

	@Bean
	public HikariDataSource dataSource() throws URISyntaxException {
		if (perryDataSource == null) {

			URI dbUri = new URI(env.getProperty("DATABASE_URL"));

			String username = dbUri.getUserInfo().split(":")[0];
			String password = dbUri.getUserInfo().split(":")[1];
			String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath()
					+ "?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory";

			HikariConfig config = new HikariConfig();
			config.setJdbcUrl(dbUrl);
			config.setUsername(username);
			config.setPassword(password);

			config.setDriverClassName("org.postgresql.Driver");
			config.setPoolName("Perrys Towing Connection Pool");
			config.setMaximumPoolSize(10);
//			config.setRegisterMbeans(true);

			perryDataSource = new HikariDataSource(config);
			perryDataSource.setConnectionTestQuery("Select 1 from DUAL");
			return perryDataSource;
		} else {
			return perryDataSource;
		}
	}

	@Bean
	public NamedParameterJdbcTemplate namedParameterJdbcTemplate(DataSource dataSource) throws URISyntaxException {
		NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(dataSource);
		return template;
	}
}
