package src.Agregacao;

import java.util.*;

public class Venda {
    private Comprador comprador;
    private Vendedor vendedor;
    private List<Produto> produto;
    public Venda(){
        this.produto = new ArrayList<>();
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<Produto> getProduto() {
        return produto;
    }
    public void add(Produto produto) {
        this.produto.add(produto);
    }

    public void confirmarVenda(){
        System.out.println("Comprador " + this.comprador.getNome());
        System.out.println("Comprou os seguintes produtos: ");
        for(Produto prod : this.produto){
            System.out.println("Item: " + prod.getNome() + " Valor: " + prod.getPreco());
        }
        System.out.println("Vendedor: " + this.vendedor.getNome());
    }

    public void cancelarVenda(){
        System.out.println("Venda cancelada");
    }

    @Override
    public String toString() {
        return "Venda{" +
                "comprador=" + comprador.getNome() +
                ", vendedor=" + vendedor.getNome() +
                ", produto=" + produto +
                '}';
    }
}
