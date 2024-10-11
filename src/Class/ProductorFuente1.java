/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;
/**
 *
 * @author gabga
 */
public class ProductorFuente1 extends Empleados {
    
    public ProductorFuente1(int id,Almacen almacen,int Unidades) {
        super(26, id,"Fuente",almacen,Unidades);
    }
    
    public void run(){
        while(true){
            this.isAlive(); //Literalmente el archivo del coco de TFT2
           if(this.diaspro>2){
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
