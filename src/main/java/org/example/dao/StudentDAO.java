package org.example.dao;



import org.example.pojo.Student;

import java.util.List;

/**
 * @author G
 * @date 2024/7/22 15:33
 */
public interface StudentDAO {
    /** 插入一个学生信息
     * @param student 要插入的学生信息 其中主键无需提供
     */
    void insert(Student student);

    /**根据主键删除一个学生信息
     * @param id 要删除的学生信息的id
     */
    void delete(Integer id);


    /** 根据学生的ID修改学生的所有信息
     * @param student  要修改的学生的ID和要被修改的字段值
     */
    void update(Student student);


    /**统计表记录总数
     * @return 表记录总数
     */
    Integer count();// select count(*) from student


    /** 根据ID查找对应的学生信息
     * @param id 找到的要获取的学生的ID
     * @return ID所对应的学生记录 如果不存在 则返回null
     */
    Student findById(Integer id);


    /**查询所有学生信息
     * @return 所有学生对应的集合
     */
    List<Student> findAll();


    /** 根据名字模糊查询学生
     * @param name 模糊查询关键字
     * @return  模糊查询学生结束
     */
    List<Student> findByNameLike(String name);

    /** 根据学生名称进行模糊分页查询
     * @param name 模糊查询关键字
     * @param start limit 起始参数
     * @param limit 要截取的行数
     * @return  分页模糊查询的学生数据结果  找不到 返回null
     */
    List<Student> findByNameLikeWithLimit(String name,int start,int limit);

    /** 分页学生查询
     * @param start  limit起始参数
     * @param limit  要截取的行数
     * @return   分页查询的学生数据 没有数据 返回null
     */
    List<Student> findWithLimit(int start,int limit);

}
