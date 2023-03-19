package org.example;

import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);
    public  void imprimirMenuPrincipal() {
        int opcion = imprimirMenu();
        switch (opcion) {
            case 1:
                Polinomio polinomio = cargarPoli();
                Polinomio otroPolinomio = cargarPoli();
                System.out.println("Sumar: ");
                polinomio.mostrar();
                otroPolinomio.mostrar();
                System.out.println("------------------");
                polinomio.sumar(otroPolinomio);
                polinomio.mostrar();
                break;
            case 2:
                Polinomio polinomioResta = cargarPoli();
                Polinomio otroPolinomioResta = cargarPoli();
                System.out.println("Restar");
                polinomioResta.mostrar();
                otroPolinomioResta.mostrar();
                System.out.println("------------------");
                polinomioResta.restar(otroPolinomioResta);
                polinomioResta.mostrar();
                break;
            case 3:
                Polinomio polinomioMulti = cargarPoli();
                Polinomio otroPolinomioMulti = cargarPoli();
                System.out.println("Multiplicar");
                polinomioMulti.mostrar();
                otroPolinomioMulti.mostrar();
                System.out.println("------------------");
                polinomioMulti.multiplicar(otroPolinomioMulti);
                polinomioMulti.mostrar();
                break;
            case 4:
                Polinomio polinomioDiv = cargarPoli();
                Polinomio otroPolinomioDiv = cargarPoli();
                System.out.println("Dividir");
                polinomioDiv.mostrar();
                otroPolinomioDiv.mostrar();
                System.out.println("------------------");
                polinomioDiv.dividir(otroPolinomioDiv);
                polinomioDiv.mostrar();
                break;
            case 5:
                System.out.println("Salir");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

    public static int imprimirMenu(){
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("Ingrese una opción: ");
        int opcion = sc.nextInt();
        return opcion;
    }

    public static Polinomio cargarPoli(){
        // Crear una instancia de la clase Polinomio
        Polinomio polinomio = new Polinomio();
        System.out.println("Ingrese el valor del polinomio: ");
        double valor = sc.nextDouble();
        System.out.println("Ingrese el termino del polinomio: ");
        int termino = sc.nextInt();
        polinomio.cargarTermino(new datoPolinomioImpl(valor, termino));
        return polinomio;
    }
}
