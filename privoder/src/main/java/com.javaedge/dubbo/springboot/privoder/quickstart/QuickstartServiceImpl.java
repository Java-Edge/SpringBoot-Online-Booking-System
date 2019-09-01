package com.javaedge.dubbo.springboot.privoder.quickstart;

import com.alibaba.dubbo.config.annotation.Service;
import com.javaedge.dubbo.springboot.ServiceAPI;
import org.springframework.stereotype.Component;

/**
 * @author JavaEdge
 */
@Component
@Service(interfaceClass = ServiceAPI.class)
public class QuickstartServiceImpl implements ServiceAPI {

    @Override
    public String sendMessage(String message) {
        return "quickstart-provider-message=" + message;
    }
}
