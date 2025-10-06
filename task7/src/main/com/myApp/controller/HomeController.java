package main.com.myApp.controller;

import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
public class HomeController
{

    @RequestMapping("/")
    public String showHomePage()
    {
        return "formPage";
    }

    @RequestMapping("/processForm")
    public String processForm(HttpServletRequest request, Model model)
    {
        String fname = request.getParameter("Fname");
        String lname = request.getParameter("Lname");
        String email = request.getParameter("Email");
        String city = request.getParameter("City");
        String dob = (String) request.getParameter("DOB");

        //step2: add name to model
        model.addAttribute("fname", fname);
        model.addAttribute("lname", lname);
        model.addAttribute("email", email);
        model.addAttribute("city", city);
        model.addAttribute("dob", dob);


        //step3: return view page
        return "resultPage";
    }
}


