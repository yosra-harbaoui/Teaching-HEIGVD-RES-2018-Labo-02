package ch.heigvd.res.labs.roulette.net.protocol;
/**
 * This class is used to serialize/deserialize the response sent by the server
 * when processing the "BYE" command defined in the protocol specification.
 * 
 * @author Yosra Harbaoui
 */

public class ByeCommandResponse {
     private String status;
    private int numberOfCommands;

    public ByeCommandResponse() {}

    public ByeCommandResponse(String status, int numberOfCommands) {
        this.status = status;
        this.numberOfCommands = numberOfCommands;
    }

    public String getStatus() {
        return status;
    }

    public int getNumberOfCommands() {
        return numberOfCommands;
    }

    public void setNumberOfCommands(int numberOfCommands) {
        this.numberOfCommands = numberOfCommands;
    }
}