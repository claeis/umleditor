package ch.ehi.umleditor.application;

import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

import javax.swing.JOptionPane;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
public class CheckUpdate {
	String url = null;
	DataObject obj = null;
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public CheckUpdate(String url) {
		this.url = url;
	}

	
	private class DataObject{ //This class should match your json object structure
        private String tag_name;
        //private List<Item> item; // This is for the inner array
        @Override
        public String toString() {
            return tag_name;
        }
    }
	public boolean parseAndCheckJson(){
        try{
            Reader reader = new InputStreamReader(new URL(url).openStream()); //Read the json output
            Gson gson = new GsonBuilder().create();
            obj = gson.fromJson(reader, DataObject.class);
            
            String[] actualVersion = LauncherView.getVersion().split("\\.");
            String[] serverVersion = obj.toString().split("\\.");
           
            //3.4.4.1
            if( (serverVersion[0].contains(actualVersion[0])) && (serverVersion[1].equals(actualVersion[1]))&& (serverVersion[2].equals(actualVersion[2])) && (actualVersion[3].startsWith(serverVersion[3])) ){
            	
            		return true; 		
            } else {
				return false;
			}
           
        }catch(Exception e){
            System.out.println(e);
        }
		return false;
    }
	
}

