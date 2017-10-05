package unit_test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Main.Main;

public class unit_test 
{
	@Test
	public void test() 
	{
		// checks to see if success for
		// returning list of all dogs
		String list = Main.api("https://dog.ceo/api/breeds/list/all");
		String temp[] = list.split(",");
		String stat[] = temp[0].split(":");
		stat[1] = stat[1].substring(1, stat[1].length()-1);
		assertEquals("success", stat[1]);
	}
	
	@Test 
	public void test2()
	{
		// checks to see if success for 
		// returning list of dingos
		String list = Main.api("https://dog.ceo/api/breed/dingo/list");
		String temp[] = list.split(",");
		String stat[] = temp[0].split(":");
		stat[1] = stat[1].substring(1,  stat[1].length()-1);
		assertEquals("success", stat[1]);
	}
	
	@Test
	public void test3()
	{
		// checks to see if success of 
		// returning a link to a picture of a random dog
		String list = Main.api("https://dog.ceo/api/breeds/image/random");
		String temp[] = list.split(",");
		String stat[] = temp[0].split(":");
		stat[1] = stat[1].substring(1,  stat[1].length()-1);
		assertEquals("success", stat[1]);
	}
	
	@Test 
	public void test4()
	{
		// checks to see if success of 
		// returning an array of all the images from the sub-breed
		String list = Main.api("https://dog.ceo/api/breed/hound/blood/images");
		String temp[] = list.split(",");
		String stat[] = temp[0].split(":");
		stat[1] = stat[1].substring(1,  stat[1].length()-1);
		assertEquals("success", stat[1]);
	}
	
	
	
}
