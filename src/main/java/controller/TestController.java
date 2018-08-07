package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import service.*;
import javax.transaction.TransactionManager;

/**
 * @author shabab
 * @since 7/30/18
 */
@Controller
public class TestController {

    @Autowired
    private TransactionManager userTransactionManager;

    @Autowired
    private MandatoryService mandatoryService;

    @Autowired
    private RequiredService requiredService;

    @Autowired
    private NeverService neverService;

    @Autowired
    private SupportService supportService;

    @Autowired
    private NotSupportedService notSupportedService;

    @Autowired
    private RequiresNewService requiresNewService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {

        return "index";
    }

    @RequestMapping(value = "result", method = RequestMethod.GET)
    public String result(@RequestParam("transaction") String transaction) {

        if(transaction.equals("required"))
        {
            requiredService.getId();

            try {
                System.out.println(userTransactionManager);

                userTransactionManager.begin();

                requiredService.getId();
                System.out.println(userTransactionManager);

                userTransactionManager.commit();

            } catch (Exception e) {

                e.printStackTrace();
            }

        } else if(transaction.equals("requires_new")) {
            requiresNewService.getId();

            try {
                System.out.println(userTransactionManager);

                userTransactionManager.begin();

                requiresNewService.getId();
                System.out.println(userTransactionManager);

                userTransactionManager.commit();

            } catch (Exception e) {

                e.printStackTrace();
            }

        } else if(transaction.equals("mandatory")) {

            mandatoryService.getId();

            try {
                System.out.println(userTransactionManager);

                userTransactionManager.begin();

                mandatoryService.getId();
                System.out.println(userTransactionManager);

                userTransactionManager.commit();

            } catch (Exception e) {

                e.printStackTrace();
            }

        } else if(transaction.equals("supports")) {

            supportService.getId();

            try {
                System.out.println(userTransactionManager);

                userTransactionManager.begin();

                supportService.getId();
                System.out.println(userTransactionManager);

                userTransactionManager.commit();

            } catch (Exception e) {

                e.printStackTrace();
            }

        } else if(transaction.equals("not_supported")) {
            notSupportedService.getId();

            try {
                System.out.println(userTransactionManager);

                userTransactionManager.begin();

                notSupportedService.getId();
                System.out.println(userTransactionManager);

                userTransactionManager.commit();

            } catch (Exception e) {

                e.printStackTrace();
            }

        } else {
            //never
            neverService.getId();

            try {
                System.out.println(userTransactionManager);

                userTransactionManager.begin();

                neverService.getId();
                System.out.println(userTransactionManager);

                userTransactionManager.commit();

            } catch (Exception e) {

                e.printStackTrace();
            }
        }

        return "index";
    }

}
