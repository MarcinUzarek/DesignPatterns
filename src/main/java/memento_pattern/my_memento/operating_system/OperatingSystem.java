package memento_pattern.my_memento.operating_system;

import java.time.LocalDateTime;
import java.util.SortedMap;

public class OperatingSystem {

    private int backupNumber = 0;
    private LocalDateTime backupDate;

    public void createBackup() {
        backupNumber++;
        backupDate = LocalDateTime.now();
        System.out.println("Stworzono backup o numerze " + backupNumber + " data: " + backupDate);
    }
    public OperatingSystemMemento save() {
        return new OperatingSystemMemento(this.backupNumber, this.backupDate);
    }
    public void load(OperatingSystemMemento memento) {
        this.backupNumber = memento.getBackupNumber();
        this.backupDate = memento.getBackupDate();
    }
    public void showCurrentVer() {
        System.out.println(backupNumber);
        System.out.println(backupDate);
    }
}
