/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import Class.Director;

/**
 *
 * @author gabga
 */
public class Empresa {
    private String Nombre;
    private int Ganacias;
    private int Perdidas;
    private int GananciasNetas;
    private ProyectManager PM;
    private Director Director;
    private ProductorPlaca PPlacas[];
    private ProductorFuente PFuente[];
    //private ProductorCPU PCPU[];
    
    
    public Empresa(String nombre,ProyectManager pm,Director director,ProductorPlaca[] lista){
        this.Nombre=nombre;
        this.Ganacias=0;
        this.Perdidas=0;
        this.GananciasNetas=0;
        this.PM=pm;
        this.PM.contratar(this);
        this.Director=director;
        this.PPlacas=lista;
    }
    
    public ProyectManager SolicitarPM(){
        return(this.PM);
    }
    
    public Director SolicitarDirector(){
        return(this.Director);
    }
    
}
