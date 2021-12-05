package memento_pattern.my_memento.operating_system;

import java.time.LocalDateTime;

class OperatingSystemMemento {

    private int backupNumber;
    private LocalDateTime backupDate;

    public OperatingSystemMemento(int backupNumber, LocalDateTime backupDate) {
        this.backupNumber = backupNumber;
        this.backupDate = backupDate;
    }

    public int getBackupNumber() {
         return backupNumber;
     }

    public LocalDateTime getBackupDate() {
        return backupDate;
    }
}
