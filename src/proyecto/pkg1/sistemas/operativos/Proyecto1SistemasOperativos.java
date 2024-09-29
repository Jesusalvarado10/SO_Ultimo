/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.pkg1.sistemas.operativos;

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
        Director director= new Director(PM);
        for (int i =1; i<=5;i++){
            ProductorPlaca empleado = new ProductorPlaca(i,almacen,);
            
        }
        Empresa empresa = new Empresa("Pepe Corp",PM,director,);
        Almacen almacen=new Almacen();
    }
    
}
