package mint.controllers

import groovy.util.logging.Slf4j
import mint.models.Account
import mint.services.AccountService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

//@RestController
//@Slf4j
class AccountController {

    @Autowired
    AccountService service

    @RequestMapping('/acct')
    String home(){
        service.getWelcome()
    }

    @RequestMapping("/acct/getAllAccounts")
    def getAccount(){
        service.getAllAccounts()
    }

    @RequestMapping("/acct/add")
    def addAccount(@RequestParam String firstName, @RequestParam String lastName, @RequestParam BigDecimal amount){
        service.addAccount(firstName, lastName, amount)
    }

    @RequestMapping("/acct/getAcct")
    Account getAccount(@RequestParam Long id){
        service.getAccount(id)
    }

    @RequestMapping("acct//removeAcct")
    def deleteAccount(@RequestParam Long id){
        service.removeAccount(id)
    }
}
