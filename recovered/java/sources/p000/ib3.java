            package p000;

            import android.os.SystemClock;
            import com.google.android.gms.common.ConnectionResult;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.common.internal.AbstractC0322a;
            import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
            import com.google.android.gms.common.internal.MethodInvocation;
            import com.google.android.gms.common.internal.RootTelemetryConfiguration;
            import com.google.android.gms.internal.base.zau;
            import com.google.android.gms.tasks.OnCompleteListener;
            import com.google.android.gms.tasks.Task;
            import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ib3 implements OnCompleteListener {

                /* JADX INFO: renamed from: a */
                public final ur0 f9533a;

                /* JADX INFO: renamed from: b */
                public final int f9534b;

                /* JADX INFO: renamed from: c */
                public final C2323w9 f9535c;

                /* JADX INFO: renamed from: d */
                public final long f9536d;

                /* JADX INFO: renamed from: e */
                public final long f9537e;

                public ib3(ur0 ur0Var, int i, C2323w9 c2323w9, long j, long j2) {
/* 4 */             this.f9533a = ur0Var;
/* 6 */             this.f9534b = i;
/* 8 */             this.f9535c = c2323w9;
/* 10 */            this.f9536d = j;
/* 12 */            this.f9537e = j2;
                }

                /* JADX INFO: renamed from: a */
                public static ConnectionTelemetryConfiguration m4511a(cb3 cb3Var, AbstractC0322a abstractC0322a, int i) {
/* 1 */             ConnectionTelemetryConfiguration telemetryConfiguration = abstractC0322a.getTelemetryConfiguration();
/* 5 */             if (telemetryConfiguration == null || !telemetryConfiguration.f3481b) {
/* 49 */                return null;
                    }
/* 11 */            int[] iArr = telemetryConfiguration.f3483d;
/* 13 */            int i2 = 0;
/* 14 */            if (iArr != null) {
/* 33 */                while (i2 < iArr.length) {
/* 37 */                    if (iArr[i2] != i) {
/* 46 */                        i2++;
                            }
                        }
/* 49 */                return null;
                    }
/* 16 */            int[] iArr2 = telemetryConfiguration.f3485f;
/* 18 */            if (iArr2 != null) {
/* 22 */                while (i2 < iArr2.length) {
/* 26 */                    if (iArr2[i2] == i) {
/* 49 */                        return null;
                            }
/* 29 */                    i2++;
                        }
                    }
/* 43 */            if (cb3Var.f2831n < telemetryConfiguration.f3484e) {
/* 45 */                return telemetryConfiguration;
                    }
/* 49 */            return null;
                }

                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    int i;
                    int i2;
                    int i3;
                    int i4;
                    int i5;
                    int i6;
                    long j;
                    long j2;
/* 3 */             ur0 ur0Var = this.f9533a;
/* 9 */             if (ur0Var.m9127c()) {
/* 19 */                RootTelemetryConfiguration rootTelemetryConfiguration = (RootTelemetryConfiguration) d52.m2927D().f7001a;
/* 21 */                if (rootTelemetryConfiguration == null || rootTelemetryConfiguration.f3515b) {
/* 35 */                    cb3 cb3Var = (cb3) ur0Var.f17691j.get(this.f9535c);
/* 37 */                    if (cb3Var != null) {
/* 39 */                        Object obj = cb3Var.f2821b;
/* 43 */                        if (obj instanceof AbstractC0322a) {
/* 45 */                            AbstractC0322a abstractC0322a = (AbstractC0322a) obj;
/* 47 */                            long j3 = this.f9536d;
/* 59 */                            boolean z = j3 > 0;
/* 60 */                            int gCoreServiceId = abstractC0322a.getGCoreServiceId();
/* 66 */                            if (rootTelemetryConfiguration != null) {
/* 70 */                                z &= rootTelemetryConfiguration.f3516c;
/* 71 */                                int i7 = rootTelemetryConfiguration.f3517d;
/* 73 */                                int i8 = rootTelemetryConfiguration.f3518e;
/* 75 */                                i = rootTelemetryConfiguration.f3514a;
/* 81 */                                if (abstractC0322a.hasConnectionInfo() && !abstractC0322a.isConnecting()) {
/* 91 */                                    ConnectionTelemetryConfiguration connectionTelemetryConfigurationM4511a = m4511a(cb3Var, abstractC0322a, this.f9534b);
/* 95 */                                    if (connectionTelemetryConfigurationM4511a == null) {
/* 231 */                                       return;
                                            }
/* 99 */                                    boolean z2 = connectionTelemetryConfigurationM4511a.f3482c && j3 > 0;
/* 105 */                                   i8 = connectionTelemetryConfigurationM4511a.f3484e;
/* 107 */                                   z = z2;
                                        }
/* 108 */                               i3 = i7;
/* 109 */                               i2 = i8;
                                    } else {
/* 113 */                               i = 0;
/* 114 */                               i2 = 100;
/* 115 */                               i3 = 5000;
                                    }
/* 120 */                           int iElapsedRealtime = -1;
/* 121 */                           if (task.isSuccessful()) {
/* 123 */                               i6 = 0;
/* 124 */                               i5 = 0;
                                    } else if (task.isCanceled()) {
/* 133 */                               i5 = -1;
/* 135 */                               i6 = 100;
                                    } else {
/* 137 */                               Exception exception = task.getException();
/* 143 */                               if (exception instanceof C1020i9) {
/* 147 */                                   Status status = ((C1020i9) exception).getStatus();
/* 151 */                                   i4 = status.f3445a;
/* 153 */                                   ConnectionResult connectionResult = status.f3448d;
/* 155 */                                   if (connectionResult != null) {
/* 161 */                                       i5 = connectionResult.f3416b;
                                            }
/* 159 */                                   i6 = i4;
                                        } else {
/* 166 */                                   i4 = ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE;
                                        }
/* 157 */                               i5 = -1;
/* 159 */                               i6 = i4;
                                    }
/* 169 */                           if (z) {
/* 171 */                               long jCurrentTimeMillis = System.currentTimeMillis();
/* 182 */                               iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.f9537e);
/* 183 */                               j = j3;
/* 185 */                               j2 = jCurrentTimeMillis;
                                    } else {
/* 190 */                               j = 0;
/* 192 */                               j2 = 0;
                                    }
/* 217 */                           jb3 jb3Var = new jb3(new MethodInvocation(this.f9534b, i6, i5, j, j2, null, null, gCoreServiceId, iElapsedRealtime), i, i3, i2);
/* 220 */                           zau zauVar = ur0Var.f17695n;
/* 228 */                           zauVar.sendMessage(zauVar.obtainMessage(18, jb3Var));
                                }
                            }
                        }
                    }
                }
            }
