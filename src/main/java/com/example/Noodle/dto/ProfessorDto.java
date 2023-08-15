package com.example.Noodle.dto;

import com.example.Noodle.model.Department;
import com.example.Noodle.model.Professor;
import org.springframework.beans.BeanUtils;

public class ProfessorDto extends UserDto {
    private Department department;

    public static Professor fromDto(ProfessorDto dto) {
        Professor professor = new Professor();
        BeanUtils.copyProperties(dto, professor);
        return professor;
    }

    public static ProfessorDto toDto(Professor professor) {
        ProfessorDto dto = new ProfessorDto();
        BeanUtils.copyProperties(professor, dto);
        return dto;
    }
}
