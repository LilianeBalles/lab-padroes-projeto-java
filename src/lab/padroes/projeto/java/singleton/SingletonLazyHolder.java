
package lab.padroes.projeto.java.singleton;

/** @see <a href="https://stackoverflow.com/questions/15019306/regarding-static-holder-singleton-pattern/24018148#24018148">Referencia</a>
 * 
 * @author User
 */

public class SingletonLazyHolder {
    
    private static class InstanceHolder {
        
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder() {
        super();
    }
    
    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}