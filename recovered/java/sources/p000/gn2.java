            package p000;

            import android.content.Context;
            import android.text.TextPaint;
            import java.lang.ref.WeakReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class gn2 {

                /* JADX INFO: renamed from: c */
                public float f8749c;

                /* JADX INFO: renamed from: e */
                public final WeakReference f8751e;

                /* JADX INFO: renamed from: f */
                public dn2 f8752f;

                /* JADX INFO: renamed from: a */
                public final TextPaint f8747a = new TextPaint(1);

                /* JADX INFO: renamed from: b */
                public final C0893eu f8748b = new C0893eu(this, 1);

                /* JADX INFO: renamed from: d */
                public boolean f8750d = true;

                public gn2(fn2 fn2Var) {
/* 27 */            this.f8751e = new WeakReference(null);
/* 34 */            this.f8751e = new WeakReference(fn2Var);
                }

                /* JADX INFO: renamed from: a */
                public final float m3977a(String str) {
/* 3 */             if (!this.f8750d) {
/* 5 */                 return this.f8749c;
                    }
/* 19 */            float fMeasureText = str == null ? 0.0f : this.f8747a.measureText((CharSequence) str, 0, str.length());
/* 23 */            this.f8749c = fMeasureText;
/* 25 */            this.f8750d = false;
/* 27 */            return fMeasureText;
                }

                /* JADX INFO: renamed from: b */
                public final void m3978b(dn2 dn2Var, Context context) {
/* 3 */             if (this.f8752f != dn2Var) {
/* 5 */                 this.f8752f = dn2Var;
/* 7 */                 WeakReference weakReference = this.f8751e;
/* 9 */                 if (dn2Var != null) {
/* 11 */                    TextPaint textPaint = this.f8747a;
/* 13 */                    C0893eu c0893eu = this.f8748b;
/* 15 */                    dn2Var.m3163f(context, textPaint, c0893eu);
/* 22 */                    fn2 fn2Var = (fn2) weakReference.get();
/* 24 */                    if (fn2Var != null) {
/* 30 */                        textPaint.drawableState = fn2Var.getState();
                            }
/* 32 */                    dn2Var.m3162e(context, textPaint, c0893eu);
/* 36 */                    this.f8750d = true;
                        }
/* 42 */                fn2 fn2Var2 = (fn2) weakReference.get();
/* 44 */                if (fn2Var2 != null) {
/* 46 */                    fn2Var2.mo3729a();
/* 53 */                    fn2Var2.onStateChange(fn2Var2.getState());
                        }
                    }
                }
            }
