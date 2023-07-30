package lab3.lab3.Service.IMP;

import lab3.lab3.Model.Adress;
import lab3.lab3.Repository.AdressRepo;
import lab3.lab3.Service.IadressSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdressService implements IadressSevice {
    @Autowired
    public AdressRepo adressRepo;
    @Override
    public void save(Adress adress) {
        adressRepo.save(adress);
    }

    @Override
    public List<Adress> getAll() {
        return adressRepo.findAll();
    }

    @Override
    public Adress getAdressById(int id) {
        return adressRepo.findById(id).get();
    }

    @Override
    public void deleteAdressById(int id) {
adressRepo.deleteById(id);
    }

    @Override
    public void update(int id, Adress adress) {

    }
}
