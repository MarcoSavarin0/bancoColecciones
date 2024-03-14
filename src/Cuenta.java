public class Cuenta implements Comparable<Cuenta>  {
    protected Integer nroCuenta;
    protected Double saldo;

    public Cuenta(Integer nroCuenta, Double saldo) {
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }


    @Override
    public int compareTo(Cuenta o) {
        return 0;
    }
}
