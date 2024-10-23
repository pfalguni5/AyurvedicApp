package com.example.ayurvedicapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.text.LineBreaker;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class VattaPg extends AppCompatActivity {
    Button Sympbut, HealthIssbut, AyuCurebut;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_vatta_pg);

        DBhelper dBhelper=new DBhelper(this);

        TextView vattaInfoTextView = findViewById(R.id.vattaInfoTextView);

        String vatinfo="An element in the body which is responsible for any sort of movement is called as ‘Vata dosh’. Vata has special importance among Tridoshas. \n" +
                "In the human body, Pitta, Kapha, tissues and wastes are handicapped for doing their activities independently. Each and every action needs the stimulation of Vata dosh. We can observe the same thing in nature. Movements of clouds, sea waves, shifting of sands, movement of tree leaves and even earthquake are all due to principle of population.\n" +
                "\n" +
                "Vata nirukti\n" +
                "“Ta” is a suffix to “Va”. “Va” word is concerned with movement (gati) and enthusiasm (gadhan) so, the movement, needed for union and separation is carried by Vata dosh.\n" +
                "\n" +
                "Structure of Vata dosh:\n" +
                "Vata dosh is invisible, but can be experienced from its functions. It does not possess physical measurements like length, breadth, height but the activities of Vata can be seen. Vata can be compared with electrical energy. We cannot see the electricity but we can experience its functions like lighting bulbs, tube lights, television and through various other electrically operated machines.\n" +
                "\n" +
                "Properties of Vata Dosh:\n"+"1.Ruksha (dryness) is a key characteristic of Vata dosha in Ayurveda, often seen in the skin, hair, mouth, throat, and intestines, leading to symptoms like constipation, cracking joints, and wrinkles.\n" +
                "Factors like dehydration, dry environments, and imbalances in Pitta and Kapha can worsen this condition.\n" +
                "Lifestyle aspects such as poor diet, stress, lack of sleep, and over-exertion also aggravate Vata.\n\n" +
                "2.Laghu (lightness) is a key feature of Vata dosha, reflecting its subtle and mobile nature.\n" +
                "When Vata is imbalanced, it can lead to tissue loss, reduced weight, increased mobility, and restlessness.\n" +
                "Aggravating factors include excessive consumption of dry, light, and cold foods, irregular eating habits, lack of sleep, over-exercise, exposure to cold, and stress.\n\n" +
                "3.Sheeta (coldness) is a key characteristic of Vata dosha, often leading to a preference for warmth and sensitivity to cold.\n" +
                "Factors like cold temperatures, cold foods, emotional stress, and dosha imbalances can aggravate Sheeta Vata.\n\n" +
                "4.Khara (roughness) is a key quality of Vata dosha, contributing to its ability to separate and move substances within the body.\n" +
                "It is associated with the exfoliating action of the skin and is sometimes used in Ayurvedic treatments for fat reduction.\n" +
                "Excess consumption of dry, rough, and spicy foods, irregular eating habits, lack of sleep, and stress can aggravate Vata and lead to roughness.\n\n"+"Physical Symptoms:\n" +
                "1. Constipation: This symptom involves difficulty in passing stools or experiencing irregular bowel movements. It can be caused by a lack of fiber in the diet, dehydration, or stress. Constipation often leads to discomfort, bloating, and a feeling of heaviness in the abdomen. Regular hydration, a fiber-rich diet, and stress management can help alleviate this condition.\n" +
                "2. Dry and Rough Skin: Vata imbalance can cause the skin to become dry, rough, and prone to cracking. This is due to the dosha’s inherent dryness and cold qualities. Moisturizing regularly, consuming hydrating foods, and avoiding excessive exposure to cold and dry environments can help maintain skin health.\n" +
                "3. Dehydration: A lack of sufficient moisture in the body leads to dehydration, which can manifest as dry skin, dry mouth, and a general feeling of thirst. Drinking plenty of water, consuming hydrating foods, and avoiding diuretics like caffeine can help prevent dehydration.\n" +
                "4. Body Aches and Pains: Generalized aches, pains, and stiffness in the body are common with Vata imbalance. These symptoms can affect muscles and joints, leading to discomfort and reduced mobility. Gentle exercises, warm baths, and massages with warming oils can provide relief.\n" +
                "5. Fatigue and Low Vitality: A feeling of tiredness and lack of energy is often associated with Vata imbalance. This can result from poor sleep, inadequate nutrition, or excessive physical or mental activity. Ensuring a balanced diet, regular rest, and moderate exercise can help boost energy levels.\n" +
                "6. Disturbed Sleep: Difficulty falling asleep or staying asleep, leading to insomnia, is a common symptom of Vata imbalance. This can be due to an overactive mind or stress. Establishing a calming bedtime routine, avoiding stimulants, and practicing relaxation techniques can improve sleep quality.\n\n" +
                "Behavioral Symptoms:\n" +
                "1. Anxiety and Nervousness: Feeling anxious, nervous, or agitated is a hallmark of Vata imbalance. This can be triggered by stress, overthinking, or an unstable routine. Practices like meditation, deep breathing, and grounding activities can help calm the mind.\n" +
                "2. Restlessness: An inability to stay still, constantly moving or fidgeting, is another symptom. This restlessness can affect both physical and mental states, making it hard to focus or relax. Engaging in calming activities and maintaining a regular schedule can help manage restlessness.\n" +
                "3. Irrational Thoughts: Experiencing irrational fears or thoughts can be unsettling and is often linked to Vata imbalance. These thoughts can lead to unnecessary worry and stress. Cognitive-behavioral techniques and mindfulness practices can help manage and reduce irrational thoughts.\n" +
                "4. Impatience: A lack of patience and a tendency to become easily frustrated are common behavioral symptoms. This can affect personal and professional relationships. Practicing patience through mindfulness, setting realistic expectations, and taking breaks can help.\n" +
                "5. Excessive Talking: Talking more than usual or feeling the need to talk constantly can be a sign of Vata imbalance. This can be due to an overactive mind or nervous energy. Practicing active listening and engaging in calming activities can help balance this tendency.\n\n" +
                "Effects of Prolonged Imbalance:\n" +
                "1. Muscle Wasting: Loss of muscle mass and strength can occur with prolonged Vata imbalance. This can lead to weakness and reduced physical capabilities. Regular strength training, proper nutrition, and adequate rest are essential to prevent muscle wasting.\n" +
                "2. Joint Pains and Stiffness: Increased pain and stiffness in the joints can result from chronic Vata imbalance. This can limit mobility and cause discomfort. Warm oil massages, gentle stretching, and maintaining an active lifestyle can help alleviate these symptoms.\n" +
                "3. Headaches: Frequent headaches or migraines are common with Vata imbalance. These can be triggered by stress, dehydration, or irregular eating habits. Staying hydrated, maintaining a regular eating schedule, and practicing relaxation techniques can help reduce headaches.\n" +
                "4. Weight Loss: Unintended weight loss and a decrease in body mass can occur due to poor digestion and nutrient absorption. Ensuring a balanced diet, eating regular meals, and avoiding excessive fasting can help maintain a healthy weight.\n" +
                "5. Phobias: Development of irrational fears or phobias can be a severe consequence of prolonged Vata imbalance. These can significantly impact daily life and mental health. Professional counseling, exposure therapy, and stress management techniques can help manage phobias.\n\n"+"Vata Cures: \n" +
                "1. Ginger tea or fresh ginger can stimulate digestion and provide warmth to balance Vata’s cold nature.\n" +
                "2. Vata thrives with regularity. Establish a daily routine for waking, eating, and sleeping at the same times each day.\n" +
                "3. Regular meditation practices can help quiet the mental chatter and restlessness often associated with Vata imbalances.\n" +
                "4. Drink plenty of warm water, herbal teas, and broths to stay hydrated and maintain internal moisture. Avoid cold beverages, as they can aggravate Vata’s dryness.\n" +
                "5. Favor sweet, salty, and sour tastes in your diet as they help ground and balance Vata. Include foods like sweet fruits, whole grains, root vegetables, and dairy products (if well-tolerated)."+"\n"+"\n";


        SpannableString spannableContent = new SpannableString(vatinfo);

        // Bold "Vata nirukti" and other headings
        String[] boldTexts = {"Vata nirukti", "Structure of Vata dosh:", "Properties of Vata Dosh:", "Physical Symptoms:","Vata Cures:","Effects of Prolonged Imbalance:","Behavioral Symptoms:","Physical Symptoms:"};
        for (String boldText : boldTexts) {
            int start = vatinfo.indexOf(boldText);
            if (start >= 0) {
                spannableContent.setSpan(new StyleSpan(Typeface.BOLD), start, start + boldText.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            }
        }

        // Set the formatted text in TextView
        vattaInfoTextView.setText(spannableContent);
        vattaInfoTextView.setJustificationMode(LineBreaker.JUSTIFICATION_MODE_INTER_WORD); // Justify text

        // Optionally: Fetch and display dynamic content from database
        ArrayList<Symptomodel> arrinfo = dBhelper.fetchdatinfo();
        for (Symptomodel model : arrinfo) {
            spannableContent = new SpannableString(model.Info); // Handle text dynamically
            vattaInfoTextView.append("\n\n" + spannableContent); // Append fetched data
        }

    }
}