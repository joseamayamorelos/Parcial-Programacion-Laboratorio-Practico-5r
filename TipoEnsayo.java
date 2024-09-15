public class TipoEnsayo {
    private String nombre;
    private double umbralMinimo;

    public TipoEnsayo(String nombre, double umbralMinimo) {
        this.nombre = nombre;
        this.umbralMinimo = umbralMinimo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getUmbralMinimo() {
        return umbralMinimo;
    }

    public void setUmbralMinimo(double umbralMinimo) {
        this.umbralMinimo = umbralMinimo;
    }
}
