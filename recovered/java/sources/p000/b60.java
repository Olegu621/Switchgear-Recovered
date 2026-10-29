            package p000;

            import android.content.Context;
            import com.google.android.gms.tasks.Task;
            import com.google.android.gms.tasks.Tasks;
            import java.util.Set;
            import java.util.concurrent.Executor;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class b60 implements yt0, zt0 {

                /* JADX INFO: renamed from: a */
                public final C1008hy f2233a;

                /* JADX INFO: renamed from: b */
                public final Context f2234b;

                /* JADX INFO: renamed from: c */
                public final iz1 f2235c;

                /* JADX INFO: renamed from: d */
                public final Set f2236d;

                /* JADX INFO: renamed from: e */
                public final Executor f2237e;

                public b60(Context context, String str, Set set, iz1 iz1Var, Executor executor) {
/* 10 */            this.f2233a = new C1008hy(1, context, str);
/* 12 */            this.f2236d = set;
/* 14 */            this.f2237e = executor;
/* 16 */            this.f2235c = iz1Var;
/* 18 */            this.f2234b = context;
                }

                /* JADX INFO: renamed from: a */
                public final Task m1291a() {
/* 7 */             if (!dz2.m3284a(this.f2234b)) {
/* 11 */                return Tasks.forResult(HttpUrl.FRAGMENT_ENCODE_SET);
                    }
/* 24 */            return Tasks.call(this.f2237e, new a60(this, 0));
                }

                /* JADX INFO: renamed from: b */
                public final void m1292b() {
/* 8 */             if (this.f2236d.size() <= 0) {
/* 10 */                Tasks.forResult(null);
                    } else if (!dz2.m3284a(this.f2234b)) {
/* 22 */                Tasks.forResult(null);
                    } else {
/* 34 */                Tasks.call(this.f2237e, new a60(this, 1));
                    }
                }
            }
