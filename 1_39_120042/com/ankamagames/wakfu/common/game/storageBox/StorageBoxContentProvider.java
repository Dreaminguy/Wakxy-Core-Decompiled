package com.ankamagames.wakfu.common.game.storageBox;

import com.ankamagames.wakfu.common.rawData.*;
import com.ankamagames.wakfu.common.game.item.*;
import org.jetbrains.annotations.*;
import com.ankamagames.baseImpl.common.clientAndServer.game.inventory.*;

public class StorageBoxContentProvider implements InventoryContentProvider<Item, RawInventoryItem>
{
    public static final StorageBoxContentProvider INSTANCE;
    private final ItemProvider m_itemProvider;
    private final RawInventoryItemProvider m_rawItemProvider;
    
    private StorageBoxContentProvider() {
        super();
        this.m_itemProvider = ReferenceItemManager.getInstance();
        this.m_rawItemProvider = ReferenceItemManager.getInstance();
    }
    
    @Nullable
    @Override
    public Item unSerializeContent(final RawInventoryItem rawItem) {
        final Item item = this.m_itemProvider.createItem();
        return item.fromRaw(rawItem) ? item : null;
    }
    
    @Override
    public String toString() {
        return "StorageBoxContentProvider{m_itemProvider=" + this.m_itemProvider.getClass().getName() + ", m_rawItemProvider=" + this.m_rawItemProvider.getClass().getName() + '}';
    }
    
    static {
        INSTANCE = new StorageBoxContentProvider();
    }
}
