package Servlet;
//SENERE FIKS FRA Cart TIL CART!
import Classes.Cart;
import Classes.Item;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

@WebServlet(
        name="/ShoppingCart",
        urlPatterns = "/ShoppingCart"
)
public class ShoppingCart extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
//        Check for valid user
        HttpSession session = req.getSession(false);
//        if (session == null || session.getAttribute("username") == null) {
//            rep.sendRedirect("/Login");
//        } else {


//        String username = (String) session.getAttribute("username");
//        Cart cart = (Cart) session.getAttribute("cart"); //CART

//        //Input search bar
//        out.println("<form action=\"ShoppingCart\" + method=\"post\">");
//        out.println("   <fieldset>");
//        out.println("       <p><center><input type=\"text\" name=\"item\" + size=\"width: 150px;\" + style=\\\"display: inline;\" + style=\"font-size:15pt;\"/></center>"); //search bar text der du fjerne me å klikke?
//        out.println("       <button type=\"submit\">Add item</button>"); //Koss får eg denne i center?
//        out.println("   </fieldset>");
//        out.println("</form>");
//
//        //Adding items and printing out
//        out.println("<p><strong>Your shopping list:</strong></p>");


//        for (Item i : cart.getItems()) { //Call on a funtion to check if it allready exists, and then add, delete or make new
//            out.println("<form action=\"ShoppingCart\" + method=\"post\">");
//            out.println("<p>" + i.getName() + ": " + i.getUnit() +
//                    "<input type=\"submit\" name=\"" + i.getName() + "MOD\" value=\"+\"/>" +
//                    "<input type=\"submit\" name=\"" + i.getName() + "MOD\" value=\"-\"/>" +
//
//                    "</p>" + "</form>");
//        }
//
//        out.println("</form>");
//        out.println("</body>");
//        out.println("</html>");

        req.getRequestDispatcher("WEB-INF/jsp/shopping.jsp").forward(req, rep);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {

//        //Not a valid user
        HttpSession session = req.getSession(false);
//        if (session == null || session.getAttribute("username") == null) {
//            rep.sendRedirect("/Login");
//
//            //Valid user
//        } else {
//            Cart cart = (Cart) session.getAttribute("cart");
//            String newItem = req.getParameter("item");
//
//            //Adding item (or pluss unity)
//            if (newItem != null) {
//                if (cart.itemExist(newItem)) {
//                    cart.addUnit(newItem);
//                } else {
//                    cart.addItem(newItem);
//                }
//
//            } else {
//
//                Item pleaseWork = null;
//                for (Item i : cart.getItems()) {
//                    String button = req.getParameter(i.getName() + "MOD");
//
//                    if (button != null) {
//                        if (button.equals("+"))
//                            cart.addUnit(i.getName());
//                        else if (button.equals("-"))
//                            //cart.removeUnit(i.getName());
//                            pleaseWork = i;
//                    }
//                }
//
//                if (pleaseWork != null) {
//                    cart.removeUnit(pleaseWork.getName());
//                }
//
//            }
//        }
//        rep.sendRedirect("/ShoppingCart");

//        Cart cart = (Cart) session.getAttribute("cart");
//        ArrayList<Cart> cartt = new ArrayList<>(Collections.singletonList(cart));
        ArrayList<Cart> cartt = (ArrayList<Cart>) session.getAttribute("cart");
        Cart cart = cartt.get(0);





    }
}






