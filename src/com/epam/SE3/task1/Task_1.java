package com.epam.SE3.task1;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by Vesdet on 15.10.2015.
 */
public class Task_1 {
    public static void main(String[] args) throws InterruptedException {
        CrazyLogger logger = new CrazyLogger("Dima");
        logger.addNewMessage("First");
        SECONDS.sleep(1);
        logger.addNewMessage("Second");
        SECONDS.sleep(1);
        logger.addNewMessage("Third");
        SECONDS.sleep(2);
        logger.addNewMessage("Forth");

        String need = logger.searchMessage("ort");
        System.out.println(need);

        System.out.println(logger);
    }
}
