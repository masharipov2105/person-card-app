package com.masharipov2105.systems;

import com.masharipov2105.systems.ui.ConsoleUI;
import com.masharipov2105.systems.storage.CardStorage;

public class Main {
    public static void main(String[] args) {
        
        CardStorage storage = new CardStorage();
        ConsoleUI ui = new ConsoleUI(storage);
        ui.start();
    }
}
