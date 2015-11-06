package com.epam.SE13.task2.SAX;

import com.epam.SE13.task2.Food;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;

/**
 * Created by Vesdet on 05.11.2015.
 */
public class Task_2_SAX {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException{

        XMLReader reader = XMLReaderFactory.createXMLReader();
        MenuSaxHandler handler = new MenuSaxHandler();
        reader.setContentHandler(handler);

        reader.parse(new InputSource("src\\com\\epam\\SE13\\task2\\menu.xml"));

        List<Food> menu = handler.getFoodList();

        for (Food food: menu) {
            System.out.println(food.getName() + "   " + food.getPrice() + "    " + food.getDescription() + "    " + food.getCalories());
        }

    }
}
