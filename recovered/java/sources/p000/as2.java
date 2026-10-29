            package p000;

            import android.os.Bundle;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class as2 implements bs2 {

                /* JADX INFO: renamed from: a */
                public final boolean f2076a;

                /* JADX INFO: renamed from: b */
                public final int f2077b;

                public as2(boolean z, int i) {
/* 4 */             this.f2076a = z;
/* 6 */             this.f2077b = i;
                }

                @Override // p000.bs2
                /* JADX INFO: renamed from: c */
                public final Bundle mo1159c() {
/* 3 */             Bundle bundle = new Bundle();
/* 9 */             bundle.putInt("androidx.browser.trusted.displaymode.KEY_ID", 1);
/* 16 */            bundle.putBoolean("androidx.browser.trusted.displaymode.KEY_STICKY", this.f2076a);
/* 23 */            bundle.putInt("androidx.browser.trusted.displaymode.KEY_CUTOUT_MODE", this.f2077b);
/* 26 */            return bundle;
                }
            }
