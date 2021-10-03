package ru.gb.catalog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.gb.catalog.dto.ColorDTO;
import ru.gb.catalog.entity.Color;
import ru.gb.catalog.repository.ColorRepository;
import ru.gb.catalog.service.ColorService;
import java.util.ArrayList;
import java.util.List;

@Service
public class ColorServiceImpl implements ColorService {

    @Autowired
    private ColorRepository colorRepository;

    @Override
    public List<ColorDTO> getAllColors() {
        List<Color> colors = colorRepository.findAll();
        return mapToColorDTO(colors);
    }

    private List<ColorDTO> mapToColorDTO(List<Color> colors) {
        List<ColorDTO> colorDTOList = new ArrayList<>();
        colors.forEach(color -> {
            ColorDTO colorDTO = new ColorDTO();
            colorDTO.setColorName(color.getName());
            colorDTO.setColorId(color.getId());
            colorDTOList.add(colorDTO);
        });
        return colorDTOList;
    }
}
