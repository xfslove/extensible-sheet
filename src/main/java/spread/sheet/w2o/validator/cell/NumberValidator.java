package spread.sheet.w2o.validator.cell;

import spread.sheet.model.core.Cell;
import spread.sheet.model.meta.FieldMeta;
import org.apache.commons.lang3.math.NumberUtils;

/**
 * number validator
 * <p>
 * Created by hanwen on 16/7/7.
 */
public class NumberValidator extends CellValidatorAdapter {

  public NumberValidator(String matchField, String message) {
    super(matchField, message);
  }

  public NumberValidator(String matchField, String errorMessage, String[] dependsOn) {
    super(matchField, errorMessage, dependsOn);
  }

  public NumberValidator(String group, String matchField, String errorMessage, String messageOnField, String[] dependsOn) {
    super(group, matchField, errorMessage, messageOnField, dependsOn);
  }

  @Override
  protected boolean customValidate(Cell cell, FieldMeta fieldMeta) {
    return NumberUtils.isNumber(cell.getValue());
  }
}
