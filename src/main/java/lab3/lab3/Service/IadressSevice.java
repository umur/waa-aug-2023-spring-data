package lab3.lab3.Service;

import lab3.lab3.Model.Adress;

import java.util.List;

public interface IadressSevice {

    public void save(Adress adress);
    public List<Adress> getAll();
    public Adress getAdressById(int id);
    public void deleteAdressById(int id);
    public void update(int id, Adress adress);

}
