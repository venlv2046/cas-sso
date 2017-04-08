import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.HashMap;
import java.util.Map;

public class MD5Util {

	public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchProviderException {
		final MessageDigest messageDigest = MessageDigest.getInstance("MD5");
		  final byte[] digest = messageDigest.digest("root".getBytes());
		  BigInteger bigInteger = new BigInteger(1, digest);  
	       System.out.println(bigInteger.toString(16));;
	}
}
