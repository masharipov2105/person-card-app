package com.masharipov2105.systems;

import com.masharipov2105.systems.controller.PersonController;
import com.masharipov2105.systems.repository.*;
import com.masharipov2105.systems.services.*;

public class Main {
    public static void main(String[] args) {
    
        CardRepository repository = new CardRepositoryImpl();
        CardService service = new CardServiceImpl(repository);
        PersonController controller = new PersonController(service);
        controller.start();
    }
}
