
package lab.padroes.projeto.java;

import facade.Facade;
import lab.padroes.projeto.java.singleton.SingletonApressado;
import lab.padroes.projeto.java.singleton.SingletonPreguicoso;
import lab.padroes.projeto.java.singleton.SingletonLazyHolder;
import lab.padroes.projeto.java.strategy.ComportamentoDefensivo;
import lab.padroes.projeto.java.strategy.ComportamentoNormal;

public class Teste {
    
    public static void main(String[] args) {
        
        //testes relacionados ao Design Pattern Singleton:
        
        SingletonPreguicoso preguicoso = SingletonPreguicoso.getInstancia();
        System.out.println(preguicoso);
        preguicoso = SingletonPreguicoso.getInstancia();
        System.out.println(preguicoso);
        
        SingletonApressado apressado = SingletonApressado.getInstancia();
        System.out.println(apressado);
        apressado = SingletonApressado.getInstancia();
        System.out.println(apressado);
        
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        
        // Strategy
        
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        
        Robo robo = new Robo ();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        
        // Facade
        
        Facade facade = new Facade();
        facade.migrarCliente("Liliane", "83412490");
    }
    
}
