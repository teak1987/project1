package com.java1.java1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;

@SpringBootApplication
public class Java1Application {

	public static void main(String[] args) {
		SpringApplication.run(Java1Application.class, args);
	}
	
	
	@Bean
	public TilesConfigurer tilesConfigurer() {
		TilesConfigurer tilesConfigurer = new TilesConfigurer();
		String[] defs = {"/WEB-INF/tiles.xml"};
		tilesConfigurer.setDefinitions(defs);
		return tilesConfigurer;
	}
	
	@Bean
	public UrlBasedViewResolver tilesViwResolver() {
		UrlBasedViewResolver tilesViwResolver = new   
                                              UrlBasedViewResolver();
		tilesViwResolver.setViewClass(TilesView.class);
		return tilesViwResolver;
	}
	
}
