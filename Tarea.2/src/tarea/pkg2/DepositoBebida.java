package tarea.pkg2;
import java.util.ArrayList;
public class DepositoBebida {
    private ArrayList<Bebida> al;
    public DepositoBebida(){
        al = new ArrayList<Bebida>();
    }
    public void addBebida(Bebida B){
        al.add(B);
    }
    public Bebida getBebida(){
        if (al.size()==0) {
            return null;
        }else{
            return al.remove(0);
        }
    }
    public int getStorage(){
        return al.size();
    }
}
