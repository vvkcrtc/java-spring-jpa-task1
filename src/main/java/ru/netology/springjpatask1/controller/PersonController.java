package ru.netology.springjpatask1.controller;
import jakarta.annotation.security.RolesAllowed;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {


    @GetMapping("/all")
    public String getForAll() {
        return "For all users ...";
    }

    @GetMapping("/read")
    @Secured("ROLE_READ")
    public String getForRead() {
        return "Role read ...";
    }
    @GetMapping("/write")
    @RolesAllowed("ROLE_WRITE")
    public String getForWrite() {
        return "Role write ...";
    }
    @GetMapping("/delete")
    @PreAuthorize("hasRole('ROLE_WRITE') or hasRole('ROLE_DELETE')")
    public String getForDelete() {
        return "Role write and delete ...";
    }

    @GetMapping("/info")
    @PreAuthorize("#username == authentication.principal.username")
    public String greetingUser(@RequestParam("name") @Validated String username) {
        return "Hello "+username;
    }

}
