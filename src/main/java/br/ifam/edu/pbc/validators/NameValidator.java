package br.ifam.edu.pbc.validators;

import br.ifam.edu.pbc.base.Validator;
import br.ifam.edu.pbc.exceptions.ValidationException;

public class NameValidator extends Validator{

    Class<?> type;
    public NameValidator(String fieldName, String errorMessage) {
        super(fieldName, errorMessage, String.class);
    }

    public void validate(Object value) throws ValidationException{

        String text = (String) value;

        if(!text.matches("[a-zA-Z\\s]+")){
            throw new IllegalArgumentException();
        }

    }



}
