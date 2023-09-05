package dev.ristoflink.fieldvalidation;

import java.util.Date;

import jakarta.validation.ConstraintValidator;

public class AgeValidator implements ConstraintValidator<Age,int> {
    long diff = new Date().getTime() - Age.getTime();

    @Override
    public boolean isValid()

}
