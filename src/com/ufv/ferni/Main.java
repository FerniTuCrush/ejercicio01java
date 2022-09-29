package com.ufv.ferni;
//Si queremos que la clase main sea ejecutable hay que por narices hacerle un  public static void main
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona p = new Persona();
        System.out.println("Escribe tu nombre: ");
        p.setNombre(sc.nextLine());
        System.out.println("Escribe tu apellido: ");
        p.setApellidos(sc.nextLine());
        System.out.println("Escribe tu dni sin letra: ");
        p.setDnisinletra(Integer.parseInt(sc.nextLine()));
        System.out.println("Escribe tu edad: ");
        p.setEdad(Integer.parseInt(sc.nextLine()));

        System.out.println("Buenos dias : " + p.getNombre() + " " + p.getApellidos() + " con dni: " + String.valueOf(p.getDnisinletra()) + " y edad:" + String.valueOf(p.getEdad()) + " años");
    }
}
