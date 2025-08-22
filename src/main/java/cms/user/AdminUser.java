package cms.user;

public class AdminUser extends User {

    public AdminUser(int id, String nome, String email, String password) {
        super(id, nome, email, password); // chama o construtor da classe abstrata User
    }

    public void deleteContent(int contentId) {
        // exclusivo do admin
        System.out.println("Admin deletou o conteúdo com id " + contentId);
    }
}
