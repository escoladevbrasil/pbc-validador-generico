import br.ifam.edu.pbc.base.Logger;
import br.ifam.edu.pbc.exception.LoggerException;
import br.ifam.edu.pbc.exceptions.ValidationException;
import br.ifam.edu.pbc.validators.NameValidator;

import java.io.IOException;

public class TesteValidador {

    public static void main(String[] args) {


        String name = "Rogerio1";

//        Double name = 1.5;

        try {

         NameValidator nameValidator = new NameValidator(
                 "Nome",
                 "deve ser apenas letras e espaço.",new Logger());

            nameValidator.check(name);

            System.out.println("Passou na validação!");

        } catch(ValidationException | IOException | LoggerException e) {
            System.out.println(e.getMessage());

        }







    }
}
