package org.xh.xs.lucene_42;
import java.io.IOException;
import java.io.StringReader;

import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.junit.Test;
import org.xh.xs.lucene_42.XhTokenizer;


public class XhTokenizerTest {
	@Test
	public void test() throws IOException{
		
		XhTokenizer xt=new XhTokenizer(new StringReader("a"));
		for(int i=0;i<10;i++){
			xt.incrementToken();
			CharTermAttribute ssj=xt.getAttribute(CharTermAttribute.class);
			System.out.println(ssj.buffer());
		}
		
	}
}
