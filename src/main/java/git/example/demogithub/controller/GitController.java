package git.example.demogithub.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class GitController {

    @GetMapping("/user")
    public String user() {
        //qweqwe qwewqeqwewqe
        //qweqweqwe new 1
        //add comment too
        return "User";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Admin";
    }

}
