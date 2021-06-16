package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class ControllerMenuPrincipal {

    ControllerJuegos controllerJuegos = null;
    ControllerActualizaciones controllerActualizaciones = null;

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


        j1 = new Juego(false, "battlefield1", "src/imagenes/battle.png", "src/imagenes/battle2.png");
        j2 = new Juego(false, "call of duty", "src/imagenes/call.png", "src/imagenes/call2.png");
        j3 = new Juego(false, "doom eternal", "src/imagenes/doom.jpg", "src/imagenes/doom2.jpg");
        j4 = new Juego(false, "hollow knight", "src/imagenes/hollow.png", "src/imagenes/hollow2.png");
        j5 = new Juego(false, "ratchet and clank", "src/imagenes/ratchet.jpg", "src/imagenes/ratchet2.jpg");
        j6 = new Juego(false, "zelda breath of the wild", "src/imagenes/zelda.png", "src/imagenes/zelda2.png");

        lstJuego.add(j1);
        lstJuego.add(j2);
        lstJuego.add(j3);
        lstJuego.add(j4);
        lstJuego.add(j5);
        lstJuego.add(j6);

        lstImage.add(image1);
        lstImage.add(image2);
        lstImage.add(image3);
        lstImage.add(image4);
        lstImage.add(image5);
        lstImage.add(image6);

        Binder.bindJuego(j1, image1);
        Binder.bindJuego(j2, image2);
        Binder.bindJuego(j3, image3);
        Binder.bindJuego(j4, image4);
        Binder.bindJuego(j5, image5);
        Binder.bindJuego(j6, image6);


    }

    @FXML
    public void onClickJuegos(){
        abrirInformacion(lstJuego);
    }

    public void abrirInformacion (ArrayList<Juego> lstJuego){

        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("sample2.fxml"));
            AnchorPane root = (AnchorPane) loader.load();
            controllerJuegos = loader.getController();
            Scene scene = new Scene(root, 600, 400);
            stage.setScene(scene);
            controllerJuegos.informacionEntreVentanas(lstJuego);
            // TODO como enviar la lista de juegos

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
            Scene scene = new Scene(root, 600, 400);
            stage.setScene(scene);

            controllerActualizaciones = loader.getController();
            controllerActualizaciones.informacionEntreVentanas(this);

            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void onClickImage1(){
        j1.comprado = !j1.comprado;
        Binder.bindJuego(j1, image1);
    }

    @FXML
    public void onClickImage2(){
        j2.comprado = !j2.comprado;
        Binder.bindJuego(j2, image2);
    }

    @FXML
    public void onClickImage3(){
        j3.comprado = !j3.comprado;
        Binder.bindJuego(j3, image3);
    }

    @FXML
    public void onClickImage4(){
        j4.comprado = !j4.comprado;
        Binder.bindJuego(j4, image4);
    }

    @FXML
    public void onClickImage5(){
        j5.comprado = !j5.comprado;
        Binder.bindJuego(j5, image5);
    }

    @FXML
    public void onClickImage6(){
        j6.comprado = !j6.comprado;
        Binder.bindJuego(j6, image6);
    }

}
