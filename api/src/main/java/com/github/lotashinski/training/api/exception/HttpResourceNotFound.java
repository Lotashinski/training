package com.github.lotashinski.training.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class HttpResourceNotFound extends HttpBadRequestException {

	private static final long serialVersionUID = 1282150038265739848L;
	
	
	public HttpResourceNotFound(Class<?> resource) {
		super(String.format("Resource \"%s\" not found.", resource.getName()));
	}
	
	public HttpResourceNotFound(Class<?> resource, Object identifier) {
		super(String.format("Resource \"%s\" [%s] not found.", resource.getName(), identifier));
	} 
	
}
