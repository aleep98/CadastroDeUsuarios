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
                    System.out.println("Usuario Cadastrado com Sucesso!");
                    break;
                
                case 2:
                    if (users.isEmpty()) {
                        System.out.println("Nenhum usuário encontrado!");
                    }else {
                        for( int i = 0; i < users.size(); i++){
                            User u = users.get(i);
                            System.out.println(i + " - " + u.name + " | " + u.age + " Idade " +  u.email + "Email" );
                        }
                    }
                    break;

                    case 3: 
                    System.out.println("Digite o indice do usuário: ");
                    int index = scanner.nextInt();

                    if (index >= 0 && index < users.size()) {
                        users.remove(index);
                        System.out.println("Usuario removido!");
                    }else{
                        System.out.println("Indece inválido");
                    }
                    break;

                    case 0:
                        System.out.println("Saindo....");
                        break;
                default:
                    System.out.println("Opção Inválida!");
            }
        } while (option != 0); {
            scanner.close();
        }
      
    }
}
