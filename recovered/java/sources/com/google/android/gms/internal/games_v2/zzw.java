            package com.google.android.gms.internal.games_v2;

            import android.content.Context;
            import android.os.RemoteException;
            import com.google.android.gms.tasks.Task;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.AbstractC2322w8;
            import p000.C0872e9;
            import p000.C0983h9;
            import p000.c32;
            import p000.mb3;
            import p000.nr0;
            import p000.or0;
            import p000.tm2;
            import p000.um2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzw extends or0 implements zzs {
                private static final C0872e9 zza;
                private static final AbstractC2322w8 zzb;
                private static final C0983h9 zzc;

                static {
/* 3 */             C0872e9 c0872e9 = new C0872e9();
/* 6 */             zza = c0872e9;
/* 10 */            zzu zzuVar = new zzu();
/* 13 */            zzb = zzuVar;
/* 22 */            zzc = new C0983h9("GamesConnect.API", zzuVar, c0872e9);
                }

                public zzw(Context context, zzq zzqVar) {
/* 9 */             super(context, null, zzc, zzqVar, nr0.f14414c);
                }

                @Override // com.google.android.gms.internal.games_v2.zzs
                public final Task zza(final zzy zzyVar, boolean z) {
/* 1 */             tm2 tm2VarBuilder = um2.builder();
/* 10 */            tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.games_v2.zzt
                        @Override // p000.c32
                        public final void accept(Object obj, Object obj2) throws RemoteException {
/* 1 */                     zzw zzwVar = this.zza;
/* 20 */                    ((zzae) ((zzx) obj).getService()).zzd(new zzv(zzwVar, (TaskCompletionSource) obj2), zzyVar);
                        }
                    };
/* 14 */            tm2VarBuilder.f17188d = 6737;
/* 16 */            tm2VarBuilder.f17186b = z;
/* 18 */            mb3 mb3VarM8812a = tm2VarBuilder.m8812a();
                    return z ? doWrite(mb3VarM8812a) : doBestEffortWrite(mb3VarM8812a);
                }
            }
