package Servlet;

import Classes.Cart;
import Classes.Item;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


@WebServlet(
        name="/Login",
        urlPatterns ="/Login"
)
public class Login extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {

        req.getRequestDispatcher("WEB-INF/jsp/login.jsp").forward(req, rep);

    }


    @Override
    protected void doPost (HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
        String username = "Knut";
        String password = "Pass1";

        //Valid user
        if (req.getParameter("username").equals(username) && req.getParameter("password").equals(password)) {

            HttpSession session = req.getSession(false);
            if (session != null) {
                session.invalidate();
            }
            session = req.getSession(true);
            session.setMaxInactiveInterval(60);

            session.setAttribute("username", username);

//                ArrayList<Cart> cart = new ArrayList<>(Collections.singletonList(new Cart()));
//                List<Item> cart = new Cart().getItems();

//                Item item = new Item("ost", 1);
//                Item item2 = new Item("ost", 3);
//                List<Item> items = Arrays.asList(item, item2);
//                Cart cart = new Cart(items);
//                ArrayList<Cart> cartt = new ArrayList<>(Collections.singletonList(cart));


            Cart cart = new Cart();


            session.setAttribute("cart", cart); //new CART

            rep.sendRedirect("/ShoppingCart");

        } else {
            //kom me noe fancy response error
            rep.sendRedirect("/Login");


        }
    }

}

