package org.web3j.txpool;

import java.util.Collections;

import org.web3j.protocol.Web3jService;
import org.web3j.protocol.core.JsonRpc2_0Web3j;
import org.web3j.protocol.core.Request;
import org.web3j.txpool.methods.response.*;

/**
 * Txpool JSON-RPC API implementation.
 */
public class JsonRpc2_0Txpool extends JsonRpc2_0Web3j implements Txpool {

    public JsonRpc2_0Txpool(Web3jService web3jService) {
        super(web3jService);
    }

    @Override
    public Request<?, EthTxpoolStatus>txpoolStatus() {
        return new Request<>(
                "txpool_status",
                Collections.<String>emptyList(),
                ID,
                web3jService,
                EthTxpoolStatus.class);
    }

}
