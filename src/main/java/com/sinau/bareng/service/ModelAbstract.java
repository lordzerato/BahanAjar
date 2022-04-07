package com.sinau.bareng.service;

public abstract class ModelAbstract  implements ModelInterface{
    protected String GA="This just model abstract";

    public void mulai(){
        System.out.println("Hello mulai");
    }

    @Override
    public void start() {

    }

    @Override
    public void selesai() {
        System.out.println("Selesai");
    }

    @Override
    public String getValue() {
        return "Hello World";
    }

    public abstract void cobain();
    public abstract void abs();
    protected abstract String hello();
}
