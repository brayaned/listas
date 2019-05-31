/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.Scanner;

/**
 *
 * @author estudiantes
 */
public class Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Ventana ventana=new Ventana();
        ventana.setVisible(true);
        Lista lista=new Lista();
        //int n,d;
        
        
        /*do{
            System.out.println("1.insertar");
            System.out.println("2.imprimir");
            System.out.println("3.buscar");
            System.out.println("4.retirar");
            n=sc.nextInt();
        switch(n){
            case 1:
                System.out.println("ingresse el dato");
                d=sc.nextInt();
                lista.insertar(d);
                break;
            case 2:
                lista.imprimir();
                break;
            case 3:
                System.out.println("dato:");
                d=sc.nextInt();
                lista.buscar(d);
            case 4:
                System.out.println("dato:");
                d=sc.nextInt();
                lista.retirar(d);
                break;
        }
        }while(n!=0);*/
    }
    
}
