package basics.variables;

/*
 * Reglas y convenciones para nombrar variables en Java
 *
 * Cada lenguaje de programación tiene sus propias reglas y convenciones para nombrar variables.
 * En Java, las reglas y convenciones se pueden resumir de la siguiente manera:
 */

public class NamingVariables {
    
    // Regla 1: Los nombres de variables son sensibles a mayúsculas y minúsculas
    int speed = 0; // 'speed' es diferente de 'Speed' o 'SPEED'
    
    // Regla 2: Un nombre de variable puede comenzar con una letra, '$' o '_'
    int _validVariable = 10; // Permitido, pero no recomendado
    int $validVariable = 20; // Permitido, pero no recomendado
    int validVariable = 30; // Recomendado
    
    // Regla 3: Los nombres de variables no deben contener espacios en blanco
    // int invalid Variable = 40; // Esto generaría un error de compilación
    
    // Regla 4: Los nombres de variables deben ser descriptivos y utilizar palabras completas
    int cadence = 90; // Mejor que 'c' o 'cad'
    int gear = 3; // Mejor que 'g'
    
    // Regla 5: Si el nombre de la variable es de una sola palabra, debe ir en minúsculas
    int velocity = 50; // Correcto
    
    // Regla 6: Si el nombre de la variable tiene varias palabras, usar camelCase
    int gearRatio = 2; // Correcto
    int currentGear = 4; // Correcto
    
    // Regla 7: Si la variable almacena un valor constante, debe estar en mayúsculas y separada por '_'
    static final int NUM_GEARS = 6; // Correcto
    
    public static void main(String[] args) {
        NamingVariables example = new NamingVariables();
        
        System.out.println("Speed: " + example.speed);
        System.out.println("Cadence: " + example.cadence);
        System.out.println("Gear: " + example.gear);
        System.out.println("Gear ratio: " + example.gearRatio);
        System.out.println("Current gear: " + example.currentGear);
        System.out.println("Number of gears: " + NUM_GEARS);
    }
}
