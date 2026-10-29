            package com.google.android.gms.internal.games_v2;

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
            public final /* synthetic */ class zzdr implements zzaq {
                public final /* synthetic */ String zza;
                public final /* synthetic */ boolean zzb;

                public /* synthetic */ zzdr(String str, boolean z) {
/* 4 */             this.zza = str;
/* 6 */             this.zzb = z;
                }

                @Override // com.google.android.gms.internal.games_v2.zzaq
                public final Task zza(or0 or0Var) {
/* 1 */             final String str = this.zza;
/* 3 */             final boolean z = this.zzb;
/* 5 */             tm2 tm2VarBuilder = um2.builder();
/* 14 */            tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.games_v2.zzdz
                        @Override // p000.c32
                        public final void accept(Object obj, Object obj2) throws RemoteException {
/* 1 */                     String str2 = str;
/* 3 */                     boolean z2 = z;
/* 5 */                     nd3 nd3Var = (nd3) obj;
/* 7 */                     TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
/* 9 */                     nd3Var.getClass();
                            try {
/* 16 */                        com.google.android.gms.games.internal.zzap zzapVar = (com.google.android.gms.games.internal.zzap) nd3Var.getService();
/* 21 */                        dd3 dd3Var = new dd3(taskCompletionSource, 3);
/* 24 */                        Parcel parcelZza = zzapVar.zza();
/* 28 */                        zzc.zzf(parcelZza, dd3Var);
/* 31 */                        parcelZza.writeString(str2);
/* 34 */                        zzc.zzc(parcelZza, z2);
/* 39 */                        zzapVar.zzc(13006, parcelZza);
                            } catch (SecurityException unused) {
/* 43 */                        jb1.m5743I(taskCompletionSource);
                            }
                        }
                    };
/* 18 */            tm2VarBuilder.f17188d = 6711;
/* 24 */            return or0Var.doRead(tm2VarBuilder.m8812a());
                }
            }
