package ru.gb.catalog.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import ru.gb.catalog.dto.ErrorResponse;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@ControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler({RuntimeException.class})
    public ResponseEntity<ErrorResponse> handleRunTimeException(RuntimeException e) {
        return error(INTERNAL_SERVER_ERROR, e);
    }

    @ExceptionHandler({ProductNotFound.class})
    public ResponseEntity<ErrorResponse> handleNotFoundException(ProductNotFound e) {
        return error(NOT_FOUND, e);
    }

    private ResponseEntity<ErrorResponse> error(HttpStatus status, Exception e) {
        ErrorResponse res = new ErrorResponse();
        res.setErrorCode(status.toString());
        res.setMessage(e.getMessage());
        return ResponseEntity.status(status).body(res);
    }
}
