
package lab.padroes.projeto.java.singleton;

public class SingletonApressado {
    
    private static SingletonApressado instancia = new SingletonApressado();
    
    private SingletonApressado() {
        super();
    }
    
    public static SingletonApressado getInstancia() {
        return instancia;
    }
}
