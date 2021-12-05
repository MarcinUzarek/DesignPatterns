package command_pattern.command_example.workshop;

import command_pattern.command_example.workshop.command.Command;

import java.util.ArrayList;
import java.util.List;

public class WorkShopApp {

    private List<Command> commandQueue = new ArrayList<>();

   public void addtoQueue(Command command) {
       commandQueue.add(command);
   }

    public void run() {
       if (commandQueue.isEmpty()) {
           System.out.println("The que is empty");
       }
       for (Command command : commandQueue) {
           command.execute();
       }
//       commandQueue.clear();
    }
    public void unDoLastCommand() {
       for (Command command : commandQueue) {
           command.unDo();
       }
    }
}
