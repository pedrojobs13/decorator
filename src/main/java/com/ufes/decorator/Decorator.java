package com.ufes.decorator;

import com.ufes.model.Mensagem;

public abstract class Decorator implements Mensagem {
    protected Mensagem mensagem;

    public Decorator(Mensagem mensagem) {
        this.mensagem = mensagem;
    }
}
