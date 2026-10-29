            package p000;

            import android.animation.TypeEvaluator;
            
            /* JADX INFO: renamed from: yc */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2493yc implements TypeEvaluator {

                /* JADX INFO: renamed from: b */
                public static final C2493yc f19574b = new C2493yc(0);

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f19575a;

                public /* synthetic */ C2493yc(int i) {
/* 1 */             this.f19575a = i;
                }

                /* JADX INFO: renamed from: a */
                public static Integer m10142a(float f, Integer num, Integer num2) {
/* 1 */             int iIntValue = num.intValue();
/* 12 */            float f2 = ((iIntValue >> 24) & 255) / 255.0f;
/* 29 */            int iIntValue2 = num2.intValue();
/* 38 */            float f3 = ((iIntValue2 >> 24) & 255) / 255.0f;
/* 65 */            float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
/* 71 */            float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
/* 77 */            float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
/* 83 */            float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
/* 89 */            float fPow5 = (float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d);
/* 95 */            float fPow6 = (float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d);
/* 96 */            float fM3503g = AbstractC0886en.m3503g(f3, f2, f, f2);
/* 100 */           float fM3503g2 = AbstractC0886en.m3503g(fPow4, fPow, f, fPow);
/* 104 */           float fM3503g3 = AbstractC0886en.m3503g(fPow5, fPow2, f, fPow2);
/* 108 */           float fM3503g4 = AbstractC0886en.m3503g(fPow6, fPow3, f, fPow3);
/* 124 */           float fPow7 = ((float) Math.pow(fM3503g2, 0.45454545454545453d)) * 255.0f;
/* 131 */           float fPow8 = ((float) Math.pow(fM3503g3, 0.45454545454545453d)) * 255.0f;
/* 164 */           return Integer.valueOf(Math.round(((float) Math.pow(fM3503g4, 0.45454545454545453d)) * 255.0f) | (Math.round(fPow7) << 16) | (Math.round(fM3503g * 255.0f) << 24) | (Math.round(fPow8) << 8));
                }

                @Override // android.animation.TypeEvaluator
                public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
                    switch (this.f19575a) {
                        case 0:
/* 16 */                    return m10142a(f, (Integer) obj, (Integer) obj2);
                        default:
/* 10 */                    return null;
                    }
                }
            }
