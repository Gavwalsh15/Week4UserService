package ie.atu.week4userservice;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "confirmation-service", url = "${feign.url}")
public interface RegistrationServiceClient {
    @PostMapping("/confirm")
    String userDetails(@RequestBody UserDetails userDetails);
}
