package spreadsheet.mapper.w2o.validation.rule.buildin;

import spreadsheet.mapper.w2o.validation.rule.DependencyRuleParam;
import spreadsheet.mapper.w2o.validation.rule.SingleCellValidatorFactory;
import spreadsheet.mapper.w2o.validation.validator.cell.buildin.NumberValidator;

/**
 * Created by hanwen on 2017/1/22.
 */
public class NumberValidatorFactory implements SingleCellValidatorFactory<NumberValidator> {

  @Override
  public NumberValidator create(DependencyRuleParam param, String matchField) {
    return new NumberValidator()
        .matchField(matchField)
        .errorMessage(param.getErrorMessage())
        .group(param.getGroup())
        .dependsOn(param.getDependsOn().toArray(new String[0]));
  }
}
