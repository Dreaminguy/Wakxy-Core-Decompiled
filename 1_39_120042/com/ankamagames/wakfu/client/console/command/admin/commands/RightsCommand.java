package com.ankamagames.wakfu.client.console.command.admin.commands;

import com.ankamagames.wakfu.client.console.command.admin.commands.annotation.*;
import com.ankamagames.baseImpl.common.clientAndServer.account.admin.*;
import com.ankamagames.wakfu.client.core.*;
import com.ankamagames.baseImpl.client.proxyclient.base.console.*;
import com.ankamagames.baseImpl.client.proxyclient.base.network.protocol.message.*;
import com.ankamagames.framework.kernel.core.common.message.*;
import com.ankamagames.baseImpl.client.proxyclient.base.network.*;

@Documentation(commandName = "rights", commandParameters = "", commandRights = { AdminRightsGroup.ADMINISTRATOR }, commandDescription = "Show own server rights.", commandObsolete = false)
public class RightsCommand extends ModerationCommand
{
    @Override
    public boolean isValid() {
        return true;
    }
    
    @Override
    public void execute() {
        final NetworkEntity networkEntity = WakfuGameEntity.getInstance().getNetworkEntity();
        if (networkEntity == null) {
            ConsoleManager.getInstance().err("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        final byte[] arr$;
        final byte[] allModeratedServers = arr$ = new byte[] { 1, 2, 3 };
        for (final byte server : arr$) {
            final ModerationCommandMessage netMessage = new ModerationCommandMessage();
            netMessage.setServerId(server);
            netMessage.setCommand((short)13);
            networkEntity.sendMessage(netMessage);
        }
    }
}
