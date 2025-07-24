package model;

import java.util.ArrayList;

public class MusicPlayer extends Application {

    private ArrayList<String> musicList = new ArrayList<>();
    private boolean playingMusic = false;
    private String actualMusic;

    public MusicPlayer(String name) {
        super(name);
    }

    public void playMusic() {
        if (this.getExecuting()) {
            if (isPlayingMusic() && getActualMusic() != null) {
                playMusic();
            } else {
                System.out.println("Selecione uma música antes de tocar");
            }
        } else {
            System.out.println("Abra o aplicativo " + getName() + " para executar a ação");
        }
    }

    public void stopMusic() {
        if (this.getExecuting()) {
            if (isPlayingMusic()) {
                stopMusic();
            } else {
                System.out.println("Não há música em execução no momento");
            }
        } else {
            System.out.println("Abra o aplicativo " + getName() + " para executar a ação");
        }
    }

    public void selectMusic(String music) {
        if (this.getExecuting()) {
            boolean hasMusic = false;

            if (!music.isBlank()) {
                for (String m : getMusicList()) {
                    hasMusic = m.equals(music);
                }
                if (hasMusic) {
                    selectMusic(music);
                } else {
                    System.out.println("Não existe a música na playlist");
                }
            } else {
                System.out.println("Considere adicionar uma música");
            }
        }else {
            System.out.println("Abra o aplicativo " + getName() + " para executar a ação");
        }
    }

    public ArrayList<String> getMusicList() {
        return musicList;
    }

    public void setMusicList(String music) {
        this.musicList.add(music);
    }

    public String getActualMusic() {
        return actualMusic;
    }

    public void setActualMusic(String actualMusic) {
        this.actualMusic = actualMusic;
    }

    public void setMusicList(ArrayList<String> musicList) {
        this.musicList = musicList;
    }

    public boolean isPlayingMusic() {
        return playingMusic;
    }

    public void setPlayingMusic(boolean playingMusic) {
        this.playingMusic = playingMusic;
    }
}
