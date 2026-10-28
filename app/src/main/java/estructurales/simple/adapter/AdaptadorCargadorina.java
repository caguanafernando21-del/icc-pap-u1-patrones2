package estructurales.simple.adapter;
public class AdaptadorCargadorina implements Cargador {
    private final CargadorInalambrico cInalambrico;
    
    public  AdaptadorCargadorina(CargadorInalambrico cInalambrico){
        this.cInalambrico = cInalambrico;
    }
    @Override
    public void cargarCelular(){
        cInalambrico.cargarBase();    
    }
}
