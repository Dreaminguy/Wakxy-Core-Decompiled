package com.ankamagames.wakfu.client.ui.theme;

import java.util.*;
import com.ankamagames.xulor2.component.*;
import com.ankamagames.xulor2.core.*;
import com.ankamagames.xulor2.util.alignment.*;
import com.ankamagames.xulor2.appearance.*;

public class ImageIconWILLPOWER implements StyleSetter
{
    private DocumentParser doc;
    private Stack<ElementMap> elementMaps;
    
    public ImageIconWILLPOWER() {
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
        ((ImageAppearance)appearance).setScaled(false);
        widget.addBasicElement(appearance);
        appearance.onAttributesInitialized();
        final String id = "pmSmallWillpower";
        final PixmapElement checkOut = PixmapElement.checkOut();
        checkOut.setElementMap(elementMap);
        if (elementMap != null && id != null) {
            elementMap.add(id, checkOut);
        }
        checkOut.setHeight(13);
        checkOut.setPosition(Alignment17.CENTER);
        checkOut.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut.setWidth(10);
        checkOut.setX(275);
        checkOut.setY(610);
        appearance.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        checkOut.onChildrenAdded();
        appearance.onChildrenAdded();
    }
}