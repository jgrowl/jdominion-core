package jdominion.factory;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import jdominion.JDominionModule;

/**
 * Created by IntelliJ IDEA.
 * User: jonathan
 * Date: 3/5/11
 * Time: 10:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class InjectorFactory {

    private static Module module;

    private static Injector injector;

    public static Injector getInjector() {
        if(injector == null) {
            injector = Guice.createInjector(getModule());
        }

        return injector;
    }

    public static Injector getInjector(Module aModule) {
        module = aModule;
        return getInjector();
    }

    public static Module getModule() {
        if(module == null) {
            module = new JDominionModule();
        }

        return module;
    }

}
