package com.seven;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperties {

    private static final String MSG  =   "world";
    private String mag  =   MSG;

    public static String getMSG() {
        return MSG;
    }
}
