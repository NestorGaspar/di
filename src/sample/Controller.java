package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.File;
import java.util.ArrayList;

public class Controller {

    Controller2 controller2 = null;
    Controller3 controller3 = null;

    @FXML
    Label label1, label2, label3, label4, label5, label6;

    @FXML
    Juego j1, j2, j3, j4, j5 ,j6;

    @FXML
    Button juego, actua;

    @FXML
    ImageView image1, image2, image3, image4, image5, image6;

    ArrayList<ImageView> lstImage = new ArrayList<>();
    ArrayList<Juego> lstJuego = new ArrayList<>();

    @FXML
    public void initialize(){


        j1 = new Juego(false, "battlefield1", "src/imagenes/battle.png");
        j2 = new Juego(false, "call of duty", "src/imagenes/call.png");
        j3 = new Juego(false, "doom eternal", "src/imagenes/doom.jpg");
        j4 = new Juego(false, "hollow knight", "src/imagenes/hollow.png");
        j5 = new Juego(false, "ratchet and clank", "src/imagenes/ratchet.jpg");
        j6 = new Juego(false, "zelda breath of the wild", "src/imagenes/zelda.png");

        lstJuego.add(j1);
        lstJuego.add(j2);
        lstJuego.add(j3);
        lstJuego.add(j4);
        lstJuego.add(j5);
        lstJuego.add(j6);

        File battle = new File("src/imagenes/battle.png");
        Image battle2 = new Image(battle.toURI().toString());

        File battleTick = new File("src/imagenes/battle2.png");
        Image battleTick2 = new Image(battleTick.toURI().toString());

        File doom = new File("src/imagenes/doom.jpg");
        Image doom2 = new Image(doom.toURI().toString());

        File doomTick = new File("src/imagenes/doom2.jpg");
        Image doomTick2 = new Image(doomTick.toURI().toString());

        File ratchet = new File("src/imagenes/ratchet.jpg");
        Image ratchet2 = new Image(ratchet.toURI().toString());

        File ratchetTick = new File("src/imagenes/ratchet2.png");
        Image ratchetTick2 = new Image(ratchetTick.toURI().toString());

        File zelda = new File("src/imagenes/zelda.png");
        Image zelda2 = new Image(zelda.toURI().toString());

        File zeldaTick = new File("src/imagenes/zelda2.png");
        Image zeldaTick2 = new Image(zeldaTick.toURI().toString());

        File hollow = new File("src/imagenes/hollow.png");
        Image hollow2 = new Image(hollow.toURI().toString());

        File hollowTick = new File("src/imagenes/hollow2.png");
        Image hollowTick2 = new Image(hollowTick.toURI().toString());

        File call = new File("src/imagenes/call.png");
        Image call2 = new Image(call.toURI().toString());

        File callTick = new File("src/imagenes/call2.png");
        Image callTick2 = new Image(callTick.toURI().toString());




    //lstImage.add(image1);
    //lstImage.add(image2);
    //lstImage.add(image3);
    //lstImage.add(image4);
    //lstImage.add(image5);
    //lstImage.add(image6);

    //Binder.binderImage();
    //Binder.binderImage();
    //Binder.binderImage();
    //Binder.binderImage();
    //Binder.binderImage();
    //Binder.binderImage();


    }

    @FXML
    public void onClickJuegos(){

        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("sample2.fxml"));
            AnchorPane root = (AnchorPane) loader.load();
            Scene scene = new Scene(root, 450, 410);
            stage.setScene(scene);

            controller2 = loader.getController();
            controller2.informacionEntreVentanas(this);

            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void onClickActualizaciones(){

        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("sample3.fxml"));
            AnchorPane root = (AnchorPane) loader.load();
            Scene scene = new Scene(root, 450, 410);
            stage.setScene(scene);

            controller3 = loader.getController();
            controller3.informacionEntreVentanas(this);

            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
