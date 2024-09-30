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
public class Empleados extends Thread{
    protected int PagaPorHora;
    protected Almacen Almacen;
    protected int ID;
    protected String tipo;
    protected Empresa PunteroAEmpresa;
    protected int ProduDay;
    protected int unidades;
    
    public Empleados(int id,String tipo,Almacen almacen,Empresa puntero,int Unidades){
        this.PagaPorHora=0;
        this.ID=id;
        this.tipo=tipo;
        this.Almacen=almacen;
        this.PunteroAEmpresa=puntero;
        this.unidades=Unidades;
    }
    
}
