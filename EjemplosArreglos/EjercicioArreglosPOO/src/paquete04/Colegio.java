/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author SALA I
 */
public class Colegio {
    private String nombre;
    private String ciudad;
    
    public Colegio (String n, String c) {
        nombre = n;
        ciudad = c;
    }
    
    public void establecerNombre (String n) {
        nombre = n;
    }
    
    public void establecerCiudad (String c) {
        nombre = c;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public String obtenerCuidad() {
        return ciudad;
    }
    
    
}
