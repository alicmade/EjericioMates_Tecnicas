package org.example;

public class datoPolinomioImpl implements datoPolinomio {
    private double valor;
    private int termino;

    public datoPolinomioImpl(double valor, int termino) {
        this.valor = valor;
        this.termino = termino;
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public int getTermino() {
        return termino;
    }

    @Override
    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public void setTermino(int termino) {
        this.termino = termino;
    }
}