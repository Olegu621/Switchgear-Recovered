            package com.google.android.play.core.integrity;

            import android.os.Bundle;
            import android.os.RemoteException;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import com.google.android.play.integrity.internal.AbstractBinderC0468j;
            
            /* JADX INFO: renamed from: com.google.android.play.core.integrity.bi */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            class BinderC0423bi extends AbstractBinderC0468j {

                /* JADX INFO: renamed from: a */
                final TaskCompletionSource f5220a;

                /* JADX INFO: renamed from: b */
                final /* synthetic */ C0428bn f5221b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public BinderC0423bi(C0428bn c0428bn, TaskCompletionSource taskCompletionSource) {
/* 5 */             super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
/* 1 */             this.f5221b = c0428bn;
/* 8 */             this.f5220a = taskCompletionSource;
                }

                @Override // com.google.android.play.integrity.internal.InterfaceC0469k
                /* JADX INFO: renamed from: b */
                public final void mo2475b(Bundle bundle) throws RemoteException {
/* 7 */             this.f5221b.f5229a.m10291d(this.f5220a);
                }

                @Override // com.google.android.play.integrity.internal.InterfaceC0469k
                /* JADX INFO: renamed from: c */
                public void mo2476c(Bundle bundle) throws RemoteException {
/* 7 */             this.f5221b.f5229a.m10291d(this.f5220a);
                }

                @Override // com.google.android.play.integrity.internal.InterfaceC0469k
                /* JADX INFO: renamed from: d */
                public final void mo2477d(Bundle bundle) throws RemoteException {
/* 7 */             this.f5221b.f5229a.m10291d(this.f5220a);
                }

                @Override // com.google.android.play.integrity.internal.InterfaceC0469k
                /* JADX INFO: renamed from: e */
                public void mo2478e(Bundle bundle) throws RemoteException {
/* 7 */             this.f5221b.f5229a.m10291d(this.f5220a);
                }
            }
