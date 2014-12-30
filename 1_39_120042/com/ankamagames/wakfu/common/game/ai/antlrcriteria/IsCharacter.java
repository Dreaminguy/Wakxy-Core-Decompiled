package com.ankamagames.wakfu.common.game.ai.antlrcriteria;

import java.util.*;
import com.ankamagames.framework.ai.criteria.antlrcriteria.*;
import com.ankamagames.wakfu.common.datas.*;

public class IsCharacter extends FunctionCriterion
{
    private static ArrayList<ParserType[]> signatures;
    private boolean m_target;
    
    @Override
    protected List<ParserType[]> getSignatures() {
        return IsCharacter.signatures;
    }
    
    public IsCharacter(final ArrayList<ParserObject> args) {
        super();
        this.m_target = false;
        final byte type = this.checkType(args);
        if (type == 1) {
            this.m_target = args.get(0).getValue().equalsIgnoreCase("target");
        }
    }
    
    @Override
    public int getValidity(final Object criterionUser, final Object criterionTarget, final Object criterionContent, final Object criterionContext) {
        final CriterionUser user = CriteriaUtils.getTargetCriterionUserFromParameters(this.m_target, criterionUser, criterionTarget, criterionContext, criterionContent);
        if (user == null) {
            return -1;
        }
        return user.is(CriterionUserType.CHARACTER) ? 0 : -1;
    }
    
    @Override
    public Enum getEnum() {
        return WakfuCriterionIds.IS_CHARACTER;
    }
    
    static {
        (IsCharacter.signatures = new ArrayList<ParserType[]>()).add(CriterionConstants.EMPTY_SIGNATURE);
        IsCharacter.signatures.add(CriterionConstants.ONE_STRING_SIGNATURE);
    }
}
