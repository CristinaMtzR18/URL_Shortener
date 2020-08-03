package com.maven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class UrlShortenerApplication implements CommandLineRunner {
	
	@Autowired
	private JdbcTemplate template;
	

	public static void main(String[] args) {
		SpringApplication.run(UrlShortenerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		template.execute("DROP TABLE shortener_URL IF EXISTS");
		template.execute("CREATE TABLE shortener_URL(id INTEGER(11) PRIMARY KEY auto_incremente, url_completa VARCHAR(255), url_corta VARCHAR(255),alias(255)");
		
		for (int i=0; i < 3; i++) {
			template.update("insert into shortener_URL(url_completa,url_corta,alias)values('Url 00"+i+"')",i,i);
		}
		
	}

}
