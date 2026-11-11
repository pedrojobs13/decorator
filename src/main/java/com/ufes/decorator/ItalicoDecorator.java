package com.ufes.decorator;

import com.ufes.model.Mensagem;

public class ItalicoDecorator extends Decorator {
    public ItalicoDecorator(Mensagem mensagem) {
        super(mensagem);
    }
    @Override
    public String formatar(String texto) {
        return "_" + mensagem.formatar(texto) + "_";
    }
}
