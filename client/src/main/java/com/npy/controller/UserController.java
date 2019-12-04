package com.npy.controller;

import com.npy.entity.User;
import com.npy.entity.UserVO;
import com.npy.feign.OrderFeign;
import com.npy.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserFeign userFeign;
    @Autowired
    private OrderFeign orderFeign;

    @GetMapping("/findAll")
    @ResponseBody
    public UserVO findAll(@RequestParam("page") int page, @RequestParam("limit") int limit){
        return userFeign.findAll(page, limit);
    }

    @GetMapping("/findAll/{page}/{limit}")
    @ResponseBody
    public UserVO findAll2(@PathVariable("page") int page, @PathVariable("limit") int limit){
        return userFeign.findAll(page, limit);
    }

    @PostMapping("/save")
    public String save(User user){
        user.setRegisterdate(new Date());
        userFeign.save(user);
        return "redirect:/account/redirect/user_manage";
    }

//    @GetMapping("/redirect/{location}")
//    public String redirect(@PathVariable("location") String location){
//        return location;
//    }

    @GetMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id") long id){
        orderFeign.deleteByUid(id);
        userFeign.deleteById(id);
        return "redirect:/account/redirect/user_manage";
    }
}
