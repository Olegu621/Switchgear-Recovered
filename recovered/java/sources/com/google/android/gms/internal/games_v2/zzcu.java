            package com.google.android.gms.internal.games_v2;

            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.android.gms.tasks.Task;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.bd3;
            import p000.c32;
            import p000.jb1;
            import p000.nd3;
            import p000.or0;
            import p000.tm2;
            import p000.um2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class zzcu implements zzaq {
                public final /* synthetic */ String zza;
                public final /* synthetic */ int zzb;
                public final /* synthetic */ int zzc;
                public final /* synthetic */ int zzd;
                public final /* synthetic */ boolean zze;

                public /* synthetic */ zzcu(String str, int i, int i2, int i3, boolean z) {
/* 4 */             this.zza = str;
/* 6 */             this.zzb = i;
/* 8 */             this.zzc = i2;
/* 10 */            this.zzd = i3;
/* 12 */            this.zze = z;
                }

                @Override // com.google.android.gms.internal.games_v2.zzaq
                public final Task zza(or0 or0Var) {
/* 1 */             final String str = this.zza;
/* 3 */             final int i = this.zzb;
/* 5 */             final int i2 = this.zzc;
/* 7 */             final int i3 = this.zzd;
/* 9 */             final boolean z = this.zze;
/* 11 */            tm2 tm2VarBuilder = um2.builder();
/* 20 */            tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.games_v2.zzdd
                        @Override // p000.c32
                        public final void accept(Object obj, Object obj2) throws RemoteException {
/* 1 */                     String str2 = str;
/* 3 */                     int i4 = i;
/* 5 */                     int i5 = i2;
/* 7 */                     int i6 = i3;
/* 9 */                     boolean z2 = z;
/* 11 */                    nd3 nd3Var = (nd3) obj;
/* 13 */                    TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
/* 15 */                    nd3Var.getClass();
                            try {
/* 22 */                        com.google.android.gms.games.internal.zzap zzapVar = (com.google.android.gms.games.internal.zzap) nd3Var.getService();
/* 27 */                        bd3 bd3Var = new bd3(nd3Var, taskCompletionSource, 0);
/* 30 */                        Parcel parcelZza = zzapVar.zza();
/* 34 */                        zzc.zzf(parcelZza, bd3Var);
/* 37 */                        parcelZza.writeString(str2);
/* 40 */                        parcelZza.writeInt(i4);
/* 43 */                        parcelZza.writeInt(i5);
/* 46 */                        parcelZza.writeInt(i6);
/* 49 */                        zzc.zzc(parcelZza, z2);
/* 54 */                        zzapVar.zzc(5019, parcelZza);
                            } catch (SecurityException unused) {
/* 58 */                        jb1.m5743I(taskCompletionSource);
                            }
                        }
                    };
/* 24 */            tm2VarBuilder.f17188d = 6704;
/* 30 */            return or0Var.doRead(tm2VarBuilder.m8812a());
                }
            }
