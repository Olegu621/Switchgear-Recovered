            package p000;

            import android.widget.CompoundButton;
            import com.google.android.material.chip.Chip;
            
            /* JADX INFO: renamed from: fu */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0930fu implements CompoundButton.OnCheckedChangeListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Chip f8352a;

                public C0930fu(Chip chip) {
/* 4 */             this.f8352a = chip;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
/* 1 */             Chip chip = this.f8352a;
/* 3 */             ad1 ad1Var = chip.f4580U;
/* 5 */             if (ad1Var != null) {
/* 11 */                C2306vt c2306vt = (C2306vt) ((d52) ad1Var).f7001a;
/* 13 */                if (!z ? c2306vt.m9345e(chip, c2306vt.f18349b) : c2306vt.m9341a(chip)) {
/* 30 */                    c2306vt.m9344d();
                        }
                    }
/* 33 */            CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.f4598w;
/* 35 */            if (onCheckedChangeListener != null) {
/* 37 */                onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                    }
                }
            }
