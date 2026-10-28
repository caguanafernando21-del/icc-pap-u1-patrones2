package estructurales.simple.decorator;

public class AppDecorator {
    public static void main(String[] args) {
        //Bebida ->  CAFE SIMPLE
        Bebida bebida = new CafeSimple();   
    
        //Bebida ->  CAFE SIMPLE + LECHE
        Bebida bebidaLe = new Leche(bebida); 

        // Bebida -> Cafe con chocolate
        Bebida bebidaCho = new Chocolate(bebida);
        System.out.println("1 -> " + bebidaCho.descripcion());

        //Bebida -> leche y chocolate
        Bebida bebidaLeCh = new Chocolate(bebidaLe);
        System.out.println("2 -> "+ bebidaLeCh.descripcion());

        // Bebida -> Chocolate y leche
        Bebida bebidaChLe = new Leche(bebidaCho);   
        System.out.println("3 -> " + bebidaChLe.descripcion());
        // Cafe con chocolate y chocolate y leche
        Bebida bebida2 = new Chocolate(new Chocolate(new Leche(bebida)));
        System.out.println("4 -> " + bebida2);  



        System.out.println("=======Bebida Simple========");
        System.out.println(bebida.descripcion() + " $" + bebida.precio());
    
        System.out.println("=======Bebida Simple + Leche========");
        System.out.println(bebidaLe.descripcion() + " $" + bebidaLe.precio());
    }
}
