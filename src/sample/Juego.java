package sample;

public class Juego {
    public boolean comprado;
    public String nombre;
    public String imagePathSinTick;
    public String imagePathConTick;
    public String fecha = null;


    public Juego(boolean comprado, String nombre, String imagePathSinTick, String imagePathConTick){
        this.comprado = comprado;
        this.nombre = nombre;
        this.imagePathSinTick = imagePathSinTick;
        this.imagePathConTick = imagePathConTick;

    }

    //public JuegoNoComprado(boolean comprado1, String nombre, String imagePath){
        //this.comprado1 = comprado1;
        //this.nombre = nombre;
        //this.imagePath = imagePath;
   // }


}
