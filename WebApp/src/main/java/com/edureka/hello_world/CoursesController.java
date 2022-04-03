package com.edureka.hello_world;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class CoursesController {

@RequestMapping("/tryhard")
public String courses ()
{
		
		return "course";
}

}
