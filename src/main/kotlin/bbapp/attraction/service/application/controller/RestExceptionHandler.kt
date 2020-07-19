package bbapp.attraction.service.application.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.validation.BindException
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import javax.validation.ConstraintViolationException

@ControllerAdvice
class RestExceptionHandler {

    @ExceptionHandler(ConstraintViolationException::class)
    fun validationErrorHandling(ex: ConstraintViolationException): ResponseEntity<Any> {
        val errors = ex.constraintViolations.map { "${it.propertyPath} : ${it.message}" }
        return ResponseEntity(errors, HttpStatus.BAD_REQUEST)
    }

    @ExceptionHandler(BindException::class)
    fun validationErrorHandling(ex: BindException): ResponseEntity<Any> {
        return ResponseEntity(ex.allErrors, HttpStatus.BAD_REQUEST)
    }

    @ExceptionHandler(MethodArgumentNotValidException::class)
    fun validationErrorHandling(ex: MethodArgumentNotValidException): ResponseEntity<Any> {
        val errors = "${ex.parameter} : ${ex.message}"
        return ResponseEntity(errors, HttpStatus.BAD_REQUEST)
    }
}