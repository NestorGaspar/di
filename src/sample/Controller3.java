package sample;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Controller3 {

    Controller controller1 = null;

    public void informacionEntreVentanas(Controller Controller){
        controller1 = Controller;
    }

    public void actualizacionFechal1(){

        Long tiempoA = System.currentTimeMillis();
        SimpleDateFormat formatoF = new SimpleDateFormat("dd-MM-YYYY kk:mm");
        Date fecha = new Date(tiempoA);
        String tiempo = formatoF.format(fecha);
        controller1.label1.setText("" + tiempo);
    }
    public void actualizacionFechal2(){

        Long tiempoA = System.currentTimeMillis();
        SimpleDateFormat formatoF = new SimpleDateFormat("dd-MM-YYYY kk:mm");
        Date fecha = new Date(tiempoA);
        String tiempo = formatoF.format(fecha);
        controller1.label2.setText("" + tiempo);
    }
    public void actualizacionFechal3(){

        Long tiempoA = System.currentTimeMillis();
        SimpleDateFormat formatoF = new SimpleDateFormat("dd-MM-YYYY kk:mm");
        Date fecha = new Date(tiempoA);
        String tiempo = formatoF.format(fecha);
        controller1.label3.setText("" + tiempo);
    }
    public void actualizacionFechal4(){

        Long tiempoA = System.currentTimeMillis();
        SimpleDateFormat formatoF = new SimpleDateFormat("dd-MM-YYYY kk:mm");
        Date fecha = new Date(tiempoA);
        String tiempo = formatoF.format(fecha);
        controller1.label4.setText("" + tiempo);
    }
    public void actualizacionFechal5(){

        Long tiempoA = System.currentTimeMillis();
        SimpleDateFormat formatoF = new SimpleDateFormat("dd-MM-YYYY kk:mm");
        Date fecha = new Date(tiempoA);
        String tiempo = formatoF.format(fecha);
        controller1.label5.setText("" + tiempo);
    }
    public void actualizacionFechal6(){

        Long tiempoA = System.currentTimeMillis();
        SimpleDateFormat formatoF = new SimpleDateFormat("dd-MM-YYYY kk:mm");
        Date fecha = new Date(tiempoA);
        String tiempo = formatoF.format(fecha);
        controller1.label6.setText("" + tiempo);
    }

}
