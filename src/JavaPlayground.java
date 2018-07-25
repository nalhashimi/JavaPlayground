
import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class JavaPlayground {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int i = 0;
		int arr[] = { 99944,99945,99946,99947,99948,99949,99950,99951,99952,99953,99954,99955,99956,99957,99958,99959,99960,99961,99962,99963,99964,99965,99966,99967,99968,99969,99970,99971,99972,99973,99974,99975,99976,99977,99978,99979,99980,99981,99982,99983,99984,99985,99986,99987,99988,99989,99990,99991,99992,99993,99994,99995,99996,99997,99998,99999,100000 };

		SortInterface a = new Quicksort();
		a.sortArray(arr);
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println("");
		whenPostJsonUsingHttpClient_thenCorrect();
	}
	
	public static void whenPostJsonUsingHttpClient_thenCorrect() 
			  throws ClientProtocolException, IOException {
			    CloseableHttpClient client = HttpClients.createDefault();
			    HttpPost httpPost = new HttpPost("https://asirest-dev.vcfcorp.com/genesysresponse");
			 
			    //String json = "{\"id\":1,\"name\":\"John\"}";
			    String json = "{\"CallStartTime\":\"05/09/2018 11:55:10\",\"Delivery_Store\":\"110\",\"Answer_By\":\"Voicemail\",\"Invoice_Store\":\"110\",\"ASISYSTEM\":\"develop\",\"Invoice_Number\":\"247220\",\"Dialed_Number\":\"7812021110\",\"Request_Callback\":\"NO\"}";
			    
			    StringEntity entity = new StringEntity(json);
			    httpPost.setEntity(entity);
			    //httpPost.setHeader("Accept", "application/json");
			    httpPost.setHeader("Content-type", "plain/text; charset=utf-8");
			 
			    CloseableHttpResponse response = client.execute(httpPost);
			    HttpEntity entity1 = response.getEntity();
			    String ret = EntityUtils.toString(entity1);
			    System.out.println(ret);
			    client.close();
			}

}
