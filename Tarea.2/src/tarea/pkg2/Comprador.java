/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg2;

/**
 *
 * @author Cesar
 */
public class Comprador {
    private int money;
    private String flavor;
    public Comprador(Moneda mon, int sabor, Expendedor Amogus){
        Amogus.compraBebida(mon, sabor);
        while(Amogus.getVuelto != null){
            money = money+Amogus.getVuelto().getValor;
        }
        flavor = Amogus.Beber;
    }
    public int cuantoVuelto(){
        return(money);
    }
    
    public String queBebiste(){
        return(flavor);
    }
}
