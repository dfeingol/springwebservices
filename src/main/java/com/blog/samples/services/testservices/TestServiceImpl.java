package com.blog.samples.services.testservices;

import org.springframework.stereotype.Service;

/**
 * Simple of example of using a service
 */
@Service("testService")
public class TestServiceImpl implements TestService {
    public String status(){
        return "okay";
    }
}
