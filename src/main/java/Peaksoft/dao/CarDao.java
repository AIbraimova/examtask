package Peaksoft.dao;

import Peaksoft.entity.Car;

public interface CarDao {
    String saveCar(Car car);
    String assignCarToCompany(Long id, Long companyId);
    String deleteCar(Car car);
}

