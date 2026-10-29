            package com.google.android.play.core.integrity;

            import android.app.Activity;
            import android.os.Bundle;
            import android.os.RemoteException;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import com.google.android.play.integrity.internal.InterfaceC0472n;
            import p000.ra3;
            
            /* JADX INFO: renamed from: com.google.android.play.core.integrity.ag */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class C0394ag extends ra3 {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ Bundle f5158a;

                /* JADX INFO: renamed from: b */
                final /* synthetic */ Activity f5159b;

                /* JADX INFO: renamed from: c */
                final /* synthetic */ TaskCompletionSource f5160c;

                /* JADX INFO: renamed from: d */
                final /* synthetic */ int f5161d;

                /* JADX INFO: renamed from: e */
                final /* synthetic */ C0397aj f5162e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0394ag(C0397aj c0397aj, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i) {
/* 11 */            super(taskCompletionSource);
/* 1 */             this.f5158a = bundle;
/* 3 */             this.f5159b = activity;
/* 5 */             this.f5160c = taskCompletionSource2;
/* 7 */             this.f5161d = i;
/* 9 */             this.f5162e = c0397aj;
                }

                @Override // p000.ra3
                /* JADX INFO: renamed from: b */
                public final void mo2453b() {
                    try {
/* 1 */                 C0397aj c0397aj = this.f5162e;
/* 25 */                ((InterfaceC0472n) c0397aj.f5167a.f20017n).mo2510c(this.f5158a, c0397aj.f5171e.m2465a(this.f5159b, this.f5160c, c0397aj.f5167a));
                    } catch (RemoteException e) {
/* 48 */                this.f5162e.f5168b.m7755a(e, "requestAndShowDialog(%s)", Integer.valueOf(this.f5161d));
/* 60 */                this.f5160c.trySetException(new IntegrityServiceException(-100, e));
                    }
                }
            }
