package walid.djebbouri.demo.controler;

import org.springframework.web.bind.annotation.*;
import walid.djebbouri.demo.dto.PereDto;
import walid.djebbouri.demo.service.PereService;

@RestController
@RequestMapping("api/pere")
public class PereControler {
    private final PereService pereService;

    public PereControler(PereService pereService) {
        this.pereService = pereService;
    }

    @PostMapping("/add")
    public void addPere(@RequestBody PereDto pere) {
        pereService.addPere(pere);
    }

    @GetMapping("/get/{id}")
    public PereDto  getPere(@PathVariable Long id) {
        return  pereService.getParentAndHisChildrenAndHomesById(id);
    }


    @GetMapping("/getCompleteParent/{id}")
    public PereDto getCompleteParent(@PathVariable Long id) {
        return pereService.findWithHomesAndEnfantsById(id);
    }

    @GetMapping("/getSimple/{id}")
    public PereDto getSimplePere(@PathVariable Long id) {
        return pereService.findSimpleParent(id);
    }


}
