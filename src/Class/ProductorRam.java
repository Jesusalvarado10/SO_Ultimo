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
public class ProductorRam extends Empleados{
    
    public ProductorRam(int id,Almacen almacen,int CI) {
        super(26, id,"Ram",almacen);
          if (CI >= 0 && CI < 3) {
             this.unidades = 3; // 3 Memoria RAM cada día
        } else if (CI >= 3 && CI < 6) {
            System.out.print("entro5");
             this.unidades = 2; // 2 Memoria RAM cada día
        } else{
             this.unidades = 1; // 1 Memoria RAM cada día
        }
    }
    
 public void run(){
        while(true){
            this.isAlive(); //Literalmente el archivo del coco de TFT2
           if(this.diaspro>=1){
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


