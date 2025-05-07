package kz.project.Students.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import kz.project.Students.model.Students;
import kz.project.Students.services.Database;




@Controller
public class HomeController {

    @GetMapping("/")
    public String indexPage(Model model) {
        model.addAttribute("studentter", Database.getStudents());
        return "index";
    }

    @GetMapping("/students")
    public String studentPage(Model model) {
        model.addAttribute("studentter", Database.getStudents());
        return "students";
    }

//    @PostMapping("/addStudents")
//    public String addStudents(
//            @RequestParam("name") String name,
//            @RequestParam("surname") String surname,
//            @RequestParam("exam") int exam,
//            @RequestParam("mark") String mark) {
//        System.out.println("Добавлен студент: " + name + " " + surname + " " + exam +" "+ mark);
//
//        Database.addStudents(name,surname,exam,mark);
//        return "redirect:/students";
//    }

    @GetMapping(value = "/add-student")
    public String addStudentPage(){
        return "add-student";
    }
    @PostMapping(value = "/add-student")
    public String addStudent(Students student){
        Database.addStudent(student);
        return "redirect:/";
    }

}
