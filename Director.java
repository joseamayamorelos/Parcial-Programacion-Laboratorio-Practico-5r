public class Director {
    private String nombre;
    private String firma;

    public Director(String nombre, String firma) {
        this.nombre = nombre;
        this.firma = firma;
    }

    public String getNombre() {
        return nombre; }
    public void setNombre(String nombre) {
        this.nombre = nombre; }
    
    public String getFirma() { 
        return firma; }
    public void setFirma(String firma) { 
        this.firma = firma; }
}
