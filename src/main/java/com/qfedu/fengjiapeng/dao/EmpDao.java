package com.qfedu.fengjiapeng.dao;

import com.qfedu.fengjiapeng.pojo.Emp;

import java.util.List;

/**
 * @author fjp
 * @version 1.0
 * @description: TODO
 * @date 2023/9/2 9:39
 */
public interface EmpDao {

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
    int addEmp(Emp emp);

    /**
     * 更新
     * @param emp
     * @return
     */
    int updateEmp(Emp emp);

    /**
     * 删除
     * @param eid
     * @return
     */
    int deleteEmp(int eid);



}
