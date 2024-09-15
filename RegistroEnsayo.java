import java.util.ArrayList;
import java.util.List;

public class RegistroEnsayo {
    private List<Ensayo> ensayos;

    public RegistroEnsayo() {
        this.ensayos = new ArrayList<>();
    }

    

    public List<Ensayo> getEnsayos() { 
        return ensayos; }
    public void addEnsayo(Ensayo ensayo) {
        this.ensayos.add(ensayo); }
}
