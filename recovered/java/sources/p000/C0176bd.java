            package p000;

            import android.os.SystemClock;
            import java.net.URL;
            
            /* JADX INFO: renamed from: bd */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 56 */    public final class C0176bd {

                /* JADX INFO: renamed from: a */
                public int f2370a;

                /* JADX INFO: renamed from: b */
                public long f2371b;

                /* JADX INFO: renamed from: c */
                public Object f2372c;

                public C0176bd(long j, Exception exc) {
/* 9 */             this.f2371b = SystemClock.elapsedRealtime() - j;
/* 14 */            if (exc instanceof C2190sq) {
/* 16 */                this.f2370a = 2;
/* 18 */                this.f2372c = exc;
/* 20 */                return;
                    }
/* 24 */            if (!(exc instanceof ux0)) {
/* 53 */                this.f2370a = 0;
/* 55 */                this.f2372c = exc;
/* 57 */                return;
                    }
/* 26 */            Throwable cause = exc.getCause();
/* 30 */            exc = cause != null ? cause : exc;
/* 33 */            this.f2372c = exc;
/* 37 */            if (exc instanceof C1936mq) {
/* 39 */                this.f2370a = 2;
                    } else if (exc instanceof IllegalArgumentException) {
/* 47 */                this.f2370a = 1;
                    } else {
/* 50 */                this.f2370a = 0;
                    }
                }

/* 57 */        public C0176bd(int i, URL url, long j) {
/* 59 */            this.f2370a = i;
/* 60 */            this.f2372c = url;
/* 61 */            this.f2371b = j;
                }
            }
