package config;

import Peaksoft.entity.Car;
import Peaksoft.entity.Company;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Environment;

import java.lang.module.Configuration;
import java.util.Properties;

public class HibernateConfig {
        public static <EntityManagerFactory> EntityManagerFactory getEntity(){
            Properties properties = new Properties();
            properties.setProperty(Environment.DRIVER,"org.postgresql.Driver");
            properties.setProperty(Environment.URL,"jdbc:postgresql://localhost:5432/postgres");
            properties.setProperty(Environment.USER,"postgres");
            properties.setProperty(Environment.PASS,"postgres");

            properties.setProperty(Environment.HBM2DDL_AUTO,"update");
            properties.setProperty(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
            properties.setProperty(Environment.SHOW_SQL,"true");
            properties.setProperty(Environment.FORMAT_SQL,"true");

            Configuration configuration = new Configuration();
            configuration.setProperties(properties);
            configuration.addAnnotatedClass(Company.class);
            configuration.addAnnotatedClass(Car.class);

            EntityManagerFactory entityManagerFactory = configuration.buildSessionFactory().unwrap(EntityManagerFactory.class);
            return entityManagerFactory;
        }
    }