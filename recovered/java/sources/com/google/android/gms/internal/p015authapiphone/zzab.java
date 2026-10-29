            package com.google.android.gms.internal.p015authapiphone;

            import android.app.Activity;
            import android.content.Context;
            import android.os.RemoteException;
            import com.google.android.gms.common.Feature;
            import com.google.android.gms.tasks.Task;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.c32;
            import p000.jf2;
            import p000.tm2;
            import p000.um2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 3 */     public final class zzab extends jf2 {
                public zzab(Activity activity) {
/* 1 */             super(activity);
                }

                public final Task<Void> startSmsRetriever() {
/* 1 */             tm2 tm2VarBuilder = um2.builder();
/* 10 */            tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.auth-api-phone.zzx
                        @Override // p000.c32
                        public final void accept(Object obj, Object obj2) throws RemoteException {
/* 18 */                    ((zzh) ((zzw) obj).getService()).zzg(new zzz(this.zza, (TaskCompletionSource) obj2));
                        }
                    };
/* 18 */            tm2VarBuilder.f17187c = new Feature[]{zzac.zzc};
/* 22 */            tm2VarBuilder.f17188d = 1567;
/* 28 */            return doWrite(tm2VarBuilder.m8812a());
                }

                public final Task<Void> startSmsUserConsent(final String str) {
/* 1 */             tm2 tm2VarBuilder = um2.builder();
/* 10 */            tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.auth-api-phone.zzy
                        @Override // p000.c32
                        public final void accept(Object obj, Object obj2) throws RemoteException {
/* 1 */                     zzab zzabVar = this.zza;
/* 20 */                    ((zzh) ((zzw) obj).getService()).zzh(str, new zzaa(zzabVar, (TaskCompletionSource) obj2));
                        }
                    };
/* 18 */            tm2VarBuilder.f17187c = new Feature[]{zzac.zzd};
/* 22 */            tm2VarBuilder.f17188d = 1568;
/* 28 */            return doWrite(tm2VarBuilder.m8812a());
                }

/* 4 */         public zzab(Context context) {
/* 5 */             super(context);
                }
            }
