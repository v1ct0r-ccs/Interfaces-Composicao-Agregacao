package src;

import src.Interface.*;

public class ClasseTeste {
    public static void main(String args[]) {
        ICaneta caneta = new CanetaEsferografica();
        caneta.escrever("Olá Victor");
        caneta.escreverComumATodas();
        System.out.println(caneta.getCor());
        System.out.println("");

        ICaneta giz = new Giz();
        giz.escrever("Olá Victor");
        giz.escreverComumATodas();
        System.out.println(giz.getCor());
        System.out.println("");

        ICaneta lapis = new Lapis();
        lapis.escrever("Olá Victor");
        lapis.escreverComumATodas();
        System.out.println(lapis.getCor());
        System.out.println("");

        ICarro carro = new CarroPasseio();
        carro.andar();
        carro.parar();

        ICarro caminhao = new Caminhao();
        caminhao.andar();
        caminhao.parar();
    }
}
