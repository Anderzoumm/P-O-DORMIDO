import java.util.ArrayList;
import java.util.List;

public class Main{
    static void main(String[] args) {


        List<DoacaoComida> todasDoacoes = new ArrayList<>();

        todasDoacoes.add (new DoacaoComida("Mix Matheus", "Arroz e feijao", "Disponivel" , "Centro", 15));
        todasDoacoes.add(new DoacaoComida("Padaria Bom sucesso", "Pães", "Disponível", "Centro", 3.0));
        todasDoacoes.add(new DoacaoComida("Sacolao", "Frutas", "Pendente", "Jatoba", 7.2));

        List<DoacaoComida> filtroCentro = DoacaoComida.filtrarPorRegiao(todasDoacoes, "centro");

        //vai anderson envia esse negocio logo


    }

}