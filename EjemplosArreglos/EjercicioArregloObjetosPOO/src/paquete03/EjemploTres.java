/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete01.*;

public class EjemploTres {
    public static void main(String[] args) {
        // crear un arreglo de objetos de tipo Calificacion
        // Aqui hay objetos anonimos
        Profesor profesor1 = new Profesor("Luis","nombramiento");
        Profesor profesor2 = new Profesor("Ana","contrato");
        
        Calificacion [] calificaciones = {new Calificacion(10, "Computación", profesor1), 
            new Calificacion(9, "Electrónica",profesor2)};
        
        for (int i = 0; i < calificaciones.length; i++) {
            Calificacion objetoCalificacion = calificaciones[i];
            System.out.printf("%s - %.2f con profresor %s\n", 
                    objetoCalificacion.obtenerNombreMateria(),
                    objetoCalificacion.obtenerNota(),
                    objetoCalificacion.obtenerProfesor().obtenerNombre());
        }
        
    }
}
