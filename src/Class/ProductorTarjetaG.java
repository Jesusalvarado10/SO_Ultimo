/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import Class.Empleados;
import Class.Almacen;

/**
 *
 * @author gabga
 */
public class ProductorTarjetaG extends Empleados{
        int days;
    public ProductorTarjetaG(int id,Almacen almacen,int CI) {
        super(26, id,"Tarjeta",almacen);
        
            if (CI >= 0 && CI < 5) {
                // Intervalo 0 <= X < 5
                this.days = 3; // 1 tarjeta gráfica cada 3 días
                this.unidades=1;
            } else if (CI >= 5 && CI <= 9) {
                // Intervalo 5 <= X <= 9
                this.days = 2; // 1 tarjeta gráfica cada 2 días
                this.unidades=1;
            }

    }
    
    public void run(){
        while(true){
            this.isAlive(); //Literalmente el archivo del coco de TFT2
           if(this.diaspro>=days){
                this.Almacen.almacenar(this.ID, this.tipo, this.unidades);
                this.reiniciardias();
            }
        }
    }
    
    public void refreshday(){
        this.ProduDay=this.PunteroAEmpresa.SolicitarPM().getDays();
    }
    
    public void chambear(){
        //int Days=this.PunteroAEmpresa.SolicitarPM().getDays();
        if (this.ProduDay>2){  
            //System.out.println("Soy el empleado" + this.ID +" y me voy por el dia "+this.ProduDay);
        this.ProduDay=0;
        this.Almacen.almacenar(this.ID,this.tipo,this.unidades);
        }
        if (this.ProduDay<2){
            this.ProduDay++;
        }
    }
}
