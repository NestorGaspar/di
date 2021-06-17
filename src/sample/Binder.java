package sample;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;

public class Binder {

    public static void bindJuegoConTick(Juego juego, ImageView ijuego){
        if (juego.comprado){
            File f = new File(juego.imagePathConTick);
            ijuego.setImage(new Image(f.toURI().toString()));
        }else{
            File f = new File(juego.imagePathSinTick);
            ijuego.setImage(new Image(f.toURI().toString()));
        }
    }

    public static void bindJuegoOculto(Juego juego, ImageView ijuego, Label label){

        label.setVisible(juego.fecha != null);

        if (juego.comprado){
            ijuego.setVisible(true);
            File f = new File(juego.imagePathSinTick);
            ijuego.setImage(new Image(f.toURI().toString()));
            label.setText(juego.fecha);
        }else{
            ijuego.setVisible(false);
            label.setVisible(false);
        }
    }

    public static void bindJuegoOcultoSinLabel(Juego juego, ImageView ijuego, Button boton){

        if (juego.comprado){
            ijuego.setVisible(true);
            File f = new File(juego.imagePathSinTick);
            ijuego.setImage(new Image(f.toURI().toString()));
        }else{
            boton.setDisable(true);
            ijuego.setVisible(false);
        }
    }


}
