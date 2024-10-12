package com.example.ayurvedicapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class PittaPg extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pitta_pg);

        DBhelper dBhelper=new DBhelper(this);

        ListView listViewpitta;
        listViewpitta=findViewById(R.id.listpitta);
        ArrayList<String> pittainfo = new ArrayList<>();

        String pitainfo="After consuming food, water etc from the universe, it should transform into useful form, with the help of metabolic activity. This transformation, digestion and metabolism is done by Pitta dosh.\n" +
                "\n" +
                "Pitta nirukti\n" +
                "‘Tap santape’. The word ‘Tap-snatape’ means creation of heat, or oxidation process or color change etc.\n" +
                "\n" +
                "Structure of Pitta dosh:\n" +
                "In Ayurveda, Pitta Dosha is one of the three primary doshas, representing the elements of fire and water. It is primarily responsible for digestion, metabolism and transformation within the body. Pitta is characterized by qualities such as heat, sharpness, and intensity, and it governs the body’s ability to digest food and absorb nutrients. The primary site of Pitta in the body is the small intestine, but it also influences the stomach, liver, eyes, and skin. When balanced, Pitta supports a strong digestive fire, clear vision, and a sharp intellect. However, an imbalance can lead to issues like inflammation, heartburn, and irritability.\n" +
                "\n" +
                "Properties of Pitta dosh:\n"+"1.Sa-Sneha (slightly oily) is a key quality of Pitta dosha, essential for softening food during digestion.\n" +
                "However, Pitta's oiliness is not as intense as that of Kapha.\n" +
                "Consuming excess fried foods, fatty meats, and dairy can aggravate Pitta's oily nature, while imbalances in Kapha or Vata, along with a sedentary lifestyle and stress, can further increase oiliness.\n\n" +
                "2.Tikshna (sharpness) is a key quality of Pitta dosha, helping it to penetrate and break down the molecular structure of food during digestion.\n" +
                "However, consuming too much spicy food, hot beverages, and pungent spices can aggravate this sharp quality.\n" +
                "Emotions like anger, frustration, and excessive ambition can also increase Pitta's sharpness, as can imbalances in Vata or Kapha.\n\n" +
                "3.Ushna (heat) is a key property of Pitta dosha, closely linked to digestion.\n" +
                "Excess heat can change the color, taste, and smell of substances.\n" +
                "Overexposure to sunlight, hot environments, or consuming excessive spicy foods and hot beverages can aggravate Pitta’s heat.\n" +
                "Stress, lack of exercise, and a sedentary lifestyle can further increase heat in the body.\n\n" +
                "4.Visra-gandha (unpleasant smell) is a natural characteristic of Pitta, and each person has a distinct odor.\n" +
                "Imbalances in Pitta can lead to an unpleasant body odor, which can be worsened by poor hygiene and consuming too much pungent, salty, or sour foods.\n\n" +
                "Physical Symptoms\n" +
                "1. Skin Issues: Pitta’s fiery nature often leads to skin problems such as acne, rashes, hives, and redness. Individuals with a dominant Pitta dosha may also experience skin sensitivity and inflammation, making them prone to conditions like dermatitis.\n" +
                "2. Digestive Problems: The intense nature of Pitta can result in increased acidity, heartburn, acid reflux, or even diarrhea. These discomforts arise from an excess of stomach acid, leading to a burning sensation in the digestive tract.\n" +
                "3. Inflammation: Inflammatory conditions are common with Pitta imbalances. Joint inflammation can cause discomfort and pain, while eye inflammation, such as conjunctivitis, may lead to red or irritated eyes and heightened sensitivity to light.\n" +
                "4. Excessive Sweating: Profuse sweating is a hallmark of Pitta imbalance, particularly in areas like the armpits, hands, and feet. This overactive sweat response can be particularly distressing in warm weather or stressful situations.\n" +
                "5. Sensitive Digestive Tract: Pitta imbalances can make the digestive system highly sensitive. Eating spicy or heavy foods may result in discomfort, indigestion, and a feeling of bloating or fullness.\n\n"+ "Emotional and Mental Symptoms\n" +
                "1. Irritability: Pitta imbalances often cause heightened irritability. Individuals may find themselves easily provoked, impatient, and short-tempered, even in situations that wouldn’t typically trigger such reactions.\n" +
                "2. Anger: The fire of Pitta can lead to frequent or intense bouts of anger and frustration. Individuals may struggle to manage their temper and may react more strongly to perceived stressors.\n" +
                "3. Competitiveness: The competitive spirit of Pitta can become excessive when imbalanced. This drive for competition and perfectionism can lead to heightened stress and a constant need to outperform others and oneself.\n" +
                "4. Critical Judgment: Pitta imbalances may make individuals overly critical or judgmental, not just of others but also of themselves. This self-critique can contribute to heightened levels of stress and perfectionist tendencies.\n\n"+"Effects of Prolonged Imbalance\n" +
                "1. Hyperacidity: Excess stomach acidity is a common digestive symptom of Pitta imbalance. Those affected often feel overly hot or experience burning sensations in the digestive tract, particularly after meals.\n" +
                "2. Bitter Taste in Mouth: A persistent bitter taste, especially in the morning, is a sign of a Pitta imbalance. This taste can be unpleasant and may contribute to digestive discomfort.\n" +
                "3. Strong Food Craving: Pitta imbalances can lead to cravings for specific tastes, often favoring spicy, sour, or pungent foods.\n" +
                "4. Headaches: Frequent headaches or migraines are common with Pitta imbalance. These can be triggered by stress, dehydration, or irregular eating habits.\n" +
                "5. Vision Issues: Burning sensation in the eyes and sensitivity to light can occur due to Pitta imbalance. This can lead to discomfort and strain on the eyes.\n\n"+"Pitta Cures:\n" +
                "1. Include cooling and hydrating foods such as cucumbers, melons, leafy greens, and zucchini. Raw salads, fresh fruits, and steamed vegetables are great for balancing Pitta.\n" +
                "2. Stay away from spicy, salty, and fried foods, as these can increase Pitta's heat. Instead, focus on mild, bland flavors.\n" +
                "3. Known for its cooling and detoxifying properties, neem helps manage skin issues and inflammation, both of which are often aggravated by Pitta.\n" +
                "4. Engage in cooling and moderate forms of exercise like swimming, walking, or yoga. Avoid overly intense workouts, which can increase Pitta's heat.\n" +
                "5. Gentle yoga with a focus on forward bends, twists, and seated poses can help cool down Pitta. Avoid hot or power yoga, which can increase Pitta’s heat."+"\n"+"\n";

        if (!dBhelper.isDataExistpittainfo(pitainfo)) {
            dBhelper.addDatapittainfo(pitainfo);
        }

        ArrayList<Symptomodel> arrpitta = dBhelper.fetchdatpittainfo();

        for (Symptomodel model : arrpitta) {
            pittainfo.add(model.Pitta);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.textcolor,R.id.textViewItem,pittainfo);
        listViewpitta.setAdapter(adapter);
    }
}