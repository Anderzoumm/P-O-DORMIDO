import java.awt.*;
import java.util.List;
import java.util.stream.Collectors;

public class DoacaoComida {


    private static int id;
    private String descricaoDoacao;
    private String statusDoacao;
    private String estabelecimento;
    private double quantidadeKg;
    private String regiao;


    public DoacaoComida(String estabelecimento, String descricaoDoacao, String statusDoacao, String regiao, double quantidadeKg) {
        id++;
        this.descricaoDoacao = descricaoDoacao;
        this.estabelecimento = estabelecimento;
        this.statusDoacao = statusDoacao;
        this.regiao = regiao;
        this.quantidadeKg = quantidadeKg;
    }

    /*FILTRO POR REGIAO*/
    public static List<DoacaoComida> filtrarPorRegiao (List<DoacaoComida> doacao, String regiao){
        return doacao.stream()
                .filter(d -> d.getRegiao().equalsIgnoreCase(regiao))
                .collect(Collectors.toList());

    }

    /*VIZUALIZAR DOAÇÃO DISPONIVEL*/
    public static List<DoacaoComida> filtrarPorStatus (List<DoacaoComida> doacao, String status){
        return doacao.stream()
                .filter(d -> d.getStatusDoacao().equalsIgnoreCase(status))
                .collect(Collectors.toList());

    }




    public String getDescricaoDoacao() {
        return descricaoDoacao;
    }

    public void setDescricaoDoacao(String descricaoDoacao) {
        this.descricaoDoacao = descricaoDoacao;
    }

    public String getStatusDoacao() {
        return statusDoacao;
    }

    public void setStatusDoacao(String statusDoacao) {
        this.statusDoacao = statusDoacao;
    }

    public String getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(String estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public double getQuantidadeKg() {
        return quantidadeKg;
    }

    public void setQuantidadeKg(double quantidadeKg) {
        this.quantidadeKg = quantidadeKg;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    /* teste 3 */


}

