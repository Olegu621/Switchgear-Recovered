            package p000;

            import android.animation.TypeEvaluator;
            
            /* JADX INFO: renamed from: wu */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2344wu implements TypeEvaluator {

                /* JADX INFO: renamed from: b */
                public static final C2344wu f18815b = new C2344wu();

                /* JADX INFO: renamed from: a */
                public final C2564zu f18816a = new C2564zu();

                @Override // android.animation.TypeEvaluator
                public final Object evaluate(float f, Object obj, Object obj2) {
/* 1 */             C2564zu c2564zu = (C2564zu) obj;
/* 3 */             C2564zu c2564zu2 = (C2564zu) obj2;
/* 5 */             float f2 = c2564zu.f20327a;
/* 11 */            float f3 = 1.0f - f;
/* 14 */            float f4 = (c2564zu2.f20327a * f) + (f2 * f3);
/* 15 */            float f5 = c2564zu.f20328b;
/* 21 */            float f6 = (c2564zu2.f20328b * f) + (f5 * f3);
/* 22 */            float f7 = c2564zu.f20329c;
/* 27 */            float f8 = f * c2564zu2.f20329c;
/* 29 */            C2564zu c2564zu3 = this.f18816a;
/* 31 */            c2564zu3.f20327a = f4;
/* 33 */            c2564zu3.f20328b = f6;
/* 35 */            c2564zu3.f20329c = f8 + (f3 * f7);
/* 37 */            return c2564zu3;
                }
            }
