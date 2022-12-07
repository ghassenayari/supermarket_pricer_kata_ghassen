package com.supermarket.pricer.item.datasource.loaders;

import com.supermarket.pricer.item.Item;
import com.supermarket.pricer.item.datasource.ItemLoader;
import com.supermarket.pricer.output.OutputColor;
import com.supermarket.pricer.output.OutputHandler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;

import static com.supermarket.pricer.output.Constants.ERROR_WHEN_LOADING_CSV;

/**
 * CsvLoader is an implementation of the ItemLoader interface that
 * provides mechanisms for loading csv contents into an item.
 */

public class CsvLoader implements ItemLoader {
    private static final String COMMA_DELIMITER = ",";
    private static final String DEFAULT_FILE_PATH = "pricer.csv";
    private static final String UNNAMED = "unnamed";
    private String filePath;

    @Override
    public void load(Map<Integer, Item> items) {
        if (filePath == null) {
            setDefaultFilePath();
        }
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(COMMA_DELIMITER);
                updateItems(items, values);
            }
        } catch (IOException e) {
            OutputHandler.print(ERROR_WHEN_LOADING_CSV, OutputColor.RED);
            e.printStackTrace();
        }
    }

    private void updateItems(Map<Integer, Item> items, String[] values) {
        if (items.containsKey(Integer.valueOf(values[0]))) {
            items.get(Integer.valueOf(values[0])).setPrice(new BigDecimal(values[1]));
        } else {
            items.put(Integer.valueOf(values[0]), Item.builder().name(UNNAMED).price(new BigDecimal(values[1])).build());
        }
    }

    void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    void setDefaultFilePath() {
        this.filePath = DEFAULT_FILE_PATH;
    }

}
