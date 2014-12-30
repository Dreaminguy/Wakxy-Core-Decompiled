package com.ankamagames.wakfu.client.ui.theme;

import java.util.*;
import com.ankamagames.xulor2.component.*;
import com.ankamagames.xulor2.core.*;
import com.ankamagames.xulor2.util.alignment.*;
import com.ankamagames.framework.graphics.image.*;
import com.ankamagames.xulor2.appearance.*;

public class CheckBoxFilterTerritory implements StyleSetter
{
    private DocumentParser doc;
    private Stack<ElementMap> elementMaps;
    
    public CheckBoxFilterTerritory() {
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
        appearance.setState("default");
        widget.addBasicElement(appearance);
        appearance.onAttributesInitialized();
        final PixmapElement checkOut = PixmapElement.checkOut();
        checkOut.setElementMap(elementMap);
        checkOut.setHeight(32);
        checkOut.setPosition(Alignment17.CENTER);
        checkOut.setTexture(this.doc.getTexture("map_0.tga"));
        checkOut.setWidth(22);
        checkOut.setX(992);
        checkOut.setY(276);
        appearance.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        checkOut.onChildrenAdded();
        final ColorElement checkOut2 = ColorElement.checkOut();
        checkOut2.setElementMap(elementMap);
        checkOut2.setColor(new Color(1.0f, 1.0f, 1.0f, 0.5f));
        checkOut2.setDecoratorSwitch(true);
        checkOut2.setName("modulation");
        appearance.addBasicElement(checkOut2);
        checkOut2.onAttributesInitialized();
        checkOut2.onChildrenAdded();
        appearance.onChildrenAdded();
        final DecoratorAppearance appearance2 = widget.getAppearance();
        appearance2.setElementMap(elementMap);
        appearance2.setState("mouseHover");
        widget.addBasicElement(appearance2);
        appearance2.onAttributesInitialized();
        final PixmapElement checkOut3 = PixmapElement.checkOut();
        checkOut3.setElementMap(elementMap);
        checkOut3.setHeight(32);
        checkOut3.setPosition(Alignment17.CENTER);
        checkOut3.setTexture(this.doc.getTexture("map_0.tga"));
        checkOut3.setWidth(22);
        checkOut3.setX(468);
        checkOut3.setY(275);
        appearance2.addBasicElement(checkOut3);
        checkOut3.onAttributesInitialized();
        checkOut3.onChildrenAdded();
        final ColorElement checkOut4 = ColorElement.checkOut();
        checkOut4.setElementMap(elementMap);
        checkOut4.setColor(new Color(1.0f, 1.0f, 1.0f, 0.5f));
        checkOut4.setDecoratorSwitch(true);
        checkOut4.setName("modulation");
        appearance2.addBasicElement(checkOut4);
        checkOut4.onAttributesInitialized();
        checkOut4.onChildrenAdded();
        appearance2.onChildrenAdded();
        final DecoratorAppearance appearance3 = widget.getAppearance();
        appearance3.setElementMap(elementMap);
        appearance3.setState("disabled");
        widget.addBasicElement(appearance3);
        appearance3.onAttributesInitialized();
        final PixmapElement checkOut5 = PixmapElement.checkOut();
        checkOut5.setElementMap(elementMap);
        checkOut5.setHeight(32);
        checkOut5.setPosition(Alignment17.CENTER);
        checkOut5.setTexture(this.doc.getTexture("map_0.tga"));
        checkOut5.setWidth(22);
        checkOut5.setX(992);
        checkOut5.setY(276);
        appearance3.addBasicElement(checkOut5);
        checkOut5.onAttributesInitialized();
        checkOut5.onChildrenAdded();
        final ColorElement checkOut6 = ColorElement.checkOut();
        checkOut6.setElementMap(elementMap);
        checkOut6.setColor(new Color(0.7f, 0.7f, 0.7f, 0.5f));
        checkOut6.setDecoratorSwitch(true);
        checkOut6.setName("modulation");
        appearance3.addBasicElement(checkOut6);
        checkOut6.onAttributesInitialized();
        checkOut6.onChildrenAdded();
        appearance3.onChildrenAdded();
        final DecoratorAppearance appearance4 = widget.getAppearance();
        appearance4.setElementMap(elementMap);
        appearance4.setState("pressed");
        widget.addBasicElement(appearance4);
        appearance4.onAttributesInitialized();
        final PixmapElement checkOut7 = PixmapElement.checkOut();
        checkOut7.setElementMap(elementMap);
        checkOut7.setHeight(32);
        checkOut7.setPosition(Alignment17.CENTER);
        checkOut7.setTexture(this.doc.getTexture("map_0.tga"));
        checkOut7.setWidth(22);
        checkOut7.setX(443);
        checkOut7.setY(275);
        appearance4.addBasicElement(checkOut7);
        checkOut7.onAttributesInitialized();
        checkOut7.onChildrenAdded();
        final ColorElement checkOut8 = ColorElement.checkOut();
        checkOut8.setElementMap(elementMap);
        checkOut8.setColor(new Color(1.0f, 1.0f, 1.0f, 0.5f));
        checkOut8.setDecoratorSwitch(true);
        checkOut8.setName("modulation");
        appearance4.addBasicElement(checkOut8);
        checkOut8.onAttributesInitialized();
        checkOut8.onChildrenAdded();
        appearance4.onChildrenAdded();
        final DecoratorAppearance appearance5 = widget.getAppearance();
        appearance5.setElementMap(elementMap);
        appearance5.setState("selected");
        widget.addBasicElement(appearance5);
        appearance5.onAttributesInitialized();
        final PixmapElement checkOut9 = PixmapElement.checkOut();
        checkOut9.setElementMap(elementMap);
        checkOut9.setHeight(32);
        checkOut9.setPosition(Alignment17.CENTER);
        checkOut9.setTexture(this.doc.getTexture("map_0.tga"));
        checkOut9.setWidth(22);
        checkOut9.setX(992);
        checkOut9.setY(276);
        appearance5.addBasicElement(checkOut9);
        checkOut9.onAttributesInitialized();
        checkOut9.onChildrenAdded();
        final ColorElement checkOut10 = ColorElement.checkOut();
        checkOut10.setElementMap(elementMap);
        checkOut10.setColor(new Color(1.0f, 1.0f, 1.0f, 1.0f));
        checkOut10.setDecoratorSwitch(true);
        checkOut10.setName("modulation");
        appearance5.addBasicElement(checkOut10);
        checkOut10.onAttributesInitialized();
        checkOut10.onChildrenAdded();
        appearance5.onChildrenAdded();
        final DecoratorAppearance appearance6 = widget.getAppearance();
        appearance6.setElementMap(elementMap);
        appearance6.setState("mouseHoverSelected");
        widget.addBasicElement(appearance6);
        appearance6.onAttributesInitialized();
        final PixmapElement checkOut11 = PixmapElement.checkOut();
        checkOut11.setElementMap(elementMap);
        checkOut11.setHeight(32);
        checkOut11.setPosition(Alignment17.CENTER);
        checkOut11.setTexture(this.doc.getTexture("map_0.tga"));
        checkOut11.setWidth(22);
        checkOut11.setX(468);
        checkOut11.setY(275);
        appearance6.addBasicElement(checkOut11);
        checkOut11.onAttributesInitialized();
        checkOut11.onChildrenAdded();
        final ColorElement checkOut12 = ColorElement.checkOut();
        checkOut12.setElementMap(elementMap);
        checkOut12.setColor(new Color(1.0f, 1.0f, 1.0f, 1.0f));
        checkOut12.setDecoratorSwitch(true);
        checkOut12.setName("modulation");
        appearance6.addBasicElement(checkOut12);
        checkOut12.onAttributesInitialized();
        checkOut12.onChildrenAdded();
        appearance6.onChildrenAdded();
        final DecoratorAppearance appearance7 = widget.getAppearance();
        appearance7.setElementMap(elementMap);
        appearance7.setState("disabledSelected");
        widget.addBasicElement(appearance7);
        appearance7.onAttributesInitialized();
        final PixmapElement checkOut13 = PixmapElement.checkOut();
        checkOut13.setElementMap(elementMap);
        checkOut13.setHeight(32);
        checkOut13.setPosition(Alignment17.CENTER);
        checkOut13.setTexture(this.doc.getTexture("map_0.tga"));
        checkOut13.setWidth(22);
        checkOut13.setX(992);
        checkOut13.setY(276);
        appearance7.addBasicElement(checkOut13);
        checkOut13.onAttributesInitialized();
        checkOut13.onChildrenAdded();
        final ColorElement checkOut14 = ColorElement.checkOut();
        checkOut14.setElementMap(elementMap);
        checkOut14.setColor(new Color(0.7f, 0.7f, 0.7f, 1.0f));
        checkOut14.setDecoratorSwitch(true);
        checkOut14.setName("modulation");
        appearance7.addBasicElement(checkOut14);
        checkOut14.onAttributesInitialized();
        checkOut14.onChildrenAdded();
        appearance7.onChildrenAdded();
        final DecoratorAppearance appearance8 = widget.getAppearance();
        appearance8.setElementMap(elementMap);
        appearance8.setState("pressedSelected");
        widget.addBasicElement(appearance8);
        appearance8.onAttributesInitialized();
        final PixmapElement checkOut15 = PixmapElement.checkOut();
        checkOut15.setElementMap(elementMap);
        checkOut15.setHeight(32);
        checkOut15.setPosition(Alignment17.CENTER);
        checkOut15.setTexture(this.doc.getTexture("map_0.tga"));
        checkOut15.setWidth(22);
        checkOut15.setX(443);
        checkOut15.setY(275);
        appearance8.addBasicElement(checkOut15);
        checkOut15.onAttributesInitialized();
        checkOut15.onChildrenAdded();
        final ColorElement checkOut16 = ColorElement.checkOut();
        checkOut16.setElementMap(elementMap);
        checkOut16.setColor(new Color(1.0f, 1.0f, 1.0f, 1.0f));
        checkOut16.setDecoratorSwitch(true);
        checkOut16.setName("modulation");
        appearance8.addBasicElement(checkOut16);
        checkOut16.onAttributesInitialized();
        checkOut16.onChildrenAdded();
        appearance8.onChildrenAdded();
    }
}
