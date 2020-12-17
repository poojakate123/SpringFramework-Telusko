package com.pooja1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.pooja1")//it will scan all components in the package
public class AppConfig {
	
	public Samsung getPhone()
	{
		return new Samsung();
	}

}
