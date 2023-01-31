package hello.hellospring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("hello") 
    public String hello(Model model){ //servlet의 req와 같은 역할
        model.addAttribute("data","hello!"); //set
        return "hello"; //보내려는 html에게 리턴으로 전달한다.(templates)
    }

}
