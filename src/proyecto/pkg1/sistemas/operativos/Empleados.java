/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1.sistemas.operativos;
/**
 *
 * @author gabga
 */

//Implementar el concepto de la clase Hilos que se hizo para experimentar
public class Empleados extends Thread{
    protected int PagaPorHora;
    protected Almacen Almacen;
    protected int ID;
    protected String tipo;
    protected Empresa PunteroAEmpresa;
    protected int ProduDay;
    protected int unidades;
    
    public Empleados(int paga,int id,String tipo,Almacen almacen,int Unidades){
        this.PagaPorHora=paga;
        this.ID=id;
        this.tipo=tipo;
        this.Almacen=almacen;
        this.PunteroAEmpresa=null;
        this.unidades=Unidades;
    }
    
    public void Contratar(Empresa empresa){
        System.out.println("Contratado "+this.ID);
        this.PunteroAEmpresa=empresa;
    }
    
    public int getID(){
    return(this.ID);}
    
}
