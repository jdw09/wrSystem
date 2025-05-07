package b1nd.jdw09.controller;

import b1nd.jdw09.model.MainModel;
import b1nd.jdw09.service.MainService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MainController {
    private final MainService mainService;
    public MainController(MainService mainService) { this.mainService = mainService; }

    @GetMapping("/")
    public String home(Model model) {
        List<MainModel> washer = mainService.getAll();
        model.addAttribute("washers", washer);
        return "index";
    }

    @GetMapping("/reservation")
    public String reservation() {
        return "reservation";
    }

    @PostMapping("/submit")
    public String reservationSubmit(@RequestParam int id, @RequestParam String time) {
        mainService.updateStatus(id);
//        System.out.println(time);
        return "updateSucceed";
    }

}
