            package com.google.android.gms.internal.games_v2;

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
            public final /* synthetic */ class zzcw implements zzaq {
                public final /* synthetic */ String zza;
                public final /* synthetic */ long zzb;
                public final /* synthetic */ String zzc;

                public /* synthetic */ zzcw(String str, long j, String str2) {
/* 4 */             this.zza = str;
/* 6 */             this.zzb = j;
/* 8 */             this.zzc = str2;
                }

                @Override // com.google.android.gms.internal.games_v2.zzaq
                public final Task zza(or0 or0Var) {
/* 1 */             final String str = this.zza;
/* 3 */             final long j = this.zzb;
/* 5 */             final String str2 = this.zzc;
/* 7 */             tm2 tm2VarBuilder = um2.builder();
/* 16 */            tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.games_v2.zzdf
                        @Override // p000.c32
                        public final void accept(Object obj, Object obj2) throws RemoteException {
/* 13 */                    ((nd3) obj).m6971c((TaskCompletionSource) obj2, str, j, str2);
                        }
                    };
/* 20 */            tm2VarBuilder.f17188d = 6707;
/* 26 */            return or0Var.doWrite(tm2VarBuilder.m8812a());
                }
            }
