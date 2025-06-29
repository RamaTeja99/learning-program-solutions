package slf4j;

public class UserRegisteration {
	public static void main(String[] args) {
        UserService service = new UserService();
        service.registerUser("alice");       
        service.registerUser("bob");         
        service.registerUser("alice");       
        service.registerUser("");            
        service.registerUser(null);          
    }
}
