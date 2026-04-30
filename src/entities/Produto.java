package entities;

public class Produto {

    private String nome,descrição,preço,datadevalidade;
    private double preçooriginal,preçodesconto,quantidade;

    public Produto(String nome, String descrição, String preço, String datadevalidade, double preçooriginal, double preçodesconto, double quantidade) {
        this.nome = nome;
        this.descrição = descrição;
        this.preço = preço;
        this.datadevalidade = datadevalidade;
        this.preçooriginal = preçooriginal;
        this.preçodesconto = preçodesconto;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public String getPreço() {
        return preço;
    }

    public void setPreço(String preço) {
        this.preço = preço;
    }

    public String getDatadevalidade() {
        return datadevalidade;
    }

    public void setDatadevalidade(String datadevalidade) {
        this.datadevalidade = datadevalidade;
    }

    public double getPreçooriginal() {
        return preçooriginal;
    }

    public void setPreçooriginal(double preçooriginal) {
        this.preçooriginal = preçooriginal;
    }

    public double getPreçodesconto() {
        return preçodesconto;
    }

    public void setPreçodesconto(double preçodesconto) {
        this.preçodesconto = preçodesconto;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getDesconto(){
        double desconto = getPreçooriginal() / getPreçodesconto();
        desconto = Integer.valueOf(String.format("%.2f", desconto));
        return desconto;
    }



}
