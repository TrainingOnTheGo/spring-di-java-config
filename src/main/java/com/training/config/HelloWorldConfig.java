package com.training.config;

import org.springframework.context.annotation.*;

import com.training.model.HelloWorld;

@Configuration
public class HelloWorldConfig {
   @Bean 
   public HelloWorld helloWorld(){
      return new HelloWorld();
   }
}
