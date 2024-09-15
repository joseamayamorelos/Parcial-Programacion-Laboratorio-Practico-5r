import java.util.List;
 import java.util.ArrayList;

public class Ensayo {
    private String codigoEnsayo;
    private Muestra muestra;
    private TipoEnsayo tipoEnsayo;
    private List<Medida> medidas;

    public Ensayo(String codigoEnsayo, Muestra muestra, TipoEnsayo tipoEnsayo) {
        this.codigoEnsayo = codigoEnsayo;
        this.muestra = muestra;
        this.tipoEnsayo = tipoEnsayo;
        this.medidas = new ArrayList<>();
    }

    public String getCodigoEnsayo() {
        return codigoEnsayo;
    }

    public void setCodigoEnsayo(String codigoEnsayo) {
        this.codigoEnsayo = codigoEnsayo;
    }

    public Muestra getMuestra() {
        return muestra;
    }

    public void setMuestra(Muestra muestra) {
        this.muestra = muestra;
    }

    public TipoEnsayo getTipoEnsayo() {
        return tipoEnsayo;
    }

    public void setTipoEnsayo(TipoEnsayo tipoEnsayo) {
        this.tipoEnsayo = tipoEnsayo;
    }

    public List<Medida> getMedidas() {
        return medidas;
    }

}
