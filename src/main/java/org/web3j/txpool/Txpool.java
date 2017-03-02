package org.web3j.txpool;

import org.web3j.protocol.Web3j;
import org.web3j.protocol.Web3jService;
import org.web3j.protocol.core.Request;
import org.web3j.txpool.methods.response.EthTxpoolStatus;


/**
 * JSON-RPC Request object building factory for Txpool.
 */
public interface Txpool extends Web3j {
    static Txpool build(Web3jService web3jService) {
        return new JsonRpc2_0Txpool(web3jService);
    }

    Request<?, EthTxpoolStatus> txpoolStatus();

}
