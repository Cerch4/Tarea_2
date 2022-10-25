/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg2;

import java.util.ArrayList;

/**
 *
 * @author Cesar
 */
public class depositoMoneda {
   private ArrayList<Moneda> varl;

   public depositoMoneda(){
        this.varl = new ArrayList<Moneda>();
    }
   public void addBebida(Moneda mon){
       varl.add(bob);
   }
   public Bebida getBebida(){
       if(varl.size() == 0){
           return null;
       }
       else{
           Bebida aux = null;
           aux = varl.remove(0);  
           return(aux);
       }
   }
   public int check(){
       return(varl.size());
   }
}
}
}
