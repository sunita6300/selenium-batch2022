package com.mystore.base;

public class BaseClass {
	
	@BeforeTest
	
	public void loadconfig()
	{
		try
		{
			Prop=new properties();
			System.out.println();
		}
	}

}
