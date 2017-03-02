package org.web3j.txpool.methods.response;

import org.web3j.utils.Numeric;

import java.math.BigInteger;

/**
 * Created by fernando on 2/17/17.
 */
public class TxpoolStatus
{
    private String pending;
    private String queued;

    public void setPending(String pending)
    {
        this.pending = pending;
    }

    public void setQueued(String queued)
    {
        this.queued = queued;
    }

    public BigInteger getQueued()
    {
        return Numeric.decodeQuantity(queued);
    }

    public BigInteger getPending()
    {
        return Numeric.decodeQuantity(pending);
    }
}
