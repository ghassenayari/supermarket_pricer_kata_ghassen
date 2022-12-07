package com.supermarket.pricer.item.datasource;

import com.supermarket.pricer.item.datasource.loaders.CsvLoader;
import com.supermarket.pricer.item.datasource.loaders.StaticLoader;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * LoaderFactory is a factory class dedicated for creating
 * an ItemLoader instance from a convenient source.
 */

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class LoaderFactory {

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
