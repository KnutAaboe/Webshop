package Classes;

//import javax.persistence.Entity;
//import javax.persistence.Table;
import java.util.List;

//@Entity
//@Table(schema = "webshop", name = "userlist")
public class User {
    private String username;
    private String password;
    private List<Cart> cartList;

    public User(String username, String password, List<Cart> cartList){
        this.username = username;
        this.password = password;
        this.cartList = cartList;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Cart> getCartList() {
        return cartList;
    }

    public void setCartList(List<Cart> cartList) {
        this.cartList = cartList;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", cartList=" + cartList +
                '}';
    }
}
