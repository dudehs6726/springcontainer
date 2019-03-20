package Config.mixing.videosystem;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.douzone.springcontainer.videosystem.DVDPlayer;
import com.douzone.springcontainer.videosystem.DigitalVideoDisc;

@Configuration
@Import(DVDConfig.class) //dvd 정보를 가져옴
public class DVDPlayerConfig {

	@Bean //@Qualifier 빈이 다수 발견되기 때문에 지정하여 가져 옴
	public DVDPlayer dvdPlayer(@Qualifier("avengersInfinityWar") DigitalVideoDisc dvd) {
		return new DVDPlayer(dvd);
	}
}
