package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootDemoApplication extends SpringBootServletInitializer  implements EmbeddedServletContainerCustomizer{

	 protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {  
	        return builder.sources(SpringBootDemoApplication.class);  
	    }  
	public static void main(String[] args) {
          SpringApplication.run(SpringBootDemoApplication.class, args);
	}
	@Override
	public void customize(ConfigurableEmbeddedServletContainer arg0) {
		arg0.setContextPath("/SpringBootDemo");
		arg0.setPort(8090);
		
	}
}
      