            package com.google.android.play.core.integrity;

            import android.app.Activity;
            import android.os.Bundle;
            import android.os.RemoteException;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import com.google.android.play.integrity.internal.InterfaceC0467i;
            import p000.z93;
            
            /* JADX INFO: renamed from: com.google.android.play.core.integrity.bh */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class C0422bh extends AbstractC0427bm {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ Bundle f5215a;

                /* JADX INFO: renamed from: b */
                final /* synthetic */ Activity f5216b;

                /* JADX INFO: renamed from: c */
                final /* synthetic */ TaskCompletionSource f5217c;

                /* JADX INFO: renamed from: d */
                final /* synthetic */ int f5218d;

                /* JADX INFO: renamed from: e */
                final /* synthetic */ C0428bn f5219e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0422bh(C0428bn c0428bn, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i) {
/* 11 */            super(c0428bn, taskCompletionSource);
/* 1 */             this.f5215a = bundle;
/* 3 */             this.f5216b = activity;
/* 5 */             this.f5217c = taskCompletionSource2;
/* 7 */             this.f5218d = i;
/* 9 */             this.f5219e = c0428bn;
                }

                @Override // p000.ra3
                /* JADX INFO: renamed from: b */
                public final void mo2453b() {
/* 7 */             if (C0428bn.m2488l(this.f5219e)) {
/* 16 */                mo2452a(new StandardIntegrityException(-2, null));
/* 19 */                return;
                    }
                    try {
/* 20 */                C0428bn c0428bn = this.f5219e;
/* 22 */                z93 z93Var = c0428bn.f5229a;
/* 42 */                ((InterfaceC0467i) z93Var.f20017n).mo2509c(this.f5215a, c0428bn.f5233e.m2465a(this.f5216b, this.f5217c, z93Var));
                    } catch (RemoteException e) {
/* 65 */                this.f5219e.f5230b.m7755a(e, "requestAndShowDialog(%s)", Integer.valueOf(this.f5218d));
/* 77 */                this.f5217c.trySetException(new StandardIntegrityException(-100, e));
                    }
                }
            }
