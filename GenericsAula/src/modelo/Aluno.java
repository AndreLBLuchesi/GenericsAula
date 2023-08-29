package modelo;

public class Aluno {
    private String nome;
    private String ra;

    public Aluno() {
    }

    public Aluno(String nome, String ra) {
        this.nome = nome;
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", ra=" + ra + '}';
    }
    
    
}
