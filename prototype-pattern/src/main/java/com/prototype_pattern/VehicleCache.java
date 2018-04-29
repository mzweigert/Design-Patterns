package com.prototype_pattern;

import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public final class VehicleCache {

    private ConcurrentHashMap<Long, Vehicle> vehiclesMap;

    public VehicleCache(){
        vehiclesMap = new ConcurrentHashMap<>();
        // loadData();
    }

//    private void loadData() {
//        Vehicle motorcycleCross = new Motorcycle(1L, "cross");
//        Vehicle carCheap = new Car(2L, 20000);
//        Vehicle motorcycleCruiser = new Motorcycle(3L, "cruiser");
//        Vehicle carExpensive = new Car(4L, 100000);
//        vehiclesMap.put(motorcycleCross.getId(), motorcycleCross);
//        vehiclesMap.put(motorcycleCruiser.getId(), motorcycleCruiser);
//        vehiclesMap.put(carCheap.getId(), carCheap);
//        vehiclesMap.put(carExpensive.getId(), carExpensive);
//
//    }

    public Optional<Vehicle> getVehicle(Long id){
        Vehicle cached = vehiclesMap.get(id);
        if(cached == null){
            return Optional.empty();
        }
        return Optional.of(cached.clone());
    }

    public Optional<Vehicle> addVehicle(Vehicle vehicle) {
        return Optional.ofNullable(vehiclesMap.put(vehicle.getId(), vehicle));
    }

    public int getCacheSize(){
        return vehiclesMap.size();
    }
}
