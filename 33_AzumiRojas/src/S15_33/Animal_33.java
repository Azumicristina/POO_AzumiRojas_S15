/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S15_33;

import javax.swing.JOptionPane;

/**
 *
 * @author 33_AzumiRojas
 */
public class Animal_33 {
    // Atributos
    String nombre;
    int edad;
    String especie;
    String tamaño;  
     public void informacionAnimal() {
        String mensaje = "Nombre: " + nombre + "\n"
                + "Edad: " + edad + " años\n"
                + "Especie: " + especie + "\n"
                + "Tamaño: " + tamaño;
         System.out.println(mensaje);
    }

    public void preguntarAnimal() {
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del animal:");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del animal:"));
        especie = JOptionPane.showInputDialog("Ingrese la especie del animal:");
        tamaño = JOptionPane.showInputDialog("Ingresa el tamaño del animal");
    }

    public void presentarAnimal() {
        System.out.println("");
        System.out.println("==============");
        System.out.println("====ANIMAL====");
        System.out.println("==============");

    }
}
