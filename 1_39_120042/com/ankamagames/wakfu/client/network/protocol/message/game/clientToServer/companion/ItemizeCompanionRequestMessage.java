package com.ankamagames.wakfu.client.network.protocol.message.game.clientToServer.companion;

import com.ankamagames.baseImpl.client.proxyclient.base.network.protocol.message.*;
import com.ankamagames.framework.kernel.core.common.collections.*;

public final class ItemizeCompanionRequestMessage extends OutputOnlyProxyMessage
{
    private final long m_companionId;
    
    public ItemizeCompanionRequestMessage(final long companionId) {
        super();
        this.m_companionId = companionId;
    }
    
    @Override
    public byte[] encode() {
        final ByteArray ba = new ByteArray();
        ba.putLong(this.m_companionId);
        return this.addClientHeader((byte)3, ba.toArray());
    }
    
    @Override
    public int getId() {
        return 5553;
    }
    
    @Override
    public String toString() {
        return "ItemizeCompanionRequestMessage{m_companionId=" + this.m_companionId + '}';
    }
}
