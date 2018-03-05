package bonc.antlr4.entity;

public class Column {
	private String columnName = "";
	private String type;
	private String alias = "";
	private String exp;
	private boolean isContained = false;
	private String tableOrAlias="";//字段所属的表或子查询的别名，之后需要考虑表+字段唯一确定一个Column类，即hashCode()、equals()方法得改
	public String getColumnName() {
		return columnName;
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

	// column类只用columnName作为比较依据
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
}
