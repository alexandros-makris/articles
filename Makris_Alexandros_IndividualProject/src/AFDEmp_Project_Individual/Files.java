/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AFDEmp_Project_Individual;



import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author alexmakris
 */
public class Files {

    
    
    public void Files() {
    }
  
 public void mainLog(String username , String action) {
		BufferedWriter bw = null;
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy G 'at' HH:mm:ss z");
		String dateFormat = sdf.format(date);

                try {
			File file = new File("main_Log.txt");
			if (!file.exists()) {
				file.createNewFile();
				FileWriter fw2 = new FileWriter(file);
				BufferedWriter bw2 = new BufferedWriter(fw2);
				bw2.close();
			}
			FileWriter fw = new FileWriter(file , true);
			bw = new BufferedWriter(fw);
			bw.newLine();
			bw.write(dateFormat +" username = " + username + " action = " + action );
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		finally
		{ 
			try{
				if(bw!=null)
					bw.close();

			}catch(Exception ex){
				System.out.println("Error closing the BufferedWriter"+ex);
			}
		}
	}	

	public void msgLog(String sender , String receiver , String title, String  messageData) {
       
            BufferedWriter bw = null;
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy G 'at' HH:mm:ss z");
		String dateFormat = sdf.format(date);
		
		try {
			
			File file = new File("msg_Log.txt");
			if (!file.exists()) {
				file.createNewFile();
				FileWriter fw2 = new FileWriter(file);
				BufferedWriter bw2 = new BufferedWriter(fw2);
				bw2.close();
			}
			FileWriter fw = new FileWriter(file , true);
			bw = new BufferedWriter(fw);
			bw.newLine();
			bw.write(dateFormat + " sender = " + sender + " receiver = " + receiver + " title = " + title+ " message = " + messageData );
                        bw.newLine();
                } catch (IOException ioe) {
			ioe.printStackTrace();			
		}
		finally
		{ 
			try{
				if(bw!=null)
					bw.close();
			}catch(Exception ex){
			}
		}
	}   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}