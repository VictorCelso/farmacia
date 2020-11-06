import model.Cosmetico;
import model.Medicamento;
import model.Produto;
import model.Venda;
import net.bytebuddy.utility.RandomString;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private static RandomString randomString = new RandomString();
    private static Random random = new Random();
    public static void main(final String[] args) throws Exception {
        realizarVenda();
        System.out.println(String.format(""));
    }

    private static Produto comprarCosmetico(){
        Produto cosmetico = new Cosmetico();
        cosmetico.setDescricao(randomString.nextString());
        cosmetico.setEstoque(random.nextInt());
        cosmetico.setFornecedor(randomString.nextString());
        cosmetico.setPreco(random.nextDouble());
        cosmetico.setValidade(LocalDate.now().plusDays(random.nextInt()));
        return cosmetico;
    }

    private static Produto comprarMedicamento(){
        Produto medicamento = new Medicamento();
        medicamento.setDescricao(randomString.nextString());
        medicamento.setEstoque(random.nextInt());
        medicamento.setFornecedor(randomString.nextString());
        medicamento.setPreco(random.nextDouble());
        medicamento.setValidade(LocalDate.now().plusDays(random.nextInt()));
        return medicamento;
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