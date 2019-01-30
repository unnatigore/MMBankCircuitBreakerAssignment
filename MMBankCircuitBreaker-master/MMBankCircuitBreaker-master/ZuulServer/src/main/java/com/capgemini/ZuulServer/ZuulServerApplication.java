package com.capgemini.ZuulServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.capgemini.ZuulServer.filters.ErrorFilter;
import com.capgemini.ZuulServer.filters.PostFilter;
import com.capgemini.ZuulServer.filters.PreFilter;
import com.capgemini.ZuulServer.filters.RouteFilter;


@EnableZuulProxy
@SpringBootApplication
@EnableDiscoveryClient
public class ZuulServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulServerApplication.class, args);
	}

	/*
	 * @Bean public PreFilter preFilter() { return new PreFilter(); }
	 * 
	 * @Bean public PostFilter postFilter() { return new PostFilter(); }
	 * 
	 * @Bean public ErrorFilter errorFilter() { return new ErrorFilter(); }
	 * 
	 * @Bean public RouteFilter routeFilter() { return new RouteFilter(); }
	 */
}

