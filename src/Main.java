//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta(1, 1000.0);
        Cuenta cuenta2 = new Cuenta(2, 2000.0);

        // Crear una persona y agregar las cuentas
        Persona persona = new Persona("Juan", "Perez", 35);
        persona.agregarCuenta(cuenta1);
        persona.agregarCuenta(cuenta2);

        // Acceder a métodos de la persona
        System.out.println("Nombre completo: " + persona.getNombreYapellido());
        System.out.println("¿Es mayor de 60 años?: " + persona.esMayor());
        System.out.println("Saldo total de todas las cuentas: " + persona.getSaldoTotal());

        // Mostrar las cuentas de la persona
        System.out.println("Cuentas:");
        persona.getCuentas();
    }
}