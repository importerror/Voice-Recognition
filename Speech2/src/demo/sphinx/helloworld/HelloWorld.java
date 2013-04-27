/*
 * Copyright 1999-2004 Carnegie Mellon University.
 * Portions Copyright 2004 Sun Microsystems, Inc.
 * Portions Copyright 2004 Mitsubishi Electric Research Laboratories.
 * All Rights Reserved.  Use is subject to license terms.
 * 
 * See the file "license.terms" for information on usage and
 * redistribution of this file in the Sphinx package, and for a DISCLAIMER OF ALL
 * WARRANTIES.
 * 
 * i have just modified the actual HelloWorld.java file by adding few lines of code.
 * make sure you have a look on the grammar file that i have uploaded.
 * all the best.
 *
 */

package demo.sphinx.helloworld;

import edu.cmu.sphinx.frontend.util.Microphone;
import edu.cmu.sphinx.recognizer.Recognizer;
import edu.cmu.sphinx.result.Result;
import edu.cmu.sphinx.util.props.ConfigurationManager;
import edu.cmu.sphinx.util.props.PropertyException;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.speech.recognition.ResultToken;


/**
 * A simple HelloWorld demo showing a simple speech application 
 * built using Sphinx-4. This application uses the Sphinx-4 endpointer,
 * which automatically segments incoming audio into utterances and silences.
 */
public class HelloWorld {

    /**
     * Main method for running the HelloWorld demo.
     */
	static int i=1;
	static String resultText;
    public static void main(String[] args) {
        try {
            URL url;
           if (args.length > 0) {
               url = new File(args[0]).toURI().toURL();
            } else {
                url = HelloWorld.class.getResource("helloworld.config.xml");
            }

            System.out.println("Loading...");

            ConfigurationManager cm = new ConfigurationManager(url);

	    Recognizer recognizer = (Recognizer) cm.lookup("recognizer");
	    Microphone microphone = (Microphone) cm.lookup("microphone");


            /* allocate the resource necessary for the recognizer */
            recognizer.allocate();

            /* the microphone will keep recording until the program exits */
	    
            if (microphone.startRecording())
            {	
            	System.out.println("Say: (Command | Program| Browser | Bluetooth |  Device Manager |Power Options |Cal | Control | Player |task manager | Windows Security Center)");
            	System.out.println("Say: ( open word | open phot oshop|open Access|start Excel|start nero |start fire wall| open Pad |open Paint)");
            while (true) 
            {
            	
            	
		    System.out.println("Start speaking. Press Ctrl-C to quit.\n");

                    /*
                     * This method will return when the end of speech
                     * is reached. Note that the endpointer will determine
                     * the end of speech.
                     */ 
		  
		 
		    Result result = recognizer.recognize();
		    if (result != null)
		    {
		    	
		    		System.out.println("Enter your choise"+ "\n");
			 resultText = result.getBestFinalResultNoFiller();
			System.out.println("You said: " + resultText + "\n");
			
			if(resultText.equalsIgnoreCase("command"))
			{
				try{
				Process p;
				//resultText="";
				p = Runtime.getRuntime().exec("cmd /c start");
				//System.out.println("You said");
				
				 //resultText = result.getBestFinalResultNoFiller();
				//System.out.println("You said: " + resultText + "\n");
				
				}catch(Exception e){}
			}
			if (resultText.equalsIgnoreCase("Power Options"))
		    {
		        try{
		        Process p;	 
		        p = Runtime.getRuntime().exec("cmd /c powercfg.cpl");
		     
		        }catch(Exception ae){}
		    }
			if (resultText.equalsIgnoreCase("Blue"))
		    {
		        try{
		        Process p;	 
		        p = Runtime.getRuntime().exec("cmd /c fsquirt");
		     
		        }catch(Exception ae){}
		    }
			if (resultText.equalsIgnoreCase("start photo shop"))
		    {
		        try{
		        Process p;	 
		        p = Runtime.getRuntime().exec("cmd /c start photoshop");
		     
		        }catch(Exception ae){}
		    }
			if (resultText.equalsIgnoreCase("CAL"))
		    {
		        try{
		        Process p;	 
		        p = Runtime.getRuntime().exec("cmd /c calc");
		     
		        }catch(Exception ae){}
		    }
			if (resultText.equalsIgnoreCase("Windows Security Center"))
		    {
		        try{
		        Process p;	 
		        p = Runtime.getRuntime().exec("cmd /c wscui.cpl");
		     
		        }catch(Exception ae){}
		    }
			else if (resultText.equalsIgnoreCase("Player"))
		    {
		        try{
		        Process p;
		        p = Runtime.getRuntime().exec("cmd /c start wmplayer");
		        }catch(Exception ae){}
		    }
			else  if (resultText.equalsIgnoreCase("Programs"))
		    {
		        try{
		        Process p;
		        p = Runtime.getRuntime().exec("cmd /c start appwiz.cpl");
		        }catch(Exception ae){}
		    }
			 else if (resultText.equalsIgnoreCase("Control"))
			    {
			        try{
			        Process p;
			        p = Runtime.getRuntime().exec("cmd /c control");
			        }catch(Exception ae){}
			    }
			else if(resultText.equalsIgnoreCase("open paint"))
			{	 try{
				        Process p;
				        p = Runtime.getRuntime().exec("cmd /c start mspaint");
				        }catch(Exception ae){}
			}
			else if (resultText.equalsIgnoreCase("Browser"))
		    {
		        try{
		        Process p; 
		        p = Runtime.getRuntime().exec("cmd /c iexplore");
		        }catch(Exception ae){}
		     }
			else if(resultText.equalsIgnoreCase("task manager"))
				{	 try{
			        Process p;
			        p = Runtime.getRuntime().exec("cmd /c start taskmgr.exe");
			        }catch(Exception ae){}
		}
			else if (resultText.equalsIgnoreCase("open pad"))
		    {
		        try{
		        Process p; 
		        p = Runtime.getRuntime().exec("cmd /c start notepad");
		        }catch(Exception ae){}
		     }
			else if (resultText.equalsIgnoreCase("open word"))
		    {
		        try{
		        Process p;	 
		        p = Runtime.getRuntime().exec("cmd /c start winword");
		        }catch(Exception ae){}
		     }
			
			else if (resultText.equalsIgnoreCase("start Excel"))
		    {
		        try{
		        Process p;	 
		        p = Runtime.getRuntime().exec("cmd /c start excel");
		        }catch(Exception ae){}
		     }
			else if (resultText.equalsIgnoreCase("start firewall"))
		    {
		        try{
		        Process p;	
		        p = Runtime.getRuntime().exec("cmd /c start firewall.cpl");
		        }catch(Exception ae){}
		     }
			else if (resultText.equalsIgnoreCase("start nero"))
		    {
		        try{
		        Process p; 
		        p = Runtime.getRuntime().exec("cmd /c start nero");
		        }catch(Exception ae){}
		     }
			else if (resultText.equalsIgnoreCase("open Access"))
		    {
		        try{
		        Process p;	 
		        p = Runtime.getRuntime().exec("cmd /c start msaccess");
		        }catch(Exception ae){}
		     }
			else if (resultText.equalsIgnoreCase("Device Manager"))
			    {
			        try{
			        Process p;	 
			        p = Runtime.getRuntime().exec("cmd /c start devmgmt.msc");
			        }catch(Exception ae){}
			     }
		
		    }
		    
	    	else
		   	{
						System.out.println("I can't hear what you said.\n");
		    }
       }
	   } 
        else
        {
        	System.out.println("Cannot start microphone.");
        	recognizer.deallocate();
        	System.exit(1);
	    }
            
        } catch (IOException e) {
            System.err.println("Problem when loading HelloWorld: " + e);
            e.printStackTrace();
        } catch (PropertyException e) {
            System.err.println("Problem configuring HelloWorld: " + e);
            e.printStackTrace();
        } catch (InstantiationException e) {
            System.err.println("Problem creating HelloWorld: " + e);
            e.printStackTrace();
        }
        
    }
}