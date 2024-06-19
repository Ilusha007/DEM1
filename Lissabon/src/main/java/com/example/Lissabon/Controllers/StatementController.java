package com.example.Lissabon.Controllers;


import com.example.Lissabon.Model.Statement;
import com.example.Lissabon.Service.StatementService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/main")
public class StatementController {


    private final StatementService statementService;
    @GetMapping
    public String mainPage(Model model){
        model.addAttribute("statements",statementService.findAllStatement());
        return "main";
    }


    @GetMapping("/createForm")
    public String createStatementForm() {
        return "createStatement";
    }
    @PostMapping("/create")
    public String createStatement(Statement statement) {
        statementService.create(statement);
        return "redirect:/main";
    }


}
