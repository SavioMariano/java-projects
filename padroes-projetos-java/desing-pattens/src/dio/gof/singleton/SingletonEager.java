package dio.gof.singleton;

/**
 * Singleton "apressado"
 * 
 * @author SavioMariano
 */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia(){
        return instancia;
    }
    
}
