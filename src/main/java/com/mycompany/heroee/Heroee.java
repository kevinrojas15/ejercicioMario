package com.mycompany.heroee;

import java.util.Scanner;

public class Heroee {

    private String nombre;
    private int vidas;
    private int x;
    private boolean saltando;

    public Heroee(String nombre, int x) {
        this.nombre = nombre;
        this.vidas = 3;  
        this.x = x;  
        this.saltando = false;  
    }

   
    public void avanzar() {
        x++;
        System.out.println(nombre + " avanza a la posición " + x);

       
        if (x % 10 == 0) {
            if (!saltando) {
                perderVida(); 
            } else {
                System.out.println(nombre + " saltó el obstáculo en la posición " + x);
            }
        }

        saltando = false; 
    }

    
    public void saltar() {
        saltando = true;
        System.out.println(nombre + " está saltando.");
    }

    
    private void perderVida() {
        vidas--;
        System.out.println(nombre + " ha perdido una vida. Vidas restantes: " + vidas);
        if (vidas <= 0) {
            System.out.println(nombre + " ha perdido todas sus vidas. ¡Fin del juego!");
            System.exit(0);  
        }
    }

    
    public int getVidas() {
        return vidas;
    }
}