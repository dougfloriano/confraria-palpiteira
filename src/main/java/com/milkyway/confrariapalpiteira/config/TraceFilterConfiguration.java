package com.milkyway.confrariapalpiteira.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.sleuth.Span;
import org.springframework.cloud.sleuth.Tracer;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;

@Log
@RequiredArgsConstructor
@Component
public class TraceFilterConfiguration extends HandlerInterceptorAdapter {

    @Value("${trace.header.name:X-TRACE-ID}")
    private String TRACE_ID;

    private final BeanFactory beanFactory = null;

    private Tracer tracer;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws Exception {
        if (getTracer().isTracing() && StringUtils.isEmpty(response.getHeader(TRACE_ID))) {
            response
                    .setHeader(TRACE_ID, Span.idToHex(getTracer().getCurrentSpan().getTraceId()));
        }
        return true;
    }

    private Tracer getTracer() {
        if (tracer == null) {
            tracer = beanFactory.getBean(Tracer.class);
        }
        return tracer;
    }

}
