/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import Class.Empleados;

/**
 *
 * @author gabga
 */
public class ProductorRam extends Empleados{
      int ultimoNumeroCarnet;
        int capacidad;

    public ProductorRam(int  last_num,int id, String tipo, Almacen almacen, Empresa puntero, int Unidades) {
        super(id, tipo, almacen, puntero, Unidades);
        this.ultimoNumeroCarnet= last_num;
        this.capacidad=55;
    }
     public int produccionDiaria() {
        if (ultimoNumeroCarnet >= 0 && ultimoNumeroCarnet < 3) {
            return 3;  // 3 RAM cada día
        } else if (ultimoNumeroCarnet >= 3 && ultimoNumeroCarnet < 6) {
            return 2;  // 2 RAM cada día
        } else {
            return 1;  // 1 RAM cada día
        }
    }
}
