import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private String apellido;
    private Integer edad;

    private List<Cuenta> cuentas = new ArrayList<>();

    public Persona(String nombre, String apellido, Integer edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombreYapellido() {
        return nombre + " " + apellido;
    }

    public boolean esMayor(){
        return edad  > 60;
    }
    public double getSaldoTotal(){
        double suma = 0;
        for (Cuenta cuenta : cuentas) {
            suma += cuenta.saldo;
        }
        return suma;
    }
    public void getCuentas(){
        for(Cuenta cuenta: cuentas){
            System.out.println(cuenta);
        }
    }
    public void agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

}
