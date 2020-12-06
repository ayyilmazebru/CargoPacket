package com.example.CargoPacket.Operations;

import com.example.CargoPacket.Application.CargoPacketApplication;
import com.example.CargoPacket.Interfaces.CargoOperations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class PrepareCargo implements CargoOperations {

    public static final Logger LOG = LoggerFactory.getLogger(CargoPacketApplication.class);

    @Override
    public int prepareCargoPacket(int sevenKg, int twoKg, int cargoWeight) {
        LOG.info("date");
        int count=sevenKg;
        int tempSeven = 0;

        while(cargoWeight>=7)
        {
            cargoWeight-=7;
            tempSeven++;
            if((--count)==0) break;
        }

        if(cargoWeight%2==0 && cargoWeight/2<=twoKg)
        {
            LOG.info("Kullanılan 7 kg lık sabun sayısı: {} | Kullanılan 2 kg lık sabun sayısı: {}" ,tempSeven, cargoWeight/2);
            return cargoWeight/2;
        }

        else
        {
            LOG.info("7 ve 2 kg lık sabunlar ile bu kg a ulaşamayız.");
            return -1;
        }

    }
}
