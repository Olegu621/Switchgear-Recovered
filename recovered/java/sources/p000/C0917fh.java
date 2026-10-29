            package p000;

            import android.window.BackEvent;
            
            /* JADX INFO: renamed from: fh */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0917fh {

                /* JADX INFO: renamed from: a */
                public final float f8209a;

                /* JADX INFO: renamed from: b */
                public final float f8210b;

                /* JADX INFO: renamed from: c */
                public final float f8211c;

                /* JADX INFO: renamed from: d */
                public final int f8212d;

                public C0917fh(BackEvent backEvent) {
/* 1 */             backEvent.getClass();
/* 4 */             C0946g9 c0946g9 = C0946g9.f8516a;
/* 6 */             float fM3893d = c0946g9.m3893d(backEvent);
/* 10 */            float fM3894e = c0946g9.m3894e(backEvent);
/* 14 */            float fM3891b = c0946g9.m3891b(backEvent);
/* 18 */            int iM3892c = c0946g9.m3892c(backEvent);
/* 25 */            this.f8209a = fM3893d;
/* 27 */            this.f8210b = fM3894e;
/* 29 */            this.f8211c = fM3891b;
/* 31 */            this.f8212d = iM3892c;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
/* 10 */            sb.append(this.f8209a);
/* 15 */            sb.append(", touchY=");
/* 20 */            sb.append(this.f8210b);
/* 25 */            sb.append(", progress=");
/* 30 */            sb.append(this.f8211c);
/* 35 */            sb.append(", swipeEdge=");
/* 42 */            return AbstractC0886en.m3510n(sb, this.f8212d, '}');
                }
            }
