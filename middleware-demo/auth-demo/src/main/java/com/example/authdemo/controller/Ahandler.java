package com.example.authdemo.controller;

import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ahandler {

    // 登录的url
    @RequestMapping({ "/login", "/" })
    public String indexHtml() {
        return "/index";
    }

    // 属于user角色@RequiresRoles("user")
    // 必须同时属于user和admin角@RequiresRoles({ "user", "admin" })
    // 属于user或者admin之一;修改logical为OR 即可@RequiresRoles(value = { "user", "admin"},
    // logical = Logical.OR)


    @RequestMapping("/showUserHtml.htm")
    @RequiresRoles(value = { "user", "admin"},logical = Logical.OR)
    @RequiresPermissions("user:query")
    public String userHtml() {
        return "/user";
    }


    @RequestMapping("/showAdminHtml.htm")
    @RequiresRoles("admin")
    @RequiresPermissions("admin:query")
    public String adminHtml() {

        return "/admin";
    }
    @RequestMapping("/unauthorized.htm")
    public String unauthorized() {
        return "/abc";
    }

    @RequestMapping("/LoginSuccess.htm")
    public String listHtml() {
        return "/list";
    }


    @RequestMapping("/error.htm")
    public String error() {
        int a = 1 / 0;
        return "/abc";
    }
}
