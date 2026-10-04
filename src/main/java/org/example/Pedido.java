package org.example;

import java.util.Observable;

public class Pedido extends Observable {

    private Integer codigo;
    private String produto;
    private String transportadora;

    public Pedido(Integer codigo, String produto, String transportadora) {
        this.codigo = codigo;
        this.produto = produto;
        this.transportadora = transportadora;
    }

    public void atualizarStatus() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "codigo=" + codigo +
                ", produto='" + produto + '\'' +
                ", transportadora='" + transportadora + '\'' +
                '}';
    }
}