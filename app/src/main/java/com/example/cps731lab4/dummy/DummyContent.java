package com.example.cps731lab4.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 25;

    static {
        addItem(new DummyItem("1","Ana","Ana’s versatile arsenal allows her to affect heroes all over the battlefield. Her Biotic Rifle rounds and Biotic Grenades heal allies and damage or impair enemies; her sidearm tranquilizes key targets, and Nano Boost gives one of her comrades a considerable increase in power.","https://d1u1mce87gyfbn.cloudfront.net/hero/ana/hero-select-portrait.png"));
        addItem(new DummyItem("2","Ashe","Ashe quickly fires her rifle from the hip or uses her weapon’s aim-down sights to line up a high damage shot. She blasts enemies by throwing dynamite, and her coach gun packs enough punch to put some distance between her and her foes. And Ashe is not alone, as she can call on her omnic ally Bob, to join the fray when the need arises.","https://d1u1mce87gyfbn.cloudfront.net/hero/ashe/hero-select-portrait.png"));
        addItem(new DummyItem("3","Brigitte","Brigitte specializes in armor. She can throw Repair Packs to heal teammates, or automatically heal nearby allies when she damages foes with her Flail. Her Flail is capable of a wide swing to strike multiple targets, or a Whip Shot that stuns an enemy at range. When entering the fray, Barrier Shield provides personal defense while she attacks enemies with Shield Bash. Brigitte’s ultimate ability, Rally, gives her a substantial short-term boost of speed and provides long-lasting armor to all her nearby allies.","https://d1u1mce87gyfbn.cloudfront.net/hero/brigitte/hero-select-portrait.png"));
        addItem(new DummyItem("4","Echo","Echo is an evolutionary robot programmed with a rapidly adapting artificial intelligence, versatile enough to fill multiple battlefield combat roles.","https://d1u1mce87gyfbn.cloudfront.net/hero/echo/hero-select-portrait.png"));
        addItem(new DummyItem("5","Mei","Mei’s weather-altering devices slow opponents and protect locations. Her Endothermic Blaster unleashes damaging icicles and frost streams, and she can Cryo-Freeze herself to guard against counterattacks, or obstruct the opposing team's movements with an Ice Wall.","https://d1u1mce87gyfbn.cloudfront.net/hero/mei/hero-select-portrait.png"));
        addItem(new DummyItem("6","Mercy","Mercy’s Valkyrie Suit helps keep her close to teammates like a guardian angel; healing, resurrecting or strengthening them with the beams emanating from her Caduceus Staff.","https://d1u1mce87gyfbn.cloudfront.net/hero/mercy/hero-select-portrait.png"));
        addItem(new DummyItem("7","Moira","Moira’s biotic abilities enable her to contribute healing or damage in any crisis. While Biotic Grasp gives Moira short-range options, her Biotic Orbs contribute longer-range, hands-off damage and healing; she can also Fade to escape groups or remain close to allies in need of support. Once she’s charged Coalescence, Moira can save multiple allies from elimination at once or finish off weakened enemies.","https://d1u1mce87gyfbn.cloudfront.net/hero/moira/hero-select-portrait.png"));
        addItem(new DummyItem("8","Sombra","Stealth and debilitating attacks make Sombra a powerful infiltrator. Her hacking can disrupt her enemies, ensuring they're easier to take out, while her EMP provides the upper hand against multiple foes at once. Sombra’s ability to Translocate and camouflage herself makes her a hard target to pin down.","https://d1u1mce87gyfbn.cloudfront.net/hero/sombra/hero-select-portrait.png"));
        addItem(new DummyItem("9","Widowmaker","Widowmaker equips herself with whatever it takes to eliminate her targets, including mines that dispense poisonous gas, a visor that grants her squad infra-sight, and a powerful sniper rifle that can fire in fully-automatic mode.","https://d1u1mce87gyfbn.cloudfront.net/hero/widowmaker/hero-select-portrait.png"));

    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String title;
        public final String desc;
        public final String imgURL;

        public DummyItem(String id, String title, String desc,String imgURL) {
            this.id = id;
            this.title = title;
            this.desc=desc;
            this.imgURL=imgURL;
        }


    }
}