package com.tp4.services;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Singleton;

@Singleton
@LocalBean
public class CounterBean{
    private int counter = 0;
    public CounterBean() {}
    public void addOneToCount(){ this.counter+=1; }
    public int getCounter() { return counter; }
    public void setCounter(int counter) { this.counter= counter; }
    public CounterBean(int counter) { this.counter= counter; }
}
