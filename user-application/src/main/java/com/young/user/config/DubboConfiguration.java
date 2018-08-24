//package com.young.user.config;
//
//import com.alibaba.dubbo.config.ApplicationConfig;
//import com.alibaba.dubbo.config.RegistryConfig;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * Created by young on 2018/8/24.
// */
//
//@Configuration
//public class DubboConfiguration {
//
//    @Bean
//    public ApplicationConfig applicationConfig() {
//        ApplicationConfig applicationConfig = new ApplicationConfig();
//        applicationConfig.setName("user-provider");
//        return applicationConfig;
//    }
//
//    @Bean
//    public RegistryConfig registryConfig() {
//        RegistryConfig registryConfig = new RegistryConfig();
//        registryConfig.setAddress("zookeeper://172.90.11.205:2181");
//        registryConfig.setClient("curator");
//        registryConfig.setProtocol("dubbo");
//        registryConfig.setPort(30880);
//        return registryConfig;
//    }
//}
