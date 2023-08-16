package br.com.david.mymusics.models;

public class MyFavorite {

    public void increase (Audio audio) {
        if (audio.getClassification() >= 8) {
            System.out.println(audio.getTitle() + " é considerado sucesso absoluto" + " e favorito por todos!");
        } else {
            System.out.println(audio.getTitle() + " também é uma das que todos estão" + " curtindo!");
        }
    }
}
