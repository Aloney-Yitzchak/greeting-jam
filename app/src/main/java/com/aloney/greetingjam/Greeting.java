package com.aloney.greetingjam;

/**
 * מחלקת מודל (Model) שמייצגת ברכה אחת.
 * המחלקה הזו מוכנה ועובדת - אין צורך לשנות אותה.
 * שימו לב למבנה: שדות פרטיים, בנאי, גטרים ולוגיקה עסקית אחת (buildText).
 * בדיוק כך אמורה להיראות מחלקת מודל בפרויקט הגמר שלכם.
 */
public class Greeting {

    public static final String STYLE_CLASSIC = "classic";
    public static final String STYLE_FUNNY   = "funny";
    public static final String STYLE_SHORT   = "short";

    private final String name;
    private final String style;
    private final String personalMessage;

    public Greeting(String name, String style, String personalMessage) {
        this.name = name;
        this.style = style;
        this.personalMessage = personalMessage;
    }

    public String getName() {
        return name;
    }

    public String getStyle() {
        return style;
    }

    public String getPersonalMessage() {
        return personalMessage;
    }

    /** הכותרת של הכרטיס */
    public String buildHeadline() {
        if (STYLE_FUNNY.equals(style)) {
            return "יו " + name + "!";
        }
        if (STYLE_SHORT.equals(style)) {
            return name + " - שנה טובה";
        }
        return "לכבוד " + name;
    }

    /** גוף הברכה, נבנה לפי הסגנון שנבחר */
    public String buildText() {
        String base;
        if (STYLE_FUNNY.equals(style)) {
            base = "שתהיה לך שנה עם פחות באגים ויותר commits שעובדים מהפעם הראשונה.";
        } else if (STYLE_SHORT.equals(style)) {
            base = "שנה טובה ומתוקה.";
        } else {
            base = "שתהיה זו שנה של בריאות, הצלחה ושמחה, ושכל מה שתתכנן יתגשם.";
        }

        if (personalMessage != null && !personalMessage.trim().isEmpty()) {
            base = base + "\n\n" + personalMessage.trim();
        }
        return base;
    }
}
