import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        ArrayList<User> users = new ArrayList<>();

        int option;

        do {
            System.out.println("====== M E N U ======");
            System.out.println("1 - Cadastrar Usário");
            System.out.println("2 - Listar Usuário");
            System.out.println("3 - Remover Usuário");
            System.out.println("0 - Sair");

            UserService userService = new UserService();

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {

                case 1:
                    userService.CadastrarUsuario(scanner, users);
                    break;

                case 2:
                    userService.listarUsuarios(users);
                    break;

                case 3:
                    System.out.println("Digite o e-mail do usuário: ");
                    String searchEmail = scanner.nextLine();

                    boolean removed = false;

                    for (int i = 0; i < users.size(); i++) {
                        if (users.get(i).getEmail().equalsIgnoreCase(searchEmail)) {
                            users.remove(i);
                            System.out.println("Usuário Removido!");
                            removed = true;
                            break;
                        }
                    }
                    if (!removed) {
                    }
                    break;

                case 0:
                    System.out.println("Saindo....");
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        } while (option != 0);
        {
            scanner.close();
        }
    }

}
