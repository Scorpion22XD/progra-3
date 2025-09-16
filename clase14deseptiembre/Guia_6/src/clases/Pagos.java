package clases;

public class Pagos {
    // Atributos
    
    private String categoria;
    private double promedio;
    
    // Constructor con parametros

    public Pagos(String categoria, double promedio) {
        this.categoria = categoria;
        this.promedio = promedio;
    }
    
    // Metodos "get" y "set"

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    // Otros metodos
    // Metodo para definir la cuota del estudiante
    public double asignarCuota(){
        switch (getCategoria()) {
            case "A":
            return 85.00;
            case "B":
            return 70.00;
            case "C":
            return 65.00;
            case "D":
            return 60.00;
            default:
            return 0.00;
        }
    }
    
    // Metodo para calcular descuento que se hara al estudiante
    public double calcularDescuento() {
        if (getPromedio() <= 3.99) {
            return 0.00;
        } else if (getPromedio() <= 5.99) {
            return asignarCuota() * 0.10;
        } else if (getPromedio() <= 7.99) {
            return asignarCuota() * 0.12;
        } else {
            return asignarCuota() * 0.15;
        }
    }
    
    //  Metodo para calcular el monto mensual a pagar
    public double determinaCuotaAPagar() {
        return asignarCuota() - calcularDescuento();
    }
    
    
    
}
