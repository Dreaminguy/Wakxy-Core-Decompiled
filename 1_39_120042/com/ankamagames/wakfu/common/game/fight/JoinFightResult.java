package com.ankamagames.wakfu.common.game.fight;

public enum JoinFightResult
{
    OK(0), 
    ALREADY_IN_FIGHT(1023), 
    TEAM_IS_FULL(1027), 
    PLAYER_IS_DEAD(1044), 
    TEAM_DOESNT_EXIST, 
    CANT_JOIN_TUTO_FIGHT(1039), 
    CANNOT_DEFEND_ENEMY_PROTECTOR(1036), 
    CANNOT_ATTACK_ALLIED_PROTECTOR(1037), 
    CANT_JOIN_OPPOSING_PARTY_TEAM(1035), 
    CANT_JOIN_MONSTER_TEAM(1040), 
    JOINER_CANT_ATTACK(1020), 
    JOINER_IS_DEAD(1029), 
    TARGET_CANT_BE_JOINED(1021), 
    TARGET_NOT_IN_FIGHT(1022), 
    TARGET_NOT_IN_PARTY(1034), 
    JOINER_ALREADY_IN_FIGHT(1023), 
    FIGHT_NOT_IN_PLACEMENT_PHASE(1024), 
    NO_TEAM, 
    FIGHT_LOCKED(1025), 
    JOINER_CANT_STAKE_FOR_PROTECTOR(1028), 
    CANT_WALK_TO_TARGET(1026), 
    CANT_FIND_INITIAL_PLACEMENT(1043), 
    CANT_ADD_CONTROLLER_TO_TEAM, 
    PROTECTOR_NULL, 
    EXCEPTION_RAISED, 
    FIGHTER_NULL, 
    NOT_SUBSCRIBER(7), 
    JOINER_NO_NATION, 
    PVP_TAG_NOT_ACTIVATED(327), 
    PVP_TAG_NOT_ACTIVE_YET(328), 
    PVP_JOINER_MUST_HAVE_ALLIED_NATION(326), 
    PVP_INITIATOR_HAS_TOO_BIG_LEVEL_DIFFERENCE(329), 
    PVP_MUST_BE_GUARD(332), 
    PVP_MUST_HAVE_MIN_LEVEL(333), 
    PVP_NOT_SAME_NATION_AS_GUILD(331), 
    PVP_CANT_FIGHT_GUILDMATE(334), 
    PATHFINDER_ERROR(1026), 
    CANT_JOIN_WHILE_IN_TRADE(1031), 
    CANT_JOIN_WHILE_ENTERING_DIM_BAG(1030), 
    CANNOT_AUTO_JOIN(1041);
    
    private final int m_errorCode;
    
    private JoinFightResult(final int ordinal) {
        this.m_errorCode = 0;
    }
    
    private JoinFightResult(final int errorCode) {
        this.m_errorCode = errorCode;
    }
    
    public int getErrorCode() {
        return this.m_errorCode;
    }
}
