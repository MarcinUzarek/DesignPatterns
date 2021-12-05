package memento_pattern.memento_example.smart_app;

import java.util.ArrayList;
import java.util.List;

public class SmartAppCaretaker {

    private List<SmartAppMemento> mementos = new ArrayList<>();

    public void addMemento(SmartAppMemento memento) {
        mementos.add(memento);
        System.out.println("Zapisano wersje " + memento.getVersion() + " do listy pod indexem " + (mementos.size()-1));
    }
    public SmartAppMemento getMemento(int index) {
        System.out.println("Wczytano wersje " + mementos.get(index).getVersion());
        return mementos.get(index);
    }
}
