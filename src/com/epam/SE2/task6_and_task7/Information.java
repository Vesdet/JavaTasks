package com.epam.SE2.task6_and_task7;

import java.lang.annotation.Documented;

/**
 * Created by Vesdet on 08.10.2015.
 */
@Documented
public @interface Information {
    String author() default "Vesdet";
    String lastModified();
}
