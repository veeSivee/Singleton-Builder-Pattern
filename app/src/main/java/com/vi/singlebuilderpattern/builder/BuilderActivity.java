package com.vi.singlebuilderpattern.builder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.vi.singlebuilderpattern.R;

import java.util.logging.Logger;

public class BuilderActivity extends AppCompatActivity {

    private static final Logger LOGGER = Logger.getLogger("logger");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder);

        setTitle("Builder Pattern");

        test();
    }

    private void test(){
        Hero mage = new Hero.Builder(Profession.MAGE,"Magemage")
                .withHairColor(HairColor.BLACK)
                .withHairType(HairType.BALD)
                .build();

        LOGGER.info(mage.toString());


        Hero thief = new Hero.Builder(Profession.THIEF,"thieeef")
                .withHairColor(HairColor.BLOND)
                .withHairType(HairType.CURLY)
                .build();

        LOGGER.info(thief.toString());
    }
}
