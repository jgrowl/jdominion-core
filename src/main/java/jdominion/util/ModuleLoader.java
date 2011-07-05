package jdominion.util;

import com.google.inject.AbstractModule;
import com.google.inject.Module;

import java.util.ServiceLoader;

public class ModuleLoader<M extends Module> extends AbstractModule {

    private final Class<M> type;

    public ModuleLoader(Class<M> type) {
        this.type = type;
    }

    public static <M extends Module> ModuleLoader<M> of(Class<M> type) {
        return new ModuleLoader<M>(type);
    }

    @Override
    protected void configure() {
        ServiceLoader<M> modules = ServiceLoader.load(type);
        for (Module module : modules) {
            install(module);
        }
    }
}
