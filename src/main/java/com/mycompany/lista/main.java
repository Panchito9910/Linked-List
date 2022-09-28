package com.mycompany.lista;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
       lista_simple n=new lista_simple();
       Scanner s=new Scanner(System.in);
       int a;
       String as;
       do{
           System.out.println("Inserta un dato entero ");
           a=s.nextInt();
           n.insertar_ultimo(a);
           System.out.println("¿Quiere continuar? s/n");
           as=s.next();
           if(as.equalsIgnoreCase("N")==true){
               break;
           }
       }while(true);
       n.print();
       n.eliminar();
       n.insertar_adelante(7);
       n.print();
       n.insertar_por_posición(5, 9);
       n.insertar_por_nodo(1, 10);
       n.print();
    }
}
