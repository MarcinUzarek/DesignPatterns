package memento_pattern.my_memento;

import memento_pattern.my_memento.operating_system.OperatingSystem;
import memento_pattern.my_memento.operating_system.OperatingSystemCaretaker;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        OperatingSystemCaretaker operatingSystemCaretaker = new OperatingSystemCaretaker();
        OperatingSystem operatingSystem = new OperatingSystem();
        operatingSystem.createBackup();
        Thread.sleep(300);
        operatingSystem.createBackup();
        Thread.sleep(300);
        operatingSystemCaretaker.addMemento(operatingSystem.save());
        operatingSystem.createBackup();
        Thread.sleep(300);
        operatingSystem.createBackup();
        Thread.sleep(300);
        operatingSystem.load(operatingSystemCaretaker.getMemento(0));
        operatingSystem.showCurrentVer();

    }
}

