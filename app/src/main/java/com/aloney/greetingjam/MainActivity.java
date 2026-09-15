package com.aloney.greetingjam;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/**
 * מסך ראשי: טופס יצירת ברכה + רשימת הברכות שנשמרו.
 */
public class MainActivity extends AppCompatActivity {

    // מפתחות ל-Intent. תמיד מגדירים אותם כקבועים ולא כותבים מחרוזת חופשית בכל מקום.
    public static final String EXTRA_NAME    = "extra_name";
    public static final String EXTRA_STYLE   = "extra_style";
    public static final String EXTRA_MESSAGE = "extra_message";

    private EditText nameInput;
    private EditText messageInput;
    private RadioGroup styleGroup;
    private Button createButton;
    private RecyclerView greetingsList;

    private GreetingAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // --- חיבור הרכיבים (מוכן) ---
        nameInput     = findViewById(R.id.nameInput);
        messageInput  = findViewById(R.id.messageInput);
        styleGroup    = findViewById(R.id.styleGroup);
        createButton  = findViewById(R.id.createButton);
        greetingsList = findViewById(R.id.greetingsList);

        // --- הכנת הרשימה (מוכן) ---
        adapter = new GreetingAdapter(GreetingStore.getAll());
        greetingsList.setLayoutManager(new LinearLayoutManager(this));
        greetingsList.setAdapter(adapter);

        createButton.setOnClickListener(v -> onCreateClicked());
    }

    private void onCreateClicked() {
        String name = nameInput.getText().toString().trim();
        String message = messageInput.getText().toString();
        String style = readSelectedStyle();

        if (name.isEmpty()) {
            Toast.makeText(this, "צריך להזין שם", Toast.LENGTH_SHORT).show();
            return;
        }

        // ================== TODO 1 (שלב 1) ==================
        // צרו Intent למסך CardActivity, העבירו אליו את שלושת הערכים
        // בעזרת putExtra עם המפתחות שהוגדרו למעלה, והפעילו את המסך.
        //
        // רמז: new Intent(this, CardActivity.class)
        //      intent.putExtra(EXTRA_NAME, name);
        //      startActivity(intent);
        // ====================================================

    }

    /** מחזיר את הסגנון שנבחר ב-RadioGroup (מוכן) */
    private String readSelectedStyle() {
        int checkedId = styleGroup.getCheckedRadioButtonId();
        if (checkedId == R.id.styleFunny) {
            return Greeting.STYLE_FUNNY;
        }
        if (checkedId == R.id.styleShort) {
            return Greeting.STYLE_SHORT;
        }
        return Greeting.STYLE_CLASSIC;
    }

    @Override
    protected void onResume() {
        super.onResume();

        // ================== TODO 4 (שלב 2) ==================
        // כשחוזרים מהמסך השני ייתכן שנוספה ברכה חדשה לרשימה.
        // הודיעו ל-adapter שהנתונים השתנו כדי שהרשימה תתרענן.
        //
        // רמז: לאדפטר יש מתודה בשם notifyDataSetChanged
        // ====================================================

    }
}
