/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import Class.Empresa;
import Class.Almacen;

/**
 *
 * @author gabga
 */
public class ProductorPlaca extends Empleados{
    int ultimoNumeroCarnet;
     int capacidad= 25;

  public ProductorPlaca(int ultimoNumeroCarnet, int paga, int id, String tipo, Almacen almacen, int Unidades) {
        super(paga, id, tipo, almacen, Unidades);
        this.ultimoNumeroCarnet = ultimoNumeroCarnet;
    }

   
    
      public int produccionDiaria() {
        if (ultimoNumeroCarnet >= 0 && ultimoNumeroCarnet < 3) {
            return 1 / 2;  // 1 placa base cada 2 días
        } else if (ultimoNumeroCarnet >= 3 && ultimoNumeroCarnet < 6) {
            return 1 / 3;  // 1 placa base cada 3 días
        } else {
            return 1 / 4;  // 1 placa base cada 4 días
        }
    }
    public void run(){
        chambear();
    }
    
    public void chambear(){
        //int Days=this.PunteroAEmpresa.SolicitarPM().getDays();
        if (this.ProduDay==2){
        this.ProduDay=0;
        this.Almacen.almacenar(this.ID,this.tipo,this.unidades);
        }
        if (this.ProduDay<2){
            this.ProduDay++;
        }
    }
}
