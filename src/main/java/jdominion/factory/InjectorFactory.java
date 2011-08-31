package jdominion.factory;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import jdominion.JDominionModule;
import jdominion.module.SimpleXmlSerializationModule;

import java.util.ArrayList;
import java.util.List;

/**
 * User: jonathan
 * Date: 3/5/11
 * Time: 10:22 PM
 */
public class InjectorFactory {

    private static Module module;

    private static List<Module> modules;

    private static Injector injector;

    public static Injector getInjector() {
        if(injector == null) {
            injector = Guice.createInjector(getModules());
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

    public static List<Module> getModules() {
        if(modules == null) {
            modules = new ArrayList<Module>();
            modules.add(new JDominionModule());
            modules.add(new SimpleXmlSerializationModule());
        }

        return modules;
    }

}
