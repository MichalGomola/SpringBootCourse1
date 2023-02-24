package com.ltp.gradesubmission;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GradeController {
    
    List<Grade> studentGrades = Arrays.asList(
        new Grade("Harry", "Potions", "C-"),
        new Grade("Hermione", "Arithmancy", "A+"), 
        new Grade("Ron", "Charms", "D-"));
    
    @GetMapping("/grades")
    public String sayGrades(Model model) {      
        model.addAttribute("grades", studentGrades);
        return "grades";
    }
}
