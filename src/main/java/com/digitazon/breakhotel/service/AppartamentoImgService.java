package com.digitazon.breakhotel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitazon.breakhotel.model.AppartamentoImg;
import com.digitazon.breakhotel.repository.AppartamentoImgRepository;

@Service
public class AppartamentoImgService {

    @Autowired
    AppartamentoImgRepository appartamentoImgRepository;

    public AppartamentoImg save(AppartamentoImg appartamentoImg) {
        return appartamentoImgRepository.save(appartamentoImg);
    }
}
