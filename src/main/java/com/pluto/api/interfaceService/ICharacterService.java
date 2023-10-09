package com.pluto.api.interfaceService;

import com.pluto.api.model.Character;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICharacterService {
    public Character findCharacter(int id);

    public Page<Character> listCharacters(Pageable pageable);
}
