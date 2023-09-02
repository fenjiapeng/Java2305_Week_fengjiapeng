package com.qfedu.fengjiapeng.service.impl;

import com.qfedu.fengjiapeng.dao.EmpDao;
import com.qfedu.fengjiapeng.pojo.Emp;
import com.qfedu.fengjiapeng.service.EmpService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author fjp
 * @version 1.0
 * @description: TODO
 * @date 2023/9/2 9:49
 */
@Service
public class EmpServiceImpl implements EmpService {
    @Resource
    private EmpDao empdao;

    @Override
    public List<Emp> findAll() {
        List<Emp> emps = empdao.findAll();
        return emps;
    }

    @Override
    public boolean addEmp(Emp emp) {
        int i= empdao.addEmp(emp);
        return i>0;
    }

    @Override
    public boolean updateEmp(Emp emp) {
        int i = empdao.updateEmp(emp);
        return i>0;
    }

    @Override
    public boolean deleteEmp(int eid) {
        int i = empdao.deleteEmp(eid);
        return i>0;
    }
}
