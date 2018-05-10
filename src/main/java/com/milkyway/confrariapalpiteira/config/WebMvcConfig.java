package com.milkyway.confrariapalpiteira.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Primary
@Component
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    @Autowired
    private TraceFilterConfiguration traceFilterConfiguration;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(this.traceFilterConfiguration);
        super.addInterceptors(registry);
    }
}
