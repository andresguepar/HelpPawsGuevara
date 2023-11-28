package co.edu.cue.HelpPawsGuevara.controllers;

import co.edu.cue.HelpPawsGuevara.domain.enums.PayMethod;
import co.edu.cue.HelpPawsGuevara.mapping.dtos.DonationDto;
import co.edu.cue.HelpPawsGuevara.mapping.mappers.FoundationMapper;
import co.edu.cue.HelpPawsGuevara.services.impl.DonationServiceImpl;
import co.edu.cue.HelpPawsGuevara.services.impl.FoundationServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

@Controller
@RequestMapping
public class DonationController {

   private final DonationServiceImpl serviceDonation;
    private final FoundationServiceImpl serviceFoundation;

    public DonationController(DonationServiceImpl serviceDonation, FoundationServiceImpl serviceFoundation) {
        this.serviceDonation = serviceDonation;
        this.serviceFoundation = serviceFoundation;
    }

    @GetMapping("donation/create")
    public ModelAndView createDonation() {
        ModelAndView modelAndView = new ModelAndView("formDonation");
        modelAndView.addObject("foundation", serviceFoundation.list());
        return modelAndView;
    }

    @GetMapping("donation/list")
    public ModelAndView listDonation(){
        ModelAndView modelAndView = new ModelAndView("donationList");
        modelAndView.addObject("donation", serviceDonation.list());
        return modelAndView;
    }

    @PostMapping("donation/new")
    public String createNewDonation(@RequestParam("name") String name,
                                    @RequestParam("amount") Double amount,
                                    @RequestParam("foundation") Integer foundationId,
                                    @RequestParam("payMethod") String payMethod){

        DonationDto donationDto = DonationDto.builder()
                .name(name)
                .amount(amount)
                .foundation(FoundationMapper.mapFrom(serviceFoundation.byId(foundationId)))
                .date(LocalDate.now())
                .payMethod(PayMethod.valueOf(payMethod))
                .build();
        serviceDonation.save(donationDto);

        return "redirect:/donation/create?success";
    }
}
