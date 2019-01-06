package mint.services

import groovy.util.logging.Slf4j
import mint.config.AppConfig
import mint.models.Account
import mint.repos.AccountRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
@Slf4j
class AccountService {

    @Autowired
    AppConfig config

    @Autowired
    AccountRepo accountRepo

    def getWelcome(){
        config.message
    }

    def getAllAccounts(){
        accountRepo.findAll()
    }

    def addAccount(firstName, lastName, amount){
        accountRepo.save(new Account(firstName: firstName, lastName: lastName, amount: amount))
    }

    Account getOneAccount(id){
        accountRepo.findByMemberId(id)
    }

    def removeAccount(Long id){
        log.info("Deleting Account by ID: ${id} - ${accountRepo.findByMemberId(id).getLastName()}, " +
                "${accountRepo.findByMemberId(id).getFirstName()}")
        accountRepo.deleteById(id)
        log.info("Deleted")
    }

    boolean exists(){

    }
}
