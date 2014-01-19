package org.xh.xs.core;
import java.io.BufferedReader;

import org.junit.Test;
import org.xh.xs.core.XhSeg;
import org.xh.xs.util.CharUtil;
import org.xh.xs.util.ResLoader;


public class XhSegTest {
	XhSeg xs=new XhSeg();
	@Test
	public void testSeg() throws Exception{
		BufferedReader br=ResLoader.getReader("洗脚妹刘丽1.txt", true);
		String line;
		while((line=br.readLine())!=null){
			try {
				xs.segment(line);
			} catch (Exception e) {
				System.err.println(line);
				e.printStackTrace();
			}
		}
	}
	@Test
	public void testSegLine(){
		String line=" this is a good choice!";
		String[] ss=xs.segment(line);
		for (String str : ss) {
			System.out.print(str+" |");
		}
		
	}
}
