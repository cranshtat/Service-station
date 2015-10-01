/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.station.controller;

import by.station.entity.Avto;
import by.station.entity.Klient;
import by.station.entity.OrderAvto;
import by.station.logic.AddAvto;
import by.station.logic.AddKlient;
import by.station.logic.AddOrderAvto;
import by.station.logic.DelAvto;
import by.station.logic.DelKlient;
import by.station.logic.DelOrderAvto;
import by.station.logic.UpdateAvto;
import by.station.logic.UpdateClient;
import by.station.logic.UpdateOrderAvto;
import by.station.util.AvtoCreator;
import by.station.util.KlientCreator;
import by.station.util.OrderAvtoCreator;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Евгений
 */


@WebServlet(name = "Controller",loadOnStartup = 1, urlPatterns = {"/Controller",
                                                                  "/index",
                                                                  "/registration",
                                                                  "/cartclient",
                                                                  "/regavto",
                                                                  "/orderavto",
                                                                  "/clients",
                                                                  "/delorderavto",
                                                                  "/updateorder",
                                                                  "/delavto",
                                                                  "/delclient",
                                                                  "/search",
                                                                  "/updateclient",
                                                                  "/upavto"})
public class Controller extends HttpServlet{
    @Override
    public void init() throws ServletException {
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String contextPath = request.getContextPath();
        String userPath = request.getServletPath();
        String url = "";
        switch (userPath) {
        case "/index":
                url = userPath + ".jsp";
                break;
        case "/registration":
                url = userPath + ".jsp";
                break;
        case "/cartclient":
            int id = Integer.parseInt(request.getParameter("id"));
            request.setAttribute("cartClient",KlientCreator.getKlientById(id).getList());
            request.setAttribute("listAvtoToClient",AvtoCreator.getAvtoByIdKlient(id).getList());
            request.setAttribute("id", id);
            url = "WEB-INF/pages/cartclient.jsp";
            break;
        case "/regavto":
            int idKlient = Integer.parseInt(request.getParameter("id"));
            request.setAttribute("id", idKlient);
            url = "WEB-INF/pages"+userPath+".jsp";
            break;
            case "/clients":
                request.setAttribute("listClients",KlientCreator.getAllKLients().getList());
                url = "WEB-INF/pages/clients.jsp";
            break;
        case "/orderavto":
            int idavto = Integer.parseInt(request.getParameter("id"));
            request.setAttribute("idavto", idavto);
            request.setAttribute("listOrderAvto",OrderAvtoCreator.getOrderByAvtoId(idavto).getList());
            url = "WEB-INF/pages/orderavto.jsp?idavto="+idavto;
            break;
        case "/delorderavto":
            int idav = Integer.parseInt(request.getParameter("idavto"));
            int idorder = Integer.parseInt(request.getParameter("idord"));
            DelOrderAvto.delOrdAvto(idorder);
            response.sendRedirect(response.encodeRedirectURL(contextPath + "/orderavto?id="+idav));
            return;
        case "/updateorder":
            int updateidavto = Integer.parseInt(request.getParameter("idavto"));
            int updateidorder = Integer.parseInt(request.getParameter("idord"));
            String updatedateorder = request.getParameter("date");
            int sum = Integer.parseInt(request.getParameter("sum"));
            String status = request.getParameter("status");
            request.setAttribute("idavto", updateidavto);
            request.setAttribute("idorder", updateidorder);
            request.setAttribute("dateorder", updatedateorder);
            request.setAttribute("sum", sum);
            request.setAttribute("status", status);
            url = "WEB-INF/pages"+userPath+".jsp";
            break;
        case "/updateclient":
            int updateidclient = Integer.parseInt(request.getParameter("idclient"));
            String updatename = request.getParameter("name");
            String updatesurname = request.getParameter("surname");
            String updatebirthday = request.getParameter("birthday");
            String updateaddress = request.getParameter("address");
            String updatephone = request.getParameter("phone");
            String updateemail = request.getParameter("email");
            request.setAttribute("idclient", updateidclient);
            request.setAttribute("name", updatename);
            request.setAttribute("surname", updatesurname);
            request.setAttribute("birthday", updatebirthday);
            request.setAttribute("address", updateaddress);
            request.setAttribute("phone", updatephone);
            request.setAttribute("email", updateemail);
            url = "WEB-INF/pages"+userPath+".jsp";
            break;
        case "/upavto":
            int idkl = Integer.parseInt(request.getParameter("idklient"));
            int upidavto = Integer.parseInt(request.getParameter("id"));
            String upmake = request.getParameter("make");
            String upmodel = request.getParameter("model");
            int upyear = Integer.parseInt(request.getParameter("year"));
            String upvin= request.getParameter("vin");
            request.setAttribute("idklient", idkl);
            request.setAttribute("idavto", upidavto);
            request.setAttribute("make", upmake);
            request.setAttribute("model", upmodel);
            request.setAttribute("year", upyear);
            request.setAttribute("vin", upvin);
            url = "WEB-INF/pages"+userPath+".jsp";
            break;
        case "/delavto":
            int iddelavto = Integer.parseInt(request.getParameter("id"));
            int idKl = Integer.parseInt(request.getParameter("idklient"));
            DelAvto.delAv(iddelavto);
            response.sendRedirect(response.encodeRedirectURL(contextPath + "/cartclient?id="+idKl));
            return;
        case "/delclient":
            int iddelclient = Integer.parseInt(request.getParameter("id"));
            DelKlient.delKl(iddelclient);
            response.sendRedirect(response.encodeRedirectURL(contextPath + "/clients"));
            return;
        }
        try {
            request.getRequestDispatcher(url).forward(request, response);
        } catch (ServletException | IOException ex) {
            ex.printStackTrace();
        }
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String userPath = request.getServletPath();
        String url = "";
        switch (userPath) {
            case "/registration":
                String name = request.getParameter("name");
                String surname = request.getParameter("surname");
                String birthday = request.getParameter("birthday");
                String address = request.getParameter("address");
                String phone = request.getParameter("phone");
                String email = request.getParameter("email");
                AddKlient.addKl(name, surname, birthday, address, phone, email);
                request.setAttribute("listClients",KlientCreator.getAllKLients().getList());
                url = "WEB-INF/pages" + "/clients.jsp";
                request.getRequestDispatcher(url).forward(request, response);
            break;
            case "/regavto":
                int idKlient = Integer.parseInt(request.getParameter("id"));
                String make = request.getParameter("make");
                String model = request.getParameter("model");
                int year = Integer.parseInt(request.getParameter("year"));
                String vin = request.getParameter("vin");
                AddAvto.addAv(make, model, year, vin,idKlient);
                request.setAttribute("listAvtoToClient",AvtoCreator.getAvtoByIdKlient(idKlient).getList());
                request.setAttribute("cartClient",KlientCreator.getKlientById(idKlient).getList());
                response.sendRedirect(response.encodeRedirectURL(request.getContextPath() + "/cartclient?id="+idKlient));
                return;
            case "/orderavto":
                int idavto = Integer.parseInt(request.getParameter("id"));
                String date = request.getParameter("date");
                int sum = Integer.parseInt(request.getParameter("sum"));
                String status = request.getParameter("status");
                AddOrderAvto.addOrder(idavto, date, sum, status);
                request.setAttribute("listOrderAvto",OrderAvtoCreator.getOrderByAvtoId(idavto).getList());
                response.sendRedirect(response.encodeRedirectURL(request.getContextPath() + "/orderavto?id="+idavto));
                return;
            case "/updateorder":
                int updateidavto = Integer.parseInt(request.getParameter("id"));
                int updateidorder = Integer.parseInt(request.getParameter("idorder"));
                String updatedateorder = request.getParameter("date");
                int updatesum = Integer.parseInt(request.getParameter("sum"));
                String updatestatus = request.getParameter("status");
                UpdateOrderAvto.updateOrderAvto(updateidorder,updateidavto, updatedateorder, updatesum, updatestatus);
                response.sendRedirect(response.encodeRedirectURL(request.getContextPath() + "/orderavto?id="+updateidavto));
                return;
            case "/updateclient":
                int updateidclient = Integer.parseInt(request.getParameter("idclient"));
                String updatename = request.getParameter("name");
                String updatesurname = request.getParameter("surname");
                String updatebirthday = request.getParameter("birthday");
                String updateaddress = request.getParameter("address");
                String updatephone = request.getParameter("phone");
                String updateemail = request.getParameter("email");
                UpdateClient.updateClient(updateidclient, updatename, updatesurname, updatebirthday, updateaddress, updatephone, updateemail);
                response.sendRedirect(response.encodeRedirectURL(request.getContextPath() + "/cartclient?id="+updateidclient));
                return;
            case "/upavto":
                int idkl = Integer.parseInt(request.getParameter("idklient"));
                int upidavto = Integer.parseInt(request.getParameter("idavto"));
                String upmake = request.getParameter("make");
                String upmodel = request.getParameter("model");
                int upyear = Integer.parseInt(request.getParameter("year"));
                String upvin= request.getParameter("vin");
                UpdateAvto.updateAvto(upidavto, upmake, upmodel, upyear, upvin, idkl);
                response.sendRedirect(response.encodeRedirectURL(request.getContextPath() + "/cartclient?id="+idkl));
                return;
            case "/search":
                String nameClient = request.getParameter("name");
                String surnameClient = request.getParameter("surname");
                request.setAttribute("listClientsSearch", KlientCreator.getKlientByName(nameClient, surnameClient).getList());
                url = "WEB-INF/pages" + "/search.jsp";
                request.getRequestDispatcher(url).forward(request, response);
                return;
        } try {
            request.getRequestDispatcher(url).forward(request, response);
            } catch (ServletException | IOException ex) {
                ex.printStackTrace();
            } 
    }

    @Override
    public String getServletInfo() {
        return super.getServletInfo(); 
    }
    
    
    
}
