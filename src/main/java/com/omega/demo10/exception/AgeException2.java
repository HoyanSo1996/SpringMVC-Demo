package com.omega.demo10.exception;

/**
 * Class AgeException2
 *
 * @author KennySo
 * @date 2024/7/22
 */
public class AgeException2 extends RuntimeException {

    private Integer code;

    public AgeException2(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
