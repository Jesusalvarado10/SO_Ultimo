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
public class ProductorFuente extends Empleados {

     int ultimoNumeroCarnet;
     int capacidad;

    public ProductorFuente(int  last_num_ci, int id, String tipo, Almacen almacen, Empresa puntero, int Unidades) {
        super( id, tipo, almacen, puntero, Unidades);
        this.ultimoNumeroCarnet=last_num_ci;
        this.capacidad=35;
    }
       public int produccionDiaria() {
        if (ultimoNumeroCarnet >= 0 && ultimoNumeroCarnet < 3) {
            return 1 / 2;  // 1 CPU cada 2 días
        } else if (ultimoNumeroCarnet >= 3 && ultimoNumeroCarnet < 6) {
            return 1 / 3;  // 1 CPU cada 3 días
        } else {
            return 1 / 4;  // 1 CPU cada 4 días
        }
       }
}
