package nowpat;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Patryk on 2017-03-04.
 */
@RestController
@RequestMapping("/Rest1/person")
public class PersonController {

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> addPerson(@RequestBody Person person) {
        System.out.println("added peson " + person.name);
        return ResponseEntity.status(HttpStatus.CREATED).body("added");
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Person> getPersonById(@PathVariable Long id) {
        return ResponseEntity.ok(new Person(1l, "test person"));
    }
}
