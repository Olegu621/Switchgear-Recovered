            package com.google.android.play.core.integrity;

            import android.os.Parcelable;
            import android.os.RemoteException;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import com.google.android.play.integrity.internal.InterfaceC0472n;
            import p000.aa3;
            import p000.ra3;
            
            /* JADX INFO: renamed from: com.google.android.play.core.integrity.af */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class C0393af extends ra3 {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ byte[] f5152a;

                /* JADX INFO: renamed from: b */
                final /* synthetic */ Long f5153b;

                /* JADX INFO: renamed from: c */
                final /* synthetic */ Parcelable f5154c;

                /* JADX INFO: renamed from: d */
                final /* synthetic */ TaskCompletionSource f5155d;

                /* JADX INFO: renamed from: e */
                final /* synthetic */ IntegrityTokenRequest f5156e;

                /* JADX INFO: renamed from: f */
                final /* synthetic */ C0397aj f5157f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0393af(C0397aj c0397aj, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
/* 13 */            super(taskCompletionSource);
/* 1 */             this.f5152a = bArr;
/* 3 */             this.f5153b = l;
/* 5 */             this.f5154c = parcelable;
/* 7 */             this.f5155d = taskCompletionSource2;
/* 9 */             this.f5156e = integrityTokenRequest;
/* 11 */            this.f5157f = c0397aj;
                }

                @Override // p000.ra3
                /* JADX INFO: renamed from: a */
                public final void mo2452a(Exception exc) {
/* 3 */             if (exc instanceof aa3) {
/* 12 */                super.mo2452a(new IntegrityServiceException(-9, exc));
                    } else {
/* 16 */                super.mo2452a(exc);
                    }
                }

                @Override // p000.ra3
                /* JADX INFO: renamed from: b */
                public final void mo2453b() {
                    try {
/* 1 */                 C0397aj c0397aj = this.f5157f;
/* 28 */                ((InterfaceC0472n) c0397aj.f5167a.f20017n).mo2511h(C0397aj.m2456a(c0397aj, this.f5152a, this.f5153b, this.f5154c), new BinderC0396ai(this.f5157f, this.f5155d));
                    } catch (RemoteException e) {
/* 47 */                this.f5157f.f5168b.m7755a(e, "requestIntegrityToken(%s)", this.f5156e);
/* 59 */                this.f5155d.trySetException(new IntegrityServiceException(-100, e));
                    }
                }
            }
