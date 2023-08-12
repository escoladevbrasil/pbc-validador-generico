import br.ifam.edu.pbc.validators.NameValidator;

public class TesteValidador {

    public static void main(String[] args) {


        String name = "Rogerio1";

         NameValidator nameValidator = new NameValidator("Nome","deve ser apenas letras e espaço.");


        try {
            nameValidator.validate(name);
            System.out.println("Passou na validação!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }







    }
}
