package ch.heigvd.res.labs.roulette.net.protocol;

/**
 * This class defines constants for the Roulette Protocol (version 2)
 *
 * @author Olivier Liechti
 * @author Yosra Harbaoui
 */
public class RouletteV2Protocol extends RouletteV1Protocol {

  public final static String VERSION = "2.0";
  
  public final static int DEFAULT_PORT = 2613;
  
  public final static String RESPONSE_SUCCESS = "success";
  public final static String RESPONSE_FAILURE = "failure";

  public final static String CMD_CLEAR = "CLEAR";
  public final static String CMD_LIST = "LIST";

  public static String RESPONSE_CLEAR_DONE = "DATASTORE CLEARED";

  public final static String[] SUPPORTED_COMMANDS = new String[]{CMD_HELP, CMD_RANDOM, CMD_LOAD, CMD_INFO, CMD_BYE, CMD_CLEAR, CMD_LIST};

}
