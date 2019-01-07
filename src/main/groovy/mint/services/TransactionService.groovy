package mint.services

import groovy.util.logging.Slf4j
import mint.config.AppConfig
import mint.models.Transaction
import mint.repos.TransactionRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
@Slf4j
class TransactionService {

    @Autowired
    TransactionRepo transactionRepo

    @Autowired
    AppConfig config

    def getWelcome(){
        config.message
    }

    def addTransaction(Transaction transaction){
        transactionRepo.save(transaction)
        log.info('Transaction Added')
    }

    def getTransaction(long id) {
        transactionRepo.findByTransactionId(id)
    }

    def getAllTransactions(long memberId) {
        transactionRepo.findByMemberId(memberId)
    }
}

