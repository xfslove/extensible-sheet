package spreadsheet.mapper.w2o.process.listener;

import spreadsheet.mapper.model.core.Sheet;
import spreadsheet.mapper.model.meta.SheetMeta;

import java.util.List;

/**
 * listener of sheet to objects processor
 * <p>
 * Created by hanwen on 15-12-16.
 */
public interface SheetProcessListener<T> {

  /**
   * before model created
   *
   * @param sheet     {@link Sheet}
   * @param sheetMeta {@link SheetMeta}
   */
  void before(Sheet sheet, SheetMeta sheetMeta);

  /**
   * after all object value set
   *
   * @param objects   value set object list
   * @param sheet     {@link Sheet}
   * @param sheetMeta {@link SheetMeta}
   */
  void after(List<T> objects, Sheet sheet, SheetMeta sheetMeta);
}
