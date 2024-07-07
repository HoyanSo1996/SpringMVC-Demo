package com.omega.demo04.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class Pet
 *
 * @author KennySo
 * @date 2024/7/6
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pet {
    private Integer id;
    private String name;
}
