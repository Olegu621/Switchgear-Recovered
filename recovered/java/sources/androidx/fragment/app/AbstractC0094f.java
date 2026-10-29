            package androidx.fragment.app;

            import android.view.View;
            import p000.C1951n4;
            import p000.fm0;
            
            /* JADX INFO: renamed from: androidx.fragment.app.f */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC0094f {

                /* JADX INFO: renamed from: a */
                public final C0091c0 f1425a;

                public AbstractC0094f(C0091c0 c0091c0) {
/* 1 */             c0091c0.getClass();
/* 7 */             this.f1425a = c0091c0;
                }

                /* JADX INFO: renamed from: a */
                public final boolean m650a() {
                    int i;
/* 1 */             C0091c0 c0091c0 = this.f1425a;
/* 5 */             View view = c0091c0.f1410c.mView;
/* 9 */             if (view != null) {
/* 18 */                i = 4;
/* 19 */                if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
/* 28 */                    int visibility = view.getVisibility();
/* 32 */                    if (visibility == 0) {
/* 52 */                        i = 2;
                            } else if (visibility != 4) {
/* 38 */                        if (visibility != 8) {
/* 48 */                            C1951n4.m6859j(fm0.m3781g(visibility, "Unknown visibility "));
/* 7 */                             return false;
                                }
/* 40 */                        i = 3;
                            }
                        }
                    } else {
/* 54 */                i = 0;
                    }
/* 55 */            int i2 = c0091c0.f1408a;
/* 57 */            if (i != i2) {
                        return (i == 2 || i2 == 2) ? false : true;
                    }
/* 65 */            return true;
                }
            }
