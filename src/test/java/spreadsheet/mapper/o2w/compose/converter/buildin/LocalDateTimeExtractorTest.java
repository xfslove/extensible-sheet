package spreadsheet.mapper.o2w.compose.converter.buildin;

import org.testng.annotations.Test;
import spreadsheet.mapper.TestBean;
import spreadsheet.mapper.TestFactory;
import spreadsheet.mapper.model.core.Cell;
import spreadsheet.mapper.model.meta.FieldMeta;

import java.util.Map;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

/**
 * Created by hanwen on 2017/1/4.
 */
public class LocalDateTimeExtractorTest {

  @Test
  public void testGetStringValue() throws Exception {

    Map<String, FieldMeta> fieldMetaMap = TestFactory.createFieldMetaMap();
    FieldMeta fieldMeta1 = fieldMetaMap.get("localDateTime");

    LocalDateTimeConverter<TestBean> extractor1 = new LocalDateTimeConverter<TestBean>().matchField("localDateTime").pattern("yyyy-MM-dd HH:mm:ss");
    LocalDateTimeConverter<TestBean> extractor2 = new LocalDateTimeConverter<TestBean>().matchField("localDateTime").pattern("yyyy-MM-dd");
    LocalDateTimeConverter<TestBean> extractor3 = new LocalDateTimeConverter<TestBean>().matchField("localDateTime").pattern("yyyy");

    TestBean testBean1 = TestFactory.createBean1();

    Map<String, Cell> cellMap1 = TestFactory.createCellMap1();
    Cell cell11 = cellMap1.get("localDateTime");

    String s11 = extractor1.getValue(testBean1, cell11, fieldMeta1);
    assertEquals(s11, "1984-11-22 00:00:00");

    String s12 = extractor2.getValue(testBean1, cell11, fieldMeta1);
    assertEquals(s12, "1984-11-22");

    TestBean testBean2 = TestFactory.createBean2();
    Map<String, Cell> cellMap2 = TestFactory.createCellMap2();
    Cell cell21 = cellMap2.get("localDateTime");
    String s21 = extractor3.getValue(testBean2, cell21, fieldMeta1);
    assertNull(s21);
  }

}