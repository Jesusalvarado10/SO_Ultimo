/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.pkg1.sistemas.operativos;
import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;
/**
 *
 * @author gabga
 */

public class Proyecto1SistemasOperativos {
    /**
     * @param args the command line arguments
     */
    //La estrategia es hacer diferentes listas aca con los empleados de cada area
    //Pasar esas listas para la empresa despues
    public static void main(String[] args) {
        ProyectManager PM= new ProyectManager();
        Director director=new Director(PM);
        Almacen almacen= new Almacen();
        //Mediante la interfaz el usuario puede elegir la cantidad de cada empleado y la maxima produccion
        int CFuente=7;
        int CPlaca=8;
        int CRam=5;
        int CCPU=2;
        int CTarjeta=3;
        int PF=2;
        int PP=1;
        int PR=2;
        int PC=3;
        int PT=1;
        //Declaracion de los arrays
        ProductorFuente PFuente[]= new ProductorFuente[CFuente];
        ProductorPlaca PPlaca[]= new ProductorPlaca[CPlaca];
        ProductorRam PRam[]= new ProductorRam[CRam];
        ProductorCPU PCPU[]= new ProductorCPU[CCPU];
        ProductorTarjetaG PTarjeta[]= new ProductorTarjetaG[CTarjeta];
        Ensamblador ensamblador= new Ensamblador(almacen);
//        Object listaempleados[]= new Object[CFuente+CPlaca+CRam+CCPU+CTarjeta];
        //Creacion individual de cada array
        for (int i = 0; i<=CPlaca-1;i++){
               PPlaca[i]= new ProductorPlaca(i,almacen,PP);
        }
        for (int i=0; i<=CFuente-1;i++){
            PFuente[i]=new ProductorFuente(i,almacen,PF);
        }
        for (int i=0; i<=CCPU-1;i++){
            PCPU[i]=new ProductorCPU(i,almacen,PC);
        }
        for (int i=0; i<=CTarjeta-1;i++){
            PTarjeta[i]=new ProductorTarjetaG(i,almacen,PT);
        }
        for (int i=0; i<=CRam-1;i++){
            PRam[i]=new ProductorRam(i,almacen,PR);
        }
        //Creacion de la empresa
        Empresa HP= new Empresa("HP",PM,director,PPlaca,PFuente,PCPU,PTarjeta,PRam,ensamblador,almacen);
        HP.SolicitarPM().start();
        
    }
    
}
