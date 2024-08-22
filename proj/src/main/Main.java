package main;

import main.ferramentas.iphone.Iphone;

public class Main {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        iphone.selecionarMusica("Nirvana - Something In The Way");
        iphone.tocar();
        iphone.pausar();

        iphone.ligar("9XXXX-YYYY");
        iphone.iniciarCorreioVoz();
        iphone.atender();

        iphone.adicionarNovaAba();
        iphone.exibirPagina("https://www.dio.me/");
        iphone.atualizarPagina();
    }
}