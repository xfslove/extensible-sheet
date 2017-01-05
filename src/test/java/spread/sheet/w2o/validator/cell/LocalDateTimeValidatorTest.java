package spread.sheet.w2o.validator.cell;

import org.testng.annotations.Test;
import spread.sheet.TestFactory;
import spread.sheet.model.core.Cell;
import spread.sheet.model.meta.FieldMeta;

import java.util.Map;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * Created by hanwen on 2017/1/4.
 */
public class LocalDateTimeValidatorTest {

  @Test
  public void testCustomValidate() throws Exception {

    Map<String, FieldMeta> fieldMetaMap = TestFactory.createFieldMetaMap();
    LocalDateTimeValidator validator = new LocalDateTimeValidator("yyyy-MM-dd HH:mm:ss", "test.localDateTime", "");

    Map<String, Cell> cellMap1 = TestFactory.createCellMap1();
    assertTrue(validator.valid(cellMap1.get("test.localDateTime"), fieldMetaMap.get("test.localDateTime")));

    Map<String, Cell> cellMap2 = TestFactory.createErrorCellMap();
    assertFalse(validator.valid(cellMap2.get("test.localDateTime"), fieldMetaMap.get("test.localDateTime")));
  }

}