package com.supermarket.pricer.item.datasource;

import com.supermarket.pricer.item.datasource.loaders.CsvLoader;
import com.supermarket.pricer.item.datasource.loaders.StaticLoader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.supermarket.pricer.item.datasource.LoaderType.CSV;
import static com.supermarket.pricer.item.datasource.LoaderType.STATIC;

class LoaderFactoryTest {

    @Test
    void getLoader_CsvInstance_CsvType() {
        ItemLoader itemLoader = LoaderFactory.getLoader(CSV);
        Assertions.assertTrue(itemLoader instanceof CsvLoader);
    }

    @Test
    void getLoader_StaticInstance_StaticType() {
        ItemLoader itemLoader = LoaderFactory.getLoader(STATIC);
        Assertions.assertTrue(itemLoader instanceof StaticLoader);
    }

    @Test
    void getLoader_null_NullInput() {
        ItemLoader itemLoader = LoaderFactory.getLoader(null);
        Assertions.assertNull(itemLoader);
    }
}
