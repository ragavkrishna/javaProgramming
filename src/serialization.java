/**
 * author : Ragav Ramakrishnan
 * The program is used to demonstrate serialization in java. Objects can be stored in a file 
 * and can be retrieved for operations later. 
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * Class implements the serializable interface to indicate that objects in the class 
 * are serialized.
 */
public class serialization implements java.io.Serializable{
	/**
	 * The deafulat serial version id, that is eclipse prompted.
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String args[]) throws IOException, ClassNotFoundException{
		
		// Arraylist that will be serialized
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		
		String endtest = "This should be displayed";
		String googleExample = "Well, its all about testing";
		
		
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(4);
		al1.add(5);
		al1.add(6);
		
		try{
			// FileOUtputStream is used to write to a file/ file descriptor
			FileOutputStream file = new FileOutputStream("/Users/ragavramakrishnan/Desktop/Serialize/demo.ser");
			// Serialize the primitive date and graphs of Java Objects
			ObjectOutputStream out = new ObjectOutputStream(file);
			// Flush all the objects to the output stream
            out.writeObject(al);
            out.writeObject(googleExample);
            out.writeObject(endtest);
            out.writeInt(5);
            out.writeObject(al1);
		}
		catch (FileNotFoundException foe){
			System.out.println("Input Output Exception");
		}
		catch (IOException ioe){
			System.out.println("Input Output Exception");
		}
		// FileOutputStream is used to read from a file/ file descriptor
		FileInputStream file1 = new FileInputStream("/Users/ragavramakrishnan/Desktop/Serialize/demo.ser");
		//serialize the object/ primitive type
		ObjectInputStream in = new ObjectInputStream(file1);
		// Read the deserialized objects
		ArrayList<Integer> a1,a2 = new ArrayList<Integer>();
		a1 = (ArrayList<Integer>) in.readObject();
		System.out.println(a1);
		String s1 = (String) in.readObject();
		System.out.println(s1);
		String s2 = (String) in.readObject();
		System.out.println(s2);
		Integer int1 = (Integer) in.readInt();
		System.out.println(int1);
		a2 = (ArrayList<Integer>) in.readObject();
		System.out.println(a2);
	}
}
