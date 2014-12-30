package com.ankamagames.wakfu.client.ui.theme;

import java.util.*;
import com.ankamagames.xulor2.component.*;
import com.ankamagames.xulor2.core.*;
import com.ankamagames.xulor2.util.alignment.*;
import com.ankamagames.xulor2.decorator.*;
import com.ankamagames.xulor2.appearance.*;

public class ButtonRemove implements StyleSetter
{
    private DocumentParser doc;
    private Stack<ElementMap> elementMaps;
    
    public ButtonRemove() {
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
        final String id = "buttonFlatBackgroundDefault";
        final PixmapBackground checkOut = PixmapBackground.checkOut();
        checkOut.setElementMap(elementMap);
        if (elementMap != null && id != null) {
            elementMap.add(id, checkOut);
        }
        checkOut.setScaled(true);
        appearance.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        final PixmapElement checkOut2 = PixmapElement.checkOut();
        checkOut2.setElementMap(elementMap);
        checkOut2.setHeight(7);
        checkOut2.setPosition(Alignment17.CENTER);
        checkOut2.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut2.setWidth(1);
        checkOut2.setX(522);
        checkOut2.setY(504);
        checkOut.addBasicElement(checkOut2);
        checkOut2.onAttributesInitialized();
        checkOut2.onChildrenAdded();
        checkOut.onChildrenAdded();
        final String id2 = "buttonFlatBorderDefault";
        final PixmapBorder pixmapBorder = new PixmapBorder();
        pixmapBorder.onCheckOut();
        pixmapBorder.setElementMap(elementMap);
        if (elementMap != null && id2 != null) {
            elementMap.add(id2, pixmapBorder);
        }
        appearance.addBasicElement(pixmapBorder);
        pixmapBorder.onAttributesInitialized();
        final PixmapElement checkOut3 = PixmapElement.checkOut();
        checkOut3.setElementMap(elementMap);
        checkOut3.setHeight(3);
        checkOut3.setPosition(Alignment17.NORTH_WEST);
        checkOut3.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut3.setWidth(3);
        checkOut3.setX(626);
        checkOut3.setY(233);
        pixmapBorder.addBasicElement(checkOut3);
        checkOut3.onAttributesInitialized();
        checkOut3.onChildrenAdded();
        final PixmapElement checkOut4 = PixmapElement.checkOut();
        checkOut4.setElementMap(elementMap);
        checkOut4.setHeight(3);
        checkOut4.setPosition(Alignment17.NORTH);
        checkOut4.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut4.setWidth(1);
        checkOut4.setX(321);
        checkOut4.setY(254);
        pixmapBorder.addBasicElement(checkOut4);
        checkOut4.onAttributesInitialized();
        checkOut4.onChildrenAdded();
        final PixmapElement checkOut5 = PixmapElement.checkOut();
        checkOut5.setElementMap(elementMap);
        checkOut5.setHeight(3);
        checkOut5.setPosition(Alignment17.NORTH_EAST);
        checkOut5.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut5.setWidth(3);
        checkOut5.setX(509);
        checkOut5.setY(228);
        pixmapBorder.addBasicElement(checkOut5);
        checkOut5.onAttributesInitialized();
        checkOut5.onChildrenAdded();
        final PixmapElement checkOut6 = PixmapElement.checkOut();
        checkOut6.setElementMap(elementMap);
        checkOut6.setHeight(7);
        checkOut6.setPosition(Alignment17.WEST);
        checkOut6.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut6.setWidth(3);
        checkOut6.setX(229);
        checkOut6.setY(492);
        pixmapBorder.addBasicElement(checkOut6);
        checkOut6.onAttributesInitialized();
        checkOut6.onChildrenAdded();
        final PixmapElement checkOut7 = PixmapElement.checkOut();
        checkOut7.setElementMap(elementMap);
        checkOut7.setHeight(7);
        checkOut7.setPosition(Alignment17.EAST);
        checkOut7.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut7.setWidth(3);
        checkOut7.setX(1018);
        checkOut7.setY(502);
        pixmapBorder.addBasicElement(checkOut7);
        checkOut7.onAttributesInitialized();
        checkOut7.onChildrenAdded();
        final PixmapElement checkOut8 = PixmapElement.checkOut();
        checkOut8.setElementMap(elementMap);
        checkOut8.setHeight(3);
        checkOut8.setPosition(Alignment17.SOUTH_WEST);
        checkOut8.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut8.setWidth(3);
        checkOut8.setX(509);
        checkOut8.setY(234);
        pixmapBorder.addBasicElement(checkOut8);
        checkOut8.onAttributesInitialized();
        checkOut8.onChildrenAdded();
        final PixmapElement checkOut9 = PixmapElement.checkOut();
        checkOut9.setElementMap(elementMap);
        checkOut9.setHeight(3);
        checkOut9.setPosition(Alignment17.SOUTH);
        checkOut9.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut9.setWidth(1);
        checkOut9.setX(777);
        checkOut9.setY(356);
        pixmapBorder.addBasicElement(checkOut9);
        checkOut9.onAttributesInitialized();
        checkOut9.onChildrenAdded();
        final PixmapElement checkOut10 = PixmapElement.checkOut();
        checkOut10.setElementMap(elementMap);
        checkOut10.setHeight(3);
        checkOut10.setPosition(Alignment17.SOUTH_EAST);
        checkOut10.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut10.setWidth(3);
        checkOut10.setX(538);
        checkOut10.setY(331);
        pixmapBorder.addBasicElement(checkOut10);
        checkOut10.onAttributesInitialized();
        checkOut10.onChildrenAdded();
        pixmapBorder.onChildrenAdded();
        final String id3 = "minusIcon";
        final PixmapElement checkOut11 = PixmapElement.checkOut();
        checkOut11.setElementMap(elementMap);
        if (elementMap != null && id3 != null) {
            elementMap.add(id3, checkOut11);
        }
        checkOut11.setHeight(8);
        checkOut11.setPosition(Alignment17.CENTER);
        checkOut11.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut11.setWidth(8);
        checkOut11.setX(224);
        checkOut11.setY(362);
        appearance.addBasicElement(checkOut11);
        checkOut11.onAttributesInitialized();
        checkOut11.onChildrenAdded();
        appearance.onChildrenAdded();
        final DecoratorAppearance appearance2 = widget.getAppearance();
        appearance2.setElementMap(elementMap);
        appearance2.setState("mouseHover");
        widget.addBasicElement(appearance2);
        appearance2.onAttributesInitialized();
        final String id4 = "buttonFlatBackgroundOver";
        final PixmapBackground checkOut12 = PixmapBackground.checkOut();
        checkOut12.setElementMap(elementMap);
        if (elementMap != null && id4 != null) {
            elementMap.add(id4, checkOut12);
        }
        checkOut12.setScaled(true);
        appearance2.addBasicElement(checkOut12);
        checkOut12.onAttributesInitialized();
        final PixmapElement checkOut13 = PixmapElement.checkOut();
        checkOut13.setElementMap(elementMap);
        checkOut13.setHeight(7);
        checkOut13.setPosition(Alignment17.CENTER);
        checkOut13.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut13.setWidth(1);
        checkOut13.setX(522);
        checkOut13.setY(504);
        checkOut12.addBasicElement(checkOut13);
        checkOut13.onAttributesInitialized();
        checkOut13.onChildrenAdded();
        checkOut12.onChildrenAdded();
        final String id5 = "buttonFlatBorderOver";
        final PixmapBorder pixmapBorder2 = new PixmapBorder();
        pixmapBorder2.onCheckOut();
        pixmapBorder2.setElementMap(elementMap);
        if (elementMap != null && id5 != null) {
            elementMap.add(id5, pixmapBorder2);
        }
        appearance2.addBasicElement(pixmapBorder2);
        pixmapBorder2.onAttributesInitialized();
        final PixmapElement checkOut14 = PixmapElement.checkOut();
        checkOut14.setElementMap(elementMap);
        checkOut14.setHeight(3);
        checkOut14.setPosition(Alignment17.NORTH_WEST);
        checkOut14.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut14.setWidth(3);
        checkOut14.setX(509);
        checkOut14.setY(222);
        pixmapBorder2.addBasicElement(checkOut14);
        checkOut14.onAttributesInitialized();
        checkOut14.onChildrenAdded();
        final PixmapElement checkOut15 = PixmapElement.checkOut();
        checkOut15.setElementMap(elementMap);
        checkOut15.setHeight(3);
        checkOut15.setPosition(Alignment17.NORTH);
        checkOut15.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut15.setWidth(1);
        checkOut15.setX(1019);
        checkOut15.setY(263);
        pixmapBorder2.addBasicElement(checkOut15);
        checkOut15.onAttributesInitialized();
        checkOut15.onChildrenAdded();
        final PixmapElement checkOut16 = PixmapElement.checkOut();
        checkOut16.setElementMap(elementMap);
        checkOut16.setHeight(3);
        checkOut16.setPosition(Alignment17.NORTH_EAST);
        checkOut16.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut16.setWidth(3);
        checkOut16.setX(1013);
        checkOut16.setY(263);
        pixmapBorder2.addBasicElement(checkOut16);
        checkOut16.onAttributesInitialized();
        checkOut16.onChildrenAdded();
        final PixmapElement checkOut17 = PixmapElement.checkOut();
        checkOut17.setElementMap(elementMap);
        checkOut17.setHeight(7);
        checkOut17.setPosition(Alignment17.WEST);
        checkOut17.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut17.setWidth(3);
        checkOut17.setX(229);
        checkOut17.setY(482);
        pixmapBorder2.addBasicElement(checkOut17);
        checkOut17.onAttributesInitialized();
        checkOut17.onChildrenAdded();
        final PixmapElement checkOut18 = PixmapElement.checkOut();
        checkOut18.setElementMap(elementMap);
        checkOut18.setHeight(7);
        checkOut18.setPosition(Alignment17.EAST);
        checkOut18.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut18.setWidth(3);
        checkOut18.setX(229);
        checkOut18.setY(502);
        pixmapBorder2.addBasicElement(checkOut18);
        checkOut18.onAttributesInitialized();
        checkOut18.onChildrenAdded();
        final PixmapElement checkOut19 = PixmapElement.checkOut();
        checkOut19.setElementMap(elementMap);
        checkOut19.setHeight(3);
        checkOut19.setPosition(Alignment17.SOUTH_WEST);
        checkOut19.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut19.setWidth(3);
        checkOut19.setX(111);
        checkOut19.setY(249);
        pixmapBorder2.addBasicElement(checkOut19);
        checkOut19.onAttributesInitialized();
        checkOut19.onChildrenAdded();
        final PixmapElement checkOut20 = PixmapElement.checkOut();
        checkOut20.setElementMap(elementMap);
        checkOut20.setHeight(3);
        checkOut20.setPosition(Alignment17.SOUTH);
        checkOut20.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut20.setWidth(1);
        checkOut20.setX(628);
        checkOut20.setY(264);
        pixmapBorder2.addBasicElement(checkOut20);
        checkOut20.onAttributesInitialized();
        checkOut20.onChildrenAdded();
        final PixmapElement checkOut21 = PixmapElement.checkOut();
        checkOut21.setElementMap(elementMap);
        checkOut21.setHeight(3);
        checkOut21.setPosition(Alignment17.SOUTH_EAST);
        checkOut21.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut21.setWidth(3);
        checkOut21.setX(626);
        checkOut21.setY(227);
        pixmapBorder2.addBasicElement(checkOut21);
        checkOut21.onAttributesInitialized();
        checkOut21.onChildrenAdded();
        pixmapBorder2.onChildrenAdded();
        final String id6 = "minusIcon";
        final PixmapElement checkOut22 = PixmapElement.checkOut();
        checkOut22.setElementMap(elementMap);
        if (elementMap != null && id6 != null) {
            elementMap.add(id6, checkOut22);
        }
        checkOut22.setHeight(8);
        checkOut22.setPosition(Alignment17.CENTER);
        checkOut22.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut22.setWidth(8);
        checkOut22.setX(224);
        checkOut22.setY(362);
        appearance2.addBasicElement(checkOut22);
        checkOut22.onAttributesInitialized();
        checkOut22.onChildrenAdded();
        appearance2.onChildrenAdded();
        final DecoratorAppearance appearance3 = widget.getAppearance();
        appearance3.setElementMap(elementMap);
        appearance3.setState("pressed");
        widget.addBasicElement(appearance3);
        appearance3.onAttributesInitialized();
        final String id7 = "buttonFlatBackgroundPressed";
        final PixmapBackground checkOut23 = PixmapBackground.checkOut();
        checkOut23.setElementMap(elementMap);
        if (elementMap != null && id7 != null) {
            elementMap.add(id7, checkOut23);
        }
        checkOut23.setScaled(true);
        appearance3.addBasicElement(checkOut23);
        checkOut23.onAttributesInitialized();
        final PixmapElement checkOut24 = PixmapElement.checkOut();
        checkOut24.setElementMap(elementMap);
        checkOut24.setHeight(7);
        checkOut24.setPosition(Alignment17.CENTER);
        checkOut24.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut24.setWidth(1);
        checkOut24.setX(88);
        checkOut24.setY(416);
        checkOut23.addBasicElement(checkOut24);
        checkOut24.onAttributesInitialized();
        checkOut24.onChildrenAdded();
        checkOut23.onChildrenAdded();
        final String id8 = "buttonFlatBorderPressed";
        final PixmapBorder pixmapBorder3 = new PixmapBorder();
        pixmapBorder3.onCheckOut();
        pixmapBorder3.setElementMap(elementMap);
        if (elementMap != null && id8 != null) {
            elementMap.add(id8, pixmapBorder3);
        }
        appearance3.addBasicElement(pixmapBorder3);
        pixmapBorder3.onAttributesInitialized();
        final PixmapElement checkOut25 = PixmapElement.checkOut();
        checkOut25.setElementMap(elementMap);
        checkOut25.setHeight(3);
        checkOut25.setPosition(Alignment17.NORTH_WEST);
        checkOut25.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut25.setWidth(3);
        checkOut25.setX(509);
        checkOut25.setY(222);
        pixmapBorder3.addBasicElement(checkOut25);
        checkOut25.onAttributesInitialized();
        checkOut25.onChildrenAdded();
        final PixmapElement checkOut26 = PixmapElement.checkOut();
        checkOut26.setElementMap(elementMap);
        checkOut26.setHeight(3);
        checkOut26.setPosition(Alignment17.NORTH);
        checkOut26.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut26.setWidth(1);
        checkOut26.setX(231);
        checkOut26.setY(356);
        pixmapBorder3.addBasicElement(checkOut26);
        checkOut26.onAttributesInitialized();
        checkOut26.onChildrenAdded();
        final PixmapElement checkOut27 = PixmapElement.checkOut();
        checkOut27.setElementMap(elementMap);
        checkOut27.setHeight(3);
        checkOut27.setPosition(Alignment17.NORTH_EAST);
        checkOut27.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut27.setWidth(3);
        checkOut27.setX(1013);
        checkOut27.setY(263);
        pixmapBorder3.addBasicElement(checkOut27);
        checkOut27.onAttributesInitialized();
        checkOut27.onChildrenAdded();
        final PixmapElement checkOut28 = PixmapElement.checkOut();
        checkOut28.setElementMap(elementMap);
        checkOut28.setHeight(7);
        checkOut28.setPosition(Alignment17.WEST);
        checkOut28.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut28.setWidth(3);
        checkOut28.setX(1018);
        checkOut28.setY(492);
        pixmapBorder3.addBasicElement(checkOut28);
        checkOut28.onAttributesInitialized();
        checkOut28.onChildrenAdded();
        final PixmapElement checkOut29 = PixmapElement.checkOut();
        checkOut29.setElementMap(elementMap);
        checkOut29.setHeight(7);
        checkOut29.setPosition(Alignment17.EAST);
        checkOut29.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut29.setWidth(3);
        checkOut29.setX(88);
        checkOut29.setY(528);
        pixmapBorder3.addBasicElement(checkOut29);
        checkOut29.onAttributesInitialized();
        checkOut29.onChildrenAdded();
        final PixmapElement checkOut30 = PixmapElement.checkOut();
        checkOut30.setElementMap(elementMap);
        checkOut30.setHeight(3);
        checkOut30.setPosition(Alignment17.SOUTH_WEST);
        checkOut30.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut30.setWidth(3);
        checkOut30.setX(111);
        checkOut30.setY(249);
        pixmapBorder3.addBasicElement(checkOut30);
        checkOut30.onAttributesInitialized();
        checkOut30.onChildrenAdded();
        final PixmapElement checkOut31 = PixmapElement.checkOut();
        checkOut31.setElementMap(elementMap);
        checkOut31.setHeight(3);
        checkOut31.setPosition(Alignment17.SOUTH);
        checkOut31.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut31.setWidth(1);
        checkOut31.setX(628);
        checkOut31.setY(270);
        pixmapBorder3.addBasicElement(checkOut31);
        checkOut31.onAttributesInitialized();
        checkOut31.onChildrenAdded();
        final PixmapElement checkOut32 = PixmapElement.checkOut();
        checkOut32.setElementMap(elementMap);
        checkOut32.setHeight(3);
        checkOut32.setPosition(Alignment17.SOUTH_EAST);
        checkOut32.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut32.setWidth(3);
        checkOut32.setX(626);
        checkOut32.setY(227);
        pixmapBorder3.addBasicElement(checkOut32);
        checkOut32.onAttributesInitialized();
        checkOut32.onChildrenAdded();
        pixmapBorder3.onChildrenAdded();
        final String id9 = "minusIcon";
        final PixmapElement checkOut33 = PixmapElement.checkOut();
        checkOut33.setElementMap(elementMap);
        if (elementMap != null && id9 != null) {
            elementMap.add(id9, checkOut33);
        }
        checkOut33.setHeight(8);
        checkOut33.setPosition(Alignment17.CENTER);
        checkOut33.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut33.setWidth(8);
        checkOut33.setX(224);
        checkOut33.setY(362);
        appearance3.addBasicElement(checkOut33);
        checkOut33.onAttributesInitialized();
        checkOut33.onChildrenAdded();
        appearance3.onChildrenAdded();
        final DecoratorAppearance appearance4 = widget.getAppearance();
        appearance4.setElementMap(elementMap);
        appearance4.setState("disabled");
        widget.addBasicElement(appearance4);
        appearance4.onAttributesInitialized();
        final String id10 = "buttonFlatBackgroundDisabled";
        final PixmapBackground checkOut34 = PixmapBackground.checkOut();
        checkOut34.setElementMap(elementMap);
        if (elementMap != null && id10 != null) {
            elementMap.add(id10, checkOut34);
        }
        checkOut34.setScaled(true);
        appearance4.addBasicElement(checkOut34);
        checkOut34.onAttributesInitialized();
        final PixmapElement checkOut35 = PixmapElement.checkOut();
        checkOut35.setElementMap(elementMap);
        checkOut35.setHeight(7);
        checkOut35.setPosition(Alignment17.CENTER);
        checkOut35.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut35.setWidth(1);
        checkOut35.setX(777);
        checkOut35.setY(436);
        checkOut34.addBasicElement(checkOut35);
        checkOut35.onAttributesInitialized();
        checkOut35.onChildrenAdded();
        checkOut34.onChildrenAdded();
        final String id11 = "buttonFlatBorderDisabled";
        final PixmapBorder pixmapBorder4 = new PixmapBorder();
        pixmapBorder4.onCheckOut();
        pixmapBorder4.setElementMap(elementMap);
        if (elementMap != null && id11 != null) {
            elementMap.add(id11, pixmapBorder4);
        }
        appearance4.addBasicElement(pixmapBorder4);
        pixmapBorder4.onAttributesInitialized();
        final PixmapElement checkOut36 = PixmapElement.checkOut();
        checkOut36.setElementMap(elementMap);
        checkOut36.setHeight(3);
        checkOut36.setPosition(Alignment17.NORTH_WEST);
        checkOut36.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut36.setWidth(3);
        checkOut36.setX(111);
        checkOut36.setY(243);
        pixmapBorder4.addBasicElement(checkOut36);
        checkOut36.onAttributesInitialized();
        checkOut36.onChildrenAdded();
        final PixmapElement checkOut37 = PixmapElement.checkOut();
        checkOut37.setElementMap(elementMap);
        checkOut37.setHeight(3);
        checkOut37.setPosition(Alignment17.NORTH);
        checkOut37.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut37.setWidth(1);
        checkOut37.setX(220);
        checkOut37.setY(263);
        pixmapBorder4.addBasicElement(checkOut37);
        checkOut37.onAttributesInitialized();
        checkOut37.onChildrenAdded();
        final PixmapElement checkOut38 = PixmapElement.checkOut();
        checkOut38.setElementMap(elementMap);
        checkOut38.setHeight(3);
        checkOut38.setPosition(Alignment17.NORTH_EAST);
        checkOut38.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut38.setWidth(3);
        checkOut38.setX(968);
        checkOut38.setY(239);
        pixmapBorder4.addBasicElement(checkOut38);
        checkOut38.onAttributesInitialized();
        checkOut38.onChildrenAdded();
        final PixmapElement checkOut39 = PixmapElement.checkOut();
        checkOut39.setElementMap(elementMap);
        checkOut39.setHeight(7);
        checkOut39.setPosition(Alignment17.WEST);
        checkOut39.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut39.setWidth(3);
        checkOut39.setX(88);
        checkOut39.setY(538);
        pixmapBorder4.addBasicElement(checkOut39);
        checkOut39.onAttributesInitialized();
        checkOut39.onChildrenAdded();
        final PixmapElement checkOut40 = PixmapElement.checkOut();
        checkOut40.setElementMap(elementMap);
        checkOut40.setHeight(7);
        checkOut40.setPosition(Alignment17.EAST);
        checkOut40.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut40.setWidth(3);
        checkOut40.setX(88);
        checkOut40.setY(518);
        pixmapBorder4.addBasicElement(checkOut40);
        checkOut40.onAttributesInitialized();
        checkOut40.onChildrenAdded();
        this.method0(pixmapBorder4);
        this.method1(pixmapBorder4);
        this.method2(pixmapBorder4);
        pixmapBorder4.onChildrenAdded();
        this.method3(appearance4);
        appearance4.onChildrenAdded();
    }
    
    public BasicElement method0(final BasicElement basicElement) {
        final ElementMap elementMap = this.elementMaps.peek();
        final PixmapElement checkOut = PixmapElement.checkOut();
        checkOut.setElementMap(elementMap);
        checkOut.setHeight(3);
        checkOut.setPosition(Alignment17.SOUTH_WEST);
        checkOut.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut.setWidth(3);
        checkOut.setX(111);
        checkOut.setY(255);
        basicElement.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        checkOut.onChildrenAdded();
        return checkOut;
    }
    
    public BasicElement method1(final BasicElement basicElement) {
        final ElementMap elementMap = this.elementMaps.peek();
        final PixmapElement checkOut = PixmapElement.checkOut();
        checkOut.setElementMap(elementMap);
        checkOut.setHeight(3);
        checkOut.setPosition(Alignment17.SOUTH);
        checkOut.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut.setWidth(1);
        checkOut.setX(321);
        checkOut.setY(248);
        basicElement.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        checkOut.onChildrenAdded();
        return checkOut;
    }
    
    public BasicElement method2(final BasicElement basicElement) {
        final ElementMap elementMap = this.elementMaps.peek();
        final PixmapElement checkOut = PixmapElement.checkOut();
        checkOut.setElementMap(elementMap);
        checkOut.setHeight(3);
        checkOut.setPosition(Alignment17.SOUTH_EAST);
        checkOut.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut.setWidth(3);
        checkOut.setX(229);
        checkOut.setY(446);
        basicElement.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        checkOut.onChildrenAdded();
        return checkOut;
    }
    
    public BasicElement method3(final BasicElement basicElement) {
        final ElementMap elementMap = this.elementMaps.peek();
        final String id = "minusIcon";
        final PixmapElement checkOut = PixmapElement.checkOut();
        checkOut.setElementMap(elementMap);
        if (elementMap != null && id != null) {
            elementMap.add(id, checkOut);
        }
        checkOut.setHeight(8);
        checkOut.setPosition(Alignment17.CENTER);
        checkOut.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut.setWidth(8);
        checkOut.setX(224);
        checkOut.setY(362);
        basicElement.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        checkOut.onChildrenAdded();
        return checkOut;
    }
}
