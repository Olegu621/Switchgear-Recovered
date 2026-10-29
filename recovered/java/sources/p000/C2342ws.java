            package p000;

            import android.view.View;
            import java.util.WeakHashMap;
            
            /* JADX INFO: renamed from: ws */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2342ws {

                /* JADX INFO: renamed from: a */
                public final float f18788a;

                /* JADX INFO: renamed from: b */
                public final float f18789b;

                /* JADX INFO: renamed from: c */
                public final float f18790c;

                /* JADX INFO: renamed from: d */
                public final float f18791d;

                /* JADX INFO: renamed from: e */
                public final float f18792e;

                /* JADX INFO: renamed from: f */
                public final float f18793f;

                /* JADX INFO: renamed from: g */
                public final float f18794g;

                /* JADX INFO: renamed from: h */
                public final float f18795h;

                public C2342ws(View view) {
/* 8 */             this.f18788a = view.getTranslationX();
/* 14 */            this.f18789b = view.getTranslationY();
/* 16 */            WeakHashMap weakHashMap = e33.f7494a;
/* 22 */            this.f18790c = s23.m8374l(view);
/* 28 */            this.f18791d = view.getScaleX();
/* 34 */            this.f18792e = view.getScaleY();
/* 40 */            this.f18793f = view.getRotationX();
/* 46 */            this.f18794g = view.getRotationY();
/* 52 */            this.f18795h = view.getRotation();
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof C2342ws)) {
/* 3 */                 return false;
                    }
/* 7 */             C2342ws c2342ws = (C2342ws) obj;
                    return c2342ws.f18788a == this.f18788a && c2342ws.f18789b == this.f18789b && c2342ws.f18790c == this.f18790c && c2342ws.f18791d == this.f18791d && c2342ws.f18792e == this.f18792e && c2342ws.f18793f == this.f18793f && c2342ws.f18794g == this.f18794g && c2342ws.f18795h == this.f18795h;
                }

                public final int hashCode() {
/* 1 */             float f = this.f18788a;
/* 15 */            int iFloatToIntBits = (f != 0.0f ? Float.floatToIntBits(f) : 0) * 31;
/* 17 */            float f2 = this.f18789b;
/* 30 */            int iFloatToIntBits2 = (iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
/* 32 */            float f3 = this.f18790c;
/* 45 */            int iFloatToIntBits3 = (iFloatToIntBits2 + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31;
/* 47 */            float f4 = this.f18791d;
/* 60 */            int iFloatToIntBits4 = (iFloatToIntBits3 + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31;
/* 62 */            float f5 = this.f18792e;
/* 75 */            int iFloatToIntBits5 = (iFloatToIntBits4 + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0)) * 31;
/* 77 */            float f6 = this.f18793f;
/* 90 */            int iFloatToIntBits6 = (iFloatToIntBits5 + (f6 != 0.0f ? Float.floatToIntBits(f6) : 0)) * 31;
/* 92 */            float f7 = this.f18794g;
/* 105 */           int iFloatToIntBits7 = (iFloatToIntBits6 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31;
/* 107 */           float f8 = this.f18795h;
/* 117 */           return iFloatToIntBits7 + (f8 != 0.0f ? Float.floatToIntBits(f8) : 0);
                }
            }
