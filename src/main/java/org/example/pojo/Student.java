package org.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author G
 * @date 2024/7/22 15:29
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private Integer id;
    private String name;
    private String gender;
    private Date birthday;
    private String addr;
    private Long qqnumber;
    /*@Override
    public String toString() {
        return "Student{" +
                " id=" + id +
                " name='" + name + '\'' +
                " gender='" + gender + '\'' +
                " birthday=" + birthday +
                " addr='" + addr + '\'' +
                " qqnumber=" + qqnumber +
                "}\r";

    }*/
}
