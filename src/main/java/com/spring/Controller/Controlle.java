package com.spring.Controller;

import com.spring.User.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by Степан1 on 02.04.2018.
 */
@Controller
public class Controlle  {
        @RequestMapping(value = "/one4", method = RequestMethod.GET)
public ModelAndView main(){
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.addObject("userJSP", new User());
    modelAndView.setViewName("index");
    return modelAndView;
}


        @RequestMapping(value = "one4/check-user")
        public ModelAndView checkUser(@ModelAttribute("userJSP") User user) {
            ModelAndView modelAndView = new ModelAndView();

            //имя представления, куда нужно будет перейти
            modelAndView.setViewName("secondPage");

            //записываем в атрибут userJSP (используется на странице *.jsp объект user
            modelAndView.addObject("userJSP", user);

            return modelAndView; //после уйдем на представление, указанное чуть выше, если оно будет найдено.
        }
}
