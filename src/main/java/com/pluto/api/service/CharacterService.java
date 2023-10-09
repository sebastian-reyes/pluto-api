package com.pluto.api.service;

import com.pluto.api.interfaceService.ICharacterService;
import com.pluto.api.model.Character;
import com.pluto.api.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CharacterService implements ICharacterService {

    @Autowired
    private CharacterRepository repository;

    @Override
    public Character findCharacter(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Page<Character> listCharacters(Pageable pageable) {
        return repository.findAll(pageable);
    }
}
