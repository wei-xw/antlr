package bonc.antlr4;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
public class Sql {
	
	public static void main(String[] args) {  
		
		 String str="INSERT INTO C SELECT * FROM A LEFT JOIN B ON ASDAASFDSVFS";
		 str="INSERT INTO direct SELECT userid,name FROM D UNION ALL SELECT userid,name FROM B UNION ALL SELECT sex AS userid,userid AS sex,name AS name FROM A ;";
		 str="INSERT INTO HJ.SRC_D_BCD_ORACLE (USER_ID,PARTITION_ID )SELECT * FROM ( SELECT SourceQulifier_1.USER_ID AS USER_ID, SourceQulifier_1.PARTITION_ID AS PARTITION_ID FROM HJ.DET_D_BCD_ORACLE SourceQulifier_1 LEFT JOIN HJ.SRC_D_BCD_ORACLE_ISOMERY SourceQulifier_3 ON ( SourceQulifier_1.USER_ID = SourceQulifier_3.DAY_ID ) RIGHT JOIN HJ.SRC_D_BCD1227 SourceQulifier_5 ON ( SourceQulifier_1.USER_ID = SourceQulifier_5.USER_ID ))tableA WHERE USER_ID>10 WHERE ROWNUM>10 ORDER BY userid;";
		 str="INSERT INTO B (USER_ID,PARTITION_ID )SELECT * FROM ( SELECT USER_ID AS userid,PARTITION_ID AS  PARTITION_ID FROM C WHERE USER_ID>0 WHERE ROWNUM>10 GROUP BY USER_ID )A ORDER BY userid;";
		 str="INSERT INTO B (USER_ID,PARTITION_ID )SELECT * FROM ( SELECT SourceQulifier_1.USER_ID AS USER_ID, SourceQulifier_1.PARTITION_ID AS PARTITION_ID FROM HJ.DET_D_BCD_ORACLE SourceQulifier_1 LEFT JOIN HJ.SRC_D_BCD_ORACLE_ISOMERY SourceQulifier_3 ON ( SourceQulifier_1.USER_ID = SourceQulifier_3.DAY_ID ) RIGHT JOIN HJ.SRC_D_BCD1227 SourceQulifier_5 ON ( SourceQulifier_1.USER_ID = SourceQulifier_5.USER_ID ) WHERE USER_ID>0 WHERE ROWNUM>10 GROUP BY USER_ID )A ORDER BY userid;";
		 str="INSERT INTO HJ.WXW_REDIS_TEST (USER_ID,PARTITION_ID,BINDSALE_ATTR,EXTRA_DEV_FEE ) SELECT SourceQulifier_1_M.USER_ID AS USER_ID,SourceQulifier_1_M.PARTITION_ID AS PARTITION_ID,SourceQulifier_3_D.USER_ID_1 AS USER_ID_1,SourceQulifier_3_D.MPFEE AS MPFEE FROM (SELECT USER_ID AS USER_ID,PARTITION_ID AS PARTITION_ID FROM HJ.SRC_D_BCD1227 SourceQulifier_1) SourceQulifier_1_M LEFT JOIN(SELECT USER_ID AS USER_ID_1,MPFEE AS MPFEE FROM HJ.SRC_D_BCD1227_1 SourceQulifier_3) SourceQulifier_3_D  ON  (SourceQulifier_1_M.USER_ID = SourceQulifier_3_D.USER_ID_1);";
//		 str="INSERT INTO B (USER_ID,PARTITION_ID ) SELECT * FROM (SELECT USER_ID AS userid,PARTITION_ID AS  PARTITION_ID FROM C WHERE USER_ID>0)A WHERE USER_ID>1;";
		 str="INSERT INTO B (USER_ID,PARTITION_ID )SELECT * FROM ( SELECT concat(a,PARTITION_ID),1+2,count(1), a+1*2+3-4 AS userid,PARTITION_ID AS  PARTITION_ID FROM C WHERE USER_ID>0 WHERE ROWNUM>10 GROUP BY USER_ID )A ORDER BY userid;";
//		 str="insert into B select a from (select a,b,c from tableB)source1 where b>0 order by c;";
		 str=" INSERT  INTO HJ.WXW_ANTLR_DIRECT_TEST (USER_ID,PARTITION_ID,BINDSALE_ATTR,EXTRA_DEV_FEE,MPFEE ) SELECT USER_ID AS USER_ID, a AS PARTITION_ID, PARTITION_ID AS BINDSALE_ATTR, BINDSALE_ATTR AS EXTRA_DEV_FEE, MPFEE AS MPFEE  FROM (SELECT USER_ID AS USER_ID, CONCAT(PARTITION_ID, 'wwwwww') AS PARTITION_ID, BINDSALE_ATTR AS BINDSALE_ATTR, LENGTH(MPFEE) AS b, MPFEE AS MPFEE, USER_ID AS a  FROM HJ.WXW_ANTLR_TEST SourceQulifier_1) Filter_3  WHERE b>3 ;";
		 str="INSERT INTO HJ.WXW_ANTLR_DIRECT_TEST select USER_ID,PARTITION_ID from (select USER_ID,PARTITION_ID,DAY_ID from HJ.WXW_ANTLR_TEST where length(MPFEE)>3) a where length(MPFEE)>3;";
	       sqlLexer lexer=new sqlLexer(new ANTLRInputStream(str));
	       CommonTokenStream tokens =new CommonTokenStream(lexer);
	       sqlParser parser = new sqlParser(tokens);
	       ParseTree tree= parser.prog();
//	       System.out.println(tree.toStringTree(parser));
//	       Mappingvisitor eval = new Mappingvisitor();  
//	       eval.visit(tree);  
	       ParseTreeWalker walker = new  ParseTreeWalker();
	       MappingListener listen =new MappingListener();
	       walker.walk(listen,tree); 
	      
	}

}
