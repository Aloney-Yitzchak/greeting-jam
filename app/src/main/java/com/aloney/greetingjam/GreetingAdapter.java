package com.aloney.greetingjam;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/**
 * מתאם (Adapter) שמחבר בין רשימת אובייקטים לבין RecyclerView.
 * זה בדיוק אותו מבנה שתצטרכו כמעט בכל מסך רשימה בפרויקט הגמר.
 */
public class GreetingAdapter extends RecyclerView.Adapter<GreetingAdapter.GreetingViewHolder> {

    private final List<Greeting> items;

    public GreetingAdapter(List<Greeting> items) {
        this.items = items;
    }

    /** ViewHolder - מחזיק את ה-Views של שורה אחת (מוכן) */
    static class GreetingViewHolder extends RecyclerView.ViewHolder {
        final TextView itemName;
        final TextView itemPreview;

        GreetingViewHolder(@NonNull View itemView) {
            super(itemView);
            itemName    = itemView.findViewById(R.id.itemName);
            itemPreview = itemView.findViewById(R.id.itemPreview);
        }
    }

    /** יוצר שורה חדשה מתוך קובץ ה-layout (מוכן) */
    @NonNull
    @Override
    public GreetingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View row = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_greeting, parent, false);
        return new GreetingViewHolder(row);
    }

    @Override
    public void onBindViewHolder(@NonNull GreetingViewHolder holder, int position) {

        // ================== TODO 5 (שלב 2) ==================
        // 1. קחו את הברכה שבמיקום position מתוך הרשימה items.
        // 2. הציגו את שם המקבל ב-holder.itemName
        //    ואת טקסט הברכה ב-holder.itemPreview.
        // ====================================================

    }

    @Override
    public int getItemCount() {

        // ================== TODO 6 (שלב 2) ==================
        // החזירו את מספר הפריטים ברשימה.
        // שימו לב: כל עוד זה מחזיר 0 - שום דבר לא יוצג על המסך,
        // גם אם הכל שאר הקוד נכון. זו טעות נפוצה מאוד.
        // ====================================================

        return 0;
    }
}
