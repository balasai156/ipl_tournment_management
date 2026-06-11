package bean;


import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DBConnection;
import model.Team;

import java.util.ArrayList;

@WebServlet("/teams")
public class TeamServlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        ArrayList<Team> teamList = new ArrayList<>();
        
        try {
            Connection conn = DBConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM teams");
            
            while (rs.next()) {
                int id = rs.getInt("team_id");
                String name = rs.getString("team_name");
                String str = rs.getString("short_name");
                
                Team team = new Team(id, name, str);
                teamList.add(team);
            }
            
            conn.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        request.setAttribute("teams", teamList);
        request.getRequestDispatcher("teams.jsp").forward(request, response);
    }
}