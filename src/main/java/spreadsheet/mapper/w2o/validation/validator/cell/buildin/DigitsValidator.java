package spreadsheet.mapper.w2o.validation.validator.cell.buildin;

import org.apache.commons.lang3.math.NumberUtils;
import spreadsheet.mapper.model.core.Cell;
import spreadsheet.mapper.model.meta.FieldMeta;
import spreadsheet.mapper.w2o.validation.validator.cell.CustomSingleCellValidatorAdapter;

/**
 * digits validator
 * <p>
 * Created by hanwen on 2017/1/12.
 */
public class DigitsValidator extends CustomSingleCellValidatorAdapter<DigitsValidator> {

  @Override
  protected DigitsValidator getThis() {
    return this;
  }

  @Override
  protected boolean customValid(Cell cell, FieldMeta fieldMeta) {
    return NumberUtils.isDigits(cell.getValue());
  }
}
