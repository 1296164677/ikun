package org.example.test;


import org.example.dao.StudentDAO;
import org.example.dao.impl.StudentDAOImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * @author Raxcl
 * @date 2024/7/23 上午11:02
 * @TEST  将指定方法标记为测试方法
 * @After 在所有测试方法运行之后执行的代码 一般用于资源回收宝
 * @Before  在有测试方法运行之前执行的代码  一般用于环境的初始化
 *
 *
 */
public class TestStudentDAO {
    public static void print(String message){
        for(int i = 0; i < message.length(); i++){
            System.out.print(message.charAt(i));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println();

    }
    private StudentDAO studentDAO;
    @Before
    public void init(){
        studentDAO = new StudentDAOImpl();

    }
    @Test
    public void testFindById(){
        Assert.assertNotNull(studentDAO.findById(2));
        System.out.println(studentDAO.findById(2));


    }
    @Test
    public void testCount(){
        Assert.assertEquals(14L,(long)studentDAO.count());
        System.out.println(studentDAO.count());
    }
    @Test
    public void testFindAll(){
        Assert.assertNotNull(studentDAO.findAll());
        System.out.println(studentDAO.findAll());
    }


    @Test
    public void testFindByNameLike(){

        Assert.assertNotNull(studentDAO.findByNameLike("刘"));
        System.out.println(studentDAO.findByNameLike("刘"));


    }

    @Test
    public void testFindByNameLikeWithLimit(){

        Assert.assertNotNull(studentDAO.findByNameLikeWithLimit("刘", 0, 2));
        System.out.println(studentDAO.findByNameLikeWithLimit("刘", 0, 2));
    }

    @Test
    public void testFindWithLimit(){
        Assert.assertNotNull(studentDAO.findWithLimit(0, 5));
        System.out.println(studentDAO.findWithLimit(0, 5));

    }
    /*@Test
    public void testInsert(){
        Student student = new Student();
        student.setName("张三");
        student.setGender("二");
        student.setBirthday(new Date());
        student.setAddr("翻斗花园");
        student.setQqnumber(123456789L);

        studentDAO.insert(student);

        Student insertedStudent = studentDAO.findById(student.getId());
        Assert.assertNotNull(insertedStudent);
        Assert.assertEquals("张三", insertedStudent.getName());
        System.out.println(insertedStudent);
    }

    @Test
    public void testDelete(){
        studentDAO.delete(3);
        Assert.assertNull(studentDAO.findById(3));
    }

    @Test
    public void testUpdate(){
        Student student = studentDAO.findById(4);
        student.setAddr("桥洞");

        studentDAO.update(student);

        Student updatedStudent = studentDAO.findById(4);
        Assert.assertEquals("桥洞", updatedStudent.getAddr());
        System.out.println(updatedStudent);
    }*/


}
