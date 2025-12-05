package Main;

public abstract class Pessoa implements ExibirDados{
    private String registro;
    private String nome;
    private String telefone;
    private Endereco endereco;

    public Pessoa(String registro, String nome, String telefone, Endereco endereco) {
        this.registro = registro;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    @Override
    public void ExibirDados() {
        System.out.println("Registro: " + registro);
        System.out.println("nome: " + nome);
        System.out.println("telefone: " + telefone);
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}

