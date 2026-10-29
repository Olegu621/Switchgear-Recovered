            package com.google.android.gms.internal.games_v2;

            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.android.gms.tasks.Task;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.c32;
            import p000.dd3;
            import p000.jb1;
            import p000.nd3;
            import p000.or0;
            import p000.tm2;
            import p000.um2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class zzcc implements zzaq {
                public final /* synthetic */ String zza;

                @Override // com.google.android.gms.internal.games_v2.zzaq
                public final Task zza(or0 or0Var) {
/* 1 */             final String str = this.zza;
/* 3 */             tm2 tm2VarBuilder = um2.builder();
/* 12 */            tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.games_v2.zzbw
                        @Override // p000.c32
                        public final void accept(Object obj, Object obj2) throws RemoteException {
/* 1 */                     String str2 = str;
/* 3 */                     nd3 nd3Var = (nd3) obj;
/* 5 */                     TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
/* 7 */                     nd3Var.getClass();
/* 17 */                    dd3 dd3Var = taskCompletionSource == null ? null : new dd3(taskCompletionSource, 7);
                            try {
/* 24 */                        com.google.android.gms.games.internal.zzap zzapVar = (com.google.android.gms.games.internal.zzap) nd3Var.getService();
/* 28 */                        zzam zzamVar = nd3Var.f14197d.f16543b;
/* 30 */                        IBinder iBinder = zzamVar.zza;
/* 32 */                        Bundle bundleZza = zzamVar.zza();
/* 36 */                        Parcel parcelZza = zzapVar.zza();
/* 40 */                        zzc.zzf(parcelZza, dd3Var);
/* 43 */                        parcelZza.writeString(str2);
/* 46 */                        parcelZza.writeStrongBinder(iBinder);
/* 49 */                        zzc.zzd(parcelZza, bundleZza);
/* 54 */                        zzapVar.zzc(5023, parcelZza);
                            } catch (SecurityException unused) {
/* 58 */                        jb1.m5743I(taskCompletionSource);
                            }
                        }
                    };
/* 16 */            tm2VarBuilder.f17188d = 6694;
/* 22 */            return or0Var.doWrite(tm2VarBuilder.m8812a());
                }
            }
