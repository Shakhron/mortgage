package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        menu();
    }
    static void menu(){
        Scanner in = new Scanner(System.in);
        System.out.println("Menu: \n1)Calculate your martgage\n2)Exit");
        int k = in.nextInt();
        switch (k){
            case 1:
                calculate();
            case 2:
                break;
            default:
                System.out.println("Input Error");
        }

    }
    static void calculate(){

    }
}
