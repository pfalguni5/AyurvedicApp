package com.example.ayurvedicapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class KaphaPg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kapha_pg);
        DBhelper dBhelper=new DBhelper(this);

        ListView listkapha;
        listkapha=findViewById(R.id.listKapha);
        ArrayList<String> kahphaainfo = new ArrayList<>();

        String kaphinfo="There is constant wear and tear in the body (Shiryate tat sharirm). However we experience that from childhood to death the body grows and is maintained well. Because addition of tissues by proper nourishment is also taking place along with wear and tear. Protection of all organs against wear and tear and maintaining molecular union and to provide stability, to stimulate growth is a function of Kapha dosh. Due to this anabolic activity, body is preserved from ageing.\n\n" +
                "Kapha nirukti\nThe element, which increases due to contact with water, is called as Kapha. This explains the intimate relation of Kapha and water. Also it is clear that body growth is dependent on Kapha and water.\n\n" +
                "Structure of Kapha dosh\nKapha dosha is one of the three fundamental energies or humors in Ayurveda, representing the earth and water elements. It is associated with structure, stability, and lubrication in the body. Kapha is responsible for maintaining body fluids, tissues, and immunity. Kapha dosha is characterized by its heavy, slow, and cold qualities. It is responsible for the body’s structure, including bones, muscles, and fat. It also governs the production of mucus, saliva, and other bodily fluids. Kapha is essential for maintaining moisture, lubrication, and immunity in the body. Balancing Kapha involves dietary changes, lifestyle modifications, and Ayurvedic therapies.\n" +
                "Properties of Kapha dosh:\n"+"1.Snigdha (oiliness or unctuousness) is the most important property of Kapha dosha, providing moisture and softness." +
                "This moisture helps maintain the body, keeping it sustained and stable." +
                "Excessive consumption of heavy, oily, and sweet foods,a sedentary lifestyle and emotional stress can contribute to an imbalance of Snigdha Kapha." +
                "Excess Snigdha Kapha can lead to weight gain, sluggishness, and excessive mucus production.\n\n"+"Guru (heavy) property is responsible for weight gain and increases the strength of the body.\n" +
                "2.Kapha's Brimhna (weight-promoting) function is due to its heavy nature, and foods like wheat and black gram are heavy in nature." +
                "Overconsumption of heavy, dense foods, lack of exercise, and emotional stagnation can contribute to an imbalance of Guru Kapha." +
                "Excess Guru Kapha can lead to weight gain, sluggishness, and decreased energy levels.\n\n"+"3.Shlakshna (slimy) property helps replenish damaged or degenerated tissues." +
                "In the nasal, oral, and respiratory passages, as well as the heart and lungs, continuous movement of air, food, water, and blood circulation creates dryness." +
                "To prevent wear and tear, Kapha with its slimy property is secreted to offer protection and support." +
                "Excessive consumption of mucus-forming foods, exposure to cold and damp environments, and emotional stagnation can contribute to an imbalance of Shlakshna Kapha." +
                "Excess Shlakshna Kapha can lead to excessive mucus production, respiratory congestion, and sluggishness.\n\n" +"Physical Symptoms\n" +
                "1. Excess Mucus: An imbalance in Kapha often leads to an overproduction of mucus, resulting in congestion, sinus issues, and frequent colds. This can cause respiratory problems and a feeling of heaviness in the chest.\n" +
                "2. Weight Gain: Kapha imbalance can lead to weight gain and difficulty losing weight. This is due to the dosha’s heavy and slow qualities, which can slow down metabolism and increase fat accumulation.\n" +
                "3. Sluggish Digestion: Slow and sluggish digestion is a common symptom. This can result in a feeling of fullness, bloating, and a lack of appetite. The digestive fire (Agni) becomes weak, leading to poor digestion and assimilation of nutrients.\n" +
                "4. Lethargy and Fatigue: Individuals with a Kapha imbalance often feel lethargic and fatigued. This can manifest as a lack of energy, drowsiness, and a general sense of heaviness in the body.\n" +
                "5. Cold and Damp Sensation: A feeling of coldness and dampness in the body is typical of Kapha imbalance. This can make individuals more susceptible to cold weather and damp environments, leading to discomfort and stiffness.\n\n"+"Emotional and Mental Symptoms\n" +
                "1. Depression and Melancholy: Kapha imbalance can lead to feelings of depression, sadness, and melancholy. This emotional heaviness can make it difficult to find joy and motivation in daily activities.\n" +
                "2. Stubbornness and Resistance to Change: Individuals with a Kapha imbalance may exhibit stubbornness and resistance to change. They may find it challenging to adapt to new situations and prefer sticking to familiar routines.\n" +
                "3. Emotional Overeating: A tendency to eat emotionally, especially when feeling stressed or sad, is common. This can lead to further weight gain and digestive issues.\n" +
                "4. Complacency and Lack of Motivation: A lack of motivation and a sense of complacency can occur. This can result in procrastination and difficulty in initiating or completing tasks.\n\n"+"Effects of Prolonged Imbalance\n" +
                "1. Chronic Sinus Infection: Persistent sinus infections and respiratory issues can develop due to the excess mucus production associated with Kapha imbalance.\n" +
                "2. High Cholesterol: Prolonged Kapha imbalance can lead to high cholesterol levels and an increased risk of heart-related issues due to the accumulation of fatty deposits in the arteries.\n" +
                "3. Diabetes and Metabolic Disorder: The slow metabolism and weight gain associated with Kapha imbalance can increase the risk of developing diabetes and other metabolic disorders.\n" +
                "4. Joint Pain and Stiffness: Excess Kapha can lead to joint pain and stiffness, making movement difficult and uncomfortable.\n\n" +"Kapha Cures: \n" +
                "1. Known for its respiratory benefits, tulsi helps clear congestion and supports Kapha balance.\n" +
                "2. Practice Kapalbhati daily. This rapid breathing technique helps energize and invigorate, which is great for reducing Kapha.\n" +
                "3. Avoid dairy, fatty and oily foods, as well as cold drinks and sweet.\n" +
                "4. Engage in vigorous exercise such as jogging, cycling, swimming, or yoga. Physical movement helps stimulate and reduce the sluggishness of Kapha.\n" +
                "5. Spending time in the sun can help counter Kapha’s cold and damp qualities.\n"+"\n"+"\n";

        if (!dBhelper.isDataExistkaphainfo(kaphinfo)) {
            dBhelper.addDatakaphainfo(kaphinfo);
        }

        ArrayList<Symptomodel> arrkapha = dBhelper.fetchdatkaphainfo();

        for (Symptomodel model : arrkapha) {
            kahphaainfo.add(model.Kapha);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.textcolor,R.id.textViewItem,kahphaainfo);
        listkapha.setAdapter(adapter);
    }
}