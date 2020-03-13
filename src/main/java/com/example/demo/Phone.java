package com.example.demo;

public class Phone {
    String fio;
    String num;

    @Override
    public String toString() {
        return "Phone [ФИО=" + fio + ", Номер телефона=" + num + "]";
    }

    public Phone(String fio, String num) {
        super();
        this.fio = fio;
        this.num = num;
    }

    public String getFio() {
        return fio;
    }
    public void setFio(String fio) {
        this.fio = fio;
    }
    public String getNum() {
        return num;
    }
    public void setNum(String num) {
        this.num = num;
    }
}
