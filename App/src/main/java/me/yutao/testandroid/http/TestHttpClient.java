package me.yutao.testandroid.http;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class TestHttpClient {

	private byte data[] = new byte[1024];
	private HttpGet httpGet;
	private HttpClient httpClient;

	public void downloadFile(String url, File targetFile) {

		// download the file
		httpClient = new DefaultHttpClient();
		httpGet = new HttpGet(url.toString());
		HttpResponse response;
		InputStream inputStream = null;
		FileOutputStream fileOutputStream = null;
		BufferedInputStream bufferedInputStream;
		try {
			response = httpClient.execute(httpGet);

			if (targetFile.exists()) {
				targetFile.delete();
			}
			targetFile.getParentFile().mkdirs();
			targetFile.createNewFile();
			HttpEntity httpEntity = response.getEntity();
			inputStream = httpEntity.getContent();
			bufferedInputStream = new BufferedInputStream(inputStream);
			fileOutputStream = new FileOutputStream(targetFile);
			long size = response.getEntity().getContentLength();
			long total = 0;
			int l = 0;
			while ((l = bufferedInputStream.read(data)) > 0) {
				fileOutputStream.write(data, 0, l);
				total += l;
				int percentage = (int) (100f * (float) total / (float) size);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fileOutputStream.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fileOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void cancel() {
		if (httpGet != null) {
			httpGet.abort();	
		}
	}

}
