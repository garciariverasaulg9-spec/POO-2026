package com.gremio.controller;

import com.gremio.model.Contacto;
import com.gremio.repository.ContactoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactoController {

    private final ContactoRepository repo;

    // Spring inyecta el repository automáticamente
    public ContactoController(ContactoRepository repo) {
        this.repo = repo;
    }

    // GET /contactos → muestra la lista
    @GetMapping("/contactos")
    public String listar(Model model) {
        model.addAttribute("contactos", repo.findAll());
        return "contactos";
    }

    // GET /nuevo → muestra el formulario vacío (modo "crear")
    @GetMapping("/nuevo")
    public String formulario(Model model) {
        model.addAttribute("contacto", new Contacto());
        return "nuevo";
    }

    // GET /editar/{id} → muestra el formulario con los datos cargados (modo "editar")
    @GetMapping("/editar/{id}")
    public String formularioEditar(@PathVariable Long id, Model model) {
        Contacto contacto = repo.findById(id)
                                 .orElseThrow(() -> new IllegalArgumentException(
                                     "Contacto no encontrado: " + id));
        model.addAttribute("contacto", contacto);
        return "nuevo";
    }

    // POST /guardar → recibe el formulario y guarda en BD
    // Si el Contacto trae id (viene de /editar), save() hace UPDATE.
    // Si no trae id (viene de /nuevo), save() hace INSERT.
    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Contacto contacto) {
        repo.save(contacto);
        return "redirect:/contactos";
    }

    // GET /eliminar/{id} → borra el contacto y regresa a la lista
    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        repo.deleteById(id);
        return "redirect:/contactos";
    }
}
