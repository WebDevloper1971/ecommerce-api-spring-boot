package com.ecomm.api.config;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.file.Path;
import java.nio.file.Paths;

public class MvcConfig implements WebMvcConfigurer {
    public void addResourceHandlers(@SuppressWarnings("null") ResourceHandlerRegistry registry) {
        Path path = Paths.get("product-images");
        String upload_path = path.toFile().getAbsolutePath();
        registry.addResourceHandler("/product-images/**").addResourceLocations("file:/" + upload_path + "/");
        System.out.println(registry.addResourceHandler("/product-images/**").addResourceLocations("file:/" + upload_path + "/"));


    }
}
