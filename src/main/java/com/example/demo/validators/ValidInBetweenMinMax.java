package com.example.demo.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.*;


@Target({ElementType.TYPE}) //elementtype.type, may not need .parameter
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {InBetweenMinMaxValidator.class})
public @interface ValidInBetweenMinMax {
    String message() default "Inventory must be above min and below max";
    Class [] groups() default {};
    Class [] payload() default {};
}
