package com.nasro.gestionstocke.exceptions;

import lombok.Getter;

import java.util.List;

public class InvalideEntityException extends RuntimeException {
    @Getter
    private ErrorsCode errorsCode;
    @Getter
    private List<String> errors;

    public InvalideEntityException(String message) {
        super(message);
    }

    public InvalideEntityException(String message, Throwable cause) {
        super(message, cause);

    }

    public InvalideEntityException(String message, Throwable cause, ErrorsCode errorsCode) {
        super(message, cause);
        this.errorsCode = errorsCode;
    }

    public InvalideEntityException(String message, ErrorsCode errorsCode) {
        super(message);
        this.errorsCode = errorsCode;
    }

    public InvalideEntityException(String message, ErrorsCode errorsCode, List<String> errors) {
        super(message);
        this.errorsCode = errorsCode;
        this.errors = errors;
    }

}
