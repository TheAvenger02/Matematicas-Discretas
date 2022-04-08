package recursión;
public class Recursión {
// Declaración y asignación de variables
int i=0;
int a=0, b=0;
// Constructor - Es un método especial de una clase que se llama automáticamente siempre que se declara un objeto de esa clase.
public Recursión(){
}
// Método - Es un conjunto de instrucciones definidas dentro de una clase, que realizan una determinada tarea y a las que podemos invocar mediante un nombre.
public void recursiva(){
     if(i<10){
         i++;
         recursiva();
         // 2 4 6 8 10 12 14 16 18 20
         a++;
         b++;
         System.err.println("La suma es: " +  (a+b));
     }
}
}