package Semana1;

public class Ben10 {
    //las clases tienen campos, métodos y constructores, aquí no definimos al constructor...
    //...porque solo usamos el que se usa por default "public void tareaBen10"
    //variables (caracteristicas/campos)
    public int indice, extremidades;
    public String poder, color;

    //Para obtener esas caract creamos funciones en la que agrego el método get
    //despues del "public" defino el tipo de dato y por eso debo indicar la variable de retorno en el {}
    public int getIndice(){return indice;}
    public int getExtremidades(){return extremidades;}
    public String getPoder(){return poder;}
    public String getColor(){return color;}

    //ahora necesito crear funciones y poner el método set para que el usuario defina los valores
    //si luego del "public" defino "void" (vacio) no debo retornar la variable, lo que hago es definir...
    //...la variable como parámetro dentro del () del set y con "this" indico al programa que la var que elijo...
    //...es igual al valor de la variable que dio el usuario:
    //public void setIndice(int indice){
        //this.indice=indice;//se redefine la var

    //la mejor forma de definir los setters es usando validación del tipo boolean para si o no
    public boolean setIndice(int indice){
        if(indice>0 & indice<=10){
            this.indice=indice;
            return true;//regrea cierto, es decir, sí se ejecuta
        }else//como solo es evaluación simple de si o no podemos omitir llaves
            return false;
            //indiqué las instrucciones en caso de false
    }
    //siguiente set:
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
    //********************************************************
    //Para tener un control y saber qué fue lo que se ejecutó hacemos un reporte de estado
    public String printState(){
        return "Indice: "+indice+"\n"+
                "Extremidades: "+extremidades+"\n"+
                "Poder: "+poder+"\n"+
                "Color: "+color+"\n";
    }

}
