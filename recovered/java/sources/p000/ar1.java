            package p000;

            import android.content.Context;
            import android.util.DisplayMetrics;
            import android.view.View;
            import androidx.recyclerview.widget.C0126d;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ar1 extends C0126d {

                /* JADX INFO: renamed from: q */
                public final /* synthetic */ br1 f2063q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ar1(br1 br1Var, Context context) {
/* 3 */             super(context);
/* 1 */             this.f2063q = br1Var;
                }

                @Override // androidx.recyclerview.widget.C0126d, p000.x12
                /* JADX INFO: renamed from: c */
                public final void mo938c(View view, v12 v12Var) {
/* 1 */             br1 br1Var = this.f2063q;
/* 9 */             int[] iArrM1416b = br1Var.m1416b(br1Var.f2578a.getLayoutManager(), view);
/* 14 */            int i = iArrM1416b[0];
/* 17 */            int i2 = iArrM1416b[1];
/* 46 */            int iCeil = (int) Math.ceil(((double) mo940g(Math.max(Math.abs(i), Math.abs(i2)))) / 0.3356d);
/* 47 */            if (iCeil > 0) {
/* 49 */                v12Var.f17835a = i;
/* 51 */                v12Var.f17836b = i2;
/* 53 */                v12Var.f17837c = iCeil;
/* 57 */                v12Var.f17839e = this.f1741j;
/* 59 */                v12Var.f17840f = true;
                    }
                }

                @Override // androidx.recyclerview.widget.C0126d
                /* JADX INFO: renamed from: f */
                public final float mo939f(DisplayMetrics displayMetrics) {
/* 6 */             return 100.0f / displayMetrics.densityDpi;
                }

                @Override // androidx.recyclerview.widget.C0126d
                /* JADX INFO: renamed from: g */
                public final int mo940g(int i) {
/* 7 */             return Math.min(100, super.mo940g(i));
                }
            }
