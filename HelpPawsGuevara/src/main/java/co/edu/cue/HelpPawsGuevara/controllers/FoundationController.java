package co.edu.cue.HelpPawsGuevara.controllers;


import co.edu.cue.HelpPawsGuevara.mapping.dtos.FoundationDto;
import co.edu.cue.HelpPawsGuevara.services.impl.FoundationServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping

public class FoundationController {
    private final FoundationServiceImpl service;

    public FoundationController(FoundationServiceImpl service) {
        this.service = service;
    }
    @GetMapping("/foundation/create")
    public ModelAndView createFoundation(){
        ModelAndView modelAndView = new ModelAndView("formFoundation");
        return modelAndView;
    }
    @GetMapping("/foundation/list")
    public ModelAndView listFoundation(){
        ModelAndView modelAndView = new ModelAndView("foundationList");
        modelAndView.addObject("foundation", service.list());
        return modelAndView;
    }
    @GetMapping("/foundation/delete/{id}")
    public String delete(@PathVariable("id")Integer id){
        service.delete(id);
        return "redirect:/foundation/list";
    }
    @GetMapping("/foundation/update")
    public ModelAndView updateFoundation(){
        ModelAndView modelAndView = new ModelAndView("formFoundationUpdate");
        modelAndView.addObject("foundation", service.list());
        return modelAndView;
    }
    @PostMapping("/foundation/updated")
    public String updateFoundation(@RequestParam("id") int id,
                                 @RequestParam("name") String name,
                                 @RequestParam("address") String address,
                                 @RequestParam("phone") String phone) {

        FoundationDto foundationDto = FoundationDto.builder()
                .id(id)
                .name(name)
                .address(address)
                .phone(phone)
                .build();
        service.save(foundationDto);

        return "redirect:/foundation/update?continue";
    }


    @PostMapping("/foundation/new")
    public String createNewFoundation(@RequestParam("name") String name,
                                    @RequestParam("address") String address,
                                    @RequestParam("phone") String phone){

        FoundationDto foundationDto = FoundationDto.builder()
                .name(name)
                .address(address)
                .phone(phone)
                .build();
        service.save(foundationDto);

        return "redirect:/foundation/create?continue";
    }


}
