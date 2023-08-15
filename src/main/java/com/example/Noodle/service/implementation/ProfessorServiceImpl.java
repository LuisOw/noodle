package com.example.Noodle.service.implementation;

import com.example.Noodle.dto.ProfessorDto;
import com.example.Noodle.model.Professor;
import com.example.Noodle.repository.ProfessorRepository;
import com.example.Noodle.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class ProfessorServiceImpl implements UserService<Professor, ProfessorDto> {

    @Autowired
    private ProfessorRepository repository;

    @Override
    public Page<ProfessorDto> getUser(Pageable pageable) {
        var professorPage = repository.findAll(pageable);
        return new PageImpl<>(professorPage.stream().map(ProfessorDto::toDto).toList(), professorPage.getPageable(),
                professorPage.getNumberOfElements());
    }

    @Override
    public ProfessorDto createUser(ProfessorDto userDto) {
        var professor = ProfessorDto.fromDto(userDto);
        return ProfessorDto.toDto(repository.save(professor));

    }
}
