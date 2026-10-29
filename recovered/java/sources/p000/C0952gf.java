            package p000;

            import android.os.Handler;
            import java.util.concurrent.Executor;
            
            /* JADX INFO: renamed from: gf */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0952gf {

                /* JADX INFO: renamed from: a */
                public final Executor f8574a;

                /* JADX INFO: renamed from: b */
                public final Handler f8575b;

                public C0952gf(Executor executor, Handler handler) {
/* 5 */             if (executor == null) {
/* 22 */                C1951n4.m6868s("Null cameraExecutor");
/* 25 */                throw null;
                    }
/* 7 */             this.f8574a = executor;
/* 9 */             if (handler != null) {
/* 11 */                this.f8575b = handler;
                    } else {
/* 16 */                C1951n4.m6868s("Null schedulerHandler");
/* 19 */                throw null;
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof C0952gf) {
/* 10 */                C0952gf c0952gf = (C0952gf) obj;
/* 20 */                if (this.f8574a.equals(c0952gf.f8574a) && this.f8575b.equals(c0952gf.f8575b)) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 18 */            return this.f8575b.hashCode() ^ ((this.f8574a.hashCode() ^ 1000003) * 1000003);
                }

                public final String toString() {
/* 28 */            return "CameraThreadConfig{cameraExecutor=" + this.f8574a + ", schedulerHandler=" + this.f8575b + "}";
                }
            }
