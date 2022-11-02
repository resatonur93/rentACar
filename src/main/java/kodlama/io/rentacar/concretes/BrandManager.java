package kodlama.io.rentacar.concretes;

import kodlama.io.rentacar.abstracts.BrandService;
import kodlama.io.rentacar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentacar.entities.concretes.Brand;

import java.util.List;

public class BrandManager implements BrandService {


    private final BrandRepository brandRepository;

    public BrandManager(BrandRepository brandsRepository) {
        super();
        this.brandRepository = brandsRepository;
    }

    @Override
    public List<Brand> getAll() {
        return brandRepository.getAll();
    }
}
