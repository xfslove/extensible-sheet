package spread.sheet.w2o.processor.listener;

import spread.sheet.model.core.Sheet;
import spread.sheet.model.meta.SheetMeta;

import java.util.List;

/**
 * do nothing listener
 * <p>
 * Created by hanwen on 2016/12/28.
 */
public final class NoopSheetProcessorListener<T> implements SheetProcessorListener<T> {

  @Override
  public void before(Sheet sheet, SheetMeta sheetMeta) {
    // nothing
  }

  @Override
  public void after(Sheet sheet, SheetMeta sheetMeta, List<T> objects) {
    // nothing
  }
}
