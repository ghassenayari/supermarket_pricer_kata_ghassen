package com.supermarket.pricer.item.datasource;

import com.supermarket.pricer.item.datasource.loaders.CsvLoader;
import com.supermarket.pricer.item.datasource.loaders.StaticLoader;

/**
 * LoaderFactory is a factory class dedicated for creating
 * an ItemLoader instance from a convenient source.
 */

public final class LoaderFactory {

    private LoaderFactory() {
    }

    public static ItemLoader getLoader(LoaderType loaderType) {
        if (loaderType == null) {
            return null;
        }
        if (loaderType.equals(LoaderType.CSV)) {
            return new CsvLoader();

        } else if (loaderType.equals(LoaderType.STATIC)) {
            return new StaticLoader();
        }
        return null;
    }
}
