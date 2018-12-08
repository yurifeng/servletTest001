package com.seaven.tcas.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yurifeng
 * @create 2018-12-06 9:56
 * @PACKAGE_NAME com.seaven.tcas.entity
 * @PROJECT_NAME servletTest001
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {

    private int id;
    private String username;
    private String password;
    private String email;
    private String gender;
    private int flag;
    private int role;
    private String code;
}