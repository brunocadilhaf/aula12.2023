package Pacote3;

import java.util.InputMismatchException;

public class Carro implements Acelerador, Autenticavel {
    private String letrasPlaca;
    private int numerosPlaca;
    private int numChassi;
    private int velocidadeAtual;
    private Motorista motorista;

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public Carro(Motorista motorista) {
        this.motorista = motorista;
        motorista.setVeiculoAtual(this);
    }

    public Carro(String placa, int numChassi, Motorista motorista){
        setPlaca(placa);
        this.numChassi = numChassi;
        this.motorista = motorista;
        motorista.setVeiculoAtual(this);
    }

    public String getPlaca() {
        if ("ERRO!!!".equals(letrasPlaca)) {
            return letrasPlaca;
        } else {
            return letrasPlaca + numerosPlaca;
        }
    }

    public void setPlaca(String placa) {
        if (placa == null) {
            throw new NullPointerException("O valor da placa não pode ser nulo.");
        }

        if (placa.length() != 7) {
            throw new InputMismatchException("A placa deve ter 7 caracteres.");
        }

        if (!placa.matches("[A-Z]{3}\\d{4}")) {
            throw new InputMismatchException("A placa deve ser composta por 3 letras e 4 números.");
        }

        this.letrasPlaca = placa.substring(0, 3); //ABC
        this.numerosPlaca = Integer.parseInt(placa.substring(3)); //1234
    }
    

    public int getNumChassi() {
        return numChassi;
    }

    public void setNumChassi(int numChassi) {
        this.numChassi = numChassi;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    @Override
    public int acelerar() {
        this.velocidadeAtual++;
        return this.velocidadeAtual;
    }

    @Override
    public int acelerar(int limite) {
        for (int i = velocidadeAtual; i < limite; i++) {
            acelerar();
        }
        return this.velocidadeAtual;
    }

    public boolean frear() {
        return false;
    }

    @Override
    public String obterCredenciais() {
        return this.getPlaca();
    }
}
