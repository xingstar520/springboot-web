package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author Jie.
 * @description: TODO
 * @date 2023/10/30
 * @version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp {
    private Integer id;//员工编号
    private String username;//用户名
    private String password;//密码
    private String name;//姓名
    private Short gender;//性别 1.男 2.女
    private String image;//头像
    private Short job;//职位 1.班主任 2.讲师 3.学工主管 4.教研主管 5.咨询师
    private LocalDate entryDate;//入职日期
    private Integer deptId;//部门编号
    private LocalDateTime createTime;//创建时间
    private LocalDateTime updateTime;//修改时间
}
