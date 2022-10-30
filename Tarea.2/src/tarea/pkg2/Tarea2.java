package tarea.pkg2;

import java.util.Stack;

public class Tarea2 {
    public static void main(String[] args) {
        Expendedor Bendomatica = new Expendedor(2, 400);
        Stack<Moneda> M100 = new Stack<Moneda>();
        Stack<Moneda> M500 = new Stack<Moneda>();
        Stack<Moneda> M1000 = new Stack<Moneda>();
        Stack<Comprador> C = new Stack<Comprador>();
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
        int clientnum = 1;
        while(!C.empty()) {
            System.out.println("Cliente numero: " + clientnum);
            System.out.println(C.lastElement().cuantoVuelto());
            System.out.println(C.lastElement().queBebiste());
            C.pop();
            clientnum++;
        }
    }
}
