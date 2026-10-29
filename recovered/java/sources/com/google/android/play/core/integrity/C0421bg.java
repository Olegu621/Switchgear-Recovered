            package com.google.android.play.core.integrity;

            import android.os.RemoteException;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import com.google.android.play.integrity.internal.InterfaceC0467i;
            
            /* JADX INFO: renamed from: com.google.android.play.core.integrity.bg */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class C0421bg extends AbstractC0427bm {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ StandardIntegrityManager.StandardIntegrityTokenRequest f5210a;

                /* JADX INFO: renamed from: b */
                final /* synthetic */ long f5211b;

                /* JADX INFO: renamed from: c */
                final /* synthetic */ long f5212c;

                /* JADX INFO: renamed from: d */
                final /* synthetic */ TaskCompletionSource f5213d;

                /* JADX INFO: renamed from: e */
                final /* synthetic */ C0428bn f5214e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0421bg(C0428bn c0428bn, TaskCompletionSource taskCompletionSource, int i, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest, long j, long j2, TaskCompletionSource taskCompletionSource2) {
/* 11 */            super(c0428bn, taskCompletionSource);
/* 1 */             this.f5210a = standardIntegrityTokenRequest;
/* 3 */             this.f5211b = j;
/* 5 */             this.f5212c = j2;
/* 7 */             this.f5213d = taskCompletionSource2;
/* 9 */             this.f5214e = c0428bn;
                }

                @Override // p000.ra3
                /* JADX INFO: renamed from: b */
                public final void mo2453b() {
/* 8 */             if (C0428bn.m2488l(this.f5214e)) {
/* 16 */                mo2452a(new StandardIntegrityException(-2, null));
/* 19 */                return;
                    }
/* 27 */            if (C0428bn.m2487k(this.f5214e, 0)) {
/* 36 */                mo2452a(new StandardIntegrityException(-14, null));
/* 39 */                return;
                    }
                    try {
/* 40 */                C0428bn c0428bn = this.f5214e;
/* 70 */                ((InterfaceC0467i) c0428bn.f5229a.f20017n).mo2508T(C0428bn.m2480a(c0428bn, this.f5210a, this.f5211b, this.f5212c, 0), new BinderC0425bk(this.f5214e, this.f5213d, this.f5211b));
                    } catch (RemoteException e) {
/* 105 */               this.f5214e.f5230b.m7755a(e, "requestExpressIntegrityToken(%s, %s, %s)", this.f5210a.requestHash(), this.f5210a.verdictOptOut(), Long.valueOf(this.f5211b));
/* 117 */               this.f5213d.trySetException(new StandardIntegrityException(-100, e));
                    }
                }
            }
