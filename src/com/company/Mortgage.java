package com.company;

public class Mortgage {
    int year;
    int sum;
    float percent;
    Mortgage(int s, int y, float v){
        this.sum = s;
        this.year = y;
        this.percent = v;
    }
    Mortgage(int s){
        this(s,20,9.6f);
    }
    Mortgage(){
        this.sum = 1500000;
        this.year = 20;
        this.percent = 9.6f;
    }
    private float Monthly_interest(){
        return this.percent/12.0f/100.0f;
    }
    void calculate(){

    }
}
