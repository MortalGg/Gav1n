package annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AnnotationUser {
		@Value("guoxiaogang")
		private String uname;

		public String getUname() {
		    return uname;
		}
}
