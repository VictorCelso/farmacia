import model.Cosmetico;
import model.Medicamento;
import model.Produto;
import model.Venda;

import java.nio.charset.Charset;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private static byte[] randomString = new byte[10];
    private static Random random = new Random();
    public static void main(final String[] args) throws Exception {
        System.out.println(realizarVenda().toString());
    }

    private static Produto comprarCosmetico(){
        Produto cosmetico = new Cosmetico();
        return getProduto(cosmetico);
    }

    private static Produto getProduto(Produto produto) {
        random.nextBytes(randomString);
        produto.setDescricao(new String(randomString, Charset.defaultCharset()));
        produto.setEstoque(random.nextInt());
        random.nextBytes(randomString);
        produto.setFornecedor(new String(randomString, Charset.defaultCharset()));
        produto.setPreco(random.nextDouble());
        produto.setValidade(LocalDate.now().plusDays(random.nextInt()));
        return produto;
    }

    private static Produto comprarMedicamento(){
        Produto medicamento = new Medicamento();
        return getProduto(medicamento);
    }

    private static Venda realizarVenda(){
        Venda venda = new Venda();
        venda.setCpfCliente("000.000.000-00");
        List<Produto> produtos = new ArrayList<>();
        for (int i = 0; i < random.nextInt(); i++) {
            Produto p;
            if(random.nextInt()%2==0)
                p = comprarCosmetico();
            else
                p = comprarMedicamento();
            produtos.add(p);
            venda.setTotal(venda.getTotal()+p.getPreco());
        }
        venda.setProdutos(produtos);
        return venda;
    }
}