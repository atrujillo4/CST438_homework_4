package common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class get_dogs implements iget_dogs 
{
	@Override
	public String getJson(String url, int timeout) 
	{

		try 
		{
			URL web;
			web = new URL(url);
			HttpURLConnection connect = (HttpURLConnection) web.openConnection();
			connect.setRequestMethod("GET");
			connect.setRequestProperty("Content-length", "0");
			connect.setUseCaches(false);
			connect.setAllowUserInteraction(false);
			connect.setConnectTimeout(timeout);
			connect.setReadTimeout(timeout);
			connect.connect();
			int stat = connect.getResponseCode();
			switch (stat)
			{
			case 200:
			case 201:
				BufferedReader reader = new BufferedReader(new InputStreamReader(connect.getInputStream()));
				StringBuilder builder = new StringBuilder();
				String list;
				while ((list = reader.readLine()) != null) 
				{
					builder.append(list + "\n");
				}
				reader.close();
				return builder.toString();
			default:
				break;
			}
		} 
		catch (MalformedURLException e) 
		{
			e.printStackTrace();
		} 
		catch (ProtocolException e) 
		{	
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return null;
	}
}
