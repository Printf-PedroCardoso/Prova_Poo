package Main;

public class PessoaJuridica extends Pessoa implements ExibirDados{
    private String razaoSocial;
    private String dataFundacao;


    public PessoaJuridica(String registro, String nome, String telefone, String razaoSocial, String dataFundacao, Endereco endereco) {
        super(registro, nome, telefone, endereco);
        this.razaoSocial = razaoSocial;
        this.dataFundacao = dataFundacao;
    }

    @Override
    public void ExibirDados() {
        System.out.println("CNPJ: " + super.getRegistro());
        System.out.println("Nome Fantasia: " + super.getNome());
        System.out.println("telefone: " + super.getTelefone());
        System.out.println("Razão Social: " + razaoSocial);
        System.out.println("Data fundação: " + dataFundacao);
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(String dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

}
