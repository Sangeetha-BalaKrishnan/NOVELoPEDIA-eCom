package eComProject.NOVELoPEDIA.util;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

public class fileUploadUtility {

	private static final String ABS_PATH = "D:\\maven-Project\\NOVELoPEDIA-eCom\\NOVELoPEDIA\\src\\main\\webapp\\resources\\images\\";
	private static String REAL_PATH = "";

	private static final Logger logger = LoggerFactory.getLogger(fileUploadUtility.class);

	public static void uploadFile(HttpServletRequest request, MultipartFile file, String code) {

		// Get the real path
		REAL_PATH = request.getSession().getServletContext().getRealPath("/resources/images/");

		logger.info(REAL_PATH);

		// To Check the directories exist or else create it
		if (!new File(ABS_PATH).exists()) {

			// Create the directories
			new File(ABS_PATH).mkdirs();
		}

		if (!new File(REAL_PATH).exists()) {

			// Create the directories
			new File(REAL_PATH).mkdirs();
		}

		try{
			
			//Server Upload
			file.transferTo(new File(REAL_PATH+code+".jpg"));
			
			//project Upload
			file.transferTo(new File(ABS_PATH+code+".jpg"));
			
		}
		catch(IOException ex){
			
		}
	
	
	
	
	
	}

}
