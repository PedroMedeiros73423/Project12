package com.mycompany.project12;
import java.util.Scanner;

public class Project12 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o primeiro valor: ");
        int X = in.nextInt();
        System.out.println("Informe o segundo valor: ");
        int Y = in.nextInt();
        if(X > Y){
            System.out.println("O maior valor é: " + X);
        }else{
        if(Y > X){
            System.out.println("O maior valor é: " + Y);
            
        }else{
            if(X == Y){
                System.out.println("Os valores são iguais");
            }
        }
    }
    }
}
