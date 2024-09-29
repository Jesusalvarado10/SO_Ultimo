/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1.sistemas.operativos;

/**
 *
 * @author gabga
 */
public class Director {
    ProyectManager PM;
    int DaysLeft;
    
    public Director(ProyectManager PoM){
        PM=PoM;
        DaysLeft=10;
    }
    
    public void CountDays(){
        //Se pone al final de cada dia del PM para restarlo
        this.DaysLeft--;
        //Agregar condicion de cuando cumple los 0 dias
        System.out.println("El Director dice: ¡¡FALTAN " + "DIAS!!");
        
}
    
}
