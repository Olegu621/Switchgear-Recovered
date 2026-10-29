            package p000;

            import android.content.Context;
            import com.google.android.gms.common.Feature;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.common.api.internal.BasePendingResult;
            import com.google.android.gms.common.internal.TelemetryData;
            import com.google.android.gms.internal.base.zaf;
            import com.google.android.gms.tasks.Task;
            import com.google.android.gms.tasks.TaskCompletionSource;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class fc3 extends or0 {

                /* JADX INFO: renamed from: a */
                public static final C0983h9 f8129a = new C0983h9("ClientTelemetry.API", new va3(2), new C0872e9());

                /* JADX INFO: renamed from: b */
                public static int f8130b = 1;

                /* JADX INFO: renamed from: c */
                public Task m3714c(TelemetryData telemetryData) {
/* 1 */             tm2 tm2VarBuilder = um2.builder();
/* 11 */            tm2VarBuilder.f17187c = new Feature[]{zaf.zaa};
/* 14 */            tm2VarBuilder.f17186b = false;
/* 23 */            tm2VarBuilder.f17185a = new fs0(telemetryData, 26);
/* 29 */            return doBestEffortWrite(tm2VarBuilder.m8812a());
                }

                /* JADX INFO: renamed from: d */
                public synchronized int m3715d() {
                    int i;
                    try {
/* 2 */                 i = f8130b;
/* 5 */                 if (i == 1) {
/* 7 */                     Context applicationContext = getApplicationContext();
/* 11 */                    pr0 pr0Var = pr0.f15259d;
/* 16 */                    int iM8004c = pr0Var.m8004c(applicationContext, 12451000);
/* 20 */                    if (iM8004c == 0) {
/* 22 */                        i = 4;
/* 23 */                        f8130b = 4;
                            } else if (pr0Var.m8003a(applicationContext, null, iM8004c) != null || wb0.m9512a(applicationContext, "com.google.android.gms.auth.api.fallback") == 0) {
/* 47 */                        i = 2;
/* 48 */                        f8130b = 2;
                            } else {
/* 43 */                        i = 3;
/* 44 */                        f8130b = 3;
                            }
                        }
                    } catch (Throwable th) {
/* 53 */                throw th;
                    }
/* 51 */            return i;
                }

                public Task signOut() {
                    BasePendingResult basePendingResultDoWrite;
/* 1 */             tr0 tr0VarAsGoogleApiClient = asGoogleApiClient();
/* 5 */             Context applicationContext = getApplicationContext();
/* 19 */            boolean z = m3715d() == 3;
/* 20 */            ha1 ha1Var = pc3.f15068a;
/* 22 */            Object[] objArr = new Object[0];
/* 26 */            if (ha1Var.f8985c <= 3) {
/* 30 */                ha1Var.m4137a("Signing out", objArr);
                    }
/* 33 */            pc3.m7388a(applicationContext);
/* 36 */            if (z) {
/* 40 */                basePendingResultDoWrite = new zg2(tr0VarAsGoogleApiClient);
/* 45 */                basePendingResultDoWrite.setResult(Status.f3440e);
                    } else {
/* 58 */                basePendingResultDoWrite = ((eb3) tr0VarAsGoogleApiClient).f7609b.doWrite(new oc3(tr0VarAsGoogleApiClient, 0));
                    }
/* 66 */            p62 p62Var = new p62(11);
/* 71 */            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
/* 79 */            basePendingResultDoWrite.addStatusListener(new hc3(basePendingResultDoWrite, taskCompletionSource, p62Var));
/* 82 */            return taskCompletionSource.getTask();
                }
            }
