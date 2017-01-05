package spread.sheet.w2f;

import spread.sheet.model.core.Workbook;

import java.io.OutputStream;

/**
 * Created by hanwen on 2016/12/30.
 */
public interface WorkbookWriter {

  /**
   * write workbook to supplied output stream
   *
   * @param workbook     write workbook
   * @param outputStream notice close the stream
   */
  void write(Workbook workbook, OutputStream outputStream);
}
