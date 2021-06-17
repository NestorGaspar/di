package sample;

import javafx.fxml.FXML;

import javafx.scene.image.ImageView;

import java.util.ArrayList;

public class ControllerJuegos {

    ControllerMenuPrincipal controllerMenuPrincipal1 = null;
    ArrayList<Juego> lstJuego = null;

    @FXML
    public ImageView image1, image2, image3, image4, image5, image6;

    public void informacionEntreVentanas(ArrayList<Juego> lstJuego, ControllerMenuPrincipal controller){

        this.controllerMenuPrincipal1 = controller;
        this.lstJuego = lstJuego;
        Binder.bindJuegoConTick(lstJuego.get(0),image1);
        Binder.bindJuegoConTick(lstJuego.get(1),image2);
        Binder.bindJuegoConTick(lstJuego.get(2),image3);
        Binder.bindJuegoConTick(lstJuego.get(3),image4);
        Binder.bindJuegoConTick(lstJuego.get(4),image5);
        Binder.bindJuegoConTick(lstJuego.get(5),image6);
    }


    @FXML
    public void onClickImagen1(){
        lstJuego.get(0).comprado = !lstJuego.get(0).comprado;
        Binder.bindJuegoConTick(lstJuego.get(0), image1);
        controllerMenuPrincipal1.actualizarJuegos();
    }

    @FXML
    public void onClickImagen2(){
        lstJuego.get(1).comprado = !lstJuego.get(1).comprado;
        Binder.bindJuegoConTick(lstJuego.get(1), image2);
        controllerMenuPrincipal1.actualizarJuegos();
    }

    @FXML
    public void onClickImagen3(){
        lstJuego.get(2).comprado = !lstJuego.get(2).comprado;
        Binder.bindJuegoConTick(lstJuego.get(2), image3);
        controllerMenuPrincipal1.actualizarJuegos();
    }

    @FXML
    public void onClickImagen4(){
        lstJuego.get(3).comprado = !lstJuego.get(3).comprado;
        Binder.bindJuegoConTick(lstJuego.get(3), image4);
        controllerMenuPrincipal1.actualizarJuegos();
    }

    @FXML
    public void onClickImagen5(){
        lstJuego.get(4).comprado = !lstJuego.get(4).comprado;
        Binder.bindJuegoConTick(lstJuego.get(4), image5);
        controllerMenuPrincipal1.actualizarJuegos();
    }

    @FXML
    public void onClickImagen6(){
        lstJuego.get(5).comprado = !lstJuego.get(5).comprado;
        Binder.bindJuegoConTick(lstJuego.get(5), image6);
        controllerMenuPrincipal1.actualizarJuegos();
    }

}
