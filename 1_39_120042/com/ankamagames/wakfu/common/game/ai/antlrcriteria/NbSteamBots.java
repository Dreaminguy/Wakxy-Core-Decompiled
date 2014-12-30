package com.ankamagames.wakfu.common.game.ai.antlrcriteria;

import java.util.*;
import com.ankamagames.framework.ai.criteria.antlrcriteria.*;
import com.ankamagames.baseImpl.common.clientAndServer.game.effectArea.*;
import com.ankamagames.wakfu.common.game.effectArea.*;

public final class NbSteamBots extends NbAreas
{
    public NbSteamBots(final ArrayList<ParserObject> args) {
        super(args);
    }
    
    @Override
    protected int getAreaType() {
        return EffectAreaType.FAKE_FIGHTER.getTypeId();
    }
    
    @Override
    protected boolean isConcernedArea(final BasicEffectArea area) {
        return area.getType() == this.getAreaType() && ((AbstractFakeFighterEffectArea)area).getUserDefinedId() == 4;
    }
    
    @Override
    public Enum getEnum() {
        return WakfuCriterionIds.NB_STEAMBOTS;
    }
}
