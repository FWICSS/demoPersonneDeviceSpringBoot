package fr.miage.demopersonnedevice.dao.repo;

import fr.miage.demopersonnedevice.dao.entities.Device;
import org.springframework.data.repository.CrudRepository;

public interface DeviceRepository extends CrudRepository<Device, Long> {

}
