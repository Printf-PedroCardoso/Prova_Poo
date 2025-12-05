package Main;

public class Endereco {
    private String CEP;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String UF;

    public Endereco(String CEP, String logradouro, String bairro, String cidade, String UF) {
        this.CEP = CEP;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.UF = UF;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }
}
