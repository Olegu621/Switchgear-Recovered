            package p000;

            import android.os.Bundle;
            import android.util.Log;
            import com.google.android.gms.tasks.TaskCompletionSource;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class vq3 {

                /* JADX INFO: renamed from: a */
                public final int f18318a;

                /* JADX INFO: renamed from: b */
                public final TaskCompletionSource f18319b = new TaskCompletionSource();

                /* JADX INFO: renamed from: c */
                public final int f18320c;

                /* JADX INFO: renamed from: d */
                public final Bundle f18321d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ int f18322e;

                public vq3(int i, int i2, Bundle bundle, int i3) {
/* 1 */             this.f18322e = i3;
/* 13 */            this.f18318a = i;
/* 15 */            this.f18320c = i2;
/* 17 */            this.f18321d = bundle;
                }

                /* JADX INFO: renamed from: a */
                public final boolean m9335a() {
                    switch (this.f18322e) {
                        case 0:
/* 8 */                     return true;
                        default:
/* 6 */                     return false;
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m9336b(C1898lp c1898lp) {
/* 8 */             if (Log.isLoggable("MessengerIpcClient", 3)) {
/* 10 */                toString();
/* 13 */                c1898lp.toString();
                    }
/* 18 */            this.f18319b.setException(c1898lp);
                }

                public final String toString() {
/* 40 */            return "Request { what=" + this.f18320c + " id=" + this.f18318a + " oneWay=" + m9335a() + "}";
                }
            }
