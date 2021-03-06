package com.ankamagames.wakfu.common.game.interactiveElements.param;

import com.ankamagames.wakfu.common.game.chaos.*;

public class IEKrosmozGameCollectionParameter extends IEParameter
{
    private final byte m_gameId;
    
    public IEKrosmozGameCollectionParameter(final int paramId, final int visualId, final ChaosInteractiveCategory chaos, final int chaosCollectorId, final byte gameId) {
        super(paramId, visualId, chaos, chaosCollectorId);
        this.m_gameId = gameId;
    }
    
    public byte getGameId() {
        return this.m_gameId;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("IEKrosmozGameCollectionParameter");
        sb.append("{m_gameId=").append(this.m_gameId);
        sb.append('}');
        return sb.toString();
    }
}
