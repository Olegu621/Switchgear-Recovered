            package com.google.android.play.core.integrity;

            import android.os.RemoteException;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import com.google.android.play.integrity.internal.InterfaceC0467i;
            
            /* JADX INFO: renamed from: com.google.android.play.core.integrity.bf */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class C0420bf extends AbstractC0427bm {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ long f5207a;

                /* JADX INFO: renamed from: b */
                final /* synthetic */ TaskCompletionSource f5208b;

                /* JADX INFO: renamed from: c */
                final /* synthetic */ C0428bn f5209c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0420bf(C0428bn c0428bn, TaskCompletionSource taskCompletionSource, int i, long j, TaskCompletionSource taskCompletionSource2) {
/* 7 */             super(c0428bn, taskCompletionSource);
/* 1 */             this.f5207a = j;
/* 3 */             this.f5208b = taskCompletionSource2;
/* 5 */             this.f5209c = c0428bn;
                }

                @Override // p000.ra3
                /* JADX INFO: renamed from: b */
                public final void mo2453b() {
/* 8 */             if (C0428bn.m2488l(this.f5209c)) {
/* 16 */                mo2452a(new StandardIntegrityException(-2, null));
/* 19 */                return;
                    }
/* 27 */            if (C0428bn.m2487k(this.f5209c, 0)) {
/* 36 */                mo2452a(new StandardIntegrityException(-14, null));
/* 39 */                return;
                    }
                    try {
/* 40 */                C0428bn c0428bn = this.f5209c;
/* 63 */                ((InterfaceC0467i) c0428bn.f5229a.f20017n).mo2507J(C0428bn.m2481b(c0428bn, this.f5207a, 0), new BinderC0426bl(this.f5209c, this.f5208b));
                    } catch (RemoteException e) {
/* 86 */                this.f5209c.f5230b.m7755a(e, "warmUpIntegrityToken(%s)", Long.valueOf(this.f5207a));
/* 98 */                this.f5208b.trySetException(new StandardIntegrityException(-100, e));
                    }
                }
            }
