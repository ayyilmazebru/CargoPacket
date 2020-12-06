package com.example.CargoPacket.Interfaces;

public interface CargoOperations {
    /**
     *
     * @param sevenKg 7 kg of soap pieces
     * @param twoKg 2 kg of soap pieces
     * @param cargoWeight total cargo weight
     * @return If we can create the cargo, the positive result will return else return -1
     */
    int prepareCargoPacket(int sevenKg, int twoKg, int cargoWeight);

}
