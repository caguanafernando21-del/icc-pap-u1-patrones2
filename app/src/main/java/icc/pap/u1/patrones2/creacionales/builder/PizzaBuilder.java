package icc.pap.u1.patrones2.creacionales.builder;
/*
ObjBuilder
PizzaBuilder va a acumular las opciones de una pizza
y creara el producto(objeto(Pizza)) cuando se le
pida al metodo construir(build)    
*/

import java.util.ArrayList;
import java.util.List;

public final class PizzaBuilder {
    
    private String size;
    private List<String> ingredientes;
    
    // vacio -> default
    public PizzaBuilder(){
        this.size = "mediano";
        this.ingredientes = new ArrayList<>();
        this.ingredientes.add("queso");
    
    }
    
    //opc 1
    public PizzaBuilder size(String size){
        this.size =size;
        return this;
    }
    //opc 2
    public PizzaBuilder addIng(String ing){
        

        this.ingredientes.add(ing);
        return this;
    }

    //Metodo build
    //devuelve el producto
    public Pizza build(){
        return new Pizza(size, ingredientes);
    }
}
