package memento_pattern.memento_example.smart_app;

 class SmartAppMemento {

    private Double version;

     SmartAppMemento(Double version) {
        this.version = version;
    }

     Double getVersion() {
        return version;
    }
}
