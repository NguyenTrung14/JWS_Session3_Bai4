package com.example.session3_bai4.controller;

import com.example.session3_bai4.model.SinhVien;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SinhVienController {

    @GetMapping(
            value = "/sinhvien",
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public List<SinhVien> getSinhVien() {
        return List.of(
                new SinhVien("SV001", "Nguyen Van A", 8.5),
                new SinhVien("SV002", "Tran Thi B", 7.8),
                new SinhVien("SV003", "Le Van C", 9.0)
        );
    }
}
