package adapter_pattern.adapter.adapters;

import adapter_pattern.adapter.device.ContinentalDevice;
import adapter_pattern.adapter.device.UkDevice;

public class TwoWayAdapter implements UkDevice, ContinentalDevice {

    private UkDevice ukDevice;
    private ContinentalDevice conDevice;

    public TwoWayAdapter(UkDevice ukDevice, ContinentalDevice conDevice) {
        this.ukDevice = ukDevice;
        this.conDevice = conDevice;
    }

    @Override
    public void continentalPowerOn() {
        ukDevice.ukPowerOn();
    }

    @Override
    public void ukPowerOn() {
        conDevice.continentalPowerOn();
    }
}
