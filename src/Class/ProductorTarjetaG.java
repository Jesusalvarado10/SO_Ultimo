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
public class ProductorTarjetaG extends Empleados{
    int capacidad =10;
    int ultimoNumeroCarnet;
    public ProductorTarjetaG(int last_num_ci,int id, String tipo, Almacen almacen, Empresa puntero, int Unidades) {
        super(id, tipo, almacen, puntero, Unidades);
        this.ultimoNumeroCarnet=last_num_ci;
    }
    public int produccionDiaria() {
        if (ultimoNumeroCarnet >= 0 && ultimoNumeroCarnet < 5) {
            return 1 / 3;  // 1 tarjeta gráfica cada 3 días
        } else {
            return 1 / 2;  // 1 tarjeta gráfica cada 2 días
        }
    }
    
}
