package com.ankamagames.wakfu.client.ui.theme;

import java.util.*;
import com.ankamagames.xulor2.component.*;
import com.ankamagames.xulor2.core.*;
import com.ankamagames.xulor2.appearance.*;

public class AnimatedElementViewerFightDecoratorRight implements StyleSetter
{
    private DocumentParser doc;
    private Stack<ElementMap> elementMaps;
    
    public AnimatedElementViewerFightDecoratorRight() {
        super();
        this.elementMaps = new Stack<ElementMap>();
    }
    
    @Override
    public void applyStyle(final ElementMap item, final DocumentParser doc, final Widget widget) {
        this.doc = doc;
        this.elementMaps.push(item);
        final ElementMap elementMap = this.elementMaps.peek();
        final DecoratorAppearance appearance = widget.getAppearance();
        appearance.setElementMap(elementMap);
        ((AnimatedElementViewerAppearance)appearance).setAnimName("AnimCombat1-D");
        ((AnimatedElementViewerAppearance)appearance).setDirection(0);
        ((AnimatedElementViewerAppearance)appearance).setFilePath("Banner_Combat.anm");
        ((AnimatedElementViewerAppearance)appearance).setScale(1.0f);
        widget.addBasicElement(appearance);
        appearance.onAttributesInitialized();
        appearance.onChildrenAdded();
    }
}
