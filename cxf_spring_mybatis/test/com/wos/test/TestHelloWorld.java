package com.wos.test;

import org.junit.Assert;
import org.junit.Test;

import com.wos.client.stub.HelloWorld;
import com.wos.client.stub.HelloWorldImplService;


public class TestHelloWorld
{
    
    @Test
    public void test()
    {
        HelloWorld service = new HelloWorldImplService().getHelloWorldImplPort();
        System.out.println(service.sayHi("123"));
        Assert.assertNotNull(service);
    }
    
}
