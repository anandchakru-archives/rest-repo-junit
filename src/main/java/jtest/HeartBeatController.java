package jtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeartBeatController {
	@GetMapping("/hb")
	public String heatbeat() {
		return System.currentTimeMillis() + ": Heartbeat";
	}
}
