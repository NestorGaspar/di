package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;

public class Binder {

    public static void bindJuego(Juego juego, ImageView ijuego){
        if (juego.comprado){
            File f = new File(juego.imagePathConTick);
            ijuego.setImage(new Image(f.toURI().toString()));
        }else{
            File f = new File(juego.imagePathSinTick);
            ijuego.setImage(new Image(f.toURI().toString()));        }
    }

}
