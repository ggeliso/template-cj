package com.ggelis.templatecj.entity;

import jakarta.persistence.Entity;
import lombok.Data;

import java.io.Serial;
import java.util.Objects;

@Entity
@Data
public class EmployeePerHour extends Employee {
    @Serial
    private static final long serialVersionUID = 3887525516780101767L;

    private Float hourWorked;
    private Float valuePerHour;

    public EmployeePerHour(Integer id, String name, Float hourWorked, boolean active, Float valuePerHour) {
        super(id, name, active);
        this.hourWorked = hourWorked;
        this.valuePerHour = valuePerHour;
    }

    public EmployeePerHour() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EmployeePerHour that = (EmployeePerHour) o;
        return Objects.equals(hourWorked, that.hourWorked) && Objects.equals(valuePerHour, that.valuePerHour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hourWorked, valuePerHour);
    }
}
