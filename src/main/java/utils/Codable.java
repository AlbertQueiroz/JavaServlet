package utils;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.beanutils.BeanUtils;

public class Codable {
	public static void encode(Object object, Map request) {
		try {
			BeanUtils.populate(object, request);
		} catch (Exception e) {
			System.out.println("Could not encode object");
		}
	}
}
