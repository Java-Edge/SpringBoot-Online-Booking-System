package com.javaedge.dubbo.springboot;

/**
 * @author JavaEdge
 */
public interface ServiceAPI {

    /**
     * 发消息
     *
     * @param message
     * @return
     */
    String sendMessage(String message);

}
