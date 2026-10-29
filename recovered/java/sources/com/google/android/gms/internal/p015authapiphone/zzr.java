            package com.google.android.gms.internal.p015authapiphone;

            import android.app.Activity;
            import android.content.Context;
            import android.os.RemoteException;
            import com.google.android.gms.common.Feature;
            import com.google.android.gms.tasks.Task;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.AbstractC2322w8;
            import p000.C0872e9;
            import p000.C0983h9;
            import p000.InterfaceC0172b9;
            import p000.c32;
            import p000.kb1;
            import p000.nr0;
            import p000.or0;
            import p000.tm2;
            import p000.um2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 12 */    public final class zzr extends or0 {
                private static final C0872e9 zza;
                private static final AbstractC2322w8 zzb;
                private static final C0983h9 zzc;

                static {
/* 3 */             C0872e9 c0872e9 = new C0872e9();
/* 6 */             zza = c0872e9;
/* 10 */            zzn zznVar = new zzn();
/* 13 */            zzb = zznVar;
/* 22 */            zzc = new C0983h9("SmsCodeAutofill.API", zznVar, c0872e9);
                }

                public zzr(Activity activity) {
/* 10 */            super(activity, activity, zzc, InterfaceC0172b9.f2328g, nr0.f14414c);
                }

                public final Task<Integer> checkPermissionState() {
/* 1 */             tm2 tm2VarBuilder = um2.builder();
/* 11 */            tm2VarBuilder.f17187c = new Feature[]{zzac.zza};
/* 18 */            tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.auth-api-phone.zzk
                        @Override // p000.c32
                        public final void accept(Object obj, Object obj2) throws RemoteException {
/* 18 */                    ((zzh) ((zzw) obj).getService()).zzc(new zzp(this.zza, (TaskCompletionSource) obj2));
                        }
                    };
/* 22 */            tm2VarBuilder.f17188d = 1564;
/* 28 */            return doRead(tm2VarBuilder.m8812a());
                }

                public final Task<Boolean> hasOngoingSmsRequest(final String str) {
/* 1 */             kb1.m6061n(str);
/* 12 */            kb1.m6053f("The package name cannot be empty.", !str.isEmpty());
/* 15 */            tm2 tm2VarBuilder = um2.builder();
/* 25 */            tm2VarBuilder.f17187c = new Feature[]{zzac.zza};
/* 32 */            tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.auth-api-phone.zzm
                        @Override // p000.c32
                        public final void accept(Object obj, Object obj2) throws RemoteException {
/* 1 */                     zzr zzrVar = this.zza;
/* 20 */                    ((zzh) ((zzw) obj).getService()).zzd(str, new zzq(zzrVar, (TaskCompletionSource) obj2));
                        }
                    };
/* 36 */            tm2VarBuilder.f17188d = 1565;
/* 42 */            return doRead(tm2VarBuilder.m8812a());
                }

                public final Task<Void> startSmsCodeRetriever() {
/* 1 */             tm2 tm2VarBuilder = um2.builder();
/* 11 */            tm2VarBuilder.f17187c = new Feature[]{zzac.zza};
/* 18 */            tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.auth-api-phone.zzl
                        @Override // p000.c32
                        public final void accept(Object obj, Object obj2) throws RemoteException {
/* 18 */                    ((zzh) ((zzw) obj).getService()).zze(new zzo(this.zza, (TaskCompletionSource) obj2));
                        }
                    };
/* 22 */            tm2VarBuilder.f17188d = 1563;
/* 28 */            return doWrite(tm2VarBuilder.m8812a());
                }

/* 13 */        public zzr(Context context) {
/* 15 */            super(context, null, zzc, InterfaceC0172b9.f2328g, nr0.f14414c);
                }
            }
