package flyweight_pattern.my_flyweight.repositories;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Position {

   private int numberPosition;
   private char letterPosition;
   private String name;

   @Override
   public String toString() {
      return "Position{" +
              "numberPosition=" + numberPosition +
              ", letterPosition=" + letterPosition +
              ", name='" + name + '\'' +
              '}';
   }
}

