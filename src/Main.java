import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Deportista> lsDeportista= new ArrayList<>();
        Corredor corredor1 = new Corredor("Pepe", 26, "Colombia", 25, 4.56, 12.3);
        Ciclista ciclista1=new Ciclista("Tilin",24,"Peru",65,123.4,80,12);
        Nadador nadador1=new Nadador("Kris",19,"USA",66,32,12.5,"libre");

        lsDeportista.add(corredor1);
        lsDeportista.add(ciclista1);
        lsDeportista.add(nadador1);
    }
}