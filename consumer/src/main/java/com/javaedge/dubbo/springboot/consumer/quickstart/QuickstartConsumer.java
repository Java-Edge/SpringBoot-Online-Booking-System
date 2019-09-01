package com.javaedge.dubbo.springboot.consumer.quickstart;

import com.alibaba.dubbo.config.annotation.Reference;
import com.javaedge.dubbo.springboot.ServiceAPI;
import org.springframework.stereotype.Component;

/**
 * @author JavaEdge
 */
@Component
public class QuickstartConsumer {

    @Reference(url = "dubbo://localhost:20880")
    ServiceAPI serviceAPI;

    public void sendMessage(String message) {
        System.out.println(serviceAPI.sendMessage(message));
    }
}
