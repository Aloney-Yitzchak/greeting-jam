package com.aloney.greetingjam;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * מסך שני: מציג את כרטיס הברכה שנוצר במסך הראשון.
 */
public class CardActivity extends AppCompatActivity {

    private TextView cardHeadline;
    private TextView cardBody;
    private Button saveButton;
    private Button backButton;

    private Greeting greeting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        // --- חיבור הרכיבים (מוכן) ---
        cardHeadline = findViewById(R.id.cardHeadline);
        cardBody     = findViewById(R.id.cardBody);
        saveButton   = findViewById(R.id.saveButton);
        backButton   = findViewById(R.id.backButton);

        backButton.setOnClickListener(v -> finish());

        // ================== TODO 2 (שלב 1) ==================
        // 1. קראו את שלושת הערכים שנשלחו מהמסך הראשון:
        //    getIntent().getStringExtra(MainActivity.EXTRA_NAME)  וכן הלאה.
        // 2. צרו אובייקט Greeting מהערכים האלה ושמרו אותו בשדה greeting.
        // 3. הציגו את הכותרת והטקסט במסך:
        //    cardHeadline.setText(greeting.buildHeadline());
        //    cardBody.setText(greeting.buildText());
        // ====================================================

        saveButton.setOnClickListener(v -> onSaveClicked());
    }

    private void onSaveClicked() {
        if (greeting == null) {
            Toast.makeText(this, "אין ברכה לשמור", Toast.LENGTH_SHORT).show();
            return;
        }

        // ================== TODO 3 (שלב 2) ==================
        // הוסיפו את הברכה למאגר המשותף וסגרו את המסך:
        //    GreetingStore.add(greeting);
        // אחר כך הציגו Toast למשתמש וקראו ל-finish().
        // ====================================================

    }
}
