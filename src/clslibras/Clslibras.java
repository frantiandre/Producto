/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clslibras;
import java.util.ArrayList;
import java.util.Date;
import clslibras.clspeso;

/**
 *
 * @author FRANKLIN
 */
public class Clslibras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<clspeso> pesos=new ArrayList<clspeso>();
        
        clspeso p0=new clspeso(1,"cemento",20,clspeso.unid.libras);
         clspeso p1=new clspeso(2,"pintura",45,clspeso.unid.litros);
          clspeso p2=new clspeso(3,"agua",60,clspeso.unid.litros);
           clspeso p3=new clspeso(4,"lija",15,clspeso.unid.metros);
            clspeso p4=new clspeso(5,"cemento",100,clspeso.unid.libras);
       pesos.add(p0);
        pesos.add(p1);
         pesos.add(p2);
          pesos.add(p3);
           pesos.add(p4);
           
       imprimir(pesos);
       
    }
// para generar el for se puede dar crlt + espacio y asman las opciones 
    
    private static void imprimir(ArrayList<clspeso> pesos) {
        for(clspeso producto :pesos){
             System.out.println("**********************");
                System.out.println("           ID:"+producto.Id());
                System.out.println("           Nombre:"+producto.Nombre());
                System.out.println("           Telefono:"+producto.Unidad());
                System.out.println("           Telefono:"+producto.Valor());
        
        }
        
    }
    
}
