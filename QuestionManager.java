import java.util.*;

public class QuestionManager {
	
	// This class is to make and add questions.
	public static Question[] getQuestion() {
		ArrayList<Question> ret = new ArrayList<Question>();
		
		ret.add(new Question("What wireless technology is most frequently used for wireless payment solutions?",new String[] {"A. Cellular", "B. Bluetooth", "C. NFC", "D. USB"}, 'C'));
		ret.add(new Question("What hardware device is used to create the hardware root of trust for modern desktops and laptops?", new String[] {"A. System memory", "B. A HSM", "C. The CPU", "D. The TPM"}, 'D'));
		ret.add(new Question("Which if the following is not a capability provided by S/MIME when it is used to protect attachments for email?",new String[] {"A. Authentication", "B. Nonrepudiation of the sender", "C. Message integrity", "D. Data security for the email headers"}, 'D'));
		ret.add(new Question("Which of the following is the least volatile according to the forensic order of volatility?",new String[] {"A. The system’s routing table", "B. Logs", "C. Temp files", "D. CPU registers"}, 'B'));
		ret.add(new Question("What term best describes data that is being sent between two systems over a network connection?",new String[] {"A. Data at rest", "B. Data in motion", "C. Data in processing", "D. Data in use"}, 'B'));
		
		Question[] tmp = new Question[ret.size()];
		
		return ret.toArray(tmp);
	}
}
