/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import Class.Director;
import Class.Almacen;

/**
 *
 * @author gabga
 */
public class Empresa {
    private String Nombre;
    private int Ganancias;
    private int Perdidas;
    private int GananciasNetas;
    private ProyectManager PM;
    private Director Director;
    private ProductorPlaca PPlacas[];
    private ProductorFuente PFuente[];
    private ProductorCPU PCPU[];
    private ProductorTarjetaG PTarjeta[];
    private ProductorRam PRam[];
    private Ensamblador ensamblador;
    private Almacen Almacen;
    private int gananciaE;
    private int ganancia;
    private int[] especificaciones;
    //Agregar variables de las ganancia de una pc normal o especial dependiedo del nombre de la empresa
    
    public Empresa(String nombre,ProyectManager pm,Director director,ProductorPlaca ListaP[],ProductorFuente ListaF[],ProductorCPU ListaC[],ProductorTarjetaG ListaT[],ProductorRam ListaR[],Ensamblador ensamblador_,Almacen almacen){
        this.Nombre=nombre;
        this.Ganancias=0;
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
        this.ensamblador=ensamblador_;
        this.Almacen=almacen;
   
        if (this.Nombre.equals("HP")){
            this.ganancia=90000;
            this.gananciaE=140000;
            //cpu,fuente,placa,ram,tarjeta,compus
            int[] HP={1,4,1,2,3,2};
            this.especificaciones=HP;
        }
        if (this.Nombre.equals("MSI")){
            this.ganancia=180000;
            this.gananciaE=250000;
            int[] MSI={3,6,2,4,5,6};
            this.especificaciones=MSI;
        }
        pm.contratar(this);
        ensamblador.contratar(this);
        director.contratar(this);
        for (int i = 0; i<=this.PPlacas.length-1;i++){
               this.PPlacas[i].Contratar(this);
        }
        for (int i = 0; i<=this.PFuente.length-1;i++){
               this.PFuente[i].Contratar(this);
        }
        for (int i = 0; i<=this.PCPU.length-1;i++){
               this.PCPU[i].Contratar(this);
        }
        for (int i = 0; i<=this.PTarjeta.length-1;i++){
               this.PTarjeta[i].Contratar(this);
        }
        for (int i = 0; i<=this.PRam.length-1;i++){
               this.PRam[i].Contratar(this);
        }
        
    }
    
    public void cambiarpuesto(String tipoInicial, String tipoFinal){
        Object Ultimo;
        int position=0;
        int unidades=0;
        switch(tipoInicial){
            case("CPU"): 
                for (int i = 0;i<=this.PCPU.length;i++){
                    Ultimo=this.PCPU[i];
                    if(Ultimo==null){
                        position=i-1;
                        unidades=this.PCPU[position].getunidades();
                        break;
                    }
                }
            case("Ram"): 
                for (int i = 0;i<=this.PRam.length;i++){
                    Ultimo=this.PRam[i];
                    if(Ultimo==null){
                        position=i-1;
                        unidades=this.PRam[position].getunidades();
                        break;
                    }
                }
            case("Tarjeta"): 
                for (int i = 0;i<=this.PTarjeta.length;i++){
                    Ultimo=this.PTarjeta[i];
                    if(Ultimo==null){
                        position=i-1;
                        unidades=this.PTarjeta[position].getunidades();
                        break;
                    }
                }
            case("Placa"): 
                for (int i = 0;i<=this.PPlacas.length;i++){
                    Ultimo=this.PPlacas[i];
                    if(Ultimo==null){
                        position=i-1;
                        unidades=this.PPlacas[position].getunidades();
                        break;
                    }
                }
            case("Ensamblador"): 
                System.out.println("No se puede cambiar al ensamblador");
        }
        switch(tipoFinal){
            case ("CPU"):
                this.PCPU[position]= new ProductorCPU(position,this.Almacen,unidades);
            case ("Tarjeta"):
                this.PTarjeta[position]= new ProductorTarjetaG(position,this.Almacen,unidades);
            case ("Ram"):
                this.PRam[position]= new ProductorRam(position,this.Almacen,unidades);
            case ("Placa"):
                this.PPlacas[position]= new ProductorPlaca(position,this.Almacen,unidades);
            case ("Fuente"):
                this.PFuente[position]= new ProductorFuente(position,this.Almacen,unidades);
            case ("Ensamblador"):
                System.out.println("Mi hermano, esta parte del proyecto se escondió en el docs, así que la estrucutra");
                System.out.println("no está hecha para realizar estos cambios y aún así hicimos un amago para hacerlo");
                System.out.println("sin alterar la estructura, haciendo un par de arreglos. Cambiar el ensamblador, implica ");
                System.out.println("cambiar la arquitectura un pelo, cosa que nanai.");
        }
    }
    public void setGanancias(int Ganancias) {
        this.Ganancias = this.Ganancias+Ganancias;
        System.out.println("Ganancias brutas de la empresa: "+this.Ganancias);
    }

    public int getGananciaE() {
        return gananciaE;
    }

    public int getGanancia() {
        return ganancia;
    }

    public int[] getEspecificaciones() {
        return especificaciones;
    }
    
    public Almacen accesoAlmacen(){
        return Almacen;
    }
    public Ensamblador getEnsamblador() {
        return ensamblador;
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
    
    public ProductorRam[] SolicitarPRam(){
        return(this.PRam);
    }
    
    public ProductorTarjetaG[] SolicitarPTarjeta(){
        return(this.PTarjeta);
    }
    
    public Director SolicitarDirector(){
        return(this.Director);
    }
    
}
