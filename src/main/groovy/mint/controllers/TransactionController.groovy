package mint.controllers

import groovy.util.logging.Slf4j
import mint.models.Transaction
import mint.services.AccountService
import mint.services.TransactionService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@Slf4j
class TransactionController {

    @Autowired
    TransactionService service

    @Autowired
    AccountService accountService

    @RequestMapping('/tran')
    String home(){
        service.getWelcome()
    }

    @RequestMapping('/addTrn')
    def addTransaction(@RequestParam BigDecimal amount, @RequestParam String transactionType, @RequestParam Long key){
        service.addTransaction(new Transaction(amount: amount, transactionType: transactionType, key: key))
    }
}
