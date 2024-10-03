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
        //Mediante la interfaz el usuario puede elegir la cantidad de cada empleado
        ProductorFuente PFuente[]= new ProductorFuente[3];
        ProductorPlaca PPlaca[]= new ProductorPlaca[4];
        ProductorRam PRam[]= new ProductorRam[2];
        ProductorCPU PCPU[]= new ProductorCPU[2];
        ProductorTarjetaG PTarjeta[]= new ProductorTarjetaG[1];
        //Mediante la interfaz tambien se asigna la cantidad de unidades segun el numero de cedula
        for (int i = 1; i<=5;i++){
               PPlaca[i]= new ProductorPlaca(i,almacen,2);
        }
        Empresa HP= new Empresa("HP",PM,director,PPlaca,PFuente,PCPU,PTarjeta,PRam);
        PM.contratar(HP);
        
    }
    
}
