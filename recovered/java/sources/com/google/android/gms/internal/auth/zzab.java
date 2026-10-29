            package com.google.android.gms.internal.auth;

            import android.accounts.Account;
            import android.content.Context;
            import android.os.Bundle;
            import android.os.RemoteException;
            import com.google.android.gms.auth.AccountChangeEventsRequest;
            import com.google.android.gms.common.Feature;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.tasks.Task;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import io.sentry.android.core.AbstractC1245n0;
            import p000.AbstractC2322w8;
            import p000.C0872e9;
            import p000.C0983h9;
            import p000.InterfaceC0172b9;
            import p000.c32;
            import p000.ha1;
            import p000.i13;
            import p000.kb1;
            import p000.nr0;
            import p000.or0;
            import p000.qj3;
            import p000.tm2;
            import p000.um2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzab extends or0 implements zzg {
                private static final C0872e9 zza;
                private static final AbstractC2322w8 zzb;
                private static final C0983h9 zzc;
                private static final ha1 zzd;
                private final Context zze;

                static {
/* 3 */             C0872e9 c0872e9 = new C0872e9();
/* 6 */             zza = c0872e9;
/* 10 */            zzv zzvVar = new zzv();
/* 13 */            zzb = zzvVar;
/* 22 */            zzc = new C0983h9("GoogleAuthService.API", zzvVar, c0872e9);
/* 37 */            zzd = new ha1("Auth", "GoogleAuthServiceClient");
                }

                public zzab(Context context) {
/* 10 */            super(context, null, zzc, InterfaceC0172b9.f2328g, nr0.f14414c);
/* 13 */            this.zze = context;
                }

                public static void zzf(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
/* 20 */            if (status.m2006D1() ? taskCompletionSource.trySetResult(obj) : taskCompletionSource.trySetException(i13.m4438q(status))) {
/* 38 */                return;
                    }
/* 22 */            ha1 ha1Var = zzd;
/* 35 */            AbstractC1245n0.m4889q(ha1Var.f8983a, ha1Var.m4137a("The task is already complete.", new Object[0]));
                }

                @Override // com.google.android.gms.internal.auth.zzg
                public final Task zza(final zzbw zzbwVar) {
/* 1 */             tm2 tm2VarBuilder = um2.builder();
/* 11 */            tm2VarBuilder.f17187c = new Feature[]{qj3.f15590k};
/* 18 */            tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.auth.zzt
                        @Override // p000.c32
                        public final void accept(Object obj, Object obj2) throws RemoteException {
/* 1 */                     zzab zzabVar = this.zza;
/* 20 */                    ((zzp) ((zzi) obj).getService()).zzd(new zzx(zzabVar, (TaskCompletionSource) obj2), zzbwVar);
                        }
                    };
/* 22 */            tm2VarBuilder.f17188d = 1513;
/* 28 */            return doWrite(tm2VarBuilder.m8812a());
                }

                @Override // com.google.android.gms.internal.auth.zzg
                public final Task zzb(final AccountChangeEventsRequest accountChangeEventsRequest) {
/* 3 */             kb1.m6062o(accountChangeEventsRequest, "request cannot be null.");
/* 6 */             tm2 tm2VarBuilder = um2.builder();
/* 16 */            tm2VarBuilder.f17187c = new Feature[]{qj3.f15589j};
/* 23 */            tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.auth.zzu
                        @Override // p000.c32
                        public final void accept(Object obj, Object obj2) throws RemoteException {
/* 1 */                     zzab zzabVar = this.zza;
/* 3 */                     AccountChangeEventsRequest accountChangeEventsRequest2 = accountChangeEventsRequest;
/* 20 */                    ((zzp) ((zzi) obj).getService()).zze(new zzz(zzabVar, (TaskCompletionSource) obj2), accountChangeEventsRequest2);
                        }
                    };
/* 27 */            tm2VarBuilder.f17188d = 1515;
/* 33 */            return doWrite(tm2VarBuilder.m8812a());
                }

                @Override // com.google.android.gms.internal.auth.zzg
                public final Task zzc(final Account account, final String str, final Bundle bundle) {
/* 3 */             kb1.m6062o(account, "Account name cannot be null!");
/* 8 */             kb1.m6059l(str, "Scope cannot be null!");
/* 11 */            tm2 tm2VarBuilder = um2.builder();
/* 21 */            tm2VarBuilder.f17187c = new Feature[]{qj3.f15590k};
/* 28 */            tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.auth.zzs
                        @Override // p000.c32
                        public final void accept(Object obj, Object obj2) throws RemoteException {
/* 1 */                     zzab zzabVar = this.zza;
/* 24 */                    ((zzp) ((zzi) obj).getService()).zzf(new zzw(zzabVar, (TaskCompletionSource) obj2), account, str, bundle);
                        }
                    };
/* 32 */            tm2VarBuilder.f17188d = 1512;
/* 38 */            return doWrite(tm2VarBuilder.m8812a());
                }

                @Override // com.google.android.gms.internal.auth.zzg
                public final Task zzd(final Account account) {
/* 3 */             kb1.m6062o(account, "account cannot be null.");
/* 6 */             tm2 tm2VarBuilder = um2.builder();
/* 16 */            tm2VarBuilder.f17187c = new Feature[]{qj3.f15589j};
/* 23 */            tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.auth.zzr
                        @Override // p000.c32
                        public final void accept(Object obj, Object obj2) throws RemoteException {
/* 1 */                     zzab zzabVar = this.zza;
/* 20 */                    ((zzp) ((zzi) obj).getService()).zzg(new zzaa(zzabVar, (TaskCompletionSource) obj2), account);
                        }
                    };
/* 27 */            tm2VarBuilder.f17188d = 1517;
/* 33 */            return doWrite(tm2VarBuilder.m8812a());
                }

                @Override // com.google.android.gms.internal.auth.zzg
                public final Task zze(final String str) {
/* 3 */             kb1.m6062o(str, "Client package name cannot be null!");
/* 6 */             tm2 tm2VarBuilder = um2.builder();
/* 16 */            tm2VarBuilder.f17187c = new Feature[]{qj3.f15589j};
/* 23 */            tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.auth.zzq
                        @Override // p000.c32
                        public final void accept(Object obj, Object obj2) throws RemoteException {
/* 1 */                     zzab zzabVar = this.zza;
/* 20 */                    ((zzp) ((zzi) obj).getService()).zzh(new zzy(zzabVar, (TaskCompletionSource) obj2), str);
                        }
                    };
/* 27 */            tm2VarBuilder.f17188d = 1514;
/* 33 */            return doWrite(tm2VarBuilder.m8812a());
                }
            }
