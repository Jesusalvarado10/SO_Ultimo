/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1.sistemas.operativos;

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
    private ProductorCPU PCPU[];
    private ProductorTarjetaG PTarjeta[];
    private ProductorRam PRam[];
    
    
    public Empresa(String nombre,ProyectManager pm,Director director,ProductorPlaca ListaP[],ProductorFuente ListaF[],ProductorCPU ListaC[],ProductorTarjetaG ListaT[],ProductorRam ListaR[]){
        this.Nombre=nombre;
        this.Ganacias=0;
        this.Perdidas=0;
        this.GananciasNetas=0;
        this.PM=pm;
        this.PM.contratar(this);
        this.Director=director;
        this.PPlacas=ListaP;
        this.PFuente=ListaF;
        this.PCPU=ListaC;
        this.PTarjeta=ListaT;
        this.PRam=ListaR;
        pm.contratar(this);
    }
    
    public ProyectManager SolicitarPM(){
        return(this.PM);
    }
    
    public ProductorPlaca[] SolicitarPPlacas(){
        return(this.PPlacas);
    }
    
    public ProductorFuente[] SolicitarPFuente(){
        return(this.PFuente);
    }
    
    public ProductorCPU[] SolicitarPCPU(){
        return(this.PCPU);
    }
    
    public ProductorTarjetaG[] SolicitarPTarjeta(){
        return(this.PTarjeta);
    }
    
    public Director SolicitarDirector(){
        return(this.Director);
    }
    
}
