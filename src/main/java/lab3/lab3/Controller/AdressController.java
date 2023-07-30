package lab3.lab3.Controller;

import lab3.lab3.Model.Adress;
import lab3.lab3.Service.IadressSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("adress")
public class AdressController {
    @Autowired
    private IadressSevice iadressSevice;

    @PostMapping
    public void save(@RequestBody Adress adress){
        iadressSevice.save(adress);
    }
    @GetMapping
    public List<Adress> getAll(){
        return iadressSevice.getAll();
    }
    @GetMapping("/{id}")
    public Adress getAdressById(@PathVariable int id){
        return iadressSevice.getAdressById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteAdressById(@PathVariable int id){
       iadressSevice.deleteAdressById(id);
    }
}
