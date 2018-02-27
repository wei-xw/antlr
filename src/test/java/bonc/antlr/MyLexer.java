package bonc.antlr;
import java.util.ArrayList;
import java.util.List;

public class MyLexer {
	
	/**
	 * CURRENTTIME,LIKE这两个函数是没有参数的,以下37个关键字是37个逻辑函数的集合,并不是全部函数的集合.而本测试
	 * 类主要目的是实现一个可以在词法层次解析一个传入的函数,将函数本身解析并输出,同时解析出需要的参数,以及参数类型.因此
	 * 不需要判断输入字符串函数格式以及内容的正误,只需要完成解析的功能即可.
	 */
	public String[] remain = {"ADD_MONTHS","ASCII","CONCAT","CURRENTTIME","DAY",
						"DATE_ADD","DATE_SUB","DATEDIFF","TO_STRING","DECODE",
						"LENGTH","HOUR","INDEXOF","LAST_INDEX_OF","LCFIRST",
						"LIKE","LOWER","LPAD","LTRIM","NVL","NULLIF","REPLACE",
						"RPAD","RTRIM","REVERSE","SUBSTR","SECOND","TO_NUMBER",
						"TO_CHAR","TO_STRING","TO_DATE","TRIM","UCFIRST","UPPER",
						"MONTHS_BETWEEN","MINUTE","MONTH","YEAR"};

	public StringBuffer strTokens = new StringBuffer();
	public int ch;
	public int code;
	public List<String> list = new ArrayList<String>();
	
	/**
	 * 判断当前字符是否为字母
	 * @return
	 */
	public boolean IsLetter(){
		if((ch>='a'&&ch<='z') || (ch>='A'&&ch<='Z')){
			return true;
		}else{
			return false;
		}
	}
	/**
	 * 判断当前字符是否为数字
	 * @return
	 */
	public boolean IsDigit(){
		if(ch>='0'&&ch<='9'){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * 返回1为保留字，返回2为数字，返回3为字段，返回4为字符串
	 * @return
	 */
	public int IsReserve(){
		//保留字判断
		for(int i=0;i<remain.length;i++){
			if(strTokens.toString().equals(remain[i])){
				return 1;
			}
		}
		//数字判断
		if(strTokens.length()!=0){
			if(strTokens.length()>1){
				int i= 1;
				for(;i<strTokens.length();i++){
					if((strTokens.charAt(0) == '-'||
							(strTokens.charAt(0)>='0'&&strTokens.charAt(0)<='9'))&&
							((strTokens.charAt(i)>='0'&&strTokens.charAt(i)<='9')||
							  strTokens.charAt(i) == '.')){
						continue;
					}else{
						break;
					}
				}
				
				String[] num = strTokens.toString().split("\\.");
				if(num.length == 1 && i==strTokens.length()){
					return 2;
				}else if(num.length == 2 && i==strTokens.length()){
					return 3;
				}else if(num.length > 2 && i==strTokens.length()){
					return -1;
				}
				
			}else if(strTokens.length()==1){
				if(strTokens.charAt(0)>='0'&&strTokens.charAt(0)<='9'){
					return 2;
				}
			}
		}
		//字段类型判断，判定结果：字符串不以‘开头的，并且+-*/这四个运算符号都不能作为字段内容
		if(strTokens.length() != 0){
			if(strTokens.charAt(0)!='\''){
				int k = 0;
				for(int i=0;i<strTokens.length();i++){
					//截子串，存储到list中
					if(strTokens.charAt(i) == '+'||strTokens.charAt(i) == '-'||
					   strTokens.charAt(i) == '*'||strTokens.charAt(i) == '/'||
					   strTokens.charAt(i) == '%'){
						//判断子串是否由完全由数字组成，如果是，则判断为数字，不是，则判定为字段
						int j = 0;
						for(;j<strTokens.toString().substring(k, i).length();j++){
							if(strTokens.toString().substring(k, i).charAt(j)>='0'&&
									strTokens.toString().substring(k, i).charAt(j)<='9'){
								continue;
							}else{
								break;
							}
						}
						//如果不相等，就证明当前子串中含有非数字的字符，那么就应该判定为字段，并且添加到list当中
						//但无论是否相等，即无论当前子串是数字还是字段，k的值都应该往下进行，这样才能保证每次截取
						//的子串都是正确分割的
						if(j != strTokens.toString().substring(k, i).length()){
							list.add(strTokens.toString().substring(k, i));
						}
						k = i+1;
						
					}
				}
				//处理被运算符分割之后的最后一部分子串，判断其是否为数字，如果是，就不处理，如果不是，就证明是正常的字段
				//存储到list当中。方式是遍历子串，判断子串每一个字符是否是数字，只要有一个字符不是数字，即整体不是数字。
				int m = 0;
				for(;m<strTokens.toString().substring(k, strTokens.length()).length();m++){
					if(strTokens.toString().substring(k,strTokens.length()).charAt(m)>='0'&&
							strTokens.toString().substring(k, strTokens.length()).charAt(m)<='9'){
						continue;
					}else{
						break;
					}
				}
				if(m != strTokens.toString().substring(k, strTokens.length()).length()){
					list.add(strTokens.toString().substring(k, strTokens.length()));
				}
				return 4;
			}
		}
		//字符串类型判断
		if(strTokens.length() != 0){
			if(strTokens.charAt(0) == '\''&&strTokens.charAt(strTokens.length()-1)=='\''){
				return 5;
			}
		}
		return 6;
	}
	/**
	 * 输出当前字符串内容并且将字符串清空，也可以理解为将当前StringBuffer字符串回收
	 */
	public void Retract(){
		code = IsReserve();
		if(code == 1){
			//LIKE识别处理。-----------------------------------
			if(strTokens.toString().equals("LIKE")){
				System.out.println("函数为："+strTokens);
			}else{
				System.out.println("函数为："+strTokens+"()");
			}
		}else if(code == 2){
//			System.out.println("参数为："+strTokens+"，类型为：整数");//可以判断整数和小数，但是还没有对int，double，long类型等进行分类
		}else if(code == 3){
//			System.out.println("参数为："+strTokens+"，类型为：double");
		}else if(code == 4){
			for(int i=0;i<list.size();i++){
				System.out.println("字段为："+list.get(i));
			}
			list.clear();
		}else if(code == 5){
//			System.out.println("参数为："+strTokens+"，类型为：字符串");
		}else if(code == -1){
			System.out.println("当前参数类型不合法，参数为："+strTokens+" 请修改参数");
		}
		strTokens.delete(0, strTokens.length());
	}
	
	public void connect(char c){
		strTokens.append(c);
	}
	
	public void scanner(String s){
		
			char[] ss = s.toCharArray();
			
			for(int i=0;i<ss.length;i++){
				
				ch = ss[i];
				
				if(IsLetter()){
					connect((char)ch);
				}else if(IsDigit()){
					connect((char)ch);
				}else if(ch == '\''){
					connect((char)ch);
				}else if(ch == ':'){
					connect((char)ch);
				}else if(ch == '_'){
					connect((char)ch);
				}else if(ch == '.'){
					connect((char)ch);
				}else if(ch == '+'){
					connect((char)ch);
				}else if(ch == '-'){
					connect((char)ch);
				}else if(ch == '*'){
					connect((char)ch);
				}else if(ch == '/'){
					connect((char)ch);
				}else if(ch == '#'){
					connect((char)ch);
				}else if(ch == '@'){
					connect((char)ch);
				}else if(ch == '$'){
					connect((char)ch);
				}else if(ch == '%'){
					connect((char)ch);
				}else if(ch == '('){
					Retract();
				}else if(ch == ')'){
					Retract();
				}else if(ch == ','){
					Retract();
				}else if(ch == '&'){
					Retract();
				}else if(ch == '|'){
					Retract();
				}else if(ch == ';'){
					Retract();
				}else if(ch == '>'){
					Retract();
				}else if(ch == '<'){
					Retract();
				}else if(ch == '='){
					//关于=的判断还需要进一步处理，表示最多只能有两个=，但由于目前不会影响字段的识别和输出，暂时不做处理
					if(ss[i+1] == '='){
						connect((char)ch);
						continue;
					}else{
						Retract();
					}
				}
			}
		
	}
	
	public static void main(String[] args) {
		MyLexer ml = new MyLexer();
		ml.scanner("TO_STRING(TO_DATE('2017-06-05','yyyy-MM-dd'),D)"
				+ " NULLIF(2.2,B) "
				+ " NULLIF(A,A-B) "
				+ " CONCAT(A%2) ");
	}
}
