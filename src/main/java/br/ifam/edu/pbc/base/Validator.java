package br.ifam.edu.pbc.base;

import br.ifam.edu.pbc.exception.LoggerException;
import br.ifam.edu.pbc.exceptions.ValidationException;

import java.io.IOException;

public abstract class Validator {

    private final ILog logger;

    private String fieldName;

    private String errorMessage;

    private Class<?> type;

    public Validator(String fieldName, String errorMessage, Class<?> type, ILog logger) throws LoggerException {
        this.fieldName = fieldName;
        this.errorMessage = errorMessage;
        this.type = type;
        this.logger = logger;
        logger.setSource("validator"+"-"+fieldName);
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public Class<?> getType() {
        return type;
    }

    public abstract void validate(Object value) throws ValidationException;

    private void verifyType(Object value) throws Exception{

        Class<?> objectClassType= value.getClass();

        if(!objectClassType.equals(this.type)){
            throw new ClassCastException("Error on converting types: "
                    +objectClassType.getName()
                    +" into "
                    +this.type.getName());
        }

    }

    public void check(Object value) throws ValidationException, IOException, LoggerException {

        try {

            verifyType(value);
            validate(value);

        }catch(Exception e){

            ValidationException validationException = new ValidationException(
                    this.getFieldName()+": "+this.getErrorMessage(),e);

            logger.log(validationException);

            throw validationException;

        }

    }


}
