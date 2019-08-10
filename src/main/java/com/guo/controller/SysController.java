package com.guo.controller;import com.github.pagehelper.PageHelper;import com.github.pagehelper.PageInfo;import com.guo.entity.BlogUserWithBLOBs;import com.guo.entity.SysUser;import com.guo.entity.SysUserExample;import com.guo.entity.SysUserWithBLOBs;import com.guo.service.ISysService;import org.apache.shiro.SecurityUtils;import org.apache.shiro.authc.UsernamePasswordToken;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.stereotype.Controller;import org.springframework.ui.Model;import org.springframework.web.bind.annotation.*;import org.apache.shiro.subject.Subject;import org.springframework.web.servlet.ModelAndView;import java.util.HashMap;import java.util.List;import java.util.Map;/** * @author guoyutao * @date 2019/03/06 */@Controller@RequestMapping(value = "/system")public class SysController {    @Autowired    private ISysService sysService;    @RequestMapping(value = "/login",method = RequestMethod.POST)    public String login(@ModelAttribute(value = "sysUser") SysUser sysUser){        Subject subject= SecurityUtils.getSubject();        UsernamePasswordToken usernamePasswordToken=new UsernamePasswordToken(                sysUser.getUserId(),sysUser.getUserPassword());        subject.login(usernamePasswordToken);        return "index";    }    /**     * 查询所有管理员     * @return     */    @RequestMapping(value = "/findsys")    public ModelAndView findSysUser(@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "2") int pageSize){        ModelAndView model=new ModelAndView();        PageHelper.startPage(pageNum,pageSize);        SysUserExample userExample = new SysUserExample();        List<SysUserWithBLOBs> sysUsers = sysService.querySysUser(userExample);        PageInfo<SysUserWithBLOBs> pageInfo = new PageInfo<>(sysUsers);        model.addObject("sysUsers",sysUsers);        model.addObject("total",pageInfo.getTotal());        model.setViewName("sys/adminList");        return model;    }    /**     * 根据权限查询管理员     * @param permission     * @return     */    @ResponseBody    @RequestMapping(value = "/findby")    public Map<String,Object> findByPermission(String permission){        Map<String,Object> result = new HashMap<>();        List<SysUserWithBLOBs> sysUsers = sysService.queryByPermission(permission);        result.put("sysUsers",sysUsers);        return result;    }    /**     * 根据搜索框查询管理员     * @param seacrh     * @return     */    @ResponseBody    @RequestMapping(value = "findbyExample")    public Map<String,Object> findByExample(String seacrh){        Map<String,Object> result = new HashMap<>();        SysUserExample userExample = new SysUserExample();        // userExample.or 或连接 查询条件or关系        SysUserExample.Criteria criteria1=userExample.createCriteria();        criteria1.andUserIdLike(seacrh);        SysUserExample.Criteria criteria2=userExample.createCriteria();        criteria2.andUserNameLike(seacrh);        userExample.or(criteria2);        List<SysUserWithBLOBs> sysUsers = sysService.querySysUser(userExample);        result.put("sysUsers",sysUsers);        return result;    }}