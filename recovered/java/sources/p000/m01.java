            package p000;

            import android.app.job.JobParameters;
            import android.app.job.JobServiceEngine;
            import androidx.core.app.JobIntentService;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class m01 extends JobServiceEngine {

                /* JADX INFO: renamed from: a */
                public final JobIntentService f13543a;

                /* JADX INFO: renamed from: b */
                public final Object f13544b;

                public m01(JobIntentService jobIntentService) {
/* 1 */             super(jobIntentService);
/* 9 */             this.f13544b = new Object();
/* 11 */            this.f13543a = jobIntentService;
                }

                public final boolean onStartJob(JobParameters jobParameters) {
/* 3 */             this.f13543a.getClass();
/* 6 */             return true;
                }

                public final boolean onStopJob(JobParameters jobParameters) {
/* 3 */             this.f13543a.getClass();
/* 7 */             throw null;
                }
            }
