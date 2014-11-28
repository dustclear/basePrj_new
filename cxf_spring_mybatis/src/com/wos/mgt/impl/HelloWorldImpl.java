package com.wos.mgt.impl;

import javax.jws.WebService;

import com.wos.dao.mapper.AddressTypeMapper;
import com.wos.mgt.HelloWorld;
import com.wos.pojo.AddressType;

@WebService(endpointInterface = "com.wos.mgt.HelloWorld")
public class HelloWorldImpl implements HelloWorld
{
    private AddressTypeMapper addressType;
    
    public String sayHi(String text)
    {
        AddressType type = addressType.getAllAddressTypes("zcdz").get(0);
        System.out.println("sayHi called" + type.getCname()+" "+type.getCcode());
        return "Hello "+text +" "+ type.getCname() +" "+type.getCcode();
    }

    public AddressTypeMapper getAddressType()
    {
        return addressType;
    }

    public void setAddressType(AddressTypeMapper addressType)
    {
        this.addressType = addressType;
    }
    
    
}