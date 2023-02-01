package Peaksoft.dao;

import Peaksoft.entity.Car;
import config.HibernateConfig;
import org.hibernate.Session;

public class CarDaoImpl implements CarDao {
    CarDao carDao = new CarDaoImpl();
    @Override
    public String saveCar(Car car) {
        Session session = HibernateConfig.getSession();
        return null;
    }

    @Override
    public String assignCarToCompany(Long id, Long companyId) {
        return null;
    }

    @Override
    public String deleteCar(Car car) {
        return null;
    }
}
