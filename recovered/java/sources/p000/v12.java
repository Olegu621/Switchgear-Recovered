            package p000;

            import android.view.animation.Interpolator;
            import androidx.recyclerview.widget.RecyclerView;
            import io.sentry.android.core.AbstractC1245n0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class v12 {

                /* JADX INFO: renamed from: a */
                public int f17835a;

                /* JADX INFO: renamed from: b */
                public int f17836b;

                /* JADX INFO: renamed from: c */
                public int f17837c;

                /* JADX INFO: renamed from: d */
                public int f17838d;

                /* JADX INFO: renamed from: e */
                public Interpolator f17839e;

                /* JADX INFO: renamed from: f */
                public boolean f17840f;

                /* JADX INFO: renamed from: g */
                public int f17841g;

                /* JADX INFO: renamed from: a */
                public final void m9189a(RecyclerView recyclerView) {
/* 1 */             int i = this.f17838d;
/* 4 */             if (i >= 0) {
/* 7 */                 this.f17838d = -1;
/* 9 */                 recyclerView.m861O(i);
/* 12 */                this.f17840f = false;
/* 14 */                return;
                    }
/* 17 */            if (!this.f17840f) {
/* 73 */                this.f17841g = 0;
/* 75 */                return;
                    }
/* 19 */            Interpolator interpolator = this.f17839e;
/* 22 */            if (interpolator != null && this.f17837c < 1) {
/* 31 */                f42.m3656l("If you provide an interpolator, you must set a positive duration");
/* 34 */                return;
                    }
/* 35 */            int i2 = this.f17837c;
/* 37 */            if (i2 < 1) {
/* 69 */                f42.m3656l("Scroll duration must be a positive number");
/* 72 */                return;
                    }
/* 45 */            recyclerView.f1621O0.m41b(this.f17835a, this.f17836b, i2, interpolator);
/* 50 */            int i3 = this.f17841g + 1;
/* 51 */            this.f17841g = i3;
/* 55 */            if (i3 > 10) {
/* 61 */                AbstractC1245n0.m4876d("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
/* 64 */            this.f17840f = false;
                }
            }
