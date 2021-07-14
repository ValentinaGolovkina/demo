package com.example.demo;

import org.apache.camel.Exchange;

public interface AdresseeResolver {

    Boolean  whenCond(Exchange exchange);
    Addressee  to();
}
