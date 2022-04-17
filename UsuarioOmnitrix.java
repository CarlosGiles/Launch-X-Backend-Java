package Semana1;

abstract class Omnitrix{
    public int indice, extremidades;
    public String poder, color;

    public int getIndice(){return indice;}
    public int getExtremidades(){return extremidades;}
    public String getPoder(){return poder;}
    public String getColor(){return color;}

    public boolean setIndice(int indice){
        if(indice>0 & indice<=10){
            this.indice=indice;
            return true;
        }else
            return false;
    }

    public boolean setExtremidades(int extremidades){
        if(extremidades>=0){
            this.extremidades=extremidades;
            return true;
        }else
            return false;
    }
    public boolean setPoder(String poder){
        if(!poder.isEmpty()){
            this.poder=poder;
            return true;
        }else
            return false;
    }
    public boolean setColor(String color){
        if(!color.isEmpty()){
            this.color=color;
            return true;
        }else
            return false;
    }
    void transformar(){
        System.out.println("*Salen destellos y el cuerpo se deforma*");
    }
    abstract void presentacion();
}

interface Alien{
    void show();
    abstract void Sindice();
    abstract void Sextremidades();
    abstract void Spoder();
    abstract void Scolor();
}

public class UsuarioOmnitrix extends Omnitrix implements Alien {

    public void show(){
        System.out.println("Me transformaré en el siguiente alien:\n ");
    }

    public void Sindice(){
        System.out.println(setIndice(1)+" = Cuatrobrazos, el #1 del Omnitrix");
    }
    public void Sextremidades(){
        System.out.println(setExtremidades(6)+" = *De las 6 extremidades resultantes, 4 son brazos enormes*");
    }
    public void Spoder(){
        System.out.println(setPoder("Ondas de choque")+" = Puedo crear ondas de choque");
    }
    public void Scolor(){
        System.out.println("Soy un alien rojo");
    }
    public void presentacion(){
        System.out.println("¡Es hora de luchar!");
    }

    public static void main(String[] args) {
        UsuarioOmnitrix cuatrobrazos=new UsuarioOmnitrix();
        cuatrobrazos.show();
        cuatrobrazos.transformar();
        cuatrobrazos.Sextremidades();
        cuatrobrazos.Sindice();
        cuatrobrazos.Spoder();
        cuatrobrazos.Scolor();
        cuatrobrazos.presentacion();
    }
}
