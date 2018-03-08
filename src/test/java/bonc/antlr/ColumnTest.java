package bonc.antlr;

import java.util.HashSet;
import java.util.Set;

import bonc.antlr4.entity.Column;

public class ColumnTest {
	public static void main(String[] args) {
		//Column由columnName和tableOrAlias共同作为唯一性的标准
		Set<Column> colSet =new HashSet<Column>();
		colSet.add(new Column("1","1"));
		Column col = new Column("1","2");
		colSet.add(col);
		for(Column col1 : colSet) {
			col1.setTableOrAlias("1");
		}
		System.out.println(colSet.size());
		System.out.println("********");
		colSet.add(new Column("1","1"));
		for(Column col1 : colSet) {
			System.out.println(col1.getTableOrAlias());
		}
		System.out.println(colSet.size());//现在这个set有两个相同的column
		Set<Column> colSet1=new HashSet<Column>();
		colSet1.addAll(colSet);
		System.out.println(colSet1.size());//再add一个新set就正常了，看来只有add或addall的时候会保证set的元素的唯一性。
	}

}
