import java.util.ArrayList;
import java.util.Scanner;;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        ArrayList<User> users = new ArrayList<>();

        int option;

        do{
            System.out.println("====== M E N U ======");
            System.out.println("1 - Cadastrar Usário");
            System.out.println("2 - Listar Usuário");
            System.out.println("3 - Remover Usuário");
            System.out.println("0 - Sair");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Nome:");
                    String name = scanner.nextLine();

                    System.out.println("Email: ");
                    String email = scanner.nextLine();

                    System.out.println("Idade: ");
                    int age = scanner.nextInt();

                    users.add(new User (name , email, age));
                    break;
            
                default:
                    break;
            }
        }
      
    }
}
