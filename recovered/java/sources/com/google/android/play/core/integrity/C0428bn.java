            package com.google.android.play.core.integrity;

            import android.app.Activity;
            import android.content.Context;
            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.IInterface;
            import com.google.android.gms.tasks.Task;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import com.google.android.play.integrity.internal.AbstractBinderC0466h;
            import com.google.android.play.integrity.internal.C0465g;
            import com.google.android.play.integrity.internal.InterfaceC0467i;
            import java.util.ArrayList;
            import p000.mn0;
            import p000.pa3;
            import p000.qa3;
            import p000.ua3;
            import p000.z93;
            
            /* JADX INFO: renamed from: com.google.android.play.core.integrity.bn */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class C0428bn {

                /* JADX INFO: renamed from: a */
                final z93 f5229a;

                /* JADX INFO: renamed from: b */
                private final qa3 f5230b;

                /* JADX INFO: renamed from: c */
                private final String f5231c;

                /* JADX INFO: renamed from: d */
                private final TaskCompletionSource f5232d;

                /* JADX INFO: renamed from: e */
                private final C0407at f5233e;

                /* JADX INFO: renamed from: f */
                private final InterfaceC0445k f5234f;

                public C0428bn(Context context, qa3 qa3Var, C0407at c0407at, InterfaceC0445k interfaceC0445k) {
/* 6 */             TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
/* 9 */             this.f5232d = taskCompletionSource;
/* 15 */            this.f5231c = context.getPackageName();
/* 17 */            this.f5230b = qa3Var;
/* 19 */            this.f5233e = c0407at;
/* 21 */            this.f5234f = interfaceC0445k;
/* 36 */            z93 z93Var = new z93(context, qa3Var, "ExpressIntegrityService", C0429bo.f5235a, new ua3() { // from class: com.google.android.play.core.integrity.bd
                        @Override // p000.ua3
                        /* JADX INFO: renamed from: a */
                        public final Object mo2451a(IBinder iBinder) {
/* 1 */                     int i = AbstractBinderC0466h.f5280i;
/* 3 */                     if (iBinder == null) {
/* 5 */                         return null;
                            }
/* 9 */                     IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
                            return iInterfaceQueryLocalInterface instanceof InterfaceC0467i ? (InterfaceC0467i) iInterfaceQueryLocalInterface : new C0465g(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
                        }
                    });
/* 39 */            this.f5229a = z93Var;
/* 50 */            z93Var.m10289a().post(new C0419be(this, taskCompletionSource, context));
                }

                /* JADX INFO: renamed from: a */
                public static Bundle m2480a(C0428bn c0428bn, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest, long j, long j2, int i) {
/* 3 */             Bundle bundle = new Bundle();
/* 10 */            bundle.putString("package.name", c0428bn.f5231c);
/* 15 */            bundle.putLong("cloud.prj", j);
/* 24 */            bundle.putString("nonce", standardIntegrityTokenRequest.requestHash());
/* 29 */            bundle.putLong("warm.up.sid", j2);
/* 35 */            bundle.putInt("playcore.integrity.version.major", 1);
/* 41 */            bundle.putInt("playcore.integrity.version.minor", 4);
/* 47 */            bundle.putInt("playcore.integrity.version.patch", 0);
/* 52 */            bundle.putInt("webview.request.mode", 0);
/* 66 */            bundle.putIntegerArrayList("request.verdict.opt.out", new ArrayList<>(standardIntegrityTokenRequest.verdictOptOut()));
/* 71 */            ArrayList arrayList = new ArrayList();
/* 84 */            arrayList.add(new pa3(5, System.currentTimeMillis()));
/* 98 */            bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(mn0.m6685a(arrayList)));
/* 101 */           return bundle;
                }

                /* JADX INFO: renamed from: b */
                public static Bundle m2481b(C0428bn c0428bn, long j, int i) {
/* 3 */             Bundle bundle = new Bundle();
/* 10 */            bundle.putString("package.name", c0428bn.f5231c);
/* 15 */            bundle.putLong("cloud.prj", j);
/* 21 */            bundle.putInt("playcore.integrity.version.major", 1);
/* 27 */            bundle.putInt("playcore.integrity.version.minor", 4);
/* 33 */            bundle.putInt("playcore.integrity.version.patch", 0);
/* 38 */            bundle.putInt("webview.request.mode", 0);
/* 43 */            ArrayList arrayList = new ArrayList();
/* 55 */            arrayList.add(new pa3(4, System.currentTimeMillis()));
/* 69 */            bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(mn0.m6685a(arrayList)));
/* 72 */            return bundle;
                }

                /* JADX INFO: renamed from: k */
                public static /* bridge */ /* synthetic */ boolean m2487k(C0428bn c0428bn, int i) {
                    return c0428bn.f5232d.getTask().isSuccessful() && ((Integer) c0428bn.f5232d.getTask().getResult()).intValue() < 83420000;
                }

                /* JADX INFO: renamed from: l */
                public static /* bridge */ /* synthetic */ boolean m2488l(C0428bn c0428bn) {
                    return c0428bn.f5232d.getTask().isSuccessful() && ((Integer) c0428bn.f5232d.getTask().getResult()).intValue() == 0;
                }

                /* JADX INFO: renamed from: c */
                public final Task m2489c(Activity activity, Bundle bundle) {
/* 3 */             int i = bundle.getInt("dialog.intent.type");
/* 19 */            this.f5230b.m7756b("requestAndShowDialog(%s)", Integer.valueOf(i));
/* 24 */            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
/* 38 */            this.f5229a.m10290c(new C0422bh(this, taskCompletionSource, bundle, activity, taskCompletionSource, i), taskCompletionSource);
/* 41 */            return taskCompletionSource.getTask();
                }

                /* JADX INFO: renamed from: d */
                public final Task m2490d(StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest, long j, long j2, int i) {
/* 13 */            this.f5230b.m7756b("requestExpressIntegrityToken(%s)", Long.valueOf(j2));
/* 18 */            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
/* 34 */            this.f5229a.m10290c(new C0421bg(this, taskCompletionSource, 0, standardIntegrityTokenRequest, j, j2, taskCompletionSource), taskCompletionSource);
/* 37 */            return taskCompletionSource.getTask();
                }

                /* JADX INFO: renamed from: e */
                public final Task m2491e(long j, int i) {
/* 13 */            this.f5230b.m7756b("warmUpIntegrityToken(%s)", Long.valueOf(j));
/* 18 */            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
/* 32 */            this.f5229a.m10290c(new C0420bf(this, taskCompletionSource, 0, j, taskCompletionSource), taskCompletionSource);
/* 35 */            return taskCompletionSource.getTask();
                }
            }
