package com.codegym.cms.service.provinceService;

import com.codegym.cms.model.Province;

public interface ProvinceService {
    Iterable<Province> findAll();
    Province findById(Long id);
    void save(Province province);
    void delete(Long id);
}
