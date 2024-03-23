package controller;

import it.be.api.login.LoginApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController implements LoginApi {

    @Override
    public ResponseEntity<String> testGet() {
        return ResponseEntity.ok("ciao");
    }
}
