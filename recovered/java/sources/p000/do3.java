            package p000;

            import android.app.BroadcastOptions;
            import android.content.Context;
            import android.content.Intent;
            import android.os.Build;
            import android.os.SystemClock;
            import io.sentry.android.core.internal.tombstone.C1212b;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class do3 extends be3 {

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ int f7353e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ Object f7354f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ do3(Object obj, jk3 jk3Var, int i) {
/* 5 */             super(jk3Var);
/* 1 */             this.f7353e = i;
/* 3 */             this.f7354f = obj;
                }

                @Override // p000.be3
                /* JADX INFO: renamed from: a */
                public final void mo1347a() {
/* 1 */             int i = this.f7353e;
/* 3 */             Object obj = this.f7354f;
                    switch (i) {
                        case 0:
/* 126 */                   C1212b c1212b = (C1212b) obj;
/* 130 */                   lo3 lo3Var = (lo3) c1212b.f10130d;
/* 132 */                   lo3Var.mo1375y();
/* 137 */                   ij3 ij3Var = (ij3) lo3Var.f16749a;
/* 141 */                   ij3Var.f9640V.getClass();
/* 149 */                   c1212b.m4822b(SystemClock.elapsedRealtime(), false, false);
/* 152 */                   of3 of3Var = ij3Var.f9643Y;
/* 154 */                   ij3.m4552i(of3Var);
/* 159 */                   ij3Var.f9640V.getClass();
/* 166 */                   of3Var.m7163C(SystemClock.elapsedRealtime());
                            break;
                        case 1:
/* 99 */                    po3 po3Var = (po3) obj;
/* 101 */                   po3Var.m7531D();
/* 108 */                   uh3 uh3Var = ((ij3) po3Var.f16749a).f9655f;
/* 110 */                   ij3.m4555l(uh3Var);
/* 117 */                   uh3Var.f17534Y.m8510a("Starting upload from DelayedRunnable");
/* 122 */                   po3Var.f15676b.m6776q();
                            break;
                        default:
/* 8 */                     mp3 mp3Var = (mp3) obj;
/* 14 */                    mp3Var.mo4558b().mo1375y();
/* 23 */                    String str = (String) mp3Var.f13912b0.pollFirst();
/* 25 */                    if (str != null) {
/* 33 */                        ((xt0) mp3Var.mo4562f()).getClass();
/* 40 */                        mp3Var.f13935t0 = SystemClock.elapsedRealtime();
/* 50 */                        mp3Var.mo4557a().f17534Y.m8511b(str, "Sending trigger URI notification to app");
/* 55 */                        Intent intent = new Intent();
/* 60 */                        intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
/* 63 */                        intent.setPackage(str);
/* 68 */                        Context context = mp3Var.f13905W.f9645a;
/* 74 */                        if (Build.VERSION.SDK_INT < 34) {
/* 76 */                            context.sendBroadcast(intent);
                                } else {
/* 2 */                             context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                }
                            }
/* 95 */                    mp3Var.m6734F();
                            break;
                    }
                }
            }
