package com.ankamagames.wakfu.client.ui.theme;

import java.util.*;
import com.ankamagames.xulor2.component.*;
import com.ankamagames.xulor2.core.*;
import com.ankamagames.xulor2.util.alignment.*;
import com.ankamagames.xulor2.decorator.*;
import com.ankamagames.xulor2.appearance.*;

public class Mru$ButtonSouthWest implements StyleSetter
{
    private DocumentParser doc;
    private Stack<ElementMap> elementMaps;
    
    public Mru$ButtonSouthWest() {
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
        final PixmapBorder element = new PixmapBorder();
        element.onCheckOut();
        element.setElementMap(elementMap);
        appearance.addBasicElement(element);
        element.onAttributesInitialized();
        final PixmapElement checkOut = PixmapElement.checkOut();
        checkOut.setElementMap(elementMap);
        checkOut.setHeight(12);
        checkOut.setPosition(Alignment17.NORTH_WEST);
        checkOut.setTexture(this.doc.getTexture("mru_0.tga"));
        checkOut.setWidth(14);
        checkOut.setX(452);
        checkOut.setY(240);
        element.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        checkOut.onChildrenAdded();
        final PixmapElement checkOut2 = PixmapElement.checkOut();
        checkOut2.setElementMap(elementMap);
        checkOut2.setHeight(12);
        checkOut2.setPosition(Alignment17.NORTH);
        checkOut2.setTexture(this.doc.getTexture("mru_0.tga"));
        checkOut2.setWidth(21);
        checkOut2.setX(722);
        checkOut2.setY(242);
        element.addBasicElement(checkOut2);
        checkOut2.onAttributesInitialized();
        checkOut2.onChildrenAdded();
        final PixmapElement checkOut3 = PixmapElement.checkOut();
        checkOut3.setElementMap(elementMap);
        checkOut3.setHeight(12);
        checkOut3.setPosition(Alignment17.NORTH_EAST);
        checkOut3.setTexture(this.doc.getTexture("mru_0.tga"));
        checkOut3.setWidth(12);
        checkOut3.setX(142);
        checkOut3.setY(228);
        element.addBasicElement(checkOut3);
        checkOut3.onAttributesInitialized();
        checkOut3.onChildrenAdded();
        final PixmapElement checkOut4 = PixmapElement.checkOut();
        checkOut4.setElementMap(elementMap);
        checkOut4.setHeight(20);
        checkOut4.setPosition(Alignment17.WEST);
        checkOut4.setTexture(this.doc.getTexture("mru_0.tga"));
        checkOut4.setWidth(14);
        checkOut4.setX(157);
        checkOut4.setY(277);
        element.addBasicElement(checkOut4);
        checkOut4.onAttributesInitialized();
        checkOut4.onChildrenAdded();
        final PixmapElement checkOut5 = PixmapElement.checkOut();
        checkOut5.setElementMap(elementMap);
        checkOut5.setHeight(20);
        checkOut5.setPosition(Alignment17.EAST);
        checkOut5.setTexture(this.doc.getTexture("mru_0.tga"));
        checkOut5.setWidth(12);
        checkOut5.setX(856);
        checkOut5.setY(257);
        element.addBasicElement(checkOut5);
        checkOut5.onAttributesInitialized();
        checkOut5.onChildrenAdded();
        final PixmapElement checkOut6 = PixmapElement.checkOut();
        checkOut6.setElementMap(elementMap);
        checkOut6.setHeight(12);
        checkOut6.setPosition(Alignment17.SOUTH_WEST);
        checkOut6.setTexture(this.doc.getTexture("mru_0.tga"));
        checkOut6.setWidth(14);
        checkOut6.setX(521);
        checkOut6.setY(243);
        element.addBasicElement(checkOut6);
        checkOut6.onAttributesInitialized();
        checkOut6.onChildrenAdded();
        final PixmapElement checkOut7 = PixmapElement.checkOut();
        checkOut7.setElementMap(elementMap);
        checkOut7.setHeight(12);
        checkOut7.setPosition(Alignment17.SOUTH);
        checkOut7.setTexture(this.doc.getTexture("mru_0.tga"));
        checkOut7.setWidth(21);
        checkOut7.setX(782);
        checkOut7.setY(242);
        element.addBasicElement(checkOut7);
        checkOut7.onAttributesInitialized();
        checkOut7.onChildrenAdded();
        final PixmapElement checkOut8 = PixmapElement.checkOut();
        checkOut8.setElementMap(elementMap);
        checkOut8.setHeight(12);
        checkOut8.setPosition(Alignment17.SOUTH_EAST);
        checkOut8.setTexture(this.doc.getTexture("mru_0.tga"));
        checkOut8.setWidth(12);
        checkOut8.setX(48);
        checkOut8.setY(228);
        element.addBasicElement(checkOut8);
        checkOut8.onAttributesInitialized();
        checkOut8.onChildrenAdded();
        element.onChildrenAdded();
        final PixmapBackground checkOut9 = PixmapBackground.checkOut();
        checkOut9.setElementMap(elementMap);
        checkOut9.setScaled(true);
        appearance.addBasicElement(checkOut9);
        checkOut9.onAttributesInitialized();
        final PixmapElement checkOut10 = PixmapElement.checkOut();
        checkOut10.setElementMap(elementMap);
        checkOut10.setHeight(20);
        checkOut10.setPosition(Alignment17.CENTER);
        checkOut10.setTexture(this.doc.getTexture("mru_0.tga"));
        checkOut10.setWidth(1);
        checkOut10.setX(268);
        checkOut10.setY(413);
        checkOut9.addBasicElement(checkOut10);
        checkOut10.onAttributesInitialized();
        checkOut10.onChildrenAdded();
        checkOut9.onChildrenAdded();
        appearance.onChildrenAdded();
        final DecoratorAppearance appearance2 = widget.getAppearance();
        appearance2.setElementMap(elementMap);
        appearance2.setState("mouseHover");
        widget.addBasicElement(appearance2);
        appearance2.onAttributesInitialized();
        final PixmapBorder element2 = new PixmapBorder();
        element2.onCheckOut();
        element2.setElementMap(elementMap);
        appearance2.addBasicElement(element2);
        element2.onAttributesInitialized();
        final PixmapElement checkOut11 = PixmapElement.checkOut();
        checkOut11.setElementMap(elementMap);
        checkOut11.setHeight(12);
        checkOut11.setPosition(Alignment17.NORTH_WEST);
        checkOut11.setTexture(this.doc.getTexture("mru_0.tga"));
        checkOut11.setWidth(14);
        checkOut11.setX(392);
        checkOut11.setY(240);
        element2.addBasicElement(checkOut11);
        checkOut11.onAttributesInitialized();
        checkOut11.onChildrenAdded();
        final PixmapElement checkOut12 = PixmapElement.checkOut();
        checkOut12.setElementMap(elementMap);
        checkOut12.setHeight(12);
        checkOut12.setPosition(Alignment17.NORTH);
        checkOut12.setTexture(this.doc.getTexture("mru_0.tga"));
        checkOut12.setWidth(21);
        checkOut12.setX(662);
        checkOut12.setY(242);
        element2.addBasicElement(checkOut12);
        checkOut12.onAttributesInitialized();
        checkOut12.onChildrenAdded();
        final PixmapElement checkOut13 = PixmapElement.checkOut();
        checkOut13.setElementMap(elementMap);
        checkOut13.setHeight(12);
        checkOut13.setPosition(Alignment17.NORTH_EAST);
        checkOut13.setTexture(this.doc.getTexture("mru_0.tga"));
        checkOut13.setWidth(12);
        checkOut13.setX(1009);
        checkOut13.setY(240);
        element2.addBasicElement(checkOut13);
        checkOut13.onAttributesInitialized();
        checkOut13.onChildrenAdded();
        final PixmapElement checkOut14 = PixmapElement.checkOut();
        checkOut14.setElementMap(elementMap);
        checkOut14.setHeight(20);
        checkOut14.setPosition(Alignment17.WEST);
        checkOut14.setTexture(this.doc.getTexture("mru_0.tga"));
        checkOut14.setWidth(14);
        checkOut14.setX(782);
        checkOut14.setY(257);
        element2.addBasicElement(checkOut14);
        checkOut14.onAttributesInitialized();
        checkOut14.onChildrenAdded();
        final PixmapElement checkOut15 = PixmapElement.checkOut();
        checkOut15.setElementMap(elementMap);
        checkOut15.setHeight(20);
        checkOut15.setPosition(Alignment17.EAST);
        checkOut15.setTexture(this.doc.getTexture("mru_0.tga"));
        checkOut15.setWidth(12);
        checkOut15.setX(357);
        checkOut15.setY(257);
        element2.addBasicElement(checkOut15);
        checkOut15.onAttributesInitialized();
        checkOut15.onChildrenAdded();
        final PixmapElement checkOut16 = PixmapElement.checkOut();
        checkOut16.setElementMap(elementMap);
        checkOut16.setHeight(12);
        checkOut16.setPosition(Alignment17.SOUTH_WEST);
        checkOut16.setTexture(this.doc.getTexture("mru_0.tga"));
        checkOut16.setWidth(14);
        checkOut16.setX(469);
        checkOut16.setY(240);
        element2.addBasicElement(checkOut16);
        checkOut16.onAttributesInitialized();
        checkOut16.onChildrenAdded();
        final PixmapElement checkOut17 = PixmapElement.checkOut();
        checkOut17.setElementMap(elementMap);
        checkOut17.setHeight(12);
        checkOut17.setPosition(Alignment17.SOUTH);
        checkOut17.setTexture(this.doc.getTexture("mru_0.tga"));
        checkOut17.setWidth(21);
        checkOut17.setX(602);
        checkOut17.setY(242);
        element2.addBasicElement(checkOut17);
        checkOut17.onAttributesInitialized();
        checkOut17.onChildrenAdded();
        final PixmapElement checkOut18 = PixmapElement.checkOut();
        checkOut18.setElementMap(elementMap);
        checkOut18.setHeight(12);
        checkOut18.setPosition(Alignment17.SOUTH_EAST);
        checkOut18.setTexture(this.doc.getTexture("mru_0.tga"));
        checkOut18.setWidth(12);
        checkOut18.setX(497);
        checkOut18.setY(228);
        element2.addBasicElement(checkOut18);
        checkOut18.onAttributesInitialized();
        checkOut18.onChildrenAdded();
        element2.onChildrenAdded();
        final PixmapBackground checkOut19 = PixmapBackground.checkOut();
        checkOut19.setElementMap(elementMap);
        checkOut19.setScaled(true);
        appearance2.addBasicElement(checkOut19);
        checkOut19.onAttributesInitialized();
        final PixmapElement checkOut20 = PixmapElement.checkOut();
        checkOut20.setElementMap(elementMap);
        checkOut20.setHeight(20);
        checkOut20.setPosition(Alignment17.CENTER);
        checkOut20.setTexture(this.doc.getTexture("mru_0.tga"));
        checkOut20.setWidth(1);
        checkOut20.setX(268);
        checkOut20.setY(459);
        checkOut19.addBasicElement(checkOut20);
        checkOut20.onAttributesInitialized();
        checkOut20.onChildrenAdded();
        checkOut19.onChildrenAdded();
        appearance2.onChildrenAdded();
        final DecoratorAppearance appearance3 = widget.getAppearance();
        appearance3.setElementMap(elementMap);
        appearance3.setState("pressed");
        widget.addBasicElement(appearance3);
        appearance3.onAttributesInitialized();
        final PixmapBorder element3 = new PixmapBorder();
        element3.onCheckOut();
        element3.setElementMap(elementMap);
        appearance3.addBasicElement(element3);
        element3.onAttributesInitialized();
        final PixmapElement checkOut21 = PixmapElement.checkOut();
        checkOut21.setElementMap(elementMap);
        checkOut21.setHeight(12);
        checkOut21.setPosition(Alignment17.NORTH_WEST);
        checkOut21.setTexture(this.doc.getTexture("mru_0.tga"));
        checkOut21.setWidth(14);
        checkOut21.setX(452);
        checkOut21.setY(240);
        element3.addBasicElement(checkOut21);
        checkOut21.onAttributesInitialized();
        checkOut21.onChildrenAdded();
        final PixmapElement checkOut22 = PixmapElement.checkOut();
        checkOut22.setElementMap(elementMap);
        checkOut22.setHeight(12);
        checkOut22.setPosition(Alignment17.NORTH);
        checkOut22.setTexture(this.doc.getTexture("mru_0.tga"));
        checkOut22.setWidth(21);
        checkOut22.setX(722);
        checkOut22.setY(242);
        element3.addBasicElement(checkOut22);
        checkOut22.onAttributesInitialized();
        checkOut22.onChildrenAdded();
        final PixmapElement checkOut23 = PixmapElement.checkOut();
        checkOut23.setElementMap(elementMap);
        checkOut23.setHeight(12);
        checkOut23.setPosition(Alignment17.NORTH_EAST);
        checkOut23.setTexture(this.doc.getTexture("mru_0.tga"));
        checkOut23.setWidth(12);
        checkOut23.setX(142);
        checkOut23.setY(228);
        element3.addBasicElement(checkOut23);
        checkOut23.onAttributesInitialized();
        checkOut23.onChildrenAdded();
        final PixmapElement checkOut24 = PixmapElement.checkOut();
        checkOut24.setElementMap(elementMap);
        checkOut24.setHeight(20);
        checkOut24.setPosition(Alignment17.WEST);
        checkOut24.setTexture(this.doc.getTexture("mru_0.tga"));
        checkOut24.setWidth(14);
        checkOut24.setX(33);
        checkOut24.setY(277);
        element3.addBasicElement(checkOut24);
        checkOut24.onAttributesInitialized();
        checkOut24.onChildrenAdded();
        final PixmapElement checkOut25 = PixmapElement.checkOut();
        checkOut25.setElementMap(elementMap);
        checkOut25.setHeight(20);
        checkOut25.setPosition(Alignment17.EAST);
        checkOut25.setTexture(this.doc.getTexture("mru_0.tga"));
        checkOut25.setWidth(12);
        checkOut25.setX(856);
        checkOut25.setY(257);
        element3.addBasicElement(checkOut25);
        checkOut25.onAttributesInitialized();
        checkOut25.onChildrenAdded();
        final PixmapElement checkOut26 = PixmapElement.checkOut();
        checkOut26.setElementMap(elementMap);
        checkOut26.setHeight(12);
        checkOut26.setPosition(Alignment17.SOUTH_WEST);
        checkOut26.setTexture(this.doc.getTexture("mru_0.tga"));
        checkOut26.setWidth(14);
        checkOut26.setX(332);
        checkOut26.setY(240);
        element3.addBasicElement(checkOut26);
        checkOut26.onAttributesInitialized();
        checkOut26.onChildrenAdded();
        final PixmapElement checkOut27 = PixmapElement.checkOut();
        checkOut27.setElementMap(elementMap);
        checkOut27.setHeight(12);
        checkOut27.setPosition(Alignment17.SOUTH);
        checkOut27.setTexture(this.doc.getTexture("mru_0.tga"));
        checkOut27.setWidth(21);
        checkOut27.setX(932);
        checkOut27.setY(244);
        element3.addBasicElement(checkOut27);
        checkOut27.onAttributesInitialized();
        checkOut27.onChildrenAdded();
        final PixmapElement checkOut28 = PixmapElement.checkOut();
        checkOut28.setElementMap(elementMap);
        checkOut28.setHeight(12);
        checkOut28.setPosition(Alignment17.SOUTH_EAST);
        checkOut28.setTexture(this.doc.getTexture("mru_0.tga"));
        checkOut28.setWidth(12);
        checkOut28.setX(48);
        checkOut28.setY(228);
        element3.addBasicElement(checkOut28);
        checkOut28.onAttributesInitialized();
        checkOut28.onChildrenAdded();
        element3.onChildrenAdded();
        final PixmapBackground checkOut29 = PixmapBackground.checkOut();
        checkOut29.setElementMap(elementMap);
        checkOut29.setScaled(true);
        appearance3.addBasicElement(checkOut29);
        checkOut29.onAttributesInitialized();
        final PixmapElement checkOut30 = PixmapElement.checkOut();
        checkOut30.setElementMap(elementMap);
        checkOut30.setHeight(20);
        checkOut30.setPosition(Alignment17.CENTER);
        checkOut30.setTexture(this.doc.getTexture("mru_0.tga"));
        checkOut30.setWidth(1);
        checkOut30.setX(268);
        checkOut30.setY(413);
        checkOut29.addBasicElement(checkOut30);
        checkOut30.onAttributesInitialized();
        checkOut30.onChildrenAdded();
        checkOut29.onChildrenAdded();
        appearance3.onChildrenAdded();
        final DecoratorAppearance appearance4 = widget.getAppearance();
        appearance4.setElementMap(elementMap);
        appearance4.setState("disabled");
        widget.addBasicElement(appearance4);
        appearance4.onAttributesInitialized();
        final PixmapBorder element4 = new PixmapBorder();
        element4.onCheckOut();
        element4.setElementMap(elementMap);
        appearance4.addBasicElement(element4);
        element4.onAttributesInitialized();
        final PixmapElement checkOut31 = PixmapElement.checkOut();
        checkOut31.setElementMap(elementMap);
        checkOut31.setHeight(12);
        checkOut31.setPosition(Alignment17.NORTH_WEST);
        checkOut31.setTexture(this.doc.getTexture("mru_0.tga"));
        checkOut31.setWidth(14);
        checkOut31.setX(452);
        checkOut31.setY(240);
        element4.addBasicElement(checkOut31);
        checkOut31.onAttributesInitialized();
        checkOut31.onChildrenAdded();
        final PixmapElement checkOut32 = PixmapElement.checkOut();
        checkOut32.setElementMap(elementMap);
        checkOut32.setHeight(12);
        checkOut32.setPosition(Alignment17.NORTH);
        checkOut32.setTexture(this.doc.getTexture("mru_0.tga"));
        checkOut32.setWidth(21);
        checkOut32.setX(722);
        checkOut32.setY(242);
        element4.addBasicElement(checkOut32);
        checkOut32.onAttributesInitialized();
        checkOut32.onChildrenAdded();
        final PixmapElement checkOut33 = PixmapElement.checkOut();
        checkOut33.setElementMap(elementMap);
        checkOut33.setHeight(12);
        checkOut33.setPosition(Alignment17.NORTH_EAST);
        checkOut33.setTexture(this.doc.getTexture("mru_0.tga"));
        checkOut33.setWidth(12);
        checkOut33.setX(142);
        checkOut33.setY(228);
        element4.addBasicElement(checkOut33);
        checkOut33.onAttributesInitialized();
        checkOut33.onChildrenAdded();
        final PixmapElement checkOut34 = PixmapElement.checkOut();
        checkOut34.setElementMap(elementMap);
        checkOut34.setHeight(20);
        checkOut34.setPosition(Alignment17.WEST);
        checkOut34.setTexture(this.doc.getTexture("mru_0.tga"));
        checkOut34.setWidth(14);
        checkOut34.setX(157);
        checkOut34.setY(277);
        element4.addBasicElement(checkOut34);
        checkOut34.onAttributesInitialized();
        checkOut34.onChildrenAdded();
        final PixmapElement checkOut35 = PixmapElement.checkOut();
        checkOut35.setElementMap(elementMap);
        checkOut35.setHeight(20);
        checkOut35.setPosition(Alignment17.EAST);
        checkOut35.setTexture(this.doc.getTexture("mru_0.tga"));
        checkOut35.setWidth(12);
        checkOut35.setX(856);
        checkOut35.setY(257);
        element4.addBasicElement(checkOut35);
        checkOut35.onAttributesInitialized();
        checkOut35.onChildrenAdded();
        final PixmapElement checkOut36 = PixmapElement.checkOut();
        checkOut36.setElementMap(elementMap);
        checkOut36.setHeight(12);
        checkOut36.setPosition(Alignment17.SOUTH_WEST);
        checkOut36.setTexture(this.doc.getTexture("mru_0.tga"));
        checkOut36.setWidth(14);
        checkOut36.setX(521);
        checkOut36.setY(243);
        element4.addBasicElement(checkOut36);
        checkOut36.onAttributesInitialized();
        checkOut36.onChildrenAdded();
        final PixmapElement checkOut37 = PixmapElement.checkOut();
        checkOut37.setElementMap(elementMap);
        checkOut37.setHeight(12);
        checkOut37.setPosition(Alignment17.SOUTH);
        checkOut37.setTexture(this.doc.getTexture("mru_0.tga"));
        checkOut37.setWidth(21);
        checkOut37.setX(782);
        checkOut37.setY(242);
        element4.addBasicElement(checkOut37);
        checkOut37.onAttributesInitialized();
        checkOut37.onChildrenAdded();
        final PixmapElement checkOut38 = PixmapElement.checkOut();
        checkOut38.setElementMap(elementMap);
        checkOut38.setHeight(12);
        checkOut38.setPosition(Alignment17.SOUTH_EAST);
        checkOut38.setTexture(this.doc.getTexture("mru_0.tga"));
        checkOut38.setWidth(12);
        checkOut38.setX(48);
        checkOut38.setY(228);
        element4.addBasicElement(checkOut38);
        checkOut38.onAttributesInitialized();
        checkOut38.onChildrenAdded();
        element4.onChildrenAdded();
        final PixmapBackground checkOut39 = PixmapBackground.checkOut();
        checkOut39.setElementMap(elementMap);
        checkOut39.setScaled(true);
        appearance4.addBasicElement(checkOut39);
        checkOut39.onAttributesInitialized();
        final PixmapElement checkOut40 = PixmapElement.checkOut();
        checkOut40.setElementMap(elementMap);
        checkOut40.setHeight(20);
        checkOut40.setPosition(Alignment17.CENTER);
        checkOut40.setTexture(this.doc.getTexture("mru_0.tga"));
        checkOut40.setWidth(1);
        checkOut40.setX(268);
        checkOut40.setY(413);
        checkOut39.addBasicElement(checkOut40);
        checkOut40.onAttributesInitialized();
        checkOut40.onChildrenAdded();
        checkOut39.onChildrenAdded();
        appearance4.onChildrenAdded();
    }
}
