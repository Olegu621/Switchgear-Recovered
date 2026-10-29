            package com.google.android.gms.internal.games_v2;

            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.android.gms.tasks.Task;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.C0914fe;
            import p000.c32;
            import p000.dd3;
            import p000.nd3;
            import p000.or0;
            import p000.tm2;
            import p000.um2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzco {
                private final zzav zza;
                private final zzar zzb;

                public zzco(zzav zzavVar, zzar zzarVar) {
/* 4 */             this.zza = zzavVar;
/* 6 */             this.zzb = zzarVar;
                }

                public final Task<C0914fe> isAuthenticated() {
/* 3 */             return this.zza.zzc();
                }

                public final Task<String> requestServerSideAccess(final String str, final boolean z) {
/* 8 */             return this.zzb.zzb(new zzaq() { // from class: com.google.android.gms.internal.games_v2.zzcn
                        @Override // com.google.android.gms.internal.games_v2.zzaq
                        public final Task zza(or0 or0Var) {
/* 1 */                     final String str2 = str;
/* 3 */                     final boolean z2 = z;
/* 5 */                     tm2 tm2VarBuilder = um2.builder();
/* 14 */                    tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.games_v2.zzcm
                                @Override // p000.c32
                                public final void accept(Object obj, Object obj2) throws RemoteException {
/* 1 */                             String str3 = str2;
/* 3 */                             boolean z3 = z2;
/* 13 */                            com.google.android.gms.games.internal.zzap zzapVar = (com.google.android.gms.games.internal.zzap) ((nd3) obj).getService();
/* 19 */                            dd3 dd3Var = new dd3((TaskCompletionSource) obj2, 12);
/* 22 */                            Parcel parcelZza = zzapVar.zza();
/* 26 */                            zzc.zzf(parcelZza, dd3Var);
/* 29 */                            parcelZza.writeString(str3);
/* 32 */                            zzc.zzc(parcelZza, z3);
/* 37 */                            zzapVar.zzc(27003, parcelZza);
                                }
                            };
/* 18 */                    tm2VarBuilder.f17188d = 6699;
/* 24 */                    return or0Var.doWrite(tm2VarBuilder.m8812a());
                        }
                    });
                }

                public final Task<C0914fe> signIn() {
/* 3 */             return this.zza.zzb();
                }
            }
