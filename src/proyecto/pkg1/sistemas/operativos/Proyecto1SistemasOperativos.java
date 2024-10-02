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
        List<ProductorPlaca> Lista = new LinkedList<>();
        for (int i = 1; i<=5;i++){
            ProductorPlaca ProductorP= new ProductorPlaca(i,almacen,2);
            Lista.add(ProductorP);
        }
        Empresa HP = new Empresa("HP",PM,director,Lista);
        HP.SolicitarPM().contratar(HP);
        ListIterator<ProductorPlaca> iterador = Lista.listIterator();
            while(iterador.hasNext()){
                System.out.println(iterador.next().getID());
            }
            while(iterador.hasNext()){
                iterador.next().Contratar(HP);
            }
            while(iterador.hasNext()){
                iterador.next().start();
            }
        PM.start();
        
    }
    
}
