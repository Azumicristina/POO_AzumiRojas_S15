/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S15_33;

/**
 *
 * @author 33_AzumiRojas
 */
public class Estudiante_33 {
    String nombres;
    int edad;
    String grado;
    String seccion;
      public String presentarse() {
        return "Hola, mi nombre es " + nombres + " y tengo " + edad + " años.";
    }

    public void Edad() {
        System.out.println("Tengo " + edad + " años");
    }

    public void acciones() {
        System.out.println("Estoy caminando");
    }

    public int edadEnDias() {
        return edad * 365;
    }

}
    
