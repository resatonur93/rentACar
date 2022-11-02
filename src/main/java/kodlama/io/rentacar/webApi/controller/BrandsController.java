package kodlama.io.rentacar.webApi.controller;

import kodlama.io.rentacar.abstracts.BrandService;
import kodlama.io.rentacar.entities.concretes.Brand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandsController {
    private final BrandService brandService;


    public BrandsController(BrandService  brandService) {
        this.brandService = brandService;
    }

    public List<Brand> getAll(){
        return brandService.getAll();
    }

}
