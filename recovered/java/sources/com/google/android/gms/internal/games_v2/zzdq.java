            package com.google.android.gms.internal.games_v2;

            import android.content.Intent;
            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.android.gms.tasks.Task;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.c32;
            import p000.nd3;
            import p000.or0;
            import p000.tm2;
            import p000.um2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class zzdq implements zzaq {
                public final /* synthetic */ String zza;
                public final /* synthetic */ String zzb;
                public final /* synthetic */ String zzc;

                public /* synthetic */ zzdq(String str, String str2, String str3) {
/* 4 */             this.zza = str;
/* 6 */             this.zzb = str2;
/* 8 */             this.zzc = str3;
                }

                @Override // com.google.android.gms.internal.games_v2.zzaq
                public final Task zza(or0 or0Var) {
/* 1 */             final String str = this.zza;
/* 3 */             final String str2 = this.zzb;
/* 5 */             final String str3 = this.zzc;
/* 7 */             tm2 tm2VarBuilder = um2.builder();
/* 16 */            tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.games_v2.zzdy
                        @Override // p000.c32
                        public final void accept(Object obj, Object obj2) throws RemoteException {
/* 1 */                     String str4 = str;
/* 3 */                     String str5 = str2;
/* 5 */                     String str6 = str3;
/* 15 */                    com.google.android.gms.games.internal.zzap zzapVar = (com.google.android.gms.games.internal.zzap) ((nd3) obj).getService();
/* 17 */                    Parcel parcelZza = zzapVar.zza();
/* 21 */                    parcelZza.writeString(str4);
/* 24 */                    parcelZza.writeString(str5);
/* 27 */                    parcelZza.writeString(str6);
/* 32 */                    Parcel parcelZzb = zzapVar.zzb(25016, parcelZza);
/* 42 */                    Intent intent = (Intent) zzc.zza(parcelZzb, Intent.CREATOR);
/* 44 */                    parcelZzb.recycle();
/* 47 */                    ((TaskCompletionSource) obj2).setResult(intent);
                        }
                    };
/* 20 */            tm2VarBuilder.f17188d = 6712;
/* 26 */            return or0Var.doRead(tm2VarBuilder.m8812a());
                }
            }
