import java.util.List;

public class Informe {
    private Ensayo ensayo;
    private List<Medida> medidas;
    private boolean cumpleConNormas;

    public Informe(Ensayo ensayo, List<Medida> medidas, boolean cumpleConNormas) {
        this.ensayo = ensayo;
        this.medidas = medidas;
        this.cumpleConNormas = cumpleConNormas;
    }


    public Ensayo getEnsayo() { return ensayo; }

    public void setEnsayo(Ensayo ensayo) { this.ensayo = ensayo; }
    
    public List<Medida> getMedidas() { return medidas; }
    public void setMedidas(List<Medida> medidas) { this.medidas = medidas; }
    
    public boolean isCumpleConNormas() { return cumpleConNormas; }
    public void setCumpleConNormas(boolean cumpleConNormas) { this.cumpleConNormas = cumpleConNormas; }
}
