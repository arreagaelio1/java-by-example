package basics.variables;

/*
 * Creando variables en Java
 *
 * En Java, un objeto almacena su estado en campos. Un campo es una variable
 * que pertenece a una clase o a una instancia de una clase.
 */

public class CreatingVariables {
    
    // Variables de instancia (Campos No Estáticos)
    // Cada objeto tiene su propia copia de estas variables.
    int speed = 0;
    int gear = 1;
    
    // Variable de clase (Campo Estático)
    // Es compartida por todas las instancias de la clase.
    static int numGears = 6;
    
    // Método que demuestra el uso de variables locales y parámetros
    public void changeGear(int newGear) {
        // Variable local: Solo es visible dentro de este método
        int previousGear = gear;
        
        // Modificando la variable de instancia con el valor del parámetro
        gear = newGear;
        
        // Imprimir para demostrar el cambio
        System.out.println("Gear change: " + previousGear + " -> " + gear);
    }
    
    public static void main(String[] args) {
        // Parámetro 'args' es una variable, pero no un campo
        
        // Creación de un objeto de la clase CreatingVariables
        CreatingVariables bicycle1 = new CreatingVariables();
        CreatingVariables bicycle2 = new CreatingVariables();
        
        // Modificación de variables de instancia
        bicycle1.speed = 10;
        bicycle2.speed = 20;
        
        System.out.println("Bicycle1 speed: " + bicycle1.speed);
        System.out.println("Bicycle2 speed: " + bicycle2.speed);
        
        // Uso de variable de clase (compartida entre todas las instancias)
        System.out.println("Number of gears: " + numGears);
        
        // Llamada a método que usa variable local y parámetro
        bicycle1.changeGear(3);
    }
}
