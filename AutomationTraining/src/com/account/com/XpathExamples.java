package com.account.com;

public class XpathExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Xpath=//tagname[@attribute='value']
		//Id,Name,Class Name,Link text,partial Link text,CSS selectors
		// Xpath has been classified into 2 types:
		//1. Absolute xpath
		//2. Relative xpath
		
		//http://demo.guru99.com/test/selenium-xpath.html - link
		
		
		//div[@class='featured-box cloumnsize1']//h4[1]//b[1] - relative xpath
		//div[@class='featured-box']//h4[2]//b[1]
		
		//input[@name='uid']
		
		//img[@src='https://demo.guru99.com/images/java-logo.png']
		
		//*[contains(@name,'btn')]
		
		//*[contains(text(),'here')]
		
				//label[starts-with(@id,'message')]
				
				//td[text()='UserID']
				
				//Basic XPath- //tag name[@attribute name='value']
				
				//contains- 
				
				// XPath=//*[contains(@type,'sub')]   
				// XPath=//*[contains(@id,'message')]
				// XPath=//*[contains(text(),'here')]
				// XPath=//*[contains(@href,'guru99.com')]
				
				//using or and and
				// XPath=//*[@type='submit' or @name='btnReset']

				// XPath Starts-with		
				// XPath=//label[starts-with(@id,'message')]
				
				// XPath text function
				// XPath=//td[text()='UserID']
				
				// XPath access methods are used to identify complex or dynamic elements.
				/*
				 * 1. Following 2. Ancestor 3. Child 4. Preceding 5. Following-sibling 6. Parent
				 * 7. Self 8. Descendant
				 */
				
				//*[text()='Live Projects']//ancestor::div
				//*[@id='java_technologies']//child::li
				
				
				/*
				 * https://www.guru99.com/xpath-selenium.html - link to practice
				 * 
				 * Preceding Following-sibling: Parent: Self: Descendant:
				 */
			//	https://www.youtube.com/playlist?list=PLUzXmhjZTIVq5wWNg9QTr_Rk6hGfIUAy3 - github
				
		
	}

}
