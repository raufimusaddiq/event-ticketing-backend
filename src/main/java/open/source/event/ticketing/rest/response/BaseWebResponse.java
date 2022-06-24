package open.source.event.ticketing.rest.response;

import lombok.Builder;
import lombok.Data;

/**
 * base response for all api response
 *
 * @author musaddiqr
 * @version BaseWebResponse.java, v 0.1 22 June 2022 12.34:00 raufi-musaddiq Exp $$
 */

@Data
@Builder
public class BaseWebResponse<T> {
  private String errorCode;
  private T data;

  public static BaseWebResponse successNoData() {
    return BaseWebResponse.builder()
        .build();
  }

  public static <T> BaseWebResponse<T> successWithData(T data) {
    return BaseWebResponse.<T>builder()
        .data(data)
        .build();
  }

  public static BaseWebResponse error(String errorCode) {
    return BaseWebResponse.builder()
        .errorCode(errorCode)
        .build();
  }
}
