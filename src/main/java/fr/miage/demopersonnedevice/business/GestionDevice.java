package fr.miage.demopersonnedevice.business;

import fr.miage.demopersonnedevice.dao.entities.Device;
import fr.miage.demopersonnedevice.dao.repo.DeviceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class GestionDevice {

    private DeviceRepository deviceRepository;
     public Device ajouterDevice(Device d){
         this.deviceRepository.save(d);
         return d;
     }

     public Device getDevice(Long id) throws GestionInconnueException{
         return this.deviceRepository.findById(id).orElseThrow(GestionInconnueException::new);
     }
}
