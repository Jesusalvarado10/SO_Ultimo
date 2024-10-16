/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import Class.Almacen;

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
    protected int diaspro;
    
    public Empleados(int paga,int id,String tipo,Almacen almacen){
        this.PagaPorHora=paga;
        this.ID=id;
        this.tipo=tipo;
        this.Almacen=almacen;
        this.PunteroAEmpresa=null;
        this.unidades=0;
        this.diaspro=0;
    }
    
    public void sumardias(){
//        System.out.println("Se ha sumado en hilo "+this.ID);
        this.diaspro++;
        System.out.println("Dias produccion: " +this.diaspro);
    }
    
    public void reiniciardias(){
        this.diaspro=0;
//        System.out.println("Dias produccion: " +this.diaspro);
    }
    
    public void Contratar(Empresa empresa){
        System.out.println("Contratado empleado "+this.ID+" tipo "+this.tipo);
        this.PunteroAEmpresa=empresa;
    }
    public int getunidades(){
        return(this.unidades);
    }
    public int getID(){
    return(this.ID);}
    
}
