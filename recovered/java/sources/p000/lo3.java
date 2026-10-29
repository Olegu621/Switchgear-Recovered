            package p000;

            import android.os.Looper;
            import android.os.SystemClock;
            import com.google.android.gms.internal.measurement.zzcn;
            import io.sentry.android.core.internal.tombstone.C1212b;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class lo3 extends wg3 {

                /* JADX INFO: renamed from: c */
                public zzcn f13435c;

                /* JADX INFO: renamed from: d */
                public boolean f13436d;

                /* JADX INFO: renamed from: e */
                public final pi3 f13437e;

                /* JADX INFO: renamed from: f */
                public final C1212b f13438f;

                /* JADX INFO: renamed from: i */
                public final we2 f13439i;

                public lo3(ij3 ij3Var) {
/* 1 */             super(ij3Var);
/* 5 */             this.f13436d = true;
/* 12 */            this.f13437e = new pi3(this);
/* 16 */            C1212b c1212b = new C1212b();
/* 19 */            c1212b.f10130d = this;
/* 25 */            ij3 ij3Var2 = (ij3) this.f16749a;
/* 31 */            c1212b.f10129c = new do3(c1212b, ij3Var2, 0);
/* 35 */            ij3Var2.f9640V.getClass();
/* 38 */            long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 42 */            c1212b.f10127a = jElapsedRealtime;
/* 44 */            c1212b.f10128b = jElapsedRealtime;
/* 46 */            this.f13438f = c1212b;
/* 53 */            this.f13439i = new we2(this);
                }

                @Override // p000.wg3
                /* JADX INFO: renamed from: C */
                public final boolean mo4531C() {
/* 1 */             return false;
                }

                /* JADX INFO: renamed from: D */
                public final void m6515D() {
/* 1 */             mo1375y();
/* 6 */             if (this.f13435c == null) {
/* 17 */                this.f13435c = new zzcn(Looper.getMainLooper());
                    }
                }
            }
