package adapter_pattern.adapter.adapters;

import adapter_pattern.adapter.device.ContinentalDevice;
import adapter_pattern.adapter.device.UkDevice;

public class UkToContinentalAdapter implements ContinentalDevice {

    private UkDevice device;

    public UkToContinentalAdapter(UkDevice device) {
        this.device = device;
    }

    @Override
    public void continentalPowerOn() {
        device.ukPowerOn();
    }
}
