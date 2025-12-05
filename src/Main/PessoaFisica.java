package Main;

public class PessoaFisica extends Pessoa{
    private String dataNascimento;

    public PessoaFisica(String registro, String nome, String telefone, String dataNascimento) {
        super(registro, nome, telefone);
        this.dataNascimento = dataNascimento;
    }

    @Override
    public void ExibirDados() {
        System.out.println("CPF: " + super.getRegistro());
        System.out.println("Nome: " + super.getNome());
        System.out.println("Telefone: " + super.getTelefone());
        System.out.println("Data de Nascimento: " + dataNascimento);
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
