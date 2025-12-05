package Main;

public class Produto {
    private String nome;
    private String descricao;
    private double valorUnitario;
    private int estoque;
    private Categoria categoria;
    private Categoria subcategoria;
    private Fabricante fabricante;

    public Produto(String nome, String descricao, double valorUnitario, int estoque, Categoria categoria, Categoria subcategoria, Fabricante fabricante) {
        this.nome = nome;
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
        this.estoque = estoque;
        this.categoria = categoria;
        this.subcategoria = subcategoria;
        this.fabricante = fabricante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Categoria getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(Categoria subcategoria) {
        this.subcategoria = subcategoria;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
}
