            package p000;

            import android.os.Build;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.BaseAdapter;
            import android.widget.TextView;
            import com.google.android.material.R$layout;
            import com.google.android.material.R$string;
            import java.util.Calendar;
            import java.util.Locale;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class i50 extends BaseAdapter {

                /* JADX INFO: renamed from: d */
                public static final int f9445d;

                /* JADX INFO: renamed from: a */
                public final Calendar f9446a;

                /* JADX INFO: renamed from: b */
                public final int f9447b;

                /* JADX INFO: renamed from: c */
                public final int f9448c;

                static {
/* 10 */            f9445d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
                }

                public i50() {
/* 5 */             Calendar calendarM4086f = h13.m4086f(null);
/* 9 */             this.f9446a = calendarM4086f;
/* 16 */            this.f9447b = calendarM4086f.getMaximum(7);
/* 22 */            this.f9448c = calendarM4086f.getFirstDayOfWeek();
                }

                @Override // android.widget.Adapter
                public final int getCount() {
/* 1 */             return this.f9447b;
                }

                @Override // android.widget.Adapter
                public final Object getItem(int i) {
/* 1 */             int i2 = this.f9447b;
/* 3 */             if (i >= i2) {
/* 5 */                 return null;
                    }
/* 9 */             int i3 = i + this.f9448c;
/* 10 */            if (i3 > i2) {
/* 12 */                i3 -= i2;
                    }
/* 13 */            return Integer.valueOf(i3);
                }

                @Override // android.widget.Adapter
                public final long getItemId(int i) {
/* 1 */             return 0L;
                }

                @Override // android.widget.Adapter
                public final View getView(int i, View view, ViewGroup viewGroup) {
/* 2 */             TextView textView = (TextView) view;
/* 4 */             if (view == null) {
/* 22 */                textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.mtrl_calendar_day_of_week, viewGroup, false);
                    }
/* 26 */            int i2 = i + this.f9448c;
/* 27 */            int i3 = this.f9447b;
/* 29 */            if (i2 > i3) {
/* 31 */                i2 -= i3;
                    }
/* 32 */            Calendar calendar = this.f9446a;
/* 35 */            calendar.set(7, i2);
/* 54 */            textView.setText(calendar.getDisplayName(7, f9445d, textView.getResources().getConfiguration().locale));
/* 84 */            textView.setContentDescription(String.format(viewGroup.getContext().getString(R$string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
/* 87 */            return textView;
                }
            }
