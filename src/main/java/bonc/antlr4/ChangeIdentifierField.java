package bonc.antlr4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import bonc.antlr4.entity.Column;

public class ChangeIdentifierField extends sqlBaseListener {
	String toExp = "";
	List<Column> columnList;

	public ChangeIdentifierField(List<Column> columnList) {
		this.columnList = columnList;
	}
	public void exitIdentifierField(sqlParser.IdentifierFieldContext ctx) {
		System.out.println(ctx.getText());
		String field = ctx.IDENTIFIER().getText();
		if (ctx.tableName() != null) {
			String database = ctx.tableName().getText();
			for (Column col : columnList) {
				if (col.getColumnName().equals(field) && database.equals(col.getTableOrAlias())) {
					if (col.getColumnNamealias().contains("#"))
						toExp += "#" + col.getColumnNamealias().split("#")[1];
				}
			}
		} else {
			for (Column col : columnList) {
				if (col.getColumnName().equals(field)) {
					if (col.getColumnNamealias().contains("#"))
						toExp += "#" + col.getColumnNamealias().split("#")[1];
				}
			}
		}

	}
	List<String> kwList = Arrays.asList("and", "AND", "or", "OR", "is", "IS", "null", "NULL");
	@Override
	public void visitTerminal(TerminalNode node) {
			toExp +=" "+node.getText();
	}

}