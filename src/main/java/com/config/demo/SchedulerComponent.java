package com.config.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerComponent {

    @Autowired
    DemoConfiguration demoConfiguration;

    @Scheduled(fixedDelay = 5000)
    public void ScheduleRunner(){

        System.out.println("Configuration Value from Map is : "+ demoConfiguration.getTestMessage());
    }
}
