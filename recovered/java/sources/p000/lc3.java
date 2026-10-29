            package p000;

            import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
            import java.util.Set;
            import java.util.concurrent.Executor;
            import java.util.concurrent.Semaphore;
            import java.util.concurrent.ThreadPoolExecutor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class lc3 {

                /* JADX INFO: renamed from: a */
                public c91 f13186a;

                /* JADX INFO: renamed from: b */
                public boolean f13187b;

                /* JADX INFO: renamed from: c */
                public boolean f13188c;

                /* JADX INFO: renamed from: d */
                public boolean f13189d;

                /* JADX INFO: renamed from: e */
                public boolean f13190e;

                /* JADX INFO: renamed from: f */
                public final Executor f13191f;

                /* JADX INFO: renamed from: g */
                public volatile RunnableC2289vd f13192g;

                /* JADX INFO: renamed from: h */
                public volatile RunnableC2289vd f13193h;

                /* JADX INFO: renamed from: i */
                public final Semaphore f13194i;

                /* JADX INFO: renamed from: j */
                public final Set f13195j;

                public lc3(SignInHubActivity signInHubActivity, Set set) {
/* 1 */             ThreadPoolExecutor threadPoolExecutor = RunnableC2289vd.f18002v;
/* 7 */             this.f13187b = false;
/* 9 */             this.f13188c = false;
/* 12 */            this.f13189d = true;
/* 14 */            this.f13190e = false;
/* 16 */            signInHubActivity.getApplicationContext();
/* 19 */            this.f13191f = threadPoolExecutor;
/* 26 */            this.f13194i = new Semaphore(0);
/* 28 */            this.f13195j = set;
                }

                /* JADX INFO: renamed from: a */
                public final void m6417a() {
/* 3 */             if (this.f13192g != null) {
/* 8 */                 if (!this.f13187b) {
/* 10 */                    this.f13190e = true;
                        }
/* 12 */                RunnableC2289vd runnableC2289vd = this.f13193h;
/* 14 */                RunnableC2289vd runnableC2289vd2 = this.f13192g;
/* 17 */                if (runnableC2289vd != null) {
/* 19 */                    runnableC2289vd2.getClass();
/* 22 */                    this.f13192g = null;
/* 24 */                    return;
                        }
/* 25 */                runnableC2289vd2.getClass();
/* 28 */                RunnableC2289vd runnableC2289vd3 = this.f13192g;
/* 32 */                runnableC2289vd3.f18007d.set(true);
/* 42 */                if (runnableC2289vd3.f18005b.cancel(false)) {
/* 46 */                    this.f13193h = this.f13192g;
                        }
/* 48 */                this.f13192g = null;
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m6418b() {
/* 3 */             if (this.f13193h != null || this.f13192g == null) {
/* 64 */                return;
                    }
/* 11 */            this.f13192g.getClass();
/* 14 */            RunnableC2289vd runnableC2289vd = this.f13192g;
/* 16 */            Executor executor = this.f13191f;
/* 22 */            if (runnableC2289vd.f18006c == 1) {
/* 52 */                runnableC2289vd.f18006c = 2;
/* 56 */                runnableC2289vd.f18004a.getClass();
/* 61 */                executor.execute(runnableC2289vd.f18005b);
/* 64 */                return;
                    }
/* 26 */            int iM3520y = AbstractC0886en.m3520y(runnableC2289vd.f18006c);
/* 30 */            if (iM3520y == 1) {
/* 48 */                f42.m3656l("Cannot execute task: the task is already running.");
                    } else if (iM3520y != 2) {
/* 36 */                f42.m3656l("We should never reach this state");
                    } else {
/* 42 */                f42.m3656l("Cannot execute task: the task has already been executed (a task can be executed only once)");
                    }
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder(64);
/* 8 */             he3.m4180a(sb, this);
/* 13 */            sb.append(" id=");
/* 17 */            sb.append(0);
/* 22 */            sb.append("}");
/* 25 */            return sb.toString();
                }
            }
