import java.util.ArrayList;
import java.util.Scanner;

public class UserService {
    public void CadastrarUsuario(Scanner scanner, ArrayList<User> users) {

        System.out.println("Nome:");
        String name = scanner.nextLine();

        System.out.println("Email: ");
        String email = scanner.nextLine();

        System.out.println("Idade: ");
        int age = scanner.nextInt();

        users.add(new User(name, email, age));
        System.out.println("Usuario Cadastrado com Sucesso!");

    }

    public void listarUsuarios(ArrayList<User> users){
        if (users.isEmpty()) {
            System.out.println("nenhum usuário encontrado!");
            return;
        }

        for (int i = 0; i < users.size(); i++){
            User u = users.get(i);
            System.out.println(
                i + " - " + u.getName() + " | " + u.getAge() + " anos " + " | " + u.getEmail()
            );
        }
    }
}
