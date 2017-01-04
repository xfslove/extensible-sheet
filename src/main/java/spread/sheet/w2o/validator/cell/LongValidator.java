package spread.sheet.w2o.validator.cell;

import spread.sheet.model.core.Cell;
import spread.sheet.model.meta.FieldMeta;

/**
 * long validator
 * <p>
 * Created by hanwen on 5/3/16.
 */
public class LongValidator extends CellValidatorAdapter {

  public LongValidator(String matchField, String errorMessage) {
    super(matchField, errorMessage);
  }

  public LongValidator(String matchField, String errorMessage, String[] dependsOn) {
    super(matchField, errorMessage, dependsOn);
  }

  public LongValidator(String group, String matchField, String errorMessage, String messageOnField, String[] dependsOn) {
    super(group, matchField, errorMessage, messageOnField, dependsOn);
  }

  @Override
  protected boolean customValidate(Cell cell, FieldMeta fieldMeta) {
    try {
      Long.parseLong(cell.getValue());
    } catch (NumberFormatException e) {
      return false;
    }
    return true;
  }
}