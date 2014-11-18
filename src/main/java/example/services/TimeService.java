package example.services;


import java.util.Date;

/**
 * Simple time service interface.
 * 
 * @author neven
 *
 */
public interface TimeService {
    Date getCurrentDate();
    String getCurrentTimestamp();
}
