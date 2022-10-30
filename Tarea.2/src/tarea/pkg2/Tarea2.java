package tarea.pkg2;

import java.util.Stack;

public class Tarea2 {
    public static void main(String[] args) {
        Expendedor Bendomatica = new Expendedor(2, 400);
        Stack<Moneda> M100 = new Stack<Moneda>();
        Stack<Moneda> M500 = new Stack<Moneda>();
        Stack<Moneda> M1000 = new Stack<Moneda>();
        Stack<Comprador> C = new Stack<Comprador>();
        //
        System.out.println("Test Creacion de Objetos");
        for (int i = 0; i < 5; i++) {
            M100.push(new Moneda100());
            M500.push(new Moneda500());
            M1000.push(new Moneda1000());
        }
        for (int i = 1; i < 5; i++) {
            try{
                C.push(new Comprador(M100.firstElement(), i,Bendomatica));
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            M100.pop();
            try{
                C.push(new Comprador(M500.firstElement(), i,Bendomatica));
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            M500.pop();
            try{
                C.push(new Comprador(M1000.firstElement(), i,Bendomatica));
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            M1000.pop();
        }
        try{
            C.push(new Comprador(M1000.firstElement(), 1,Bendomatica));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
            C.push(new Comprador(M1000.firstElement(), 2,Bendomatica));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
            C.push(new Comprador(M1000.firstElement(), 3,Bendomatica));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        int clientnum = 6;
        System.out.println();
        //
        System.out.println("Test Cliente y Expendedor");
        System.out.println("Precio por Bebida en la maquina Expendedora: " + Bendomatica.getPrice());
        while(!C.empty()) {
            System.out.println("Cliente numero: " + clientnum);
            System.out.println("Compro: " + C.lastElement().queBebiste());
            System.out.println("Vuelto: " + C.lastElement().cuantoVuelto());
            C.pop();
            clientnum--;
        }
        System.out.println("Vuelto restante en la maquina Expendedora: " + Bendomatica.getVuelto());
        System.out.println();
        //
        System.out.println("Test Bebidas");
        CocaCola CC = new CocaCola(6);
        Fanta F = new Fanta(7);
        Sprite S = new Sprite(8);
        System.out.println("Bebida sabor " + CC.beber() + " Numero de Serie: " + CC.getSerie());
        System.out.println("Bebida sabor " + F.beber() + " Numero de Serie: " + F.getSerie());
        System.out.println("Bebida sabor " + S.beber() + " Numero de Serie: " + S.getSerie());
        System.out.println();
        //
        System.out.println("Test Monedas");
        Moneda100 m100 = new Moneda100();
        Moneda500 m500 = new Moneda500();
        Moneda1000 m1000 = new Moneda1000();
        System.out.println("Moneda de " + m100.getValor() + " Numero de Serie: " + m100.getSerie());
        System.out.println("Moneda de " + m500.getValor() + " Numero de Serie: " + m500.getSerie());
        System.out.println("Moneda de " + m1000.getValor() + " Numero de Serie: " + m1000.getSerie());
        
        
    }
}
