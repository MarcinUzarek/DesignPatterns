package builder_pattern.builder_lombok;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
public class House {

    private String walls;
    private String floors;
    private String rooms;
    private String roof;
    private String windows;
    private String doors;
    private String garage;
}
