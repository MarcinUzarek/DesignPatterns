package adapter_pattern.adapter;

import adapter_pattern.adapter.adapters.TwoWayAdapter;
import adapter_pattern.adapter.adapters.UkToContinentalAdapter;
import adapter_pattern.adapter.device.ContinentalDevice;
import adapter_pattern.adapter.device.UkDevice;
import adapter_pattern.adapter.socket.ContinentalSocket;
import adapter_pattern.adapter.socket.UKSocket;

public class Main {

    public static void main(String[] args) {

        ContinentalDevice radio = new ContinentalDevice() {
            @Override
            public void continentalPowerOn() {
                System.out.println("Gra Muzyka");
            }
        };

        ContinentalSocket continentalSocket = new ContinentalSocket();
        continentalSocket.plugIn(radio);


        UkDevice englishRadio = new UkDevice() {
            @Override
            public void ukPowerOn() {
                System.out.println("Music plays");
            }
        };

        UKSocket ukSocket = new UKSocket();
        ukSocket.plugIn(englishRadio);

        UkToContinentalAdapter adapter = new UkToContinentalAdapter(englishRadio);
        continentalSocket.plugIn(adapter);


        //-----------------------------------------------------
        //  two ways adapter:

        ContinentalDevice tv = new ContinentalDevice() {
            @Override
            public void continentalPowerOn() {
                System.out.println("Continental tv works");
            }
        };

        UkDevice fridge = new UkDevice() {
            @Override
            public void ukPowerOn() {
                System.out.println("Uk Fridge works");
            }
        };

        TwoWayAdapter twoWayAdapter = new TwoWayAdapter(fridge, tv);

        continentalSocket.plugIn(twoWayAdapter);
        ukSocket.plugIn(twoWayAdapter);
    }
}
