package src.Agregacao;
public class Programa {
    public static void main(String args[]) {
        Produto produtoTV = criarProduto(1L,4000d,"TV");
        Produto produtoCel = criarProduto(2L, 3000d,"Smartphone");

        Vendedor vendedor = criarVendedor("Victor Bruno", 0.2d);

        Comprador comprador = criarComprador("Rodrigo Pires", 10000d);

        Venda venda = new Venda();
        venda.setVendedor(vendedor);
        venda.setComprador(comprador);
        venda.add(produtoTV);
        venda.add(produtoCel);

        venda.confirmarVenda();
//        System.out.println(venda);
//        venda.cancelarVenda();
//        venda = null;
//        System.out.println(venda);
    }

    private static Comprador criarComprador(String nome, Double verba) {
        Comprador comprador = new Comprador(nome, verba);
//        comprador.setNome(nome);
//        comprador.setVerba(verba);
        return comprador;
    }

    private static Vendedor criarVendedor(String nome, Double comissao) {
        Vendedor vendedor = new Vendedor();
        vendedor.setNome(nome);
        vendedor.setComissao(comissao);
        return vendedor;
    }

    private static Produto criarProduto(Long codigo, Double valor, String nome) {
        Produto produto = new Produto();
        produto.setCodigo(codigo);
        produto.setPreco(valor);
        produto.setNome(nome);
        return produto;
    }

}
