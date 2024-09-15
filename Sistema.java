public class Sistema {
    private RegistroEnsayo registroEnsayo;
    private Director director;

    public Sistema(RegistroEnsayo registroEnsayo, Director director) {
        this.registroEnsayo = registroEnsayo;
        this.director = director;
    }

    // Getters y Setters
    public RegistroEnsayo getRegistroEnsayo() {
    return registroEnsayo; }

    public void setRegistroEnsayo(RegistroEnsayo registroEnsayo) {
        this.registroEnsayo = registroEnsayo; }
    
    public Director getDirector() {
        return director; }

    public void setDirector(Director director) { 
        this.director = director; }
    
}
