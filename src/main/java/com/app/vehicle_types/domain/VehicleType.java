package com.app.vehicle_types.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Table(name = "vehicle_types")
@Data
public class VehicleType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Vehicle type is required")
    @Column(nullable = false)
    private String vehicleType;

    // Empty constructor (required for JPA)
    public VehicleType() {}

    // Constructor with parameters
    public VehicleType(Long id, String vehicleType) {
        this.id = id;
        this.vehicleType = vehicleType;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
}