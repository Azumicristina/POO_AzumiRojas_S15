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
public class profesor {
    String nombre;
    String apellido;
    int edad;
    String curso;
    int titulos;
      public void presentarse() {
          System.out.println("hola me llamo " + nombre +" "+ apellido);
    }

    public void Edad() {
        System.out.println("Tengo " + edad + " años");
    }

    public void acciones() {
        System.out.println("Estoy enseñando");
    }
    public void titulos( ){
        System.out.println("tengo" + titulos + " a lo largo de mi carrera");
    }
    public void cursos(){
        System.out.println("En esta clase llevo" + curso);
    }


}

