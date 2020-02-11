package nowpat.controller;

import lombok.extern.slf4j.Slf4j;
import nowpat.entity.Person;
import nowpat.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Patryk on 2017-03-04.
 */
@RestController
@RequestMapping("/Rest1/person")
@Slf4j
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> addPerson(@RequestBody Person person) {
        personRepository.save(person);
        log.info("added peson {}", person.getName());
        return ResponseEntity.status(HttpStatus.CREATED).body("added");
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Person> getPersonById(@PathVariable Long id) {
        return ResponseEntity.ok(personRepository.findOne(id));
    }
}
