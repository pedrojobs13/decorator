package com.ufes.decorator;

import com.ufes.model.Mensagem;

public class NegritoDecorator extends Decorator {
    public NegritoDecorator(Mensagem mensagem) {
        super(mensagem);
    }

    @Override
    public String formatar(String texto) {
        return "*" + mensagem.formatar(texto) + "*";
    }
}
