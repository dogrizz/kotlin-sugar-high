package com.deloitte.nullability;

import org.jetbrains.annotations.NotNull;

public class Pojo2 {
    private String field;

    @NotNull
    public String getField() {
        return field;
    }
    
    public void setField(String field) {
        this.field = field;
    }
}
