            package com.google.android.gms.internal.auth;

            import android.app.Activity;
            import android.content.Context;
            import android.os.RemoteException;
            import com.google.android.gms.auth.api.proxy.ProxyRequest;
            import com.google.android.gms.auth.api.proxy.ProxyResponse;
            import com.google.android.gms.tasks.Task;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.AbstractC0841de;
            import p000.C0877ee;
            import p000.c32;
            import p000.nr0;
            import p000.or0;
            import p000.tm2;
            import p000.um2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 15 */    public final class zzbo extends or0 {
                public zzbo(Activity activity, C0877ee c0877ee) {
/* 13 */            super(activity, activity, AbstractC0841de.f7136a, c0877ee == null ? C0877ee.f7653b : c0877ee, nr0.f14414c);
                }

                public final Task<String> getSpatulaHeader() {
/* 1 */             tm2 tm2VarBuilder = um2.builder();
/* 10 */            tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.auth.zzbk
                        @Override // p000.c32
                        public final void accept(Object obj, Object obj2) throws RemoteException {
/* 18 */                    ((zzbh) ((zzbe) obj).getService()).zzd(new zzbn(this.zza, (TaskCompletionSource) obj2));
                        }
                    };
/* 14 */            tm2VarBuilder.f17188d = 1520;
/* 20 */            return doRead(tm2VarBuilder.m8812a());
                }

                public final Task<ProxyResponse> performProxyRequest(final ProxyRequest proxyRequest) {
/* 1 */             tm2 tm2VarBuilder = um2.builder();
/* 10 */            tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.auth.zzbl
                        @Override // p000.c32
                        public final void accept(Object obj, Object obj2) throws RemoteException {
/* 1 */                     zzbo zzboVar = this.zza;
/* 3 */                     ProxyRequest proxyRequest2 = proxyRequest;
/* 20 */                    ((zzbh) ((zzbe) obj).getService()).zze(new zzbm(zzboVar, (TaskCompletionSource) obj2), proxyRequest2);
                        }
                    };
/* 14 */            tm2VarBuilder.f17188d = 1518;
/* 20 */            return doWrite(tm2VarBuilder.m8812a());
                }

/* 16 */        public zzbo(Context context, C0877ee c0877ee) {
/* 19 */            super(context, null, AbstractC0841de.f7136a, c0877ee == null ? C0877ee.f7653b : c0877ee, nr0.f14414c);
                }
            }
