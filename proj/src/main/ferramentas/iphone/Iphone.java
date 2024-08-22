package main.ferramentas.iphone;

import main.ferramentas.aparelhoTelefonico.AparelhoEletronico;
import main.ferramentas.navegadorInternet.NavegadorInternet;
import main.ferramentas.reprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoEletronico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("TOCANDO A MÚSICA");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSADA A MÚSICA");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.printf("SELECIONADA A MÚSICA %s\n", musica);
    }


    @Override
    public void ligar(String numero) {
        System.out.printf("LIGANDO PARA %s\n", numero);
    }

    @Override
    public void atender() {
        System.out.println("ATENDIDO");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIADO O CORREIO DE VOZ");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.printf("EXIBE A PÁGINA WEB DE URL (%s)\n", url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONADA A NOVA ABA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZADA A PÁGINA");
    }
}
