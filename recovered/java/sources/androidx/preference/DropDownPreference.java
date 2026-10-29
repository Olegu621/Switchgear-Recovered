            package androidx.preference;

            import android.R;
            import android.content.Context;
            import android.util.AttributeSet;
            import android.widget.ArrayAdapter;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 36 */    public class DropDownPreference extends ListPreference {

                /* JADX INFO: renamed from: U */
                public final ArrayAdapter f1554U;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public DropDownPreference(Context context, AttributeSet attributeSet, int i) {
/* 2 */             super(context, attributeSet, i, 0);
/* 10 */            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_dropdown_item);
/* 13 */            this.f1554U = arrayAdapter;
/* 15 */            arrayAdapter.clear();
/* 18 */            CharSequence[] charSequenceArr = this.f1556v;
/* 20 */            if (charSequenceArr != null) {
/* 23 */                for (CharSequence charSequence : charSequenceArr) {
/* 31 */                    arrayAdapter.add(charSequence.toString());
                        }
                    }
                }

                @Override // androidx.preference.Preference
                /* JADX INFO: renamed from: b */
                public final void mo759b() {
/* 1 */             ArrayAdapter arrayAdapter = this.f1554U;
/* 3 */             if (arrayAdapter != null) {
/* 5 */                 arrayAdapter.notifyDataSetChanged();
                    }
                }

/* 37 */        public DropDownPreference(Context context, AttributeSet attributeSet) {
/* 38 */            this(context, attributeSet, R$attr.dropdownPreferenceStyle);
                }
            }
