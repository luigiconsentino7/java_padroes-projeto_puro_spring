package gof;


import gof.gof_facade.Facade;
import gof.gof_singleton.SingletonEager;
import gof.gof_singleton.SingletonLazy;
import gof.gof_singleton.SingletonLazyHolder;
import gof.gof_strategy.Comportamento;
import gof.gof_strategy.ComportamentoAgressivo;
import gof.gof_strategy.ComportamentoDefensivo;
import gof.gof_strategy.ComportamentoNormal;
import gof.gof_strategy.Robo;

public class Test {
    public static void main(String[] args) {
        //Singleton
        SingletonLazy lazy =  SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager =  SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder =  SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        System.out.println();

        //Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();

        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        System.out.println();

        //Facade

        Facade facade = new Facade();
        facade.migrarCliente("Luigi", "09310-610");
    }
}
