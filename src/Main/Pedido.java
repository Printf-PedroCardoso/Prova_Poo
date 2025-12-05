package Main;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<> Itens;
    private Cliente cliente;
    private Empresa empresa;
    private Vendedor vendedor;
    private Pagamento pagamento;

    public Pedido(Cliente cliente, Empresa empresa, Vendedor vendedor) {
        this.cliente = cliente;
        this.empresa = empresa;
        this.vendedor = vendedor;
        Itens = new ArrayList()<Item>;
    }

    public void AdicionarItem (Item item){
        Itens.add(item);
    }

    public ArrayList getItens() {
        return Itens;
    }

    public void setItens(ArrayList itens) {
        Itens = itens;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    private void validar()
    {
        int total = 0;
        for (item: Itens)
        {
            total = total + (item.getProduto().)
        }

    }
}
