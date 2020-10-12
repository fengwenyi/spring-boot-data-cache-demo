package com.fengwenyi.springbootdatacachedemo.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author Erwin Feng
 * @since 2020-10-12
 */
@Data
@Accessors(chain = true)
public class UserEntity implements Serializable {

    private static final long serialVersionUID = -2363182304870178087L;

    private int id;

    private String name;

    private String gender;

    private int age;

    private LocalDate birthday;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

}
