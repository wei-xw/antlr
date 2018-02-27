package bonc.antlr;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class read {
	public static void main(String[] args) throws IOException {
		/*
为了把一堆这个		 
KW_UPDATE: 'UPDATE';
KW_RESTRICT: 'RESTRICT';
KW_CASCADE: 'CASCADE';
转成
KW_DESC:('d'|'D')('e'|'E')('s'|'S')('c'|'C');
KW_ORDER:('o'|'O')('r'|'R')('d'|'D')('e'|'E')('r'|'R');
KW_INSERT:('i'|'I')('n'|'N')('s'|'S')('e'|'E')('r'|'R')('t'|'T');

。。。。。。。。。。。。
		 */
		File file = new File("/home/wxw/Desktop/2222.txt");
		String str = null;
		BufferedReader br;
		// value类型在这里判断,现在只有String。
			br = new BufferedReader(new FileReader(file));
			String strtmp;
			int line=1;
			Set<String> hs = new HashSet<String>(); 
			while ((str = br.readLine()) != null) {
				for(int i=0;i<str.length();i++) {
					if((i+3)<str.length()) {
						if(str.charAt(i)=='K'&&str.charAt(i+1)=='W'&&str.charAt(i+2)=='_') {
							int j=1;
							strtmp="KW_";
							while((i+2+j)<str.length()&&str.charAt(i+2+j)>='A'&&str.charAt(i+2+j)<='Z') {
								strtmp+=str.charAt(i+2+j);
								j++;
							}
							hs.add(strtmp);
						}
					}
				}
			}
			for(String tmp:hs) {
				String str1=tmp.substring(tmp.indexOf('_')+1);
				System.out.print(tmp+":");
				for(int i=0;i<str1.length();i++) {
					char chartmp=(char) (str1.charAt(i)-('A'-'a'));
					System.out.print("('"+chartmp+"'|'"+str1.charAt(i)+"')");
				}
				System.out.println(";");
			}
	}

}
