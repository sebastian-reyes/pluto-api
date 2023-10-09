package com.pluto.api.rest;

import com.pluto.api.interfaceService.ICharacterService;
import com.pluto.api.model.Character;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/character")
public class CharacterRestController {

    @Autowired
    private ICharacterService service;

    @GetMapping("/page/{page}")
    public Page<Character> getCharacters(@PathVariable Integer page){
        return service.listCharacters(PageRequest.of(page,8));
    }
}
