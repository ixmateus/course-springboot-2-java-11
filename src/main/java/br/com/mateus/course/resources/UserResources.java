package br.com.mateus.course.resources;

import br.com.mateus.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (value = "/users")
public class UserResources {

    @GetMapping
    public ResponseEntity <User> findAll(){
        User u = new User(1L,"Mateus Monteiro", "mateus@gmail.com","956088553","123456");
        return ResponseEntity.ok().body(u);
    }
}
