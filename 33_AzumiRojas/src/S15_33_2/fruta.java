/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S15_33_2;

/**
 *
 * @author Usuario14
 */
public class fruta {
    String nombre;
    String estado;
    String tamaño;
    String sabor;
    String color; 
     public void nombrefruta() {
          System.out.println("la fruta es " + nombre );
    }

    public void tamaño() {
        System.out.println("El" + tamaño + " de la fruta ");
    }

    public void frutas() {
        System.out.println("Cuanto de tipos de frutas hay");
    }
    public void color( ){
        System.out.println("tengo diferente tipos de " + color + " de fruta");
    }
    public void cursos(){
        System.out.println("La fruta esta en " + estado + "podrido");
    }

}
