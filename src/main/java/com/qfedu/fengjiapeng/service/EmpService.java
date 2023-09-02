package com.qfedu.fengjiapeng.service;

import com.qfedu.fengjiapeng.pojo.Emp;

import java.util.List;

/**
 * @author fjp
 * @version 1.0
 * @description: TODO
 * @date 2023/9/2 9:47
 */
public interface EmpService {
    /**
     * 查找全部
     * @return
     */
    List<Emp> findAll();
    /**
     * 增加
     * @param emp
     * @return
     */
    boolean addEmp(Emp emp);
    /**
     * 更新
     * @param emp
     * @return
     */
    boolean updateEmp(Emp emp);

    /**
     * 删除
     * @param eid
     * @return
     */
    boolean deleteEmp(int eid);
}
