import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class validationHandler {
    
    public boolean validateName(String name){
        
        String regx = "[^a-zA-Z]";
        Pattern pattern = Pattern.compile(regx,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(name);
        if(name.length()==0){
            JOptionPane.showMessageDialog(new JDialog(), "Name cannot be empty");
            return false;   
        }
        else if(matcher.find())
        {
            JOptionPane.showMessageDialog(new JDialog(), "Characters from a-z allowed only");
            return false;    
        }
        else
            return true;
    }
    
    public boolean validateEmail(String email){
        
        String regx = "^[a-zA-Z0-9.!#$%&’*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
        Pattern pattern = Pattern.compile(regx,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        if(email.length()==0){
            JOptionPane.showMessageDialog(new JDialog(), "Email cannot be empty");
            return false;   
        }
        else if(!matcher.find())
        {
            JOptionPane.showMessageDialog(new JDialog(), "Enter a valid email ");
            return false;    
        }
        else
            return true;
    }
    
    public boolean validateContact(String cno){
        
        String regx = "[^0-9]";
        Pattern pattern = Pattern.compile(regx,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(cno);
        if(matcher.find() && (cno.length()!=10))
        {
            JOptionPane.showMessageDialog(new JDialog(), "Enter a valid contact number ");
            return false;    
        }
        else
            return true;
    }
}
