package adapter_pattern.adapter.socket;

import adapter_pattern.adapter.device.UkDevice;

public class UKSocket {

    public void plugIn(UkDevice device) {
        device.ukPowerOn();
    }

}
