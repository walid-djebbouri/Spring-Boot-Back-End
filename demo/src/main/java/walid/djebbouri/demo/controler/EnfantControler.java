package walid.djebbouri.demo.controler;

import org.springframework.web.bind.annotation.*;
import walid.djebbouri.demo.dto.EnfantDto;
import walid.djebbouri.demo.entities.Enfant;
import walid.djebbouri.demo.service.EnfantService;

@RestController
@RequestMapping("api/enfant")

public class EnfantControler {

    private final EnfantService enfantService;

    public EnfantControler(EnfantService enfantService) {
        this.enfantService = enfantService;

    }

    @PostMapping("/add")
    public void addEnfant(@RequestBody EnfantDto enfant) {
        this.enfantService.addEnfant(enfant);
    }

    @GetMapping("/get/{id}")
    public Enfant getEnfant(@PathVariable Long id) {
        return this.enfantService.getEnfant(id);
    }
}
