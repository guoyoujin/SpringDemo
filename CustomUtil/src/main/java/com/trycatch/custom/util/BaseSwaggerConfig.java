package com.trycatch.custom.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class BaseSwaggerConfig {

    /**
     * 显示配置地址：         http://springfox.github.io/springfox/docs/current/
     * @return
     */
    @Bean
    public Docket customImplementation() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.trycatch.service.client.controller.api"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .version("1.0.1")
                .title("同心医联api接口")
                .contact(new Contact("郭友进", "https://github.com/guoyoujin", "guoyoujin@gmail.com"))
                .license("同心医联api接口")
                .licenseUrl("http://localhost:8080/swagger-ui.html")
                .termsOfServiceUrl("http://localhost:8080/v2/api-docs")
                .build();
    }
}
