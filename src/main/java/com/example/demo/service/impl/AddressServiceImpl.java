package com.example.demo.service.impl;

import com.example.demo.dto.AddressDto;
import com.example.demo.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {
    @Override
    public void save(AddressDto addressDto) {

    }

    @Override
    public List<AddressDto> getAll() {
        return null;
    }

    @Override
    public AddressDto getById(int id) {
        return null;
    }

    @Override
    public void update(AddressDto addressDto, int id) {

    }

    @Override
    public void delete(int id) {

    }
}
