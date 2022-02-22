package br.com.dio;

public class Mensagem {

    public static void obterMensagem(int hora) {

        switch (hora) {
            case 5, 6, 7, 8, 9, 10, 11, 12 -> mensagemBomdia();
            case 13, 14, 15, 16, 17 -> mensagemBoaTarde();
            case 18, 19, 20, 21, 22, 23, 0, 1, 2, 3, 4 -> mensagemBoaNoite();
            default -> System.out.println("Hora inválida");
        }
    }

    public static void mensagemBomdia() {
        System.out.println("Bom dia!");
    }

    public static void mensagemBoaTarde() {
        System.out.println("Boa tarde!");
    }

    public static void mensagemBoaNoite() {
        System.out.println("Boa noite!");
    }
}
