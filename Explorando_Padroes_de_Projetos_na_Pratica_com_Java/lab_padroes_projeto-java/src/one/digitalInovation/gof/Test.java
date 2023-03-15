package one.digitalInovation.gof;

import one.digitalInovation.gof.facade.Facade;
import one.digitalInovation.gof.singleton.SingletonEager;
import one.digitalInovation.gof.singleton.SingletonLazy;
import one.digitalInovation.gof.singleton.SingletonLazyHolder;
import one.digitalInovation.gof.strategy.*;

public class Test {
    public static void main(String[] args) {

        // Singleton:

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);

        // Strategy:

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
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
        facade.migrarCliente("Jhon Lenon", "14800200");

    }
}
