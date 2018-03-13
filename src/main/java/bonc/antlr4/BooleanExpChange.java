package bonc.antlr4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.antlr.v4.runtime.tree.TerminalNode;

import bonc.antlr4.entity.Column;

public class BooleanExpChange extends sqlBaseListener {
	String toExp = "";
	List<Column> columnList;
	Set<String> tableSet = new HashSet<String>();

	public BooleanExpChange(List<Column> columnList) {
		this.columnList = columnList;
	}

	public void exitIdentifierField(sqlParser.IdentifierFieldContext ctx) {
		String field = ctx.IDENTIFIER().getText();
		if (ctx.tableName() != null) {
			String database = ctx.tableName().getText();
			for (Column col : columnList) {
				if (col.getColumnName().equals(field) && database.equals(col.getTableOrAlias())) {
					if (col.getColumnNamealias().contains("#"))
						toExp += "#" + col.getColumnNamealias().split("#")[1];
					tableSet.add(database);
				}
			}
		} else {
			for (Column col : columnList) {
				if (col.getColumnName().equals(field)) {
					if (col.getColumnNamealias().contains("#"))
						toExp += "#" + col.getColumnNamealias().split("#")[1];
					tableSet.add(col.getTableOrAlias());
				}
			}
		}

	}

	List<String> kwList = Arrays.asList("and", "AND", "or", "OR", "is", "IS", "null", "NULL");

	public void visitTerminal(TerminalNode node) {
		if (kwList.contains(node.getText()))
			toExp += " " + node.getText() + " ";
		else
			toExp += node.getText();
	}

}