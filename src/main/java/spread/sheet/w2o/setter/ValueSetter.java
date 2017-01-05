package spread.sheet.w2o.setter;

import spread.sheet.model.core.Cell;
import spread.sheet.model.meta.FieldMeta;

/**
 * value setter
 * <p>
 * Created by hanwen on 2016/12/30.
 */
public interface ValueSetter<T> {

  /**
   * set object field from cell value
   *
   * @param object      supplied object
   * @param cell      cell
   * @param fieldMeta field meta
   */
  void set(T object, Cell cell, FieldMeta fieldMeta);
}
