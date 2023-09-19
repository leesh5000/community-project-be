package com.leesh.devlab.global.exception;

import lombok.Getter;

/**
 * 비즈니스 로직 중 발생하는 런타임 예외들에 대해서 알맞은 에러 메세지를 응답으로 보내주기 위한 클래스
 */
@Getter
public class BusinessException extends RuntimeException {

    private final ErrorCode errorCode;

    public BusinessException(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

}
