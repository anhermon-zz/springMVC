package org.webapp.mvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "org.webapp.mvc.controller")
public class WebConfig{
	
	@Bean
    public UrlBasedViewResolver jspResolver(){
        System.out.println("in WebConfig jspResolver");
        UrlBasedViewResolver urlBasedViewResolver = new UrlBasedViewResolver();
        urlBasedViewResolver.setViewClass(JstlView.class);
        urlBasedViewResolver.setPrefix("/");
        urlBasedViewResolver.setSuffix(".jsp");
        return urlBasedViewResolver;
    }
}
