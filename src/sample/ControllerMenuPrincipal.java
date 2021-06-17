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

        image1.setVisible(false);
        image2.setVisible(false);
        image3.setVisible(false);
        image4.setVisible(false);
        image5.setVisible(false);
        image6.setVisible(false);


        //Binder.bindJuego(j1, image1);
        //Binder.bindJuego(j2, image2);
        //Binder.bindJuego(j3, image3);
        //Binder.bindJuego(j4, image4);
        //Binder.bindJuego(j5, image5);
        //Binder.bindJuego(j6, image6);

    }

    @FXML
    public void onClickJuegos(){
        abrirInformacion(lstJuego);
    }

    @FXML
    public void onClickActualizaciones(){
        abrirInformacion2(lstJuego);
    }

    public void abrirInformacion (ArrayList<Juego> lstJuego){

        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("sample2.fxml"));
            AnchorPane root = (AnchorPane) loader.load();
            controllerJuegos = loader.getController();
            Scene scene = new Scene(root, 600, 400);
            stage.setScene(scene);
            controllerJuegos.informacionEntreVentanas(lstJuego, this);

            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    public void abrirInformacion2(ArrayList<Juego> lstJuego){

        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("sample3.fxml"));
            AnchorPane root = (AnchorPane) loader.load();
            controllerActualizaciones = loader.getController();
            Scene scene = new Scene(root, 600, 400);
            stage.setScene(scene);
            controllerActualizaciones.informacionEntreVentanas(lstJuego, this);

            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void actualizarJuegos() {
        Binder.bindJuegoOculto(lstJuego.get(0), image1, label1);
        Binder.bindJuegoOculto(lstJuego.get(1), image2, label2);
        Binder.bindJuegoOculto(lstJuego.get(2), image3, label3);
        Binder.bindJuegoOculto(lstJuego.get(3), image4, label4);
        Binder.bindJuegoOculto(lstJuego.get(4), image5, label5);
        Binder.bindJuegoOculto(lstJuego.get(5), image6, label6);
    }

}
