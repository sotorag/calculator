package ru.semenov.study;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws EnterException{
        Scanner in= new Scanner(System.in);
        Input a=new Input(in.nextLine());
        a.input() ;
        System.out.println(a.output());
    }
}
