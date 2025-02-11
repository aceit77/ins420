import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class MD5 {
    public static String toHexString(byte[] hash){
        BigInteger number = new BigInteger(1,hash);
        StringBuilder hexString = new StringBuilder(number.toString(16));
		
        while(hexString.length () > 32){
            hexString.insert(0,'0'); 
        }
        return hexString.toString();
    }
    
    public static void main(String args[])throws NoSuchAlgorithmException{
        try{
            System.out.println("HashCode Generated by MD5 for: ");
            String s1 = "Information and Security";
            MessageDigest md;
            md = MessageDigest.getInstance("MD5");
            byte[] hash = md.digest(s1.getBytes(StandardCharsets.UTF_8));
            
            System.out.println("Message Digest : " + s1 + " : " + toHexString(hash));  
        }
		
        catch(NoSuchAlgorithmException e){
            System.out.println("Exception throw for incorrect algorithm : "+e);   
        }
            
    }
    
}