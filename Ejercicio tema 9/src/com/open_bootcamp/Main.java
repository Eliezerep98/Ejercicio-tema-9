//Crear una clase Persona con las siguientes variables:
//La edad.
//El nombre.
//El telefono.
//Una vez creada la clase, crea una clase Cliente que herede de Persona,
//esta nueva clase tendra la variable credito solo para esa clase.
//Crear ahora un objeto de la clase Cliente que debe tener como propiedades
//la edad, el nombre y el credito, tienes que darle valor y mostrarlas por pantalla.
//Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona,
//y con una variable salario que solo tenga la clase Trabajador.

package com.open_bootcamp;
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad(25);
        cliente.nombre();
        cliente.credito(1000);
        Trabajador trabajador = new Trabajador();
        trabajador.edad(30);
        trabajador.nombre();
        trabajador.salario(500);
    }
}
class Persona {
    int edad;
    String nombre;
    int telefono;
}
class Cliente extends Persona {
    String credito;
    public int edad(int a) {
        System.out.println("la edad del cliente es: " + (a));
        return a;
    }
    public void nombre() {
        System.out.println("El nombre del cliente es Joaquin");
    }
    public int credito(int b) {
        System.out.println("el credito del cliente es: " + (b));
        return b;
    }
}

class Trabajador extends Persona {
    int salario;
    public int edad(int a) {
        System.out.println("la edad del trabajador es: " + (a));
        return a;
    }
    public void nombre() {
        System.out.println("El nombre del trabajador es Esteban");
    }
    public int salario(int b) {
        System.out.println("el salario del trabajador es: " + (b));
        return b;
    }
}