package tarea.pkg2;
public class Expendedor {
    private depositoMoneda DVuelto = new depositoMoneda();
    private int precio;
    private DepositoBebida cocacola = new DepositoBebida();
    private DepositoBebida sprite = new DepositoBebida();
    private DepositoBebida fanta = new DepositoBebida();
    public Expendedor(int nbebidas, int precio){
        this.precio = precio;
        for (int i = 0; i < nbebidas; i++) {
            CocaCola auxC = new CocaCola (i);
            cocacola.addBebida(auxC);
            Sprite auxS = new Sprite (nbebidas+i);
            sprite.addBebida(auxS);
            Fanta auxF = new Fanta ((nbebidas*2)+i);
            fanta.addBebida(auxF);
        }
    }    
    public Bebida comprarBebida(Moneda m, int n) throws NoHayBebidaException, PagoIncorrectoException, PagoInsuficienteException{
        int money = m.getValor();
        if (m == null) {
            throw new PagoIncorrectoException("Pago no valido");
        }
        if (m.getValor()<precio) {
            throw new PagoInsuficienteException("El Monto de Pago no es suficiente para realizar la transaccion");
        }
        Bebida out = null;
        switch(n){
            case 1: 
                out = cocacola.getBebida();
                if (out == null) {
                    throw new NoHayBebidaException("Actualmente no hay mas Cocacola, lo sentimos");
                }
                money = money - precio;
                while(money>0){
                    DVuelto.addMoneda(new Moneda100());
                    money = money - 100;
                }
                break;
            case 2: 
                out = sprite.getBebida();
                if (out == null) {
                    throw new NoHayBebidaException("Actualmente no hay mas Sprite, lo sentimos");
                }
                money = money - precio;
                while(money>0){
                    DVuelto.addMoneda(new Moneda100());
                    money = money - 100;
                }
                break;
            case 3: 
                out = fanta.getBebida();
                if (out == null) {
                    throw new NoHayBebidaException("Actualmente no hay mas Fanta, lo sentimos");
                }
                money = money - precio;
                while(money>0){
                    DVuelto.addMoneda(new Moneda100());
                    money = money - 100;
                }
                break;
            default:
                if (n!=1&&n!=2&&n!=3) {
                    throw new NoHayBebidaException("El numero ingresado no posee una bebida asociada");
                }
        }
        return out;
    }
    public Moneda getVuelto(){
        if (DVuelto.check()>0) {
            return DVuelto.getMoneda();
        }else{
            return null;
        }
    }
    public int getPrice(){
        return precio;
    }
}
