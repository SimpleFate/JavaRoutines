package com.hust.corey;

import java.lang.annotation.*;


@Documented
@Target({ElementType.METHOD,ElementType.TYPE})
@Inherited
@Retention(RetentionPolicy.RUNTIME)

public @interface Customer {
    int pieces()default 1;
    String prefix()default "default prefix";
}
