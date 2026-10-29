            package p000;

            import android.app.job.JobInfo;
            import android.app.job.JobScheduler;
            import android.content.ComponentName;
            import android.os.PersistableBundle;
            import com.google.android.gms.internal.measurement.zzin;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class xl3 extends wg3 {

                /* JADX INFO: renamed from: c */
                public JobScheduler f19246c;

                @Override // p000.wg3
                /* JADX INFO: renamed from: C */
                public final boolean mo4531C() {
/* 1 */             return true;
                }

                /* JADX INFO: renamed from: D */
                public final void m9975D(long j) {
/* 3 */             ij3 ij3Var = (ij3) this.f16749a;
/* 5 */             m9576A();
/* 8 */             mo1375y();
/* 11 */            JobScheduler jobScheduler = this.f19246c;
/* 15 */            if (jobScheduler != null && jobScheduler.getPendingJob("measurement-client".concat(String.valueOf(ij3Var.f9645a.getPackageName())).hashCode()) != null) {
/* 42 */                uh3 uh3Var = ij3Var.f9655f;
/* 44 */                ij3.m4555l(uh3Var);
/* 51 */                uh3Var.f17534Y.m8510a("[sgtm] There's an existing pending job, skip this schedule.");
/* 54 */                return;
                    }
/* 55 */            zzin zzinVarM9976E = m9976E();
/* 61 */            if (zzinVarM9976E != zzin.CLIENT_UPLOAD_ELIGIBLE) {
/* 174 */               uh3 uh3Var2 = ij3Var.f9655f;
/* 176 */               ij3.m4555l(uh3Var2);
/* 187 */               uh3Var2.f17534Y.m8511b(zzinVarM9976E.name(), "[sgtm] Not eligible for Scion upload");
/* 190 */               return;
                    }
/* 63 */            uh3 uh3Var3 = ij3Var.f9655f;
/* 65 */            ij3.m4555l(uh3Var3);
/* 76 */            uh3Var3.f17534Y.m8511b(Long.valueOf(j), "[sgtm] Scheduling Scion upload, millis");
/* 81 */            PersistableBundle persistableBundle = new PersistableBundle();
/* 88 */            persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
/* 141 */           JobInfo jobInfoBuild = new JobInfo.Builder("measurement-client".concat(String.valueOf(ij3Var.f9645a.getPackageName())).hashCode(), new ComponentName(ij3Var.f9645a, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build();
/* 145 */           JobScheduler jobScheduler2 = this.f19246c;
/* 147 */           kb1.m6061n(jobScheduler2);
/* 150 */           int iSchedule = jobScheduler2.schedule(jobInfoBuild);
/* 154 */           uh3 uh3Var4 = ij3Var.f9655f;
/* 156 */           ij3.m4555l(uh3Var4);
/* 170 */           uh3Var4.f17534Y.m8511b(iSchedule == 1 ? "SUCCESS" : "FAILURE", "[sgtm] Scion upload job scheduled with result");
                }

                /* JADX INFO: renamed from: E */
                public final zzin m9976E() {
/* 3 */             ij3 ij3Var = (ij3) this.f16749a;
/* 5 */             m9576A();
/* 8 */             mo1375y();
/* 13 */            if (this.f19246c == null) {
/* 79 */                return zzin.MISSING_JOB_SCHEDULER;
                    }
/* 19 */            Boolean boolM7408L = ij3Var.f9651d.m7408L("google_analytics_sgtm_upload_enabled");
/* 31 */            if (!(boolM7408L == null ? false : boolM7408L.booleanValue())) {
/* 76 */                return zzin.NOT_ENABLED_IN_MANIFEST;
                    }
/* 44 */            if (ij3Var.m4569q().f9589U < 119000) {
/* 73 */                return zzin.SDK_TOO_OLD;
                    }
/* 52 */            if (up3.m9065S(ij3Var.f9645a)) {
                        return !ij3Var.m4567o().m7511G() ? zzin.NON_PLAY_MODE : zzin.CLIENT_UPLOAD_ELIGIBLE;
                    }
/* 54 */            return zzin.MEASUREMENT_SERVICE_NOT_ENABLED;
                }
            }
