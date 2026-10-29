            package p000;

            import android.graphics.Rect;
            import android.os.Build;
            import android.view.View;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class l53 {

                /* JADX INFO: renamed from: a */
                public static final n53 f13119a;

                /* JADX INFO: renamed from: b */
                public static final C1938ms f13120b;

                /* JADX INFO: renamed from: c */
                public static final C1938ms f13121c;

                static {
/* 5 */             if (Build.VERSION.SDK_INT >= 29) {
/* 12 */                f13119a = new o53();
                    } else {
/* 20 */                f13119a = new n53();
                    }
/* 33 */            f13120b = new C1938ms("translationAlpha", Float.class, 18);
/* 46 */            f13121c = new C1938ms("clipBounds", Rect.class, 19);
                }

                /* JADX INFO: renamed from: a */
                public static void m6342a(View view, int i, int i2, int i3, int i4) {
/* 8 */             f13119a.mo6891Q(view, i, i2, i3, i4);
                }

                /* JADX INFO: renamed from: b */
                public static void m6343b(View view, float f) {
/* 3 */             f13119a.mo7103F(view, f);
                }

                /* JADX INFO: renamed from: c */
                public static void m6344c(int i, View view) {
/* 3 */             f13119a.mo6892R(i, view);
                }
            }
