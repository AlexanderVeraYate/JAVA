package Banco;

public class GestionCuentas {
    public static void main(String[] args) {
        CuentaBancaria Cuenta1 = new CuentaBancaria("12345", 500, "messi");




        System.out.println("Numero: " + Cuenta1.getNumeroCuenta());
        System.out.println("Saldo: " + Cuenta1.getSaldo());
        System.out.println("Nombre: " + Cuenta1.getNombreTitular());

    }
}

// Ejercicio CuentaBancaria. Escribir una clase CuentaBancaria que represente
// una cuenta bancaria con
// estos atributos: numerocuenta, saldo, nombretitular. Hacer métodos que hagan
// estas funciones:
// • void ingreso (int cantidad) - hacer un ingreso en la cuenta
// • void extraccion (int cantidad) - hacer una extracción de la cuenta
// La clase ha de tener un constructor con todos los atributos.
// Hacer otra clase GestionCuentas que en un método main haga;
// • crear una cuenta con saldo inicial 500
// • consultar el saldo
// • hacer un ingreso de 300
// • consultar el saldo
// • hacer una extracción de 600
// • consultar el saldo
// MEJORA 1: Considerar que una cuenta no puede quedar al descubierto (con saldo
// < 0)
// MEJORA 2: Por cada ingreso que se haga en la cuenta se mira si el saldo
// supera los 1000 euros, en
// cuyo caso, se incrementa el saldo en un 2%.
// MEJORA 3: Tener en consideración que el crear la cuenta se considera asimismo
// un ingreso
// MEJORA 4: Crear un método que sea ingresoTotal, que recibe un objeto de la
// clase CuentaBancaria
// y pasa todo su dinero a nuestra cuenta.
// MEJORA 5: Cambiar el nombre de titular por un objeto de una nueva clase,
// Persona, que tiene
// nombre y apellidos y edad. Cambiar todo y probar. Añadir que, si el titular
// es menor de edad, no se