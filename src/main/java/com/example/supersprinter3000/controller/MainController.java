package com.example.supersprinter3000.controller;

import com.example.supersprinter3000.entity.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {
    @GetMapping("/index")
    public String index(Model model){
        Task task1 = new Task(1L,"Clean Bathhroom","Clean all in bathroom",2.34);
        Task task2 = new Task(2L,"Clean Car","Clean Tyres",5.34);

        List<Task> tasksList = List.of(task1,task2);
        model.addAttribute("tasks",tasksList);

        return "index";
    }
}
