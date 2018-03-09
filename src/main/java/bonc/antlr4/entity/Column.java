package bonc.antlr4.entity;

public class Column {
	private String columnName = "";
	private String columnNamealias=""; //用于join中给两个表的相同字段加#1，例：ID=>ID#1;
	private String type;
	private String alias = "";
	private String exp;
	private boolean isContained;
	private boolean isAggregate;
	private String tableOrAlias="";//字段所属的表或子查询的别名，之后需要考虑表+字段唯一确定一个Column类,或者建一个表的类，表对象的引用，即hashCode()、equals()方法得改
	public String getColumnName() {
		return columnName;
	}
	public Column() {
		super();
	}
	public Column(String columnName) {
		this.columnName=columnName;
	}
	public Column(String columnName,String tableOrAlias) {
		this.columnName=columnName;
		this.tableOrAlias=tableOrAlias;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getExp() {
		return exp;
	}

	public void setExp(String exp) {
		this.exp = exp;
	}

	public boolean isContained() {
		return isContained;
	}

	public void setContained(boolean isContained) {
		this.isContained = isContained;
	}

//	public int hashCode() {
//		return columnName.hashCode()+tableOrAlias.hashCode();
//	}
//
//	public boolean equals(Object obj) {
//		if (obj instanceof Column) {
//			Column col = (Column) obj;
//			return columnName.equals(col.columnName)&&tableOrAlias.equals(col.tableOrAlias);
//		}
//		return super.equals(obj);
//	}
	public int hashCode() {
		return columnName.hashCode();
	}

	public boolean equals(Object obj) {
		if (obj instanceof Column) {
			Column col = (Column) obj;
			return columnName.equals(col.columnName);
		}
		return super.equals(obj);
	}
	
	public boolean isAggregate() {
		return isAggregate;
	}
	public void setAggregate(boolean isAggregate) {
		this.isAggregate = isAggregate;
	}
	public String getTableOrAlias() {
		return tableOrAlias;
	}
	public void setTableOrAlias(String tableOrAlias) {
		this.tableOrAlias = tableOrAlias;
	}
	public String getColumnNamealias() {
		return columnNamealias;
	}
	public void setColumnNamealias(String columnNamealias) {
		this.columnNamealias = columnNamealias;
	}
}
