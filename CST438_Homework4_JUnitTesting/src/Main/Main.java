package Main;

import common.get_dogs;
import common.iget_dogs;

public class Main
{
	public static void main(String args[]) 
	{
		//String url = "https://dog.ceo/api/breeds/list/all";
		String url = "https://dog.ceo/api/breeds/image/random";
		String json_list = api(url);
		System.out.println(json_list);
	}
	public static String api(String link) 
	{
		iget_dogs list = new get_dogs();	
		String json_list = list.getJson(link, 0);		
		return json_list;
	}
}
