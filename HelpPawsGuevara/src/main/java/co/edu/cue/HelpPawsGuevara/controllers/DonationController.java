package co.edu.cue.HelpPawsGuevara.controllers;

import co.edu.cue.HelpPawsGuevara.domain.entities.Donation;
import co.edu.cue.HelpPawsGuevara.domain.entities.Foundation;
import co.edu.cue.HelpPawsGuevara.domain.enums.PayMethod;
import co.edu.cue.HelpPawsGuevara.services.DonationService;
import co.edu.cue.HelpPawsGuevara.services.FoundationService;
import co.edu.cue.HelpPawsGuevara.services.impl.DonationServiceImpl;
import co.edu.cue.HelpPawsGuevara.services.impl.FoundationServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.naming.Name;
import java.time.LocalDate;
import java.util.Date;

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

    @PostMapping("donation/new")
    public String createNewDonation(@RequestParam("name") String name,
                                    @RequestParam("amount") Double amount,
                                    @RequestParam("foundation") int foundationId,
                                    @RequestParam("payMethod") String payMethod){

        Donation donation = Donation.builder()
                .name(name)
                .amount(amount)
                .foundation(serviceFoundation.byId(foundationId))
                .date(LocalDate.now())
                .payMethod(PayMethod.valueOf(payMethod))
                .build();
        serviceDonation.save(donation);

        return "redirect:/donation/create?success";
    }
}
