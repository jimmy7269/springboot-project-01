package com.bjpowernode.springboot.mapper;

import com.bjpowernode.springboot.model.Salary;
import com.bjpowernode.springboot.model.SalaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalaryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SALGRADE
     *
     * @mbggenerated Wed Jul 06 17:39:14 CST 2022
     */
    int countByExample(SalaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SALGRADE
     *
     * @mbggenerated Wed Jul 06 17:39:14 CST 2022
     */
    int deleteByExample(SalaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SALGRADE
     *
     * @mbggenerated Wed Jul 06 17:39:14 CST 2022
     */
    int insert(Salary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SALGRADE
     *
     * @mbggenerated Wed Jul 06 17:39:14 CST 2022
     */
    int insertSelective(Salary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SALGRADE
     *
     * @mbggenerated Wed Jul 06 17:39:14 CST 2022
     */
    List<Salary> selectByExample(SalaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SALGRADE
     *
     * @mbggenerated Wed Jul 06 17:39:14 CST 2022
     */
    int updateByExampleSelective(@Param("record") Salary record, @Param("example") SalaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SALGRADE
     *
     * @mbggenerated Wed Jul 06 17:39:14 CST 2022
     */
    int updateByExample(@Param("record") Salary record, @Param("example") SalaryExample example);
}