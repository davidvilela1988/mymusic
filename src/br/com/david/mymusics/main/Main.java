package br.com.david.mymusics.main;

import br.com.david.mymusics.models.MyFavorite;
import br.com.david.mymusics.models.Music;
import br.com.david.mymusics.models.Podcast;


public class Main {
    public static void main(String[] args) {
        Music myMusic = new Music();
        myMusic.setTitle("Far Away");
        myMusic.setSinger("Nickelback");

        for (int index = 0; index < 1000; index++) {
            myMusic.plays();
        }

        for (int index = 0; index < 50; index++) {
            myMusic.like();
        }
        Podcast myPodcast = new Podcast();
        myPodcast.setTitle("Reverendo Augustus Nicodemus");
        myPodcast.setHost("Rogério Vilela");

        for (int index = 0; index < 5000; index++) {
            myPodcast.plays();
        }

        for (int index = 0; index < 1000; index++) {
            myPodcast.like();
        }

        MyFavorite favorite = new MyFavorite();
        favorite.increase(myPodcast);
        favorite.increase(myMusic);

    }
}
