package spreadsheet.mapper.w2o.process.listener;

import spreadsheet.mapper.model.core.Sheet;
import spreadsheet.mapper.model.meta.SheetMeta;

import java.util.List;

/**
 * do nothing listener
 * <p>
 * Created by hanwen on 2016/12/28.
 */
public final class NoopSheetProcessListener<T> implements SheetProcessListener<T> {

  @Override
  public void before(Sheet sheet, SheetMeta sheetMeta) {
    // nothing
  }

  @Override
  public void after(List<T> objects, Sheet sheet, SheetMeta sheetMeta) {
    // nothing
  }
}
