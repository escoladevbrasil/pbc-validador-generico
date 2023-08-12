package br.ifam.edu.pbc.base;

import br.ifam.edu.pbc.exceptions.ValidationException;

public abstract class Validator {

    private String fieldName;

    private String errorMessage;


    public Validator(String fieldName, String errorMessage) {
        this.fieldName = fieldName;
        this.errorMessage = errorMessage;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public abstract void validate(Object value) throws ValidationException;




}
