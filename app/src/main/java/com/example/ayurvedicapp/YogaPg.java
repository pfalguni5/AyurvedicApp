package com.example.ayurvedicapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class YogaPg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_yoga_pg);

        TextView textView10 = findViewById(R.id.textView10);
        String yogaInfo = "Chakras in Yoga refer to the seven major energy centers in the human body, aligned along the spine. "
                + "These chakras are believed to influence physical, emotional, and spiritual well-being. "
                + "In both yoga and Ayurveda, chakras represent key energy centers that influence our physical, mental, and spiritual well-being. "
                + "While yoga focuses on balancing these chakras through postures, breathwork, and meditation, "
                + "Ayurveda integrates the concept of chakras with its holistic approach to health by considering how imbalances in these energy centers affect the body’s doshas (Vata, Pitta, and Kapha), tissues, organs, and mind.\n\n"
                + "There are Seven main Chakras:\n"
                + "1. Muladhara (Root Chakra): It is located at the base of the spine. Its element is Earth and its color is Red. It is associated with survival, security, stability, and grounding.\n"
                + "2. Svadhisthana (Sacral Chakra): It is located at the lower abdomen, just below the navel. Its element is water and its color is Orange. It is associated with creativity, emotions, and pleasure.\n"
                + "3. Manipura (Solar Plexus Chakra): Its location is in the upper abdomen, above the navel. Its element is Fire and its color is Yellow. It is associated with personal power, confidence, self-esteem, and digestion.\n"
                + "4. Anahata (Heart Chakra): Its location is at the center of the chest. Its element is Air and its color is Green. It is associated with love, compassion, forgiveness, and emotional balance.\n"
                + "5. Vishuddha (Throat Chakra): It is located in the throat area. Its element is Ether (Space) and color is Blue. It is associated with communication, self-expression, and truth. Its imbalance leads to difficulty in expressing yourself, communication issues, sore throat, and thyroid problems.\n"
                + "6. Ajna (Third Eye Chakra): It is located in the forehead, between the eyebrows. Its element is Light and color is Indigo. It is associated with intuition, wisdom, clarity of thoughts, and imagination. Its imbalance can lead to lack of focus, poor intuition, confusion, and headaches.\n"
                + "7. Sahasrara (Crown Chakra): It is located at the top of the head. Its element is Cosmic Energy and its color is Violet or White. It is associated with spiritual connection, enlightenment, consciousness, and inner peace.\n\n"
                + "Meditation: \n"
                + "Meditation is a practice that involves focusing the mind to achieve mental clarity, emotional calmness, and inner peace. "
                + "It often involves techniques such as mindfulness, deep breathing, or repeating a mantra. "
                + "Meditation helps reduce stress, enhances concentration, and promotes emotional well-being by quieting the mind and increasing self-awareness. "
                + "It can be practiced for spiritual growth, relaxation, or personal development.\n"
                + "Meditation is a vital aspect of Ayurvedic treatment, promoting mental clarity and emotional balance, which are essential for holistic health. "
                + "By calming the mind and reducing stress, it helps balance the doshas (Vata, Pitta, Kapha), thereby enhancing overall well-being. "
                + "Regular meditation encourages self-awareness and mindfulness, aiding in better lifestyle choices and dietary habits. "
                + "It supports digestive health by reducing anxiety, which can lead to improved digestion (agni). "
                + "Ultimately, meditation fosters a harmonious connection between the mind, body, and spirit, helping to maintain a balanced and healthy life.";

        textView10.setText(yogaInfo);

    }
}