            package com.google.android.material.datepicker;

            import android.widget.LinearLayout;
            import android.widget.TextView;
            import androidx.recyclerview.widget.AbstractC0137o;
            import com.google.android.material.R$id;
            import java.util.WeakHashMap;
            import p000.e33;
            import p000.o23;
            
            /* JADX INFO: renamed from: com.google.android.material.datepicker.q */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0360q extends AbstractC0137o {

                /* JADX INFO: renamed from: u */
                public final TextView f4697u;

                /* JADX INFO: renamed from: v */
                public final MaterialCalendarGridView f4698v;

                public C0360q(LinearLayout linearLayout, boolean z) {
/* 1 */             super(linearLayout);
/* 10 */            TextView textView = (TextView) linearLayout.findViewById(R$id.month_title);
/* 12 */            this.f4697u = textView;
/* 14 */            WeakHashMap weakHashMap = e33.f7494a;
/* 31 */            new o23(androidx.core.R$id.tag_accessibility_heading, Boolean.class, 0, 28, 3).m8129f(textView, Boolean.TRUE);
/* 42 */            this.f4698v = (MaterialCalendarGridView) linearLayout.findViewById(R$id.month_grid);
/* 44 */            if (z) {
/* 51 */                return;
                    }
/* 48 */            textView.setVisibility(8);
                }
            }
