
package wizut.tpsi.springlab1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CalculatorController {
    
    //@RequestMapping("/")
    //public String home(Model model, Integer  x, Integer y, String nazwa) {
        
// <editor-fold desc="Zadanie 1">
        /*
        if(x == null) x = 0;
        if(y == null) y = 0;
        model.addAttribute("y", y);
        model.addAttribute("x", x);
        Integer z = x + y;
        model.addAttribute("z", z);
        return "home";
*/
        // </editor-fold>
        
    
// <editor-fold desc="Zadanie 2">
        /*
        if(x == null) x = 0;
        if(y == null) y = 0;
        Integer z=0;
        String znak="";
        switch(nazwa){
            case "dodawanie":
                z = x + y;
                znak = "+";
                break;
            case "odejmowanie":
                z = x - y;
                znak = "-";
                break;
            case "mnozenie":
                z = x * y;
                znak = "*";
                break;
        }
        model.addAttribute("nazwa", nazwa);    
        model.addAttribute("znak", znak);
        model.addAttribute("y", y);
        model.addAttribute("x", x);
        model.addAttribute("z", z);
        return "home";
        */
        // </editor-fold>
        
    
// <editor-fold  desc="Zadanie 3">
    @RequestMapping("/")
    public String home(Model model, String nazwa, CalculatorForm dane) {
        if(dane.getX() == null) dane.setX(0);
        if(dane.getY() == null) dane.setY(0);
        if(dane.getZ() == null) dane.setZ(0);
        if(dane.getZnak() == null) dane.setZnak("+");
        if(nazwa != null){
            switch(nazwa){
                case "dodawanie":
                    dane.setZ(dane.getX() + dane.getY());
                    dane.setZnak("+");
                    break;
                case "odejmowanie":
                    dane.setZ(dane.getX() - dane.getY());
                    dane.setZnak("-");
                    break;
                case "mnozenie":
                    dane.setZ(dane.getX() * dane.getY());
                    dane.setZnak("*");
                    break;
            }
        }
        model.addAttribute("znak",dane.getZnak());
        model.addAttribute("x", dane.getX());
        model.addAttribute("y", dane.getY());
        model.addAttribute("z", dane.getZ());
        return "home";
    // </editor-fold>
    
    
    
    }
    
}
