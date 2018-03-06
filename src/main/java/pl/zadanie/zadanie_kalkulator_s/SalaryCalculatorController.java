package pl.zadanie.zadanie_kalkulator_s;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

//@RestController
@Controller
@RequestMapping("/v1/start")
public class SalaryCalculatorController {
    @Autowired
    SalaryProcessor salaryProcessor;

    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "start", method = RequestMethod.GET)
    public String result(@RequestParam("dailyPay") double dailyPay, @RequestParam("country") String country, ModelMap modelMap){
        modelMap.addAttribute("salary",salaryProcessor.process(dailyPay,country));
        return "result";
    }

}
