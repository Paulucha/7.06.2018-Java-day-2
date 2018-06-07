package com.infoshareacademy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        try {
            int value = scanner.nextInt();
            System.out.println(value);}
        catch (InputMismatchException e){
                System.out.println("źle wpisałes głąbie!!!!!!!!");


        } catch (Exception e) {
            System.out.println("znowu zle wpisales głąbie");
        }


    }
}
