package com.epam.SE13.task2.DOM;

import com.epam.SE13.task2.Food;
import com.sun.org.apache.xerces.internal.parsers.DOMParser;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vesdet on 06.11.2015.
 */
public class Task_2_DOM {
    public static void main(String[] args) throws IOException, SAXException {
        DOMParser parser = new DOMParser();
        parser.parse("src\\com\\epam\\SE13\\task2\\menu.xml");
        org.w3c.dom.Document document = parser.getDocument();

        Element root = document.getDocumentElement();
        List<Food> menu = new ArrayList<>();

        NodeList foodNodes = root.getElementsByTagName("food");
        Food food = null;

        for (int i=0; i<foodNodes.getLength(); i++) {
            food = new Food();
            Element foodElement = (Element) foodNodes.item(i);
            food.setId(Integer.parseInt(foodElement.getAttribute("id")));

            food.setName(getSingleChild(foodElement, "name").getTextContent().trim());
            food.setDescription(getSingleChild(foodElement, "description").getTextContent().trim());
            food.setPrice(getSingleChild(foodElement, "price").getTextContent().trim());
            food.setCalories(Integer.parseInt(getSingleChild(foodElement, "calories").getTextContent().trim()));
            menu.add(food);
        }

        for (Food x: menu) {
            System.out.println(x.getName() + "   " + x.getPrice() + "    " + x.getDescription() + "    " + x.getCalories());
        }
    }

    private static Element getSingleChild(Element element, String childName) {
        NodeList nList = element.getElementsByTagName(childName);
        Element child = (Element) nList.item(0);
        return child;
    }

}
