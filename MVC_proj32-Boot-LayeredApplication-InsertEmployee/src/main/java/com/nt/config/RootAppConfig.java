package com.nt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value= {PresistanceAppConfig.class,ServiceAppConfig.class})
public class RootAppConfig {

}
