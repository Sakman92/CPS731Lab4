package com.example.cps731lab4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private ArrayList<String> mTitles = new ArrayList<>();
    private ArrayList<String> mDescriptions = new ArrayList<>();
    private ArrayList<String> mImageURLs=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initList();
    }
    private void initList(){

        mTitles.add("Ana");
        mDescriptions.add("Ana’s versatile arsenal allows her to affect heroes all over the battlefield. Her Biotic Rifle rounds and Biotic Grenades heal allies and damage or impair enemies; her sidearm tranquilizes key targets, and Nano Boost gives one of her comrades a considerable increase in power.");
        mImageURLs.add("https://d1u1mce87gyfbn.cloudfront.net/hero/ana/hero-select-portrait.png");
        mTitles.add("Ashe");
        mDescriptions.add("Ashe quickly fires her rifle from the hip or uses her weapon’s aim-down sights to line up a high damage shot. She blasts enemies by throwing dynamite, and her coach gun packs enough punch to put some distance between her and her foes. And Ashe is not alone, as she can call on her omnic ally Bob, to join the fray when the need arises.");
        mImageURLs.add("https://d1u1mce87gyfbn.cloudfront.net/hero/ashe/hero-select-portrait.png");
        mTitles.add("Brigitte");
        mDescriptions.add("Brigitte specializes in armor. She can throw Repair Packs to heal teammates, or automatically heal nearby allies when she damages foes with her Flail. Her Flail is capable of a wide swing to strike multiple targets, or a Whip Shot that stuns an enemy at range. When entering the fray, Barrier Shield provides personal defense while she attacks enemies with Shield Bash. Brigitte’s ultimate ability, Rally, gives her a substantial short-term boost of speed and provides long-lasting armor to all her nearby allies.");
        mImageURLs.add("https://d1u1mce87gyfbn.cloudfront.net/hero/brigitte/hero-select-portrait.png");
        mTitles.add("Echo");
        mDescriptions.add("Echo is an evolutionary robot programmed with a rapidly adapting artificial intelligence, versatile enough to fill multiple battlefield combat roles.");
        mImageURLs.add("https://d1u1mce87gyfbn.cloudfront.net/hero/echo/hero-select-portrait.png");
        mTitles.add("Mei");
        mDescriptions.add("Mei’s weather-altering devices slow opponents and protect locations. Her Endothermic Blaster unleashes damaging icicles and frost streams, and she can Cryo-Freeze herself to guard against counterattacks, or obstruct the opposing team's movements with an Ice Wall.");
        mImageURLs.add("https://d1u1mce87gyfbn.cloudfront.net/hero/mei/hero-select-portrait.png");
        mTitles.add("Mercy");
        mDescriptions.add("Mercy’s Valkyrie Suit helps keep her close to teammates like a guardian angel; healing, resurrecting or strengthening them with the beams emanating from her Caduceus Staff.");
        mImageURLs.add("https://d1u1mce87gyfbn.cloudfront.net/hero/mercy/hero-select-portrait.png");
        mTitles.add("Moira");
        mDescriptions.add("Moira’s biotic abilities enable her to contribute healing or damage in any crisis. While Biotic Grasp gives Moira short-range options, her Biotic Orbs contribute longer-range, hands-off damage and healing; she can also Fade to escape groups or remain close to allies in need of support. Once she’s charged Coalescence, Moira can save multiple allies from elimination at once or finish off weakened enemies.");
        mImageURLs.add("https://d1u1mce87gyfbn.cloudfront.net/hero/moira/hero-select-portrait.png");
        mTitles.add("Sombra");
        mDescriptions.add("Stealth and debilitating attacks make Sombra a powerful infiltrator. Her hacking can disrupt her enemies, ensuring they're easier to take out, while her EMP provides the upper hand against multiple foes at once. Sombra’s ability to Translocate and camouflage herself makes her a hard target to pin down.");
        mImageURLs.add("https://d1u1mce87gyfbn.cloudfront.net/hero/sombra/hero-select-portrait.png");
        mTitles.add("Widowmaker");
        mDescriptions.add("Widowmaker equips herself with whatever it takes to eliminate her targets, including mines that dispense poisonous gas, a visor that grants her squad infra-sight, and a powerful sniper rifle that can fire in fully-automatic mode.");
        mImageURLs.add("https://d1u1mce87gyfbn.cloudfront.net/hero/widowmaker/hero-select-portrait.png");

        initRecyclerView();

    }
    private void initRecyclerView(){

            RecyclerView recyclerView = findViewById(R.id.rvList);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            RecyclerViewAdapter adapter=new RecyclerViewAdapter(this,mTitles,mDescriptions,mImageURLs);
            recyclerView.setAdapter(adapter);

    }
}