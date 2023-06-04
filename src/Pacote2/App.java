package Pacote2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import Pacote3.Motorista;
import Pacote3.Pessoa;
import Pacote3.Passageiro;
public class App {
    public static void main(String[] args) throws Exception {
        /* Limpa o terminal */
        System.out.print("\033[H\033[2J");
        System.out.flush();
        /* Limpa o terminal */
        List<Pessoa> lista = new ArrayList<>(); 
        lista.add(new Passageiro("Bruno - 1","358425", 29));
        lista.add(new Passageiro("Jose - 2","158425547854", 19));
        lista.add(new Passageiro("Kesia - 3","573753", 15));
        lista.add(new Motorista("Camille - 1", "1234", 15));
        lista.add(new Motorista("chris - 2","155664", 19));

        double media =
          lista.stream().collect(Collectors.averagingDouble(Pessoa::getIdade));
        System.out.println("Média: " + media);

        System.out.println("*******");

        IntSummaryStatistics resumo =
          lista.stream().collect(Collectors.summarizingInt(Pessoa::getIdade));

        System.out.println("Média: " + resumo.getAverage());

        System.out.println("*******");

        List<Pessoa> novaLista = lista.stream()
          .filter(p -> p instanceof Passageiro)
          .sorted(Comparator.comparing(Pessoa::getCpf))
          .collect(Collectors.toList());

          novaLista.forEach(System.out::println);

    }
}
