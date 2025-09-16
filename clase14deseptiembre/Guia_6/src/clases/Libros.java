
package clases;


public class Libros {

    public static int gettAnalisisB() {
        return tAnalisisB;
    }

    public static void settAnalisisB(int atAnalisisB) {
        tAnalisisB = atAnalisisB;
    }
    // atributos
    private String nombre;
    private String editorial;
    private String tipo;
    private int año;
    private int paginas;
    private double costo;
    
    // variables de clase
    private static int tAnalisisB;

    public Libros(String nombre, String editorial, String tipo, int año, int paginas, double costo) {
        this.nombre = nombre;
        this.editorial = editorial;
        this.tipo = tipo;
        this.año = año;
        this.paginas = paginas;
        this.costo = costo;
        
        // Metodo que utilizaremos para contar la cantidad de libros de determinado "tipo"
        conteos();
        
    }
    
    // metodos get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    // Otros metodos
    // Metodo que permite contar libros de tipo "Analisis"
    final void conteos() {
        if (getTipo().equals("Analisis") && getEditorial().equals("B")) {
            tAnalisisB++;
        }
    }
    
    
    
    
}
