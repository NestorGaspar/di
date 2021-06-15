package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Controller {

    Controller2 controller2 = null;
    Controller3 controller3 = null;

    @FXML
    Button juego, actua;

    @FXML
    ImageView image1, image2, image3, image4, image5, image6;

    ArrayList<ImageView> lstImage = new ArrayList<>();

    @FXML
    public void initialize(){

    lstImage.add(image1);
    lstImage.add(image2);
    lstImage.add(image3);
    lstImage.add(image4);
    lstImage.add(image5);
    lstImage.add(image6);

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
