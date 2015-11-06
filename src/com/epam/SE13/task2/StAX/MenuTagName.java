package com.epam.SE13.task2.StAX;

/**
 * Created by Vesdet on 05.11.2015.
 */
public enum MenuTagName {
    NAME,
    PRICE,
    DESCRIPTION,
    CALORIES,
    FOOD,
    BREAKFAST_MENU;

    public static MenuTagName getElementTagName (String element) {
        switch (element) {
            case "food":
                return FOOD;
            case "price":
                return PRICE;
            case "description":
                return DESCRIPTION;
            case "name":
                return NAME;
            case "calories":
                return CALORIES;
            case "breakfast-menu":
                return BREAKFAST_MENU;
            default:
                throw new EnumConstantNotPresentException(MenuTagName.class, element);
        }
    }
}
