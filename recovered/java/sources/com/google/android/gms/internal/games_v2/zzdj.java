            package com.google.android.gms.internal.games_v2;

            import android.content.Intent;
            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.android.gms.tasks.Task;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.C0828d1;
            import p000.b61;
            import p000.bd3;
            import p000.bx0;
            import p000.c32;
            import p000.dd3;
            import p000.jb1;
            import p000.nd3;
            import p000.or0;
            import p000.tm2;
            import p000.um2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 10 */    public final class zzdj {
                private final zzar zza;

                public zzdj(zzar zzarVar) {
/* 4 */             this.zza = zzarVar;
                }

                public final Task<Intent> getAllLeaderboardsIntent() {
/* 5 */             return this.zza.zzb(new zzaq() { // from class: com.google.android.gms.internal.games_v2.zzcz
                        @Override // com.google.android.gms.internal.games_v2.zzaq
                        public final Task zza(or0 or0Var) {
/* 1 */                     tm2 tm2VarBuilder = um2.builder();
/* 7 */                     tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.games_v2.zzdi
                                @Override // p000.c32
                                public final void accept(Object obj, Object obj2) throws RemoteException {
/* 9 */                             com.google.android.gms.games.internal.zzap zzapVar = (com.google.android.gms.games.internal.zzap) ((nd3) obj).getService();
/* 17 */                            Parcel parcelZzb = zzapVar.zzb(9003, zzapVar.zza());
/* 27 */                            Intent intent = (Intent) zzc.zza(parcelZzb, Intent.CREATOR);
/* 29 */                            parcelZzb.recycle();
/* 32 */                            ((TaskCompletionSource) obj2).setResult(intent);
                                }
                            };
/* 11 */                    tm2VarBuilder.f17188d = 6700;
/* 17 */                    return or0Var.doRead(tm2VarBuilder.m8812a());
                        }
                    });
                }

                public final Task<Intent> getLeaderboardIntent(final String str, final int i, final int i2) {
/* 8 */             return this.zza.zzb(new zzaq() { // from class: com.google.android.gms.internal.games_v2.zzcr
                        @Override // com.google.android.gms.internal.games_v2.zzaq
                        public final Task zza(or0 or0Var) {
/* 1 */                     final String str2 = str;
/* 3 */                     final int i3 = i;
/* 5 */                     final int i4 = i2;
/* 7 */                     tm2 tm2VarBuilder = um2.builder();
/* 16 */                    tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.games_v2.zzda
                                @Override // p000.c32
                                public final void accept(Object obj, Object obj2) throws RemoteException {
/* 1 */                             String str3 = str2;
/* 3 */                             int i5 = i3;
/* 5 */                             int i6 = i4;
/* 15 */                            com.google.android.gms.games.internal.zzap zzapVar = (com.google.android.gms.games.internal.zzap) ((nd3) obj).getService();
/* 17 */                            Parcel parcelZza = zzapVar.zza();
/* 21 */                            parcelZza.writeString(str3);
/* 24 */                            parcelZza.writeInt(i5);
/* 27 */                            parcelZza.writeInt(i6);
/* 32 */                            Parcel parcelZzb = zzapVar.zzb(18001, parcelZza);
/* 42 */                            Intent intent = (Intent) zzc.zza(parcelZzb, Intent.CREATOR);
/* 44 */                            parcelZzb.recycle();
/* 47 */                            ((TaskCompletionSource) obj2).setResult(intent);
                                }
                            };
/* 20 */                    tm2VarBuilder.f17188d = 6701;
/* 26 */                    return or0Var.doRead(tm2VarBuilder.m8812a());
                        }
                    });
                }

                public final Task<C0828d1> loadCurrentPlayerLeaderboardScore(final String str, final int i, final int i2) {
/* 8 */             return this.zza.zzb(new zzaq() { // from class: com.google.android.gms.internal.games_v2.zzcs
                        @Override // com.google.android.gms.internal.games_v2.zzaq
                        public final Task zza(or0 or0Var) {
/* 1 */                     final String str2 = str;
/* 3 */                     final int i3 = i;
/* 5 */                     final int i4 = i2;
/* 7 */                     tm2 tm2VarBuilder = um2.builder();
/* 16 */                    tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.games_v2.zzdb
                                @Override // p000.c32
                                public final void accept(Object obj, Object obj2) throws RemoteException {
/* 1 */                             String str3 = str2;
/* 3 */                             int i5 = i3;
/* 5 */                             int i6 = i4;
/* 7 */                             nd3 nd3Var = (nd3) obj;
/* 9 */                             TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
/* 11 */                            nd3Var.getClass();
                                    try {
/* 18 */                                com.google.android.gms.games.internal.zzap zzapVar = (com.google.android.gms.games.internal.zzap) nd3Var.getService();
/* 23 */                                bd3 bd3Var = new bd3(nd3Var, taskCompletionSource, 2);
/* 26 */                                Parcel parcelZza = zzapVar.zza();
/* 30 */                                zzc.zzf(parcelZza, bd3Var);
/* 34 */                                parcelZza.writeString(null);
/* 37 */                                parcelZza.writeString(str3);
/* 40 */                                parcelZza.writeInt(i5);
/* 43 */                                parcelZza.writeInt(i6);
/* 48 */                                zzapVar.zzc(8001, parcelZza);
                                    } catch (SecurityException unused) {
/* 52 */                                jb1.m5743I(taskCompletionSource);
                                    }
                                }
                            };
/* 20 */                    tm2VarBuilder.f17188d = 6703;
/* 26 */                    return or0Var.doRead(tm2VarBuilder.m8812a());
                        }
                    });
                }

                public final Task<C0828d1> loadLeaderboardMetadata(final String str, final boolean z) {
/* 8 */             return this.zza.zzb(new zzaq() { // from class: com.google.android.gms.internal.games_v2.zzcx
                        @Override // com.google.android.gms.internal.games_v2.zzaq
                        public final Task zza(or0 or0Var) {
/* 1 */                     final String str2 = str;
/* 3 */                     final boolean z2 = z;
/* 5 */                     tm2 tm2VarBuilder = um2.builder();
/* 14 */                    tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.games_v2.zzdg
                                @Override // p000.c32
                                public final void accept(Object obj, Object obj2) throws RemoteException {
/* 1 */                             String str3 = str2;
/* 3 */                             boolean z3 = z2;
/* 5 */                             nd3 nd3Var = (nd3) obj;
/* 7 */                             TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
/* 9 */                             nd3Var.getClass();
                                    try {
/* 16 */                                com.google.android.gms.games.internal.zzap zzapVar = (com.google.android.gms.games.internal.zzap) nd3Var.getService();
/* 22 */                                dd3 dd3Var = new dd3(taskCompletionSource, 13);
/* 25 */                                Parcel parcelZza = zzapVar.zza();
/* 29 */                                zzc.zzf(parcelZza, dd3Var);
/* 32 */                                parcelZza.writeString(str3);
/* 35 */                                zzc.zzc(parcelZza, z3);
/* 40 */                                zzapVar.zzc(6504, parcelZza);
                                    } catch (SecurityException unused) {
/* 44 */                                jb1.m5743I(taskCompletionSource);
                                    }
                                }
                            };
/* 18 */                    tm2VarBuilder.f17188d = 6702;
/* 24 */                    return or0Var.doRead(tm2VarBuilder.m8812a());
                        }
                    });
                }

                public final Task<C0828d1> loadMoreScores(final b61 b61Var, final int i, final int i2) {
/* 8 */             return this.zza.zzb(new zzaq() { // from class: com.google.android.gms.internal.games_v2.zzcq
                        @Override // com.google.android.gms.internal.games_v2.zzaq
                        public final Task zza(or0 or0Var) {
/* 1 */                     final b61 b61Var2 = b61Var;
/* 3 */                     final int i3 = i;
/* 5 */                     final int i4 = i2;
/* 7 */                     tm2 tm2VarBuilder = um2.builder();
/* 16 */                    tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.games_v2.zzcp
                                @Override // p000.c32
                                public final void accept(Object obj, Object obj2) throws RemoteException {
/* 1 */                             b61 b61Var3 = b61Var2;
/* 3 */                             int i5 = i3;
/* 5 */                             int i6 = i4;
/* 7 */                             nd3 nd3Var = (nd3) obj;
/* 9 */                             TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
/* 11 */                            nd3Var.getClass();
                                    try {
/* 18 */                                com.google.android.gms.games.internal.zzap zzapVar = (com.google.android.gms.games.internal.zzap) nd3Var.getService();
/* 23 */                                bd3 bd3Var = new bd3(nd3Var, taskCompletionSource, 0);
/* 30 */                                Bundle bundle = (Bundle) b61Var3.f2238b.f8339b;
/* 32 */                                Parcel parcelZza = zzapVar.zza();
/* 36 */                                zzc.zzf(parcelZza, bd3Var);
/* 39 */                                zzc.zzd(parcelZza, bundle);
/* 42 */                                parcelZza.writeInt(i5);
/* 45 */                                parcelZza.writeInt(i6);
/* 50 */                                zzapVar.zzc(5021, parcelZza);
                                    } catch (SecurityException unused) {
/* 54 */                                jb1.m5743I(taskCompletionSource);
                                    }
                                }
                            };
/* 20 */                    tm2VarBuilder.f17188d = 6706;
/* 26 */                    return or0Var.doRead(tm2VarBuilder.m8812a());
                        }
                    });
                }

                public final Task<C0828d1> loadPlayerCenteredScores(String str, int i, int i2, int i3) {
/* 13 */            return this.zza.zzb(new zzct(str, i, i2, i3, false));
                }

                public final Task<C0828d1> loadTopScores(String str, int i, int i2, int i3) {
/* 13 */            return this.zza.zzb(new zzcu(str, i, i2, i3, false));
                }

                public final void submitScore(String str, long j) {
/* 8 */             this.zza.zzb(new zzcv(str, j));
                }

                public final Task<bx0> submitScoreImmediate(String str, long j) {
/* 8 */             return this.zza.zzb(new zzcv(str, j));
                }

/* 11 */        public final void submitScore(String str, long j, String str2) {
/* 12 */            this.zza.zzb(new zzcw(str, j, str2));
                }

/* 12 */        public final Task<Intent> getLeaderboardIntent(String str, int i) {
/* 13 */            return getLeaderboardIntent(str, i, -1);
                }

/* 12 */        public final Task<C0828d1> loadLeaderboardMetadata(final boolean z) {
/* 13 */            return this.zza.zzb(new zzaq() { // from class: com.google.android.gms.internal.games_v2.zzcy
                        @Override // com.google.android.gms.internal.games_v2.zzaq
                        public final Task zza(or0 or0Var) {
/* 1 */                     final boolean z2 = z;
/* 3 */                     tm2 tm2VarBuilder = um2.builder();
/* 12 */                    tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.games_v2.zzdh
                                @Override // p000.c32
                                public final void accept(Object obj, Object obj2) throws RemoteException {
/* 1 */                             boolean z3 = z2;
/* 3 */                             nd3 nd3Var = (nd3) obj;
/* 5 */                             TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
/* 7 */                             nd3Var.getClass();
                                    try {
/* 14 */                                com.google.android.gms.games.internal.zzap zzapVar = (com.google.android.gms.games.internal.zzap) nd3Var.getService();
/* 19 */                                dd3 dd3Var = new dd3(taskCompletionSource, 0);
/* 22 */                                Parcel parcelZza = zzapVar.zza();
/* 26 */                                zzc.zzf(parcelZza, dd3Var);
/* 29 */                                zzc.zzc(parcelZza, z3);
/* 34 */                                zzapVar.zzc(6503, parcelZza);
                                    } catch (SecurityException unused) {
/* 38 */                                jb1.m5743I(taskCompletionSource);
                                    }
                                }
                            };
/* 16 */                    tm2VarBuilder.f17188d = 6702;
/* 22 */                    return or0Var.doRead(tm2VarBuilder.m8812a());
                        }
                    });
                }

/* 12 */        public final Task<bx0> submitScoreImmediate(String str, long j, String str2) {
/* 13 */            return this.zza.zzb(new zzcw(str, j, str2));
                }

/* 13 */        public final Task<Intent> getLeaderboardIntent(String str) {
/* 14 */            return getLeaderboardIntent(str, -1, -1);
                }

/* 17 */        public final Task<C0828d1> loadPlayerCenteredScores(String str, int i, int i2, int i3, boolean z) {
/* 18 */            return this.zza.zzb(new zzct(str, i, i2, i3, z));
                }

/* 17 */        public final Task<C0828d1> loadTopScores(String str, int i, int i2, int i3, boolean z) {
/* 18 */            return this.zza.zzb(new zzcu(str, i, i2, i3, z));
                }
            }
