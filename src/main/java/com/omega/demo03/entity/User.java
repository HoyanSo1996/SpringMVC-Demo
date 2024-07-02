package com.omega.demo03.entity;

import lombok.Data;

/**
 * Class User
 *
 * @author KennySo
 * @date 2024/7/3
 */
@Data
public class User {
    private String name;
    private int age;
    private Address address;
}
