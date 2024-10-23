package com.example.ayurvedicapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HerbsDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_herbs_detail);

        TextView herbsNameTextView=findViewById(R.id.herbsNameTextView);
        TextView herbsDescriptionTextView=findViewById(R.id.herbsDescriptionTextView);

        String herbsName=getIntent().getStringExtra("herbs_name");

        herbsNameTextView.setText(herbsName);

        assert herbsName!=null;
        String description=getHerbsDescription(herbsName);
        herbsDescriptionTextView.setText(description);

    }

    private String getHerbsDescription(String herbsName){
        switch (herbsName){
            case "Saffron":
                return "Ayurvedic properties:"+
                        "\n"+"Saffron is known for its ability to balance all three doshas (Vata, Pitta, and Kapha), with a particular affinity for soothing Pitta. It has a sweet, slightly bitter taste, and a warming effect.\n\n"
                        +"Benefits:"+"\n"+"It enhances complexion, improves digestion, and strengthens the reproductive system. Saffron is also widely used to uplift mood, improve circulation, and act as a mild aphrodisiac.\n\n"+"Uses: "+"\n"+"In Ayurveda, it is often used in skin care treatments, heart health tonics, and for boosting immunity. Saffron milk is a common remedy for boosting vitality and treating depression.";

            case "Turmeric":
                return "Turmeric (Haldi)\n" +
                        "Ayurvedic properties:"+"\n"+"Turmeric primarily pacifies Kapha and Pitta doshas. It has a bitter, pungent taste, and is heating in nature.\n\n" +
                        "Benefits:"+"\n"+ "Known for its strong anti-inflammatory and antioxidant properties, turmeric is beneficial for purifying the blood, promoting digestion, and enhancing skin health. It is a natural antibiotic and supports liver detoxification.\n\n" +
                        "Uses:"+"\n"+"In Ayurveda, it is used in a variety of formulations for treating skin conditions, arthritis, and respiratory disorders. Turmeric is also used in daily cooking as a spice to support digestion and overall health.";
            case "Ginger":
                return "Ginger (Adrak/Shunthi)\n" +
                        "Ayurvedic properties:"+"\n"+ "Ginger is renowned for balancing Vata and Kapha doshas. It has a pungent taste and heating properties, which aid digestion and enhance Agni (digestive fire).\n\n" +
                        "Benefits:"+"\n" +"Ginger is a powerful remedy for digestive issues like nausea, bloating, and indigestion. It also helps in clearing respiratory congestion and supports healthy circulation. It boosts metabolism and alleviates joint pain.\n\n" +
                        "Uses:"+"\n"+"Fresh ginger is commonly used to make teas and is added to food to stimulate digestion. Dried ginger (Shunthi) is used in Ayurvedic formulations for respiratory and digestive disorders.";

            case "Cumin":
                return  "Cumin (Jeera)\n" +
                        "Ayurvedic properties:"+"\n"+"Cumin balances Vata and Kapha doshas, while stimulating the digestive fire (Agni). It has a pungent, bitter taste, and is slightly heating in nature.\n\n" +
                        "Benefits:"+"\n"+"It aids digestion, improves appetite, and helps in the absorption of nutrients. Cumin also has detoxifying effects, supports lactation in nursing mothers, and soothes abdominal discomfort.\n\n" +
                        "Uses:"+"\n"+"Widely used as a spice in cooking, cumin seeds are added to foods to improve digestion. It is also a key ingredient in Ayurvedic formulations for bloating and indigestion.";

            case "Tulsi":
                return "Tulsi (Holy Basil)\n" +
                        "Ayurvedic properties:"+"\n"+ "Tulsi balances Vata and Kapha doshas, with a slight warming effect. It has a pungent and bitter taste, and is considered one of the most sacred herbs in Ayurveda.\n\n" +
                        "Benefits:"+"\n"+"Tulsi supports respiratory health, strengthens immunity, and acts as an adaptogen, helping the body cope with stress. It is also known for its antimicrobial, anti-inflammatory, and antioxidant properties.\n\n" +
                        "Uses:"+"\n"+"Tulsi is used in herbal teas, medicinal oils, and tonics to treat colds, coughs, and respiratory infections. It is also used in stress-relief remedies and to promote mental clarity.";

            case "Neem":
                return "Neem\n" +
                       "Ayurvedic properties:"+"\n"+"Neem is cooling in nature and primarily balances Pitta and Kapha doshas. It has a bitter taste and is known for its powerful detoxifying and purifying qualities.\n\n" +
                       "Benefits:"+"\n"+"Neem is an excellent blood purifier, supporting skin health and helping to clear acne, eczema, and other skin issues. It also helps in cleansing the liver and fighting infections due to its antibacterial and antiviral properties.\n\n" +
                       "Uses:"+"\n"+"Neem is used in various forms like oils, powders, and capsules. It is a common ingredient in Ayurvedic skin care, dental care, and digestive formulations.";

            case "Aloe Vera":
                return  "Aloe Vera (Ghritkumari)\n" +
                        "Ayurvedic properties:"+"\n"+"Aloe Vera primarily pacifies Pitta dosha due to its cooling nature. It has a bitter and sweet taste, and is well-known for its soothing properties.\n\n" +
                        "Benefits:"+"\n"+"Aloe Vera is a powerful skin soother and healer, helping with burns, wounds, and irritation. It also supports digestion, acts as a mild laxative, and helps detoxify the body. Additionally, it boosts immunity and enhances the body's natural healing process.\n\n" +
                        "Uses:"+"\n"+"Aloe Vera gel is commonly applied topically for skin issues, while the juice is consumed for digestive health and detoxification.";

            case "SandelWood":
                return  "Sandalwood (Chandan)\n" +
                        "Ayurvedic properties:"+"\n"+"Sandalwood is cooling in nature and balances Pitta dosha. It has a sweet, bitter taste and is known for its calming and soothing effects on the mind and body.\n\n" +
                        "Benefits:"+"\n"+"Sandalwood is renowned for promoting mental clarity, reducing stress, and enhancing skin complexion. It is widely used for its anti-inflammatory, antiseptic, and anti-aging properties.\n\n" +
                        "Uses:"+"\n"+"Sandalwood is used in skin care products for treating acne, blemishes, and sunburn. It is also used in aromatherapy to induce calmness and spiritual focus.";

            case "Amla":
                return "Amla (Indian Gooseberry)\n" +
                        "Ayurvedic properties:"+"\n"+"Amla is one of the most important rejuvenating herbs in Ayurveda, balancing all three doshas but especially pacifying Pitta. It has a sour taste and is cooling in nature.\n\n" +
                        "Benefits:"+"\n"+"Amla is extremely rich in Vitamin C and is known for boosting immunity, enhancing skin health, and promoting healthy digestion. It rejuvenates tissues, supports liver health, and acts as an anti-aging tonic.\n\n" +
                        "Uses:"+"\n"+"Amla is used in various forms such as powder, juice, and in herbal formulations like Chyawanprash. It is a key ingredient in hair care products and is also used to support eye health and overall vitality.";

            default:
                return "No Description available for now";


        }
    }
}