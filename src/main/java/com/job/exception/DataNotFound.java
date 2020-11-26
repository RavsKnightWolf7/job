package com.job.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Data
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class DataNotFound extends RuntimeException {
    private String exceptionDetail;
    private Object fieldValue;

    public DataNotFound(String exceptionDetail, Long fieldValue) {
        super(exceptionDetail + " - " + fieldValue);
        this.exceptionDetail = exceptionDetail;
        this.fieldValue = fieldValue;
    }
}
