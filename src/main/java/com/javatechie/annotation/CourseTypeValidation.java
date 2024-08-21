package com.javatechie.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;
//We are creating our custom annotation
@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = CourseTypeValidator.class)
public @interface CourseTypeValidation {

    String message() default "Course Type should be either LIVE OR RECORDING";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
