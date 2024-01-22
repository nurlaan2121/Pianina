package com.example.pianina;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import javafx.scene.control.Button;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button dobtn;

    @FXML
    private Button fabtn;
    @FXML
    private Button sibtn;


    @FXML
    private Button lyabtn;

    @FXML
    private Button mibtn;

    @FXML
    private Button rebtn;

    @FXML
    private Button solbtn;

    @FXML
    void initialize() {

        String notado = "/com/example/sounds/noty-do.mp3";
        String re = "/com/example/sounds/re.mp3";
        String mi = "/com/example/sounds/mi.mp3";
        String fa = "/com/example/sounds/fa.mp3";
        String si = "/com/example/sounds/si.mp3";
        String lia = "/com/example/sounds/lja.mp3";
        String sol = "/com/example/sounds/sol.mp3";
        Media notadom = new Media(Objects.requireNonNull(getClass().getResource(notado)).toString());
        MediaPlayer mediaPlayer = new MediaPlayer(notadom);
        Media re2 = new Media(Objects.requireNonNull(getClass().getResource(re)).toString());
        MediaPlayer mediaPlayer2 = new MediaPlayer(re2);
        Media mi2 = new Media(Objects.requireNonNull(getClass().getResource(mi)).toString());
        MediaPlayer mediaPlayer3 = new MediaPlayer(mi2);
        Media fa2 = new Media(Objects.requireNonNull(getClass().getResource(fa)).toString());
        MediaPlayer mediaPlayer4 = new MediaPlayer(fa2);
        Media si2 = new Media(Objects.requireNonNull(getClass().getResource(si)).toString());
        MediaPlayer mediaPlayer5 = new MediaPlayer(si2);
        Media lia2 = new Media(Objects.requireNonNull(getClass().getResource(lia)).toString());
        MediaPlayer mediaPlayer6 = new MediaPlayer(lia2);
        Media sol2 = new Media(Objects.requireNonNull(getClass().getResource(sol)).toString());
        MediaPlayer mediaPlayer7 = new MediaPlayer(sol2);
            mediaPlayer.stop();
            mediaPlayer.play();mediaPlayer2.stop();
            mediaPlayer.play();mediaPlayer2.stop();
            mediaPlayer.play();mediaPlayer3.stop();
            mediaPlayer.play();mediaPlayer3.stop();
            mediaPlayer.play();
        dobtn.setOnKeyPressed(keyEvent -> {
            if (keyEvent.getCode() == KeyCode.S) {
                mediaPlayer.stop();
                mediaPlayer.play();
            }
            if (keyEvent.getCode() == KeyCode.D){
                mediaPlayer2.stop();
                mediaPlayer2.play();
            }if (keyEvent.getCode() == KeyCode.J){
                mediaPlayer3.stop();
                mediaPlayer3.play();
            } if (keyEvent.getCode() == KeyCode.F){
                mediaPlayer4.stop();
                mediaPlayer4.play();
            }if (keyEvent.getCode() == KeyCode.G){
                mediaPlayer5.stop();
                mediaPlayer5.play();
            } if(keyEvent.getCode() == KeyCode.H){
                mediaPlayer6.stop();
                mediaPlayer6.play();
            }if (keyEvent.getCode() == KeyCode.K){
                mediaPlayer7.stop();
                mediaPlayer7.play();
            }
        });

    }

}
