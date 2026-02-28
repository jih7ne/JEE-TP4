package com.tp4.services;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Singleton;
import jakarta.ejb.Stateful;

@Stateful
@LocalBean
public class CounterStatefulBean {
    private int counter = 0;
    public CounterStatefulBean() {}
    public void addOneToCount(){ this.counter+=1; }
    public int getCounter() { return counter; }
    public void setCounter(int counter) { this.counter= counter; }
    public CounterStatefulBean(int counter) { this.counter= counter; }
}
