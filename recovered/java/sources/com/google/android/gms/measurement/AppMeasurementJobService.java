            package com.google.android.gms.measurement;

            import android.app.Service;
            import android.app.job.JobParameters;
            import android.app.job.JobService;
            import android.content.Intent;
            import com.google.android.gms.internal.measurement.zzfb;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.Objects;
            import p000.ac3;
            import p000.js0;
            import p000.kb1;
            import p000.mp3;
            import p000.ol3;
            import p000.pl3;
            import p000.q62;
            import p000.uh3;
            import p000.vn3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AppMeasurementJobService extends JobService implements vn3 {

                /* JADX INFO: renamed from: a */
                public ac3 f4187a;

                @Override // p000.vn3
                /* JADX INFO: renamed from: a */
                public final void mo2158a(Intent intent) {
                }

                @Override // p000.vn3
                /* JADX INFO: renamed from: b */
                public final void mo2159b(JobParameters jobParameters) {
/* 2 */             jobFinished(jobParameters, false);
                }

                /* JADX INFO: renamed from: c */
                public final ac3 m2160c() {
/* 3 */             if (this.f4187a == null) {
/* 12 */                this.f4187a = new ac3(this, 8);
                    }
/* 14 */            return this.f4187a;
                }

                @Override // android.app.Service
                public final void onCreate() {
/* 1 */             super.onCreate();
/* 22 */            ((Service) m2160c().f184b).getClass().getSimpleName().concat(" is starting up.");
                }

                @Override // android.app.Service
                public final void onDestroy() {
/* 19 */            ((Service) m2160c().f184b).getClass().getSimpleName().concat(" is shutting down.");
/* 22 */            super.onDestroy();
                }

                @Override // android.app.Service
                public final void onRebind(Intent intent) {
/* 1 */             m2160c();
/* 4 */             if (intent == null) {
/* 10 */                AbstractC1245n0.m4876d("FA", "onRebind called with null intent");
                    } else {
/* 24 */                "onRebind called. action: ".concat(String.valueOf(intent.getAction()));
                    }
                }

                @Override // android.app.job.JobService
                public final boolean onStartJob(JobParameters jobParameters) {
                    JobParameters jobParameters2;
/* 1 */             ac3 ac3VarM2160c = m2160c();
/* 7 */             Service service = (Service) ac3VarM2160c.f184b;
/* 15 */            String string = jobParameters.getExtras().getString("action");
/* 25 */            "onStartJob received action: ".concat(String.valueOf(string));
/* 34 */            if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
/* 36 */                kb1.m6061n(string);
/* 39 */                mp3 mp3VarM6723B = mp3.m6723B(service);
/* 43 */                uh3 uh3VarMo4557a = mp3VarM6723B.mo4557a();
/* 49 */                q62 q62Var = mp3VarM6723B.f13905W.f9649c;
/* 55 */                uh3VarMo4557a.f17534Y.m8511b(string, "Local AppMeasurementJobService called. action");
/* 63 */                jobParameters2 = jobParameters;
/* 76 */                mp3VarM6723B.mo4558b().m1370I(new pl3(ac3VarM2160c, mp3VarM6723B, new js0(ac3VarM2160c, uh3VarMo4557a, jobParameters2, 18, false)));
                    } else {
/* 80 */                jobParameters2 = jobParameters;
                    }
/* 87 */            if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
/* 107 */               return true;
                    }
/* 89 */            kb1.m6061n(string);
/* 104 */           zzfb.zza(service, null).zzw(new ol3(ac3VarM2160c, jobParameters2, 5, false));
/* 107 */           return true;
                }

                @Override // android.app.job.JobService
                public final boolean onStopJob(JobParameters jobParameters) {
/* 1 */             return false;
                }

                @Override // android.app.Service
                public final boolean onUnbind(Intent intent) {
/* 1 */             m2160c();
/* 4 */             if (intent == null) {
/* 10 */                AbstractC1245n0.m4876d("FA", "onUnbind called with null intent");
/* 27 */                return true;
                    }
/* 24 */            "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction()));
/* 27 */            return true;
                }

                @Override // p000.vn3
                public final boolean zza(int i) {
/* 6 */             throw new UnsupportedOperationException();
                }
            }
