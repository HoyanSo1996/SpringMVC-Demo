package com.omega.demo04.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class Master
 *
 * @author KennySo
 * @date 2024/7/6
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Master {
    private Integer id;
    private String name;
    private Pet pet;
}
