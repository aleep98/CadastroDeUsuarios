public class User {
    private String name;
    private String email;
    private int age;

    public User (String name, String email, int idade){
        this.name = name;
        this.email = email;
        this.age = idade;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    
}
