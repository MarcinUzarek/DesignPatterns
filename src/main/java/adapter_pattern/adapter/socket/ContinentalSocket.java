package adapter_pattern.adapter.socket;

import adapter_pattern.adapter.device.ContinentalDevice;

public class ContinentalSocket {

    public void plugIn(ContinentalDevice device) {
        device.continentalPowerOn();
    }
}
