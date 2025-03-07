package com.example.model;

import java.util.Objects;

public class ModelExample {

    public String name;

    public Object data;

    public ModelExample(String name, Object data) {
        this.name = name;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof ModelExample that))
            return false;

        return Objects.equals(name, that.name) && Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(data);
        return result;
    }
}
