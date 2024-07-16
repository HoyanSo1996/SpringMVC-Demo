package com.omega.demo06.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

/**
 * Class Monster
 *
 * @author KennySo
 * @date 2024/7/16
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Monster {

    private Integer id;

    @NotEmpty
    private String name;

    @Range(min = 1, max = 100)
    private Integer age;

    @Email
    private String email;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

    @NumberFormat(pattern = "###,###.##")
    private Double salary;
}
