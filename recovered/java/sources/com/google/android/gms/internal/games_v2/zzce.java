            package com.google.android.gms.internal.games_v2;

            import android.content.Intent;
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
            public final class zzce {
                private final zzar zza;

                public zzce(zzar zzarVar) {
/* 4 */             this.zza = zzarVar;
                }

                public final Task<Intent> getAchievementsIntent() {
/* 5 */             return this.zza.zzb(new zzaq() { // from class: com.google.android.gms.internal.games_v2.zzbv
                        @Override // com.google.android.gms.internal.games_v2.zzaq
                        public final Task zza(or0 or0Var) {
/* 1 */                     tm2 tm2VarBuilder = um2.builder();
/* 7 */                     tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.games_v2.zzcb
                                @Override // p000.c32
                                public final void accept(Object obj, Object obj2) throws RemoteException {
/* 3 */                             TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                                    try {
/* 9 */                                 com.google.android.gms.games.internal.zzap zzapVar = (com.google.android.gms.games.internal.zzap) ((nd3) obj).getService();
/* 17 */                                Parcel parcelZzb = zzapVar.zzb(9005, zzapVar.zza());
/* 27 */                                Intent intent = (Intent) zzc.zza(parcelZzb, Intent.CREATOR);
/* 29 */                                parcelZzb.recycle();
/* 32 */                                taskCompletionSource.setResult(intent);
                                    } catch (SecurityException unused) {
/* 36 */                                jb1.m5743I(taskCompletionSource);
                                    }
                                }
                            };
/* 11 */                    tm2VarBuilder.f17188d = 6692;
/* 17 */                    return or0Var.doRead(tm2VarBuilder.m8812a());
                        }
                    });
                }

                public final void increment(String str, int i) {
/* 8 */             this.zza.zzb(new zzbs(str, i));
                }

                public final Task<Boolean> incrementImmediate(String str, int i) {
/* 8 */             return this.zza.zzb(new zzbs(str, i));
                }

                public final Task<C0828d1> load(final boolean z) {
/* 8 */             return this.zza.zzb(new zzaq() { // from class: com.google.android.gms.internal.games_v2.zzbu
                        @Override // com.google.android.gms.internal.games_v2.zzaq
                        public final Task zza(or0 or0Var) {
/* 1 */                     final boolean z2 = z;
/* 3 */                     tm2 tm2VarBuilder = um2.builder();
/* 12 */                    tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.games_v2.zzca
                                @Override // p000.c32
                                public final void accept(Object obj, Object obj2) throws RemoteException {
/* 1 */                             boolean z3 = z2;
/* 3 */                             nd3 nd3Var = (nd3) obj;
/* 5 */                             TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
/* 7 */                             nd3Var.getClass();
                                    try {
/* 14 */                                com.google.android.gms.games.internal.zzap zzapVar = (com.google.android.gms.games.internal.zzap) nd3Var.getService();
/* 20 */                                dd3 dd3Var = new dd3(taskCompletionSource, 8);
/* 23 */                                Parcel parcelZza = zzapVar.zza();
/* 27 */                                zzc.zzf(parcelZza, dd3Var);
/* 30 */                                zzc.zzc(parcelZza, z3);
/* 35 */                                zzapVar.zzc(6001, parcelZza);
                                    } catch (SecurityException unused) {
/* 39 */                                jb1.m5743I(taskCompletionSource);
                                    }
                                }
                            };
/* 16 */                    tm2VarBuilder.f17188d = 6693;
/* 22 */                    return or0Var.doRead(tm2VarBuilder.m8812a());
                        }
                    });
                }

                public final void reveal(String str) {
/* 8 */             this.zza.zzb(new zzcc(str));
                }

                public final Task<Void> revealImmediate(String str) {
/* 8 */             return this.zza.zzb(new zzcc(str));
                }

                public final void setSteps(String str, int i) {
/* 8 */             this.zza.zzb(new zzbt(str, i));
                }

                public final Task<Boolean> setStepsImmediate(String str, int i) {
/* 8 */             return this.zza.zzb(new zzbt(str, i));
                }

                public final void unlock(String str) {
/* 8 */             this.zza.zzb(new zzcd(str));
                }

                public final Task<Void> unlockImmediate(String str) {
/* 8 */             return this.zza.zzb(new zzcd(str));
                }
            }
