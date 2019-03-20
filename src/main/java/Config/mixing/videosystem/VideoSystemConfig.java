package Config.mixing.videosystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({DVDConfig.class, DVDPlayerConfig.class}) //두 클래스를 다 가져오기 위해서
public class VideoSystemConfig {

}
