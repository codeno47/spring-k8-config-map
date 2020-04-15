package com.config.demo;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "democonfig")
@Configuration
public class DemoConfiguration {

    public DemoConfiguration() {
    }

    public String getTestMessage() {
        return testMessage;
    }

    public void setTestMessage(String testMessage) {
        this.testMessage = testMessage;
    }

    private String testMessage = "This is a default demo-test message.";


}