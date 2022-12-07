package com.supermarket.pricer.weight;

import com.supermarket.pricer.output.OutputColor;
import com.supermarket.pricer.output.OutputHandler;
import com.supermarket.pricer.weight.converters.GramOunceConverter;
import com.supermarket.pricer.weight.converters.GramPoundConverter;
import com.supermarket.pricer.weight.converters.OuncePoundConverter;
import org.apache.commons.collections4.map.MultiKeyMap;

import java.util.Optional;

import static com.supermarket.pricer.output.Constants.ERROR_WHEN_CREATING_INSTANCE_OF_CONVERTER;
import static com.supermarket.pricer.weight.WeightUnity.*;

public class ConverterFactory {

    private ConverterFactory() {
    }

    private static MultiKeyMap<WeightUnity, Class> converterMap = new MultiKeyMap<>();

    static {
        converterMap.put(GRAM, POUND, GramPoundConverter.class);
        converterMap.put(GRAM, OUNCE, GramOunceConverter.class);
        converterMap.put(OUNCE, POUND, OuncePoundConverter.class);
    }

    public static Optional<WeightConverter> getConverter(WeightUnity unity1, WeightUnity unity2) {
        WeightConverter converter = null;
        try {
            Class clazz = converterMap.get(unity1, unity2);
            if (clazz == null) {
                clazz = converterMap.get(unity2, unity1);
            }
            converter = (WeightConverter) clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            OutputHandler.print(ERROR_WHEN_CREATING_INSTANCE_OF_CONVERTER, OutputColor.RED);
        }
        return Optional.ofNullable(converter);
    }
}
