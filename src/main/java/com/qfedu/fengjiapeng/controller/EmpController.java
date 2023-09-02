package com.qfedu.fengjiapeng.controller;

import com.qfedu.fengjiapeng.pojo.ActionResult;
import com.qfedu.fengjiapeng.pojo.Emp;
import com.qfedu.fengjiapeng.service.EmpService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author fjp
 * @version 1.0
 * @description: TODO
 * @date 2023/9/2 9:46
 */
@RestController
@CrossOrigin
public class EmpController {
    @Resource
    private EmpService empService;

    @GetMapping("findAll")
    public List<Emp> findAll() {
        return empService.findAll();
    }

    @PostMapping("addEmp")
    public ActionResult addEmp(@RequestBody Emp emp){
        boolean emps = empService.addEmp(emp);

        ActionResult actionResult = new ActionResult();
        actionResult.setStatusCode(200);
        actionResult.setMsg("success");
        return actionResult;
    }

    @PostMapping("updateEmp")
    public ActionResult updateEmp(@RequestBody Emp emp) {
        boolean b = empService.updateEmp(emp);
        System.out.println(b);
        ActionResult actionResult = new ActionResult();
        actionResult.setStatusCode(200);
        actionResult.setMsg("success");
        return actionResult;
    }


    @GetMapping("deleteEmp")
    public ActionResult deleteEmp(int eid){
        boolean b = empService.deleteEmp(eid);
        ActionResult actionResult = new ActionResult();
        actionResult.setStatusCode(200);
        actionResult.setMsg("success");
        return actionResult;
    }
}
