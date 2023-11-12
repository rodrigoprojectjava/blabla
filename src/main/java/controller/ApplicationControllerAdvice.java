package controller;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import model.ApiErrors;

public class ApplicationControllerAdvice {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	public ApiErrors handleValidantionErrors(MethodArgumentNotValidException ex)
	{
		BindingResult bindingResult = ex.getBindingResult();
		List<String> messages = bindingResult.getAllErrors().stream()
				.map(ObjectError -> ObjectError.getDefaultMessage())
				.collect(Collectors.toList());
		return new ApiErrors(messages);
		
					
	}

}
