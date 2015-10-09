package com.epam.SE2.task5;

/**
 * Created by Vesdet on 09.10.2015.
 */
public enum Subject {
    MATHEMATICS,
    PHYSICS,
    HISTORY,
    CHEMISTRY,
    RUSSIAN;

    public boolean isInteger() {
        switch (this) {
            case HISTORY:
            case RUSSIAN:
                return true;
            default:
                return false;
        }
    }

}