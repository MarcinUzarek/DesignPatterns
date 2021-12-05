package memento_pattern.my_memento.operating_system;

import java.util.ArrayList;
import java.util.List;

public class OperatingSystemCaretaker {

    private List<OperatingSystemMemento> backups = new ArrayList<>();

    public void addMemento(OperatingSystemMemento memento) {
        backups.add(memento);
        System.out.println("Zapisano backup o numerze " + memento.getBackupNumber());
    }

    public OperatingSystemMemento getMemento(int index) {
        System.out.println("Przywracam wersje " + backups.get(index).getBackupNumber()+ " z datą " + backups.get(index).getBackupDate());
        return backups.get(index);
    }
}
