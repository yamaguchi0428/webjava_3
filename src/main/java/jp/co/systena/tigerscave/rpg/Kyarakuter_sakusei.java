package jp.co.systena.tigerscave.rpg;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication


@Controller
public class Kyarakuter_sakusei{
  @Autowired
  HttpSession session;
@RequestMapping(value="/charactermake",method = RequestMethod.GET)

public  ModelAndView index(ModelAndView mav) {

  mav.setViewName("NewFile");

  return mav ;
}




}
