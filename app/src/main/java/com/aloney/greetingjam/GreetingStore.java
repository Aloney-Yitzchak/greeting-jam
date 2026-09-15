package com.aloney.greetingjam;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.ArrayList;
import java.util.List;

/**
 * מאגר הברכות של האפליקציה.
 *
 * שלב 2: הרשימה נשמרת בזיכרון בלבד - היא נמחקת ברגע שסוגרים את האפליקציה.
 * שלב 3: להוסיף שמירה קבועה ב-SharedPreferences כדי שהרשימה תשרוד סגירה של האפליקציה.
 */
public class GreetingStore {

    private static final String PREFS_NAME = "greeting_jam_prefs";
    private static final String KEY_DATA   = "greetings_json";

    private static final List<Greeting> items = new ArrayList<>();

    private GreetingStore() {
    }

    /** מוסיף ברכה למאגר (מוכן) */
    public static void add(Greeting greeting) {
        items.add(0, greeting);
    }

    /** מחזיר את הרשימה עצמה (מוכן) */
    public static List<Greeting> getAll() {
        return items;
    }

    public static void clear() {
        items.clear();
    }

    // ================== TODO 7 (שלב 3 - בונוס) ==================
    // ממשו שמירה וטעינה קבועות בעזרת SharedPreferences.
    //
    // רעיון פשוט: להפוך כל ברכה למחרוזת אחת בפורמט  name|style|message
    // ולחבר את כולן עם התו ; ואז לשמור מחרוזת אחת.
    // בטעינה - לפצל בעזרת split ולבנות מחדש אובייקטים.
    //
    // שתי המתודות למטה כבר מחוברות למקומות הנכונים בקוד?
    // לא. אחרי שתממשו אותן, תצטרכו לקרוא ל-save אחרי כל add
    // ול-load פעם אחת ב-MainActivity.onCreate.
    // ============================================================

    public static void save(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();

        // TODO: לבנות מחרוזת אחת מכל הברכות ולשמור אותה תחת KEY_DATA
        // רמז: editor.putString(KEY_DATA, data); editor.apply();

    }

    public static void load(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        String data = prefs.getString(KEY_DATA, "");

        // TODO: לפצל את המחרוזת, ליצור אובייקטי Greeting ולהוסיף אותם ל-items
        // שימו לב לבדוק שהמחרוזת אינה ריקה לפני שמפצלים אותה.

    }
}
