            package com.google.android.gms.internal.games_v2;

            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.android.gms.tasks.Task;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.C0828d1;
            import p000.c32;
            import p000.dd3;
            import p000.jb1;
            import p000.nd3;
            import p000.or0;
            import p000.tm2;
            import p000.um2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzcl {
                private final zzar zza;

                public zzcl(zzar zzarVar) {
/* 4 */             this.zza = zzarVar;
                }

                public final void increment(final String str, final int i) {
/* 8 */             this.zza.zzb(new zzaq() { // from class: com.google.android.gms.internal.games_v2.zzci
                        @Override // com.google.android.gms.internal.games_v2.zzaq
                        public final Task zza(or0 or0Var) {
/* 1 */                     final String str2 = str;
/* 3 */                     final int i2 = i;
/* 5 */                     tm2 tm2VarBuilder = um2.builder();
/* 14 */                    tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.games_v2.zzcf
                                @Override // p000.c32
                                public final void accept(Object obj, Object obj2) {
/* 11 */                            ((nd3) obj).f14194a.zzc(str2, i2);
                                }
                            };
/* 18 */                    tm2VarBuilder.f17188d = 6729;
/* 24 */                    return or0Var.doWrite(tm2VarBuilder.m8812a());
                        }
                    });
                }

                public final Task<C0828d1> load(final boolean z) {
/* 8 */             return this.zza.zzb(new zzaq() { // from class: com.google.android.gms.internal.games_v2.zzcj
                        @Override // com.google.android.gms.internal.games_v2.zzaq
                        public final Task zza(or0 or0Var) {
/* 1 */                     final boolean z2 = z;
/* 3 */                     tm2 tm2VarBuilder = um2.builder();
/* 12 */                    tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.games_v2.zzcg
                                @Override // p000.c32
                                public final void accept(Object obj, Object obj2) throws RemoteException {
/* 1 */                             boolean z3 = z2;
/* 3 */                             nd3 nd3Var = (nd3) obj;
/* 5 */                             TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
/* 9 */                             nd3Var.f14194a.zzb();
                                    try {
/* 16 */                                com.google.android.gms.games.internal.zzap zzapVar = (com.google.android.gms.games.internal.zzap) nd3Var.getService();
/* 22 */                                dd3 dd3Var = new dd3(taskCompletionSource, 11);
/* 25 */                                Parcel parcelZza = zzapVar.zza();
/* 29 */                                zzc.zzf(parcelZza, dd3Var);
/* 32 */                                zzc.zzc(parcelZza, z3);
/* 37 */                                zzapVar.zzc(12016, parcelZza);
                                    } catch (SecurityException unused) {
/* 41 */                                jb1.m5743I(taskCompletionSource);
                                    }
                                }
                            };
/* 16 */                    tm2VarBuilder.f17188d = 6727;
/* 22 */                    return or0Var.doRead(tm2VarBuilder.m8812a());
                        }
                    });
                }

                public final Task<C0828d1> loadByIds(final boolean z, final String... strArr) {
/* 8 */             return this.zza.zzb(new zzaq() { // from class: com.google.android.gms.internal.games_v2.zzck
                        @Override // com.google.android.gms.internal.games_v2.zzaq
                        public final Task zza(or0 or0Var) {
/* 1 */                     final boolean z2 = z;
/* 3 */                     final String[] strArr2 = strArr;
/* 5 */                     tm2 tm2VarBuilder = um2.builder();
/* 14 */                    tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.games_v2.zzch
                                @Override // p000.c32
                                public final void accept(Object obj, Object obj2) throws RemoteException {
/* 1 */                             boolean z3 = z2;
/* 3 */                             String[] strArr3 = strArr2;
/* 5 */                             nd3 nd3Var = (nd3) obj;
/* 7 */                             TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
/* 11 */                            nd3Var.f14194a.zzb();
                                    try {
/* 18 */                                com.google.android.gms.games.internal.zzap zzapVar = (com.google.android.gms.games.internal.zzap) nd3Var.getService();
/* 24 */                                dd3 dd3Var = new dd3(taskCompletionSource, 11);
/* 27 */                                Parcel parcelZza = zzapVar.zza();
/* 31 */                                zzc.zzf(parcelZza, dd3Var);
/* 34 */                                zzc.zzc(parcelZza, z3);
/* 37 */                                parcelZza.writeStringArray(strArr3);
/* 42 */                                zzapVar.zzc(12031, parcelZza);
                                    } catch (SecurityException unused) {
/* 46 */                                jb1.m5743I(taskCompletionSource);
                                    }
                                }
                            };
/* 18 */                    tm2VarBuilder.f17188d = 6728;
/* 24 */                    return or0Var.doRead(tm2VarBuilder.m8812a());
                        }
                    });
                }
            }
