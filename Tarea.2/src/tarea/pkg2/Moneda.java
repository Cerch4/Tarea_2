/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg2;

/**
 *
 * @author Cesar
 */
public abstract class Moneda {
    public Moneda(){   
    }
    public String getSerie(){
        return(this.toString());
    }
    public abstract int getValor();
}
