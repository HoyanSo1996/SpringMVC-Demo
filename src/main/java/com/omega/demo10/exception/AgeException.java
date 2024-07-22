package com.omega.demo10.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Class AgeException
 *
 * @author KennySo
 * @date 2024/7/22
 */
@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "年龄范围为 0 ~ 120 之间.")
public class AgeException extends RuntimeException{
}
