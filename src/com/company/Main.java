package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws EnterException{
        Scanner in= new Scanner(System.in);
        Vvod a=new Vvod(in.nextLine());
        a.vvod() ;
        System.out.println(a.vuvod());
    }
}
