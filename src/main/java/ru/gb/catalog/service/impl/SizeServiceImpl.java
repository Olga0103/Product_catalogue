package ru.gb.catalog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.gb.catalog.dto.SizeDTO;
import ru.gb.catalog.entity.Size;
import ru.gb.catalog.repository.SizeRepository;
import ru.gb.catalog.service.SizeService;
import java.util.ArrayList;
import java.util.List;

@Service
public class SizeServiceImpl implements SizeService {

    @Autowired
    private SizeRepository sizeRepository;

    @Override
    public List<SizeDTO> getAllSize() {
        List<Size> sizes = sizeRepository.findAll();
        return mapToSizeDTO(sizes);
    }

    private List<SizeDTO> mapToSizeDTO(List<Size> sizes) {
        List<SizeDTO> sizeDTOList = new ArrayList<>();
        sizes.forEach(size -> {
            SizeDTO sizeDTO = new SizeDTO();
            sizeDTO.setSizeCode(size.getCode());
            sizeDTO.setSizeId(size.getId());
            sizeDTOList.add(sizeDTO);
        });
        return sizeDTOList;
    }
}
