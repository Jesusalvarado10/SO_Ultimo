/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;


import Class.Almacen;
import Class.Empresa;

/**
 *
 * @author gabga
 */
class Ensamblador extends Thread {
    
    Almacen Almacen;
    Empresa Empresa;
    
    public Ensamblador(Almacen almacen){
        this.Almacen=almacen;
        this.Empresa=null;
    }
    
    public void contratar(Empresa empresa){
        this.Empresa=empresa;
    }
 
    public void run(){
        int[] esp=this.Empresa.getEspecificaciones();
        while (true){
            this.isAlive();//Coco de TFT2
            //cpu,fuente,placa,ram,tarjeta,compus
            this.Almacen.crearPC(esp[0], esp[1],esp[2], esp[3], esp[4],esp[5]);
        }
    }   
}
