import br.ifam.edu.pbc.exceptions.ValidationException;
import br.ifam.edu.pbc.validators.NameValidator;

public class TesteValidador {

    public static void main(String[] args) {


        String name = "Rogerio";

//        Double name = 1.5;

         NameValidator nameValidator = new NameValidator("Nome","deve ser apenas letras e espaço.");


        try {
            nameValidator.check(name);
            System.out.println("Passou na validação!");
        } catch(ValidationException e) {
            System.out.println(e.getMessage());
//            e.printStackTrace();
        }







    }
}
