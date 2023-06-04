package Pacote3;

public class Motorista extends Pessoa implements Acelerador, Autenticavel {
    private int matricula;
    private Carro veiculoAtual;


    public Motorista(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public Carro getVeiculoAtual() {
        return veiculoAtual;
    }

    public void setVeiculoAtual(Carro veiculoAtual) {
        this.veiculoAtual = veiculoAtual;
    }

    public Motorista() { }

    public Motorista(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public int acelerar(int limite) {
        return this.veiculoAtual.acelerar(limite);
    }

    @Override
    public int acelerar() {
        return this.veiculoAtual.acelerar();
    }

    @Override
    public String obterCredenciais() {
        return this.getCpf();
    }
}
