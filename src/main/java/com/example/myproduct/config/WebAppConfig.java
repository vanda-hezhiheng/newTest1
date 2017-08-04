package com.example.myproduct.config;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

// import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
// import com.mangofactory.swagger.models.dto.ApiInfo;
// import com.mangofactory.swagger.plugin.EnableSwagger;
// import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;

@Configuration
// @EnableWebMvc
@EnableSwagger2
// @ComponentScan("com.example.myproduct.config")
public class WebAppConfig {

  @Bean
  public Docket userApi() {
    return new Docket(DocumentationType.SWAGGER_2).groupName("用户").select()
        .apis(RequestHandlerSelectors.basePackage("com.example.myproduct.repository"))
        .paths(PathSelectors.any()).build().apiInfo(userInfo());
  }

  private ApiInfo userInfo() {
    ApiInfo apiInfo = new ApiInfo("用户相关接口",// 大标题
        "用户有关的接口，包括增加删除用户",// 小标题
        "0.1",// 版本
        "成都", new Contact("zjx", "", ""),// 作者
        "swagger url",// 链接显示文字
        ""// 网站链接
    );
    return apiInfo;
  }

  // 上个学习版本的代码，看起来好像用不来
  // private SpringSwaggerConfig springSwaggerConfig;
  //
  // @Autowired
  // public void setSpringSwaggerConfig(SpringSwaggerConfig springSwaggerConfig) {
  // this.springSwaggerConfig = springSwaggerConfig;
  // }
  //
  // @Bean
  // public SwaggerSpringMvcPlugin customImplementation() {
  // return new SwaggerSpringMvcPlugin(this.springSwaggerConfig).apiInfo(apiInfo())
  // .includePatterns(".*pet.*");
  // }
  //
  // private ApiInfo apiInfo(){
  // ApiInfo apiInfo = new ApiInfo(
  // "MyApps API Title",
  // "My Apps API Description",
  // "My Apps API terms of service",
  // "My Apps API Contact Email",
  // "My Apps API Licence Type",
  // "My Apps API License URL"
  // );
  // return apiInfo;
  // }

}
