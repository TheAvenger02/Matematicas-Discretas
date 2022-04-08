package pkg21550384_clases_u3_md;

public class Main {

    public static void main(String[] args) {
        // Llamamos al métodoClaseMain
        metodoClaseMain();
        // Instanciamos la ClaseSecundaria
        ClaseSecundaria Cs = new ClaseSecundaria();
        Cs.metodoClaseSecundaria();
        // Llamamos al metodoEstatico de la ClaseSecundaria
        ClaseSecundaria.metodoEstaticoClaseSecundaria();
    }

    public static void metodoClaseMain() {
        System.out.println("Hola desde clase principal");
    }
}
