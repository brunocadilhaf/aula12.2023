package Pacote3;

public class Pessoa implements Comparable<Pessoa> {
    protected String nome;
    protected String cpf;
    protected int idade;

    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }


    @Override
    public String toString() {
        return String.format("Nome: %s - CPF: %s", nome, cpf);
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    @Override
    public int compareTo(Pessoa outraPessoa) {
        return this.getNome().toUpperCase().compareTo(outraPessoa.getNome().toUpperCase());
    }
}
