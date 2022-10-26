/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg2;

/**
 *
 * @author Cesar
 */
public class Expendedor {
    private depositoMoneda platica = new depositoMoneda();
    private DepositoBebida glucgluc;
    private int cantBebidas[]= new int[3];
    
    public Expendedor(int nbebidas, int price){
        cantBebidas[0]=nbebidas;
        cantBebidas[1]=nbebidas;
        cantBebidas[2]=nbebidas;
        for(int k = 0; k<3; k = k+1){
            for(int i = 0; i<nbebidas; i = i+1){
                switch (k) {
                    case 0:{
                            CocaCola aux = new CocaCola(i+100);
                            glucgluc.addBebida(aux);
                            break;
                        }
                    case 1:{
                            Fanta aux = new Fanta(i+200);
                            glucgluc.addBebida(aux);
                            break;
                        }
                    case 2:{
                            Sprite aux = new Sprite(i+300);
                            glucgluc.addBebida(aux);
                            break;
                        }
                    default:
                       break;
                }
            }
        }       
    }
    
    public Bebida comprarBebida(Moneda m, int sabor){
        switch (sabor){
            case 0:{
                int aux = cantBebidas[0];
                return(glucgluc.getBebida
            }
        }
    }
    
    
}
