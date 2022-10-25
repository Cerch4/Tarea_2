package tarea.pkg2;
public abstract class Bebida {
    int numSerie;
    public Bebida(int numSerie){
        this.numSerie = numSerie;
    }
    public int getSerie(){
        return numSerie;
    }
    public abstract String beber(); 
}
