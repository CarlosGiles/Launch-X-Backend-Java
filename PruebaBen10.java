package Semana1;

public class PruebaBen10 {
    //definimos una clase estática que no regresa nada y se llama main (principla)...
    // ...además, puede recibir String y args
    public static void main(String[] args) {
        def();//indico que el main puede usar el métod

    }
    //Declaro el método "def" dentro del cual puedo crear/definir los objetos
    public static void def(){
        //para conectar lo que hay en tareaBen10 con este programa:
        //"tareaBen10 va a tener un objeto llamado cuatrobrazos conectado a un nuevo tareaBen10()"
        //el primer tareaBen10 hace referencia a la clase que da nombre al prorama tareaBen10.java
        //el segundo tareaBen10 es el nuevo objeto o instancia creada de la clase, el () indica...
        //... que usa el constructor por omisión de la clase pública tareaBen10
        Ben10 cuatrobrazos=new Ben10();
        //ahora usamos el objeto y con "." indicamos que le aplicamos tal método con su argumento
        cuatrobrazos.setIndice(1);
        cuatrobrazos.setExtremidades(4);
        cuatrobrazos.setPoder("ondas de choque");
        cuatrobrazos.setColor("rojo");
        //Definimos un mensaje para luego mostrarlo
        String msg = "Soy el Alien dentro del Omnitrix y tengo las siguientes características: ";
        msg += "\nIndice "+ cuatrobrazos.getIndice();
        msg += "\nExtremidades "+ cuatrobrazos.getExtremidades();
        msg += "\nPoder "+ cuatrobrazos.getPoder();
        msg += "\nColor "+ cuatrobrazos.getColor();
        System.out.println(msg);
    }
    //ahora el objeto está creado y definido pero no se muestra, entonces:
    public static void show(){

    }
}
