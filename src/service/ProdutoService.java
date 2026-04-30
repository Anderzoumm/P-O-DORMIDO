package service;

import entities.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoService {

    private static List<Produto> lista = new ArrayList<>();

    public void Cadastro(String nome,String descrição,String preço,String datadevalidade,double preçooriginal,double preçodesconto,double quantidade){
        Produto x = new Produto(nome,descrição,preço,datadevalidade,preçooriginal,preçodesconto,quantidade);
        lista.add(x);
    }

}
