

public class Main {
    public static void main(String[] args) {
        // Crear instancias
        Director director = new Director("Dr. Ana Martínez", "AM1234");

        TipoEnsayo tipoEnsayo = new TipoEnsayo("Ensayo de Resistencia", 50.0);

        Muestra muestra1 = new Muestra("M001", "Lote001");

        Ensayo ensayo1 = new Ensayo("E001", muestra1, tipoEnsayo);

        RegistroEnsayo registroEnsayo = new RegistroEnsayo();
        registroEnsayo.addEnsayo(ensayo1);

        Informe informe1 = new Informe(ensayo1, ensayo1.getMedidas(), true);
        Certificado certificado1 = new Certificado(muestra1.getLote(), director.getFirma());

        // Mostrar datos
        System.out.println("Ensayo: " + ensayo1.getCodigoEnsayo());
        System.out.println("Muestra: " + ensayo1.getMuestra());
        System.out.println("Tipo de Ensayo: " + ensayo1.getTipoEnsayo().getNombre());
        for (Medida medida : ensayo1.getMedidas()) {
            System.out.println("Medida: Valor=" + medida.getValor());
        }

        System.out.println("\nInforme de Ensayo: ");
        System.out.println("Cumple con normas: " + informe1.isCumpleConNormas());

        System.out.println("\nCertificado: ");
        System.out.println("Lote: " + certificado1.getLote() + ", Firma del Director: " + certificado1.getFirmaDirector());
    }
}
