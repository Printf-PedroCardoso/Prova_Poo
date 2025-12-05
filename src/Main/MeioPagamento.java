package Main;

public abstract class MeioPagamento {
    private String Nome;

    public MeioPagamento(String nome) {
        Nome = nome;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }
}
