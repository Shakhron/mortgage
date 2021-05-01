package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println();
        Mortgage ex = new Mortgage();
        menu(ex);
    }
    static void menu(Mortgage cl){
        Scanner in = new Scanner(System.in);
        System.out.println("Menu: \n1)Calculate monthly payments\n2)Exit");
        int k = in.nextInt();
        switch (k){
            case 1:
                    cl.calculate();
            case 2:
                break;
            default:
                System.out.println("Input Error");
        }

    }
}
