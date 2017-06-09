package com.leanderli.controller;

import com.leanderli.bean.Users;
import com.leanderli.service.IUsersService;
import com.leanderli.service.impl.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/6/2.
 */
@Controller
public class UsersController {
    @Resource(name = "usersService")
    private IUsersService usersService = new UsersService();

    @RequestMapping("/listall")
    public String listAll(HttpSession session) {
        List<Users> usersList = usersService.listAll();
        if (null != usersList) {
            for (Users users : usersList) {
                System.out.println(users);
            }
            session.setAttribute("usersList", usersList);
        }
        return "redirect:/main.jsp";
    }

    @RequestMapping("/users_login")
    public String logIn(@RequestParam("usersname") String usersname, @RequestParam("userspwd") String userspwd, HttpSession session) {
        System.out.println("参数：" + usersname + userspwd);
        if (null == usersname || null == userspwd) {
            return "redirect:/error.jsp";
        } else {
            int result = usersService.selectByUsersInfo(usersname, userspwd);
            if (result > 0) {
                session.setAttribute("loginInfo", usersname);
                return "redirect:/listall";
            }
            return "redirect:/login.jsp";
        }
    }

    @RequestMapping("/users_logout")
    public String logOut(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.invalidate();
        return "redirect:/login.jsp";
    }

    public String addUsers() {
        return null;
    }
}
