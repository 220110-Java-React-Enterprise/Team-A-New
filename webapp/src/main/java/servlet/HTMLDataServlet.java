package servlet;

import DAOs.UsersDAO;
import Repository.Repository;
import utils.FileLogger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

//Class to test out writing database information to an html page
public class HTMLDataServlet extends HttpServlet {
    static FileLogger fileLogger;

    public HTMLDataServlet() {
        fileLogger = FileLogger.getFileLogger();
    }

    //Method to get a list of all user information in the database. For security purposes.
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Make sure it's using the right driver
        try {
            Class.forName ("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //Create repository object and read from database into list of users
        Repository<UsersDAO> repo = new Repository<UsersDAO>(new UsersDAO());
        List<UsersDAO> users = repo.readAll();

        //Set the response type to html
        resp.setContentType("text/html");

        //Write to html file
        PrintWriter out = resp.getWriter();
        out.println("<h1>For the \"hackers\"</h1>");
        for (UsersDAO u : users) {
            out.println("<br/>" + DisplayObjectAsJSON(u));
        }

        //Response code
        resp.setStatus(202);
    }

    public String DisplayObjectAsJSON(UsersDAO u)
    {
        String JSON = "";
        try
        {
            if (u == null)
            {
                System.out.println("objct is null. can't be displayed");
                return "";
            }
            JSON = JSON + "{\n";
            JSON = JSON + "\t\"id\":" + u.getID() + ",\n\t\"name\":\"" + u.getName() + "\",\n\t\"password\":\"" + u.getPassword() + "\",\n\t\"email\":\"" + u.getEmail() + "\"\n";
            JSON = JSON + "  },\n";
        }
        catch (Exception Exc)
        {
            System.out.println("Exception: " + Exc);
        }
        return JSON;
    }
}
