/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1.sistemas.operativos;

/**
 *
 * @author gabga
 */
public class ProductorPlaca extends Empleados{
  
    public ProductorPlaca(int id,Almacen almacen,Empresa empresa,int Unidades) {
        super(26, id,"Placa",almacen,empresa,Unidades);
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
