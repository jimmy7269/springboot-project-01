package com.bjpowernode.springboot.mapper;

import com.bjpowernode.springboot.model.Employee;
import com.bjpowernode.springboot.model.EmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMP
     *
     * @mbggenerated Thu Jul 07 15:11:16 CST 2022
     */
    int countByExample(EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMP
     *
     * @mbggenerated Thu Jul 07 15:11:16 CST 2022
     */
    int deleteByExample(EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMP
     *
     * @mbggenerated Thu Jul 07 15:11:16 CST 2022
     */
    int deleteByPrimaryKey(Integer empno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMP
     *
     * @mbggenerated Thu Jul 07 15:11:16 CST 2022
     */
    int insert(Employee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMP
     *
     * @mbggenerated Thu Jul 07 15:11:16 CST 2022
     */
    int insertSelective(Employee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMP
     *
     * @mbggenerated Thu Jul 07 15:11:16 CST 2022
     */
    List<Employee> selectByExample(EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMP
     *
     * @mbggenerated Thu Jul 07 15:11:16 CST 2022
     */
    Employee selectByPrimaryKey(Integer empno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMP
     *
     * @mbggenerated Thu Jul 07 15:11:16 CST 2022
     */
    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMP
     *
     * @mbggenerated Thu Jul 07 15:11:16 CST 2022
     */
    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMP
     *
     * @mbggenerated Thu Jul 07 15:11:16 CST 2022
     */
    int updateByPrimaryKeySelective(Employee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EMP
     *
     * @mbggenerated Thu Jul 07 15:11:16 CST 2022
     */
    int updateByPrimaryKey(Employee record);
}