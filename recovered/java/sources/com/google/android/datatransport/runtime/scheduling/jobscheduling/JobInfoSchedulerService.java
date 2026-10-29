            package com.google.android.datatransport.runtime.scheduling.jobscheduling;

            import android.app.job.JobParameters;
            import android.app.job.JobService;
            import android.util.Base64;
            import java.util.concurrent.Executor;
            import p000.C0875ec;
            import p000.C2497yg;
            import p000.RunnableC1784j8;
            import p000.f31;
            import p000.rx1;
            import p000.sy2;
            import p000.yr2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class JobInfoSchedulerService extends JobService {

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ int f3125a = 0;

                @Override // android.app.job.JobService
                public final boolean onStartJob(JobParameters jobParameters) {
/* 7 */             String string = jobParameters.getExtras().getString("backendName");
/* 17 */            String string2 = jobParameters.getExtras().getString("extras");
/* 27 */            int i = jobParameters.getExtras().getInt("priority");
/* 37 */            int i2 = jobParameters.getExtras().getInt("attemptNumber");
/* 45 */            yr2.m10174b(getApplicationContext());
/* 48 */            C0875ec c0875ecM10147a = C2497yg.m10147a();
/* 52 */            c0875ecM10147a.m3373L(string);
/* 59 */            c0875ecM10147a.f7615d = rx1.m8317b(i);
/* 61 */            if (string2 != null) {
/* 68 */                c0875ecM10147a.f7614c = Base64.decode(string2, 0);
                    }
/* 74 */            f31 f31Var = yr2.m10173a().f19784d;
/* 96 */            ((Executor) f31Var.f7987e).execute(new sy2(f31Var, c0875ecM10147a.m3390m(), i2, new RunnableC1784j8(29, this, jobParameters)));
/* 99 */            return true;
                }

                @Override // android.app.job.JobService
                public final boolean onStopJob(JobParameters jobParameters) {
/* 1 */             return true;
                }
            }
