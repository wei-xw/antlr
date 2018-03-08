package bonc.antlr4;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class exp {
	public static void main(String[] args) {
		
	
	 String str="INSERT INTO C SELECT * FROM A LEFT JOIN B ON ASDAASFDSVFS";
	 
	 str="(concat(user_id,toString(length(mpee)))='111') and set=0";
	
       sqlLexer lexer=new sqlLexer(new ANTLRInputStream(str));
       CommonTokenStream tokens =new CommonTokenStream(lexer);
       sqlParser parser = new sqlParser(tokens);
       ParseTree tree= parser.booleanExpression();
       ParseTreeWalker walker = new  ParseTreeWalker();
       ExpListener listen =new ExpListener();
       walker.walk(listen,tree); 
	}
}
