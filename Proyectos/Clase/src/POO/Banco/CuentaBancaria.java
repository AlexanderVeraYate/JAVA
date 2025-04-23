package Banco;

public class CuentaBancaria {
    private String numeroCuenta;
    private int saldo;
    private String nombreTitular;

    // getter and setters
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    // contructorr
    public CuentaBancaria(String numeroCuenta, int saldo, String nombreTitular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.nombreTitular = nombreTitular;
    }

    // metodos
    public void ingreso(int cantidad) {
        this.saldo = this.saldo + cantidad;
        //validar cantidad HACER

    }

    public void extraccion (int cantidad){
        this.saldo = this.saldo - cantidad;
        // que el saldo sea mayor o igual a la cantidad a extraer

    }

}
