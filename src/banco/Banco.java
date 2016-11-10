/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author usuario
 */
public class Banco {
    private String nombre;
    private int num_sucursales;
    private int num_acciones;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum_sucursales() {
        return num_sucursales;
    }

    public void setNum_sucursales(int num_sucursales) {
        this.num_sucursales = num_sucursales;
    }

    public int getNum_acciones() {
        return num_acciones;
    }

    public void setNum_acciones(int num_acciones) {
        this.num_acciones = num_acciones;
    }
}
