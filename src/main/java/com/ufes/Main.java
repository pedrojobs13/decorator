package com.ufes;

import com.ufes.decorator.ItalicoDecorator;
import com.ufes.model.Mensagem;
import com.ufes.model.Whatsapp;

public class Main {
    public static void main(String[] args) {
        Mensagem mensagem = new ItalicoDecorator(new Whatsapp());
        System.out.println(mensagem.formatar("Olá"));

    }
}