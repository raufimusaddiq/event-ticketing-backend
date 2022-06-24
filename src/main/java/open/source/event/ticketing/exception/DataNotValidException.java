package open.source.event.ticketing.exception;

/**
 * request data not valid exception
 *
 * @author musaddiqr
 * @version DataNotValidException.java, v 0.1 22 June 2022 13.45:40 raufi-musaddiq Exp $$
 */

public class DataNotValidException extends RuntimeException {
  public DataNotValidException(String message){
    super(message);
  }
}
