            package p000;

            import android.os.Bundle;
            import android.view.ContextThemeWrapper;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import com.google.android.material.datepicker.CalendarConstraints;
            import com.google.android.material.datepicker.DateSelector;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class gd1<S> extends zr1 {

                /* JADX INFO: renamed from: b */
                public int f8549b;

                /* JADX INFO: renamed from: c */
                public DateSelector f8550c;

                /* JADX INFO: renamed from: d */
                public CalendarConstraints f8551d;

                @Override // androidx.fragment.app.Fragment
                public final void onCreate(Bundle bundle) {
/* 1 */             super.onCreate(bundle);
/* 4 */             if (bundle == null) {
/* 6 */                 bundle = getArguments();
                    }
/* 16 */            this.f8549b = bundle.getInt("THEME_RES_ID_KEY");
/* 26 */            this.f8550c = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
/* 36 */            this.f8551d = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
                }

                @Override // androidx.fragment.app.Fragment
                public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
/* 26 */            return this.f8550c.mo2289B1(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f8549b)), viewGroup, this.f8551d, new dd1(this, 1));
                }

                @Override // androidx.fragment.app.Fragment
                public final void onSaveInstanceState(Bundle bundle) {
/* 1 */             super.onSaveInstanceState(bundle);
/* 8 */             bundle.putInt("THEME_RES_ID_KEY", this.f8549b);
/* 15 */            bundle.putParcelable("DATE_SELECTOR_KEY", this.f8550c);
/* 22 */            bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f8551d);
                }
            }
