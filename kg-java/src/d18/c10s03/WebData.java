package d18.c10s03;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;

@SuppressWarnings("unused")
public class WebData {

	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.naver.com";
		HttpURLConnection con = null;
		BufferedReader br = null;
		FileWriter fw = null;

		while(true) {
			try {
				con = (HttpURLConnection)(new URL(url)).openConnection();
				con.connect();
				br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
				Date time = new Date();

				@SuppressWarnings("deprecation")
				String fileName = (time.getYear() + 1900) +"년" + 
								  (time.getMonth() + 1) + "월" + 
								   time.getDate() + "일" + 
								   time.getHours() + "시" + 
								   time.getMinutes() + "분" + 
								   time.getSeconds() + "초의 실시간검색어.txt";
				fw = new FileWriter(fileName);
				String temp;
				int rank = 0;

				while((temp = br.readLine()) != null) {
					if(temp.contains("<span class=\"ah_k\">")) {
						String toWrite = (rank + 1) + "위: " + temp.split(">")[1].split("<")[0];
						fw.write(toWrite);
						fw.write("\r\n");
						rank++;

					}
					if(rank == 20) {
						break;

					}

				}

			} catch(IOException e) {
				e.printStackTrace();

			} finally {
				if(br != null) {
					try {
						br.close();

					} catch(IOException e) {

					}

				}
				if(fw != null) {
					try {
						fw.close();

					} catch(IOException e) {

					}

				}
				if(con != null) {
					con.disconnect();

				}

			}
			Thread.sleep(60000);

		}

	}

}
