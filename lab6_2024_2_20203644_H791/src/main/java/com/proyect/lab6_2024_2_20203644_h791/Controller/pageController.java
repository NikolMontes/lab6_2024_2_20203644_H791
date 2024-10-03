package com.proyect.lab6_2024_2_20203644_h791.Controller;
import com.proyect.lab6_2024_2_20203644_h791.Entity.Evento;
import com.proyect.lab6_2024_2_20203644_h791.Repository.EventoRepsitory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping({"/"," ","eventos"})
public class pageController {

    final EventoRepsitory eventoRepsitory;
    public pageController(EventoRepsitory eventoRepsitory){
        this.eventoRepsitory=eventoRepsitory;
    }

    @GetMapping({"/inicio","eventos"})
    public String vistainicial(Model model){

        model.addAttribute("lista", eventoRepsitory.findAll());

        return "inicio";
    }

    @GetMapping("/eventos/edicion")
    public String edicion(){
        return "inicio";
    }



}
