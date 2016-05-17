package com.leanthoughts.sky.resources.flight;

/**
 * Created by fahad on 03-05-2016.
 */
public class SearchCriteriaResource {


    private String key;
    private String operation;
    private Object value;
    private String type;

    public SearchCriteriaResource(){}
    public SearchCriteriaResource(String key,String operation,Object value){
        this.key=key;
        this.operation=operation;
        this.value=value;
    }

    public SearchCriteriaResource(String key,String operation,Object value,String type){
        this.key=key;
        this.operation=operation;
        this.value=value;
        this.type=type;
    }


    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

