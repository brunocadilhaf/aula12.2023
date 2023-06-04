package Pacote3;

import java.util.function.Predicate;

public class Contem2Predicado implements Predicate<Pessoa> {
    @Override
    public boolean test(Pessoa pessoa) {
        return pessoa.getNome().contains("2");
    }
}
