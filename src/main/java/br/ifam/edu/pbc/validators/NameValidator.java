package br.ifam.edu.pbc.validators;

import br.ifam.edu.pbc.base.Validator;
import br.ifam.edu.pbc.exceptions.ValidationException;

public class NameValidator extends Validator{
    public NameValidator(String fieldName, String errorMessage) {
        super(fieldName, errorMessage);
    }

    public void validate(Object value) throws ValidationException{

        String text = value.toString();

        if(!text.matches("[a-zA-Z\\s]+")){
            throw new IllegalArgumentException();
        }
    }



}
