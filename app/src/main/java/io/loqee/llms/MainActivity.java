package io.loqee.llms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    EditText editText;
    AIModelAdapter aiModelAdapter;
    List<AIModel> aiModels = new ArrayList<>();
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button2);

        aiModels.add(new AIModel("ChatGPT", "OpenAI", "ChatGPT is an AI-powered language model developed by OpenAI, " +
                "capable of generating human-like text based on context and past conversations.", "2023"));
        aiModels.add(new AIModel("Copilot", "Microsoft", "Work smarter, be more productive, boost creativity, and stay connected to the people and things in your life with " +
                "Copilot — an AI companion that works everywhere you do and intelligently adapts to your needs.", "2023"));
        aiModels.add(new AIModel("Gemini", "Google", "Gemini is the first model to outperform human experts on MMLU (Massive Multitask Language Understanding), " +
                "one of the most popular methods to test the knowledge and problem solving abilities of AI models.", "2024"));
        aiModels.add(new AIModel("Pi", "Inflection AI", "A new class of AI, Pi is designed to be a kind and supportive companion " +
                "offering conversations, friendly advice, and concise information in a natural, flowing style.", "2023"));

        aiModelAdapter = new AIModelAdapter(this, R.layout.item_layout, aiModels);

        listView.setAdapter(aiModelAdapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editText.getText().toString();
                AIModel aiModel = new AIModel(name, "Unknown", "Unknown", "1970");
                aiModelAdapter.add(aiModel);
                aiModelAdapter.notifyDataSetChanged();
            }
        });
    }

}