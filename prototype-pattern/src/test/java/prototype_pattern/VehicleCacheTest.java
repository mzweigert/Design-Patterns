package prototype_pattern;

import com.prototype_pattern.Motorcycle;
import com.prototype_pattern.Vehicle;
import com.prototype_pattern.VehicleCache;
import org.junit.Test;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class VehicleCacheTest {

    @Test
    public void testVehicleCache_returnCloneExistingObject(){
        // GIVEN
        Vehicle motorCycle = new Motorcycle(1L, "cross");
        VehicleCache vehicleCache = new VehicleCache();
        vehicleCache.addVehicle(motorCycle);

        // WHEN
        Optional<Vehicle> vehicle = vehicleCache.getVehicle(1L);

        // THEN
        assertThat(vehicle.isPresent()).isTrue();
        assertThat(vehicle.get()).isEqualTo(motorCycle);
    }

    @Test
    public void testVehicleCache_returnEmptyOptional(){
        // GIVEN
        Vehicle motorCycle = new Motorcycle(1L, "cross");
        VehicleCache vehicleCache = new VehicleCache();
        vehicleCache.addVehicle(motorCycle);

        // WHEN
        Optional<Vehicle> vehicle = vehicleCache.getVehicle(2L);

        // THEN
        assertThat(vehicle.isPresent()).isFalse();
    }
}
