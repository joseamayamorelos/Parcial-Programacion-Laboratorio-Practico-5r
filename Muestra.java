import java.util.ArrayList;
import java.util.List;

public class Muestra {
    private String codigoUnico;
    private String lote;
    private List<Ensayo> ensayos;

    public Muestra(String codigoUnico, String lote) {
        this.codigoUnico = codigoUnico;
        this.lote = lote;
        this.ensayos = new ArrayList<>();
    }

    public String getCodigoUnico() {
        return codigoUnico;
    }

    public void setCodigoUnico(String codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public List<Ensayo> getEnsayos() {
        return ensayos;
    }

    public void agregarEnsayo(Ensayo ensayo) {
        this.ensayos.add(ensayo);
    }
}
