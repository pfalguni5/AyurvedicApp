package com.example.ayurvedicapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RemedyDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remedy_detail);

        TextView remedyNameTextView = findViewById(R.id.remedyNameTextView);
        TextView remedyDescriptionTextView = findViewById(R.id.remedyDescriptionTextView);

        // Get the remedy name from the intent
        String remedyName = getIntent().getStringExtra("remedy_name");

        // Set the remedy name to the TextView
        remedyNameTextView.setText(remedyName);

        // Here you can set the description based on the remedy name
        assert remedyName != null;
        String description = getRemedyDescription(remedyName);
        remedyDescriptionTextView.setText(description);
    }

    private String getRemedyDescription(String remedyName) {
        // You can store your remedy descriptions in a HashMap or switch case
        switch (remedyName) {
            case "Allergy":
                return "Allergy types, symptoms, and Ayurvedic remedies:\n\n" +
                        "1. Food Allergies:\n" +
                        "Symptoms: Hives, swelling, nausea, vomiting, anaphylaxis.\n" +
                        "Trigger: Peanuts, shellfish, eggs, dairy, etc.\n" +
                        "Ayurvedic treatment: Avoid allergenic foods; consume easily digestible, warm meals. And herbs like Triphala, Amla, Neem, Ginger can cure food allergy.\n\n" +

                        "2. Skin Allergies:\n" +
                        "Symptoms: Eczema, hives, rashes, itching.\n" +
                        "Trigger: Contact with allergens (soaps, plants, metals).\n" +
                        "Ayurvedic treatment: Avoid spicy, fried, and sour foods; favor cooling foods like cucumber and coconut water. And herbs like Neem, Haridra, Manjishtha, Aloe Vera can cure Skin allergy.\n\n" +

                        "3. Pet Allergies:\n" +
                        "Symptoms: Sneezing, runny nose, wheezing, rashes.\n" +
                        "Trigger: Animal dander, saliva.\n" +
                        "Ayurvedic treatment: Avoid Kapha-increasing foods like dairy; focus on warm, light meals and herbs like Tulsi, Licorice, Haridra can cure pet allergy.\n\n" +

                        "4. Respiratory Allergies:\n" +
                        "Symptoms: Sneezing, coughing, wheezing, shortness of breath.\n" +
                        "Trigger: Dust mites, mold, pet dander, pollen.\n" +
                        "Ayurvedic treatment: Follow diet of warm herbal teas (ginger, pepper), avoid dairy and cold foods. And herbs like tulsi, Licorice, Pippali (Long Pepper), Guduchi can cure the respiratory allergy.";

            case "Acidity":
                return "Acidity occurs when excess stomach acid is produced, leading to discomfort or a burning sensation in the chest (heartburn) or stomach.\n\n" +
                        "This condition, also called acid reflux, happens when acid from the stomach rises into the oesophagus.\n\n" +
                        "Symptoms of Acidity are:\n" +
                        "1. A burning sensation in the chest or throat, usually after eating.\n" +
                        "2. A feeling of fullness or discomfort in the upper abdomen.\n" +
                        "3. Feeling of sickness, especially after eating.\n" +
                        "4. Excessive gas and burping after meals.\n" +
                        "5. A feeling of food getting stuck in the throat.\n\n" +
                        "Ayurvedic remedies for acidity:\n" +
                        "1. For burning sensation in chest take 1 tsp of Amla powder with warm water, or consume fresh Aloe Vera juice daily to cool the stomach.\n" +
                        "2. To cure the feeling of fullness, after meals, chew on a teaspoon of roasted fennel seeds or drink a tea made from fennel and cumin seeds to ease digestion.\n" +
                        "3. For feeling of sickness drink ginger tea or fresh coriander juice to relieve nausea and settle the stomach. A mix of ginger and honey can also be helpful.\n" +
                        "4. To treat excessive gas and burping mix 1/2 tsp of Ajwain and a pinch of Hing in warm water and drink it after meals to reduce gas and bloating. Triphala powder at bedtime also helps improve digestion and prevent gas.\n" +
                        "5. For feeling of food getting stuck in throat drink warm water mixed with licorice powder to soothe the throat and prevent acid from rising. Ghee mixed with warm milk can also help reduce irritation in the oesophagus.";

            case "Headache":
                return "A headache is a common condition that causes pain or discomfort in the head, scalp, or neck.\n\n" +
                        "It can be triggered by various factors such as stress, dehydration, poor posture, eyestrain, or underlying health issues.\n\n" +
                        "Headaches are classified into different types, including tension headaches (caused by muscle tension), migraines (often with throbbing pain and sensitivity to light), and sinus headaches (due to sinus congestion).\n\n" +
                        "Ayurvedic Remedies for headache:\n" +
                        "1. Apply a warm compress or heating pad to the neck and shoulders to relieve muscle tension that can cause headaches.\n" +
                        "2. Drink plenty of water and herbal teas (like chamomile or peppermint) to stay hydrated, as dehydration can lead to headaches.\n" +
                        "3. Drink warm milk mixed with turmeric for its anti-inflammatory and analgesic properties.\n" +
                        "4. Massage Brahmi oil onto the scalp and temples for its calming properties.\n" +
                        "5. Practice yoga and pranayama (breathing exercises) to relieve stress and tension. Poses like Child’s Pose and Forward Bend can be particularly helpful.\n" +
                        "6. Chew on cloves or make a tea with clove and honey to alleviate headaches.\n" +
                        "7. Brew ajwain tea to help reduce headaches caused by digestive issues.\n" +
                        "8. Ensure adequate rest, and take breaks from screens to prevent eyestrain. Engage in relaxation techniques like meditation or deep breathing exercises.";

            case "Malaria":
                return "Malaria is a life-threatening disease caused by parasites of the Plasmodium species, transmitted to humans through the bites of infected female Anopheles mosquitoes.\n\n" +
                        "Symptoms typically appear 10 days to 4 weeks after being bitten and include fever, chills, sweating, headache, nausea, vomiting, and fatigue.\n\n" +
                        "Severe cases can lead to complications such as anemia, respiratory distress, and organ failure.\n\n" +
                        "Preventive measures include using insecticide-treated bed nets, indoor spraying, and taking antimalarial medications when traveling to endemic areas.\n\n" +
                        "Early diagnosis and treatment are crucial for effective management of the disease.\n\n" +
                        "Ayurvedic remedies for Malaria:\n" +
                        "1. Drink ginger tea by boiling fresh ginger slices in water or mix ginger powder with honey and consume.\n" +
                        "2. Focus on a light and easily digestible diet. Include warm soups, khichdi (rice and lentil dish), and plenty of fruits and vegetables to support recovery.\n" +
                        "3. Soak fenugreek seeds overnight, consume in the morning, or make fenugreek tea.\n" +
                        "4. Extract juice from fresh papaya leaves and consume 1-2 tablespoons daily.\n" +
                        "5. Prepare a decoction with Neem leaves or take Neem capsules as directed by a practitioner.";

            case "Hair fall":
                return "Hair fall, or hair loss, is a common condition that can affect individuals of all ages.\n\n" +
                        "It occurs when hair strands fall out faster than they can be replaced, leading to thinning or baldness.\n\n" +
                        "Various factors contribute to hair fall, including genetics (androgenetic alopecia), hormonal changes (such as those during pregnancy or menopause), nutritional deficiencies, stress, medical conditions (like thyroid disorders or alopecia areata), and certain medications.\n\n" +
                        "Symptoms may include excessive shedding of hair, visible thinning, and patchy bald spots.\n\n" +
                        "While hair loss can be distressing, various treatments, including lifestyle changes, dietary adjustments, topical treatments, and medications, can help manage and reduce hair fall.\n\n" +
                        "Ayurvedic remedies for hairfall:\n" +
                        "1. Apply Amla oil to the scalp or mix Amla powder with water to create a paste. Leave it on for 30-60 minutes before washing.\n" +
                        "2. Use Bhringraj oil for scalp massage or prepare a hair mask with Bhringraj powder mixed with yogurt.\n" +
                        "3. Soak fenugreek seeds overnight, grind into a paste, and apply to the scalp for 30-60 minutes before rinsing.\n" +
                        "4. Warm coconut oil and massage it into the scalp and hair. Leave it on for a few hours or overnight before washing.\n" +
                        "5. Boil neem leaves in water, strain, and use the water as a rinse after shampooing. Alternatively, use neem oil for scalp massage.\n" +
                        "6. Apply fresh aloe vera gel to the scalp and hair, leave for 30-60 minutes, then rinse with water.";

            case "Diabetes":
                return "Diabetes is a chronic medical condition characterized by high blood sugar (glucose) levels due to the body’s inability to produce or effectively use insulin.\n\n" +
                        "Common Symptoms:\n" +
                        "• Increased thirst and hunger\n" +
                        "• Frequent urination\n" +
                        "• Fatigue\n" +
                        "• Blurred vision\n" +
                        "• Slow-healing sores or frequent infections\n" +
                        "• Unintended weight loss\n\n" +
                        "Ayurvedic remedies to diabetes:\n" +
                        "1. Drink fresh bitter gourd juice on an empty stomach in the morning. You can also include it in your regular diet.\n" +
                        "2. Dry Jamun seeds, grind them into a powder, and consume 1 tsp of the powder with water daily.\n" +
                        "3. Chew 3-5 fresh Bael leaves daily or drink the juice extracted from them.\n" +
                        "4. Take Gurmar powder or capsules as recommended by a practitioner.";


            case "Dark circles":
                return "Dark circles refer to the discoloration of the skin under the eyes, often appearing as dark or shadowy patches.\n\n" +
                        "They can be caused by various factors, including lack of sleep, fatigue, stress, dehydration, genetics, aging, allergies, and excessive sun exposure.\n\n" +
                        "While dark circles are generally not a serious health issue, they can affect one's appearance and may indicate underlying health problems.\n\n" +
                        "Ayurvedic remedies for dark circles:\n" +
                        "1. Place chilled cucumber slices over the eyes for about 10-15 minutes.\n" +
                        "2. Place thin potato slices over the eyes for 10-15 minutes or use potato juice soaked in cotton pads.\n" +
                        "3. Apply fresh aloe vera gel under the eyes and leave it on overnight.\n" +
                        "4. Gently massage a few drops of almond oil under the eyes before bedtime.\n" +
                        "5. Mix a pinch of turmeric powder with pineapple juice to form a paste and apply it under the eyes for 10 minutes before rinsing.";

            case "Fever":
                return "Fever is a temporary rise in body temperature, often as a result of the body fighting an infection, such as from bacteria or viruses.\n\n" +
                        "It is a natural defense mechanism and can be accompanied by symptoms like sweating, chills, headache, muscle aches, and fatigue.\n\n" +
                        "A mild fever is generally not dangerous, but persistent or high fever may require medical attention.\n\n" +
                        "Ayurvedic remedies for fever:\n" +
                        "1. Boil a few Tulsi leaves in water, strain, and drink the decoction 2-3 times a day.\n" +
                        "2. Boil fresh ginger in water and drink the tea with honey to alleviate fever symptoms.\n" +
                        "3. Boil coriander seeds in water, strain, and drink the water to reduce body temperature.\n" +
                        "4. Drink peppermint tea or apply a cool peppermint-infused cloth to the forehead.\n" +
                        "5. Add a pinch of turmeric to warm milk and drink it before bed for relief from fever.";

            case "Dengue":
                return "Dengue is a viral infection caused by the dengue virus, transmitted to humans through the bites of infected female Aedes mosquitoes, primarily Aedes aegypti.\n\n" +
                        "It is prevalent in tropical and subtropical regions.\n\n" +
                        "Symptoms typically appear 4-10 days after the mosquito bite and can range from mild to severe.\n\n" +
                        "Common symptoms include high fever, severe headache, pain behind the eyes, joint and muscle pain, rash, and mild bleeding (such as nosebleeds or gum bleeding).\n\n" +
                        "In severe cases, dengue can lead to dengue hemorrhagic fever or dengue shock syndrome, which can be life-threatening.\n\n" +
                        "Ayurvedic remedies for dengue:\n" +
                        "1. Extract juice from fresh papaya leaves and consume 1-2 tablespoons daily.\n" +
                        "2. Mix turmeric powder with warm milk and drink daily or add it to meals.\n" +
                        "3. Drink fresh coconut water regularly to stay hydrated.\n" +
                        "4. Drink fresh pomegranate juice daily to help in recovery.\n" +
                        "5. Consume easily digestible foods like khichdi (a mix of rice and lentils), fruits, and steamed vegetables.";

            case "High blood pressure":
                return "High blood pressure (Hypertension) occurs when the force of blood against the walls of the arteries is consistently too high, putting strain on the heart and blood vessels.\n\n" +
                        "It is often called a \"silent killer\" because it may not show symptoms initially but can lead to severe health complications like heart disease, stroke, and kidney damage if left untreated.\n\n" +
                        "Ayurvedic remedies for High blood pressure:\n" +
                        "1. Take Ashwagandha powder or capsules as prescribed by an Ayurvedic practitioner.\n" +
                        "2. Arjuna bark powder can be consumed with water or taken as capsules.\n" +
                        "3. Boil coriander seeds in water and drink the cooled water, or include coriander seeds in your meals.\n" +
                        "4. Mix lemon juice with warm water and honey and drink it in the morning.";

            case "Toothache":
                return "Toothache refers to pain or discomfort in or around a tooth, often caused by tooth decay, infection, gum disease, cracked teeth, or an exposed tooth root.\n\n" +
                        "The pain can range from mild to severe and may be accompanied by swelling, sensitivity to hot or cold foods, and difficulty chewing.\n\n" +
                        "Poor oral hygiene, injury, or tooth infection can lead to toothache, requiring dental care.\n\n" +
                        "Ayurvedic remedies for Toothache:\n" +
                        "1. Apply clove oil to the affected area or place a whole clove near the aching tooth and gently bite down.\n" +
                        "2. Mix a teaspoon of salt in warm water and rinse your mouth for relief from toothache and swelling.\n" +
                        "3. Crush a garlic clove and apply the juice to the painful area or chew a raw garlic clove.\n" +
                        "4. Chew on neem sticks or use neem oil for a mouth rinse.\n" +
                        "5. Mix a pinch of asafoetida (hing) with lemon juice and apply it to the affected area with a cotton ball.";

            case "Cold and Cough":
                return "Cold and Cough are common respiratory ailments usually caused by viral infections such as the common cold or flu.\n\n" +
                        "Symptoms include sneezing, runny or blocked nose, sore throat, coughing, body aches, mild fever, and fatigue.\n\n" +
                        "Ayurvedic remedies for Cold and Cough:\n" +
                        "1. Boil Tulsi leaves in water and drink the decoction or chew fresh leaves daily.\n" +
                        "2. Mix ginger juice with honey and take it 2-3 times a day to alleviate cough and cold symptoms.\n" +
                        "3. Add a pinch of turmeric powder to warm milk and drink it before bed.\n" +
                        "4. Mix a pinch of black pepper with honey and take it 1-2 times a day.\n" +
                        "5. Boil Ajwain seeds in water and inhale the steam, or drink the water after it cools slightly.";


            case "Swine flu":
                return "Swine flu (H1N1 influenza) is a respiratory infection caused by the H1N1 influenza virus, which originated in pigs but can spread to humans.\n\n" +
                        "It is highly contagious and shares symptoms with seasonal flu, including fever, cough, sore throat, body aches, fatigue, and, in severe cases, difficulty breathing.\n\n" +
                        "Swine flu can spread through respiratory droplets from coughs or sneezes of infected individuals.\n\n" +
                        "Ayurvedic remedies for Swine Flue:\n" +
                        "1. Chew fresh Tulsi leaves daily or drink a Tulsi tea by boiling the leaves in water.\n" +
                        "2. Take Ashwagandha powder or capsules as per the recommended dosage by an Ayurvedic practitioner.\n" +
                        "3. Add a few drops of eucalyptus oil to hot water and inhale the steam.\n" +
                        "4. Chew raw garlic cloves daily or add garlic to your meals.";

            case "Insomnia":
                return "Insomnia is a sleep disorder characterized by difficulty falling asleep, staying asleep, or experiencing poor quality sleep.\n\n" +
                        "It can lead to fatigue, irritability, poor concentration, and reduced productivity during the day.\n\n" +
                        "Common causes of insomnia include stress, anxiety, depression, irregular sleep schedules, unhealthy lifestyle habits, and medical conditions.\n\n" +
                        "Ayurvedic remedies for Insomnia:\n" +
                        "1. Consume Brahmi powder or capsules or drink Brahmi tea to improve sleep quality.\n" +
                        "2. Drink a glass of warm milk with a pinch of turmeric before going to bed.\n" +
                        "3. Drink chamomile tea 30 minutes before bedtime.\n" +
                        "4. Practice Anulom Vilom (alternate nostril breathing) and meditate for a few minutes before going to sleep.";

            case "Chicken pox":
                return "Chickenpox is a highly contagious viral infection caused by the varicella-zoster virus.\n\n" +
                        "It typically affects children but can occur at any age.\n\n" +
                        "The main symptom is an itchy, blister-like rash that starts on the chest, back, and face and then spreads to the rest of the body.\n\n" +
                        "Other symptoms may include fever, fatigue, headache, and loss of appetite.\n\n" +
                        "Ayurvedic remedies for Chicken Pox:\n" +
                        "1. Bathe in water boiled with neem leaves, or apply a neem paste to the affected areas to reduce itching.\n" +
                        "2. Apply honey directly to the rashes to reduce itching and promote healing.\n" +
                        "3. Mix baking soda in water and use it to bathe or apply it as a paste on the affected skin.\n" +
                        "4. Apply a paste of turmeric and water to the blisters or take turmeric in warm milk to boost immunity.\n" +
                        "5. Apply sandalwood paste or oil to soothe rashes and promote skin healing.";

            case "Laziness":
                return "Laziness refers to a state of inactivity or lack of motivation to engage in physical or mental tasks.\n\n" +
                        "It can be caused by physical fatigue, mental exhaustion, poor diet, stress, or a sedentary lifestyle.\n\n" +
                        "While occasional laziness is natural, persistent laziness may affect productivity, lead to missed opportunities, and negatively impact health.\n\n" +
                        "Ayurvedic remedies for Laziness:\n" +
                        "1. Practice pranayama techniques like Kapalbhati and Anulom Vilom daily to reduce laziness.\n" +
                        "2. Include light, easily digestible foods like seasonal fruits and vegetables in your diet.\n" +
                        "3. Take 1-2 teaspoons of Chyawanprash in the morning for sustained energy throughout the day.\n" +
                        "4. Drink ginger tea daily to increase energy and reduce fatigue.\n" +
                        "5. Consume Brahmi in powder or capsule form or as a tea to promote alertness.";

            case "Sunburn":
                return "Sunburn is a skin condition caused by excessive exposure to ultraviolet (UV) rays from the sun.\n\n" +
                        "It results in red, painful, and inflamed skin that may blister and peel in severe cases.\n\n" +
                        "Sunburn can cause long-term skin damage, increasing the risk of premature aging and skin cancer.\n\n" +
                        "Symptoms include redness, pain, swelling, and sometimes fever or chills in severe cases.\n\n" +
                        "Ayurvedic remedies for Sunburn:\n" +
                        "1. Apply fresh Aloe Vera gel directly to the affected skin for relief from pain and redness.\n" +
                        "2. Gently apply pure coconut oil to the sunburned areas for relief and skin hydration.\n" +
                        "3. Mix sandalwood powder with rose water or plain water to form a paste and apply it to the affected areas.\n" +
                        "4. Place cucumber slices on the sunburned areas or apply cucumber juice for instant cooling.\n" +
                        "5. Mix turmeric powder with milk and apply it to the sunburned skin to reduce inflammation and pain.\n\n";


            // Add cases for other remedies
            default:
                return "No description available.";
        }
    }
}