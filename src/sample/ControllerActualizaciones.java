package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ControllerActualizaciones {

    ControllerMenuPrincipal controllerMenuPrincipal1 = null;
    ArrayList<Juego> lstJuego = null;

    @FXML
    public ImageView image1, image2, image3, image4, image5, image6;
    @FXML
    public Button boton1, boton2, boton3, boton4, boton5, boton6;

    public void informacionEntreVentanas(ArrayList<Juego> lstJuego, ControllerMenuPrincipal controller){

        this.controllerMenuPrincipal1 = controller;
        this.lstJuego = lstJuego;
        Binder.bindJuegoOcultoSinLabel(lstJuego.get(0),image1, boton1);
        Binder.bindJuegoOcultoSinLabel(lstJuego.get(1),image2, boton2);
        Binder.bindJuegoOcultoSinLabel(lstJuego.get(2),image3, boton3);
        Binder.bindJuegoOcultoSinLabel(lstJuego.get(3),image4, boton4);
        Binder.bindJuegoOcultoSinLabel(lstJuego.get(4),image5, boton5);
        Binder.bindJuegoOcultoSinLabel(lstJuego.get(5),image6, boton6);
    }

    public void actualizacionFechal1(){

        Long tiempoA = System.currentTimeMillis();
        SimpleDateFormat formatoF = new SimpleDateFormat("dd-MM-YYYY kk:mm");
        Date fecha = new Date(tiempoA);
        String tiempo = formatoF.format(fecha);
        controllerMenuPrincipal1.label1.setText("" + tiempo);
    }
    public void actualizacionFechal2(){

        Long tiempoA = System.currentTimeMillis();
        SimpleDateFormat formatoF = new SimpleDateFormat("dd-MM-YYYY kk:mm");
        Date fecha = new Date(tiempoA);
        String tiempo = formatoF.format(fecha);
        controllerMenuPrincipal1.label2.setText("" + tiempo);
    }
    public void actualizacionFechal3(){

        Long tiempoA = System.currentTimeMillis();
        SimpleDateFormat formatoF = new SimpleDateFormat("dd-MM-YYYY kk:mm");
        Date fecha = new Date(tiempoA);
        String tiempo = formatoF.format(fecha);
        controllerMenuPrincipal1.label3.setText("" + tiempo);
    }
    public void actualizacionFechal4(){

        Long tiempoA = System.currentTimeMillis();
        SimpleDateFormat formatoF = new SimpleDateFormat("dd-MM-YYYY kk:mm");
        Date fecha = new Date(tiempoA);
        String tiempo = formatoF.format(fecha);
        controllerMenuPrincipal1.label4.setText("" + tiempo);
    }
    public void actualizacionFechal5(){

        Long tiempoA = System.currentTimeMillis();
        SimpleDateFormat formatoF = new SimpleDateFormat("dd-MM-YYYY kk:mm");
        Date fecha = new Date(tiempoA);
        String tiempo = formatoF.format(fecha);
        controllerMenuPrincipal1.label5.setText("" + tiempo);
    }
    public void actualizacionFechal6(){

        Long tiempoA = System.currentTimeMillis();
        SimpleDateFormat formatoF = new SimpleDateFormat("dd-MM-YYYY kk:mm");
        Date fecha = new Date(tiempoA);
        String tiempo = formatoF.format(fecha);
        controllerMenuPrincipal1.label6.setText("" + tiempo);
    }


}
