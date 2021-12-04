package adapter_pattern.my_adapter;

import adapter_pattern.my_adapter.api.LibraryAPI;
import adapter_pattern.my_adapter.api.LibraryAPIImpl;
import adapter_pattern.my_adapter.api.LibraryAPIv2;
import adapter_pattern.my_adapter.api.LibraryAPIv2Impl;

public class Main {

    public static void main(String[] args) {

//
//        LibraryAPI api = new LibraryAPIImpl();
//
//        User PawelCwik = new User("Paweł","Cwik","32131212");
//
//        BookConnector connector = new BookConnector(PawelCwik,api);
//
//        connector.checkAviability("Harry Potter i Zakon Feniksa");
//
//        connector.reserve("Karolinka", PawelCwik);

//        -------------------------------------------------------

        User user = new User("Paweł","Cwik","32131212");
        LibraryAPIv2 libraryAPIv2 = new LibraryAPIv2Impl();
        APIAdapter apiAdapter = new APIAdapter(libraryAPIv2, user);
        BookConnector connector = new BookConnector(user,apiAdapter);
        connector.checkAviability("Harry Potter i Zakon Feniksa");
        connector.reserve("Karolinka", user);
        connector.whenToReturn("Karolinka", user);



    }

}
