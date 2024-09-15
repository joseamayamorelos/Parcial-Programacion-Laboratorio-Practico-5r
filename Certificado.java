import java.time.LocalDate;

public class Certificado {
    private String lote;
    private String firmaDirector;
    private LocalDate fechaEmision;

    public Certificado(String lote, String firmaDirector) {
        this.lote = lote;
        this.firmaDirector = firmaDirector;
        this.fechaEmision = LocalDate.now();
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getFirmaDirector() {
        return firmaDirector;
    }

    public void setFirmaDirector(String firmaDirector) {
        this.firmaDirector = firmaDirector;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }
}
