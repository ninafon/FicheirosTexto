
package exemficheiros;

public class Datos {
    
    private String nome;
    private String apelido;
    private String dni;
    private int edade;

    public Datos() {
    }

    public Datos(String nome, String apelido, String dni, int edade) {
        this.nome = nome;
        this.apelido = apelido;
        this.dni = dni;
        this.edade = edade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdade() {
        return edade;
    }

    public void setEdade(int edade) {
        this.edade = edade;
    }

    @Override
    public String toString() {
        return  "nome=" + nome + ", apelido=" + apelido + ", dni=" + dni + ", edade=" + edade ;
    }
    
    
    
}
