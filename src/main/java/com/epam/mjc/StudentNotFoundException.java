package com.epam.mjc;

public class StudentNotFoundException extends IllegalArgumentException{
    private final long missingId;

    public StudentNotFoundException(long id) {
        this.missingId= id;
    }

    @Override
    public String getMessage() {
        return "Could not find student with ID " + missingId;
    }
}
