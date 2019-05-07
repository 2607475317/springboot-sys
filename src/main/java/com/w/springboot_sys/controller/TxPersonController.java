package com.w.springboot_sys.controller;

import com.w.springboot_sys.model.TxPerson;
import com.w.springboot_sys.service.TxPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class TxPersonController {
    @Autowired
    private TxPersonService txPersonService;
    @RequestMapping("/main")
    public String main(Model model){
        List<TxPerson> txPeople = txPersonService.selectPersons();
        model.addAttribute("pList",txPeople);
        return "main";
    }

    @RequestMapping("/save")
       public String save(TxPerson person){
      txPersonService.insert(person);
      return "redirect:main";
    }
    //修改显示
    @RequestMapping("/getPerson")
     public String main(int pid,Model model){
        TxPerson personById = txPersonService.getPersonById(pid);
        model.addAttribute("p",personById);
        return "update";
    }
    //修改
    @RequestMapping("/update")
    public String update(TxPerson person){
        txPersonService.updatePerson(person);
        return "redirect:main";
    }
    //删除
    @RequestMapping("/delete")
    public String delete(int pid){
        txPersonService.delete(pid);
        return "redirect:main";
    }
    //登录
    @RequestMapping("/login")
    public String login(TxPerson person, Model model, HttpSession session){
        TxPerson personByUserPass = txPersonService.getPersonByUserPass(person);
        if (personByUserPass!=null){
            session.setAttribute("user",personByUserPass);
            return "redirect:index";
        }else {
            model.addAttribute("tip","用户名或者密码错误");
            return "login";
        }
    }

}
