/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import MainUI.prueba;
import javax.swing.JFrame;

/**
 *
 * @author Indatech
 */
public class Main {
        int CFuenteMSI;
        int CPlacaMSI;
        int CRamMSI;
        int CCPUMSI;
        int CTarjetaMSI;
        int CFuenteHP;
        int CPlacaHP;
        int CRamHP;
        int CCPUHP;
        int CTarjetaHP;
        int PP;
        int PF;
        int PR;
        int PC;
        int PT;
        Empresa hp;
        Empresa msi;
    public Main(int CI) {
        this.PP=CI;
        this.PF=CI;
        this.PR=CI;
        this.PC=CI;
        this.PT=CI;
    }
public void setHP( prueba m, int cpu, int fuente, int placa, int ram, int tarjeta,int max,int day){
         this.CCPUHP=cpu;
         this.CFuenteHP=fuente;
         this.CPlacaHP=placa;
         this.CRamHP=ram;
         this.CTarjetaHP=tarjeta;
        System.out.println("RAM"+CRamHP);
        System.out.println("CPU"+CCPUHP);
        System.out.println("FUENTE"+CFuenteHP);
        System.out.println("Placa"+CPlacaHP);
        System.out.println("Tarjetas"+CTarjetaHP);
        
        ProyectManager PM= new ProyectManager(max);
        Director director=new Director(PM,day);
        Almacen almacen= new Almacen(m);
        //Nuevo array
        ProductorFuente PFuente[]= new ProductorFuente[10+CFuenteHP];
        ProductorPlaca PPlaca[]= new ProductorPlaca[10+CPlacaHP];
        ProductorRam PRam[]= new ProductorRam[10+CRamHP];
        ProductorCPU PCPU[]= new ProductorCPU[10+CCPUHP];
        ProductorTarjetaG PTarjeta[]= new ProductorTarjetaG[10+CTarjetaHP];
        Ensamblador ensamblador= new Ensamblador (almacen);
        for (int i = 0; i<CPlacaHP;i++){
               PPlaca[i]= new ProductorPlaca(i,almacen,PP);
        }
        for (int i=0; i<CFuenteHP;i++){
            PFuente[i]=new ProductorFuente(i,almacen,PF);
        }
        for (int i=0; i<CCPUHP;i++){
            PCPU[i]=new ProductorCPU(i,almacen,2);
        }
        for (int i=0; i<CTarjetaHP;i++){
            PTarjeta[i]=new ProductorTarjetaG(i,almacen,PT);
        }
        for (int i=0; i<CRamHP;i++){
            PRam[i]=new ProductorRam(i,almacen,PR);
        }
        //Creacion de la empresa
        Empresa HP= new Empresa("HP",PM,director,PPlaca,PFuente,PCPU,PTarjeta,PRam,ensamblador,almacen);
        this.hp=HP;
        HP.SolicitarPM().start();
}    
     public void setHMSI( prueba m, int cpu, int fuente, int placa, int ram, int tarjeta,int max, int day){
         this.CCPUMSI=cpu;
         this.CFuenteMSI=fuente;
         this.CPlacaMSI=placa;
         this.CRamMSI=ram;
         this.CTarjetaMSI=tarjeta;
        ProyectManager PM= new ProyectManager(max);
        Director director=new Director(PM,day);
        Almacen almacen= new Almacen(m);
        ProductorFuente PFuente[]= new ProductorFuente[CFuenteMSI];
        ProductorPlaca PPlaca[]= new ProductorPlaca[CPlacaMSI];
        ProductorRam PRam[]= new ProductorRam[CRamMSI];
        ProductorCPU PCPU[]= new ProductorCPU[CCPUMSI];
        ProductorTarjetaG PTarjeta[]= new ProductorTarjetaG[CTarjetaMSI];
        Ensamblador ensamblador= new Ensamblador (almacen);
        for (int i = 0; i<=CPlacaMSI-1;i++){
               PPlaca[i]= new ProductorPlaca(i,almacen,PP);
        }
        for (int i=0; i<=CFuenteMSI-1;i++){
            PFuente[i]=new ProductorFuente(i,almacen,PF);
        }
        for (int i=0; i<=CCPUMSI-1;i++){
            PCPU[i]=new ProductorCPU(i,almacen,PC);
        }
        for (int i=0; i<=CTarjetaMSI-1;i++){
            PTarjeta[i]=new ProductorTarjetaG(i,almacen,PT);
        }
        for (int i=0; i<=CRamMSI-1;i++){
            PRam[i]=new ProductorRam(i,almacen,PR);
        }
        //Creacion de la empresa
        Empresa MSI= new Empresa("MSI",PM,director,PPlaca,PFuente,PCPU,PTarjeta,PRam,ensamblador,almacen);
        this.msi=MSI;
        MSI.SolicitarPM().start();
}    

    public void setaddHP(String tipoFinal) {
        this.hp.cambiarpuesto("a", tipoFinal);
    }
    
    public void setdeleteHP(String tipoInicial) {
            this.hp.cambiarpuesto(tipoInicial, null);
    }
    
   public void setaddMSI(String tipoFinal) {
        this.msi.cambiarpuesto("a", tipoFinal);
    }
    
    public void setdeleteMSI(String tipoInicial) {
            this.msi.cambiarpuesto(tipoInicial, null);
    }
    
    
     
}
