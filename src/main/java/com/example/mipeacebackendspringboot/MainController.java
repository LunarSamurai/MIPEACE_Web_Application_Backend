package com.example.mipeacebackendspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // This means that this class is a Controller
@RequestMapping(path = "/demo") // This means URL's start with /demo (after Application path)
public class MainController {
  private final UserRepository userRepository;
  private Integer nextPosition;

  public MainController(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @PostMapping(path = "/add") // Map ONLY POST Requests
  public @ResponseBody String addNewUser(@RequestParam String firstName, @RequestParam String middleName,
      @RequestParam String lastName, @RequestParam String cacid) {
    // @ResponseBody means the returned String is the response, not a view name
    // @RequestParam means it is a parameter from the GET or POST request
    User newUser = new User();
    newUser.setId(newUser.getId());
    newUser.setFirstName(firstName);
    newUser.setMiddleName(middleName);
    newUser.setLastName(lastName);
    newUser.setCACID(cacid);
    userRepository.save(newUser);
    return "Saved";
  }

  @PostMapping(path = "/remove")
  public @ResponseBody String removeNewUser(@RequestParam String name, @RequestParam String cacid) {

    return null;
  }

  @GetMapping(path = "/all")
  public @ResponseBody Iterable<User> getAllUsers() {
    // This returns a JSON or XML with the users
    return userRepository.findAll();
  }
}