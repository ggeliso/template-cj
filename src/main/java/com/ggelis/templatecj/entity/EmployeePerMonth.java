package com.ggelis.templatecj.entity;

import jakarta.persistence.Entity;
import lombok.Data;

import java.io.Serial;
import java.util.Objects;

@Data
@Entity
public class EmployeePerMonth extends Employee {

    @Serial
    private static final long serialVersionUID = 3555923626158265164L;
    private Float amount;

    public EmployeePerMonth(Integer id, String name, Float amount, boolean active) {
        super(id, name, active);
        this.amount = amount;
    }

    public EmployeePerMonth() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EmployeePerMonth that = (EmployeePerMonth) o;
        return Objects.equals(amount, that.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), amount);
    }
}
