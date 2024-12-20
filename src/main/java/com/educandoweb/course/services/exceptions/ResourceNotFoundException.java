package com.educandoweb.course.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    @SuppressWarnings("unused")
    private static final Long serialVersionUID = 1L;

    public ResourceNotFoundException(Object id) {
        super("Resource not found. Id " + id);
    }

}