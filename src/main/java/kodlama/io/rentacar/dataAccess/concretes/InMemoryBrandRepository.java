package kodlama.io.rentacar.dataAccess.concretes;

import kodlama.io.rentacar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentacar.entities.concretes.Brand;

import java.util.ArrayList;
import java.util.List;

public abstract class InMemoryBrandRepository implements BrandRepository {

    List<Brand> brands;

    public InMemoryBrandRepository(){
        brands=new ArrayList<Brand>();
        brands.add(new Brand(1,"BWM"));
        brands.add(new Brand(2,"Mercedes"));
        brands.add(new Brand(3,"Audi"));
        brands.add(new Brand(4,"Fiat"));
        brands.add(new Brand(5,"Renault"));
    }


    @Override
    public List<Brand> getAll(){
        return brands;
    }

}
