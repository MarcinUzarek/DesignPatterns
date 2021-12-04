package chain_of_responsibility_pattern.message;

import chain_of_responsibility_pattern.officer.OfficerRank;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Message {

    private String content;
    private int code;
    private OfficerRank officerRank;


}
