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
public class ProductorFuente extends Empleados {
    
    public ProductorFuente(int id,Almacen almacen,int CI) {
        super(26, id,"Fuente",almacen);

        if (CI >= 0 && CI < 5) {
            this.unidades = 3; // 3 Fuentes de alimentación cada día
        } else  {
            System.out.print("entro5");
            this.unidades = 5; // 5 Fuentes de alimentación cada día
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
