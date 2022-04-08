package prueba1;
public class Prueba1 {
    public static void main(String[] args) {
        // System.out.println("Hola mundo!");
        // int - Enteros
        // String - Cadenas (textos o palabras)
        // char - caracter
        // double - decimales
        // boolean - verdad (1) o falso (0)
        
        //declarar - darle valor a una variable
        //variable - palabra que tiene un tipo de dato y puede ser utilizada dentro del codigo
        
        // 1. Tipo de dato
        // 2. Nombre de la variable
        // 3. Punto y coma
        String sNombre, sEdad, sTelefono, sDireccion;
        int iAnios = 25;
        System.out.println(iAnios);
        iAnios = 27;
        System.out.println(iAnios);
        
        // Instancia - Crear un objeto del tipo de dato que coloquemos como clase principal
        // Objeto - Que nosotros creamos y sabemos que es pero queremos enseñarle a la computadora que es
        PantallaPrincipal pObjetoPantalla = new PantallaPrincipal();
        pObjetoPantalla.setVisible(true);
    }
}