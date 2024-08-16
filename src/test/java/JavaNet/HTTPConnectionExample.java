package JavaNet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HTTPConnectionExample {
	
	public void getMethodExample() throws IOException {
		URL url = new URL("https://dummy.restapiexample.com/api/v1/employees");
		HttpURLConnection connection =  (HttpURLConnection)url.openConnection();
		
		connection.setRequestMethod("GET");
		connection.connect();
		
		int ResponseCode = connection.getResponseCode();
		System.out.println("Response Code is "+ResponseCode);
		
		String ResponseMessage = connection.getResponseMessage();
		System.out.println("Response Code is "+ResponseMessage);
		
		InputStream inputstream = connection.getInputStream();
		InputStreamReader inputstreamreader = new InputStreamReader(inputstream);
		BufferedReader bufferreader = new BufferedReader(inputstreamreader);
		
		String line;
		StringBuffer buffer = new StringBuffer();
		while((line = bufferreader.readLine())!=null) {
			buffer.append(line);
		}
		
		System.out.println(buffer);
	}
	
	public void postMethodExample() throws IOException {
		
		URL url = new URL("https://dummy.restapiexample.com/api/v1/create");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		
		String jsonbody = "{\"name\":\"Vignesh\",\"salary\":\"40000\",\"age\":\"32\"}";
		byte[] inputjson = jsonbody.getBytes();
		
		OutputStream output = connection.getOutputStream();
		output.write(inputjson);
		
		int ResposneCode = connection.getResponseCode();
		System.out.println("Response Code is "+ResposneCode);
		
		String ResponseMessage = connection.getResponseMessage();
		System.out.println("Response Message is "+ResponseMessage);
		
		InputStream input = connection.getInputStream();
		InputStreamReader inputstreamreader = new InputStreamReader(input);
		BufferedReader bufferreader = new BufferedReader(inputstreamreader);
		
		String line;
		StringBuffer buffer = new StringBuffer();
		while((line = bufferreader.readLine())!=null) {
			buffer.append(line);
		}
		System.out.println(buffer);
	}
	
	public void putMethodExample() throws IOException {
		
		URL url = new URL("https://dummy.restapiexample.com/api/v1/update/4691");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		
		connection.setRequestMethod("PUT");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		
		String jsonbody = "{\"name\":\"Vignesh K S\",\"salary\":\"90000\",\"age\":\"32\"}";
		byte[] inputjson = jsonbody.getBytes();
		
		OutputStream output = connection.getOutputStream();
		output.write(inputjson);
		
		int ResposneCode = connection.getResponseCode();
		System.out.println("Response Code is "+ResposneCode);
		
		String ResponseMessage = connection.getResponseMessage();
		System.out.println("Response Message is "+ResponseMessage);
		
		InputStream input = connection.getInputStream();
		InputStreamReader inputstreamreader = new InputStreamReader(input);
		BufferedReader bufferreader = new BufferedReader(inputstreamreader);
		
		String line;
		StringBuffer buffer = new StringBuffer();
		while((line = bufferreader.readLine())!=null) {
			buffer.append(line);
		}
		System.out.println(buffer);
		
	}
	
	public void deleteMethodExample() throws IOException {
		
		URL url = new URL("https://dummy.restapiexample.com/api/v1/delete/4691");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		
		connection.setRequestMethod("DELETE");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		
		int ResposneCode = connection.getResponseCode();
		System.out.println("Response Code is "+ResposneCode);
		
		String ResponseMessage = connection.getResponseMessage();
		System.out.println("Response Message is "+ResponseMessage);
		
		InputStream input = connection.getInputStream();
		InputStreamReader inputstreamreader = new InputStreamReader(input);
		BufferedReader bufferreader = new BufferedReader(inputstreamreader);
		
		String line;
		StringBuffer buffer = new StringBuffer();
		while((line = bufferreader.readLine())!=null) {
			buffer.append(line);
		}
		System.out.println(buffer);
		
	}
	
	public static void main(String[] args) throws IOException {
		HTTPConnectionExample connectionexample = new HTTPConnectionExample();
//		connectionexample.getMethodExample();
//		connectionexample.postMethodExample();
//		connectionexample.putMethodExample();
		connectionexample.deleteMethodExample();
		
	}

}
