            package com.google.android.gms.internal.games_v2;

            import android.content.Intent;
            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.android.gms.common.data.DataHolder;
            import com.google.android.gms.games.Player;
            import com.google.android.gms.games.PlayerEntity;
            import com.google.android.gms.games.PlayerRef;
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
/* 11 */    public final class zzef {
                private final zzar zza;

                public zzef(zzar zzarVar) {
/* 4 */             this.zza = zzarVar;
                }

                private final Task zza(final String str, final int i) {
/* 8 */             return this.zza.zzb(new zzaq() { // from class: com.google.android.gms.internal.games_v2.zzdo
                        @Override // com.google.android.gms.internal.games_v2.zzaq
                        public final Task zza(or0 or0Var) {
/* 1 */                     final String str2 = str;
/* 3 */                     final int i2 = i;
/* 5 */                     tm2 tm2VarBuilder = um2.builder();
/* 14 */                    tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.games_v2.zzdw
                                @Override // p000.c32
                                public final void accept(Object obj, Object obj2) {
/* 13 */                            ((nd3) obj).m6970b((TaskCompletionSource) obj2, str2, i2, true, false);
                                }
                            };
/* 18 */                    tm2VarBuilder.f17188d = 6716;
/* 24 */                    return or0Var.doRead(tm2VarBuilder.m8812a());
                        }
                    });
                }

                private final Task zzb(final String str, final int i, final boolean z) {
/* 8 */             return this.zza.zzb(new zzaq() { // from class: com.google.android.gms.internal.games_v2.zzdp
                        @Override // com.google.android.gms.internal.games_v2.zzaq
                        public final Task zza(or0 or0Var) {
/* 1 */                     final String str2 = str;
/* 3 */                     final int i2 = i;
/* 5 */                     final boolean z2 = z;
/* 7 */                     tm2 tm2VarBuilder = um2.builder();
/* 16 */                    tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.games_v2.zzdx
                                @Override // p000.c32
                                public final void accept(Object obj, Object obj2) {
/* 14 */                            ((nd3) obj).m6970b((TaskCompletionSource) obj2, str2, i2, false, z2);
                                }
                            };
/* 20 */                    tm2VarBuilder.f17188d = 6715;
/* 26 */                    return or0Var.doRead(tm2VarBuilder.m8812a());
                        }
                    });
                }

                public final Task<Intent> getCompareProfileIntent(String str) {
/* 9 */             return this.zza.zzb(new zzdq(str, null, null));
                }

                public final Task<Intent> getCompareProfileIntentWithAlternativeNameHints(String str, String str2, String str3) {
/* 8 */             return this.zza.zzb(new zzdq(str, str2, str3));
                }

                public final Task<C0828d1> getCurrentPlayer(final boolean z) {
/* 8 */             return this.zza.zzb(new zzaq() { // from class: com.google.android.gms.internal.games_v2.zzds
                        @Override // com.google.android.gms.internal.games_v2.zzaq
                        public final Task zza(or0 or0Var) {
/* 1 */                     final boolean z2 = z;
/* 3 */                     tm2 tm2VarBuilder = um2.builder();
/* 12 */                    tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.games_v2.zzea
                                @Override // p000.c32
                                public final void accept(Object obj, Object obj2) throws RemoteException {
/* 1 */                             boolean z3 = z2;
/* 3 */                             nd3 nd3Var = (nd3) obj;
/* 5 */                             TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
/* 7 */                             nd3Var.getClass();
                                    try {
/* 14 */                                com.google.android.gms.games.internal.zzap zzapVar = (com.google.android.gms.games.internal.zzap) nd3Var.getService();
/* 19 */                                dd3 dd3Var = new dd3(taskCompletionSource, 3);
/* 22 */                                Parcel parcelZza = zzapVar.zza();
/* 26 */                                zzc.zzf(parcelZza, dd3Var);
/* 30 */                                parcelZza.writeString(null);
/* 33 */                                zzc.zzc(parcelZza, z3);
/* 38 */                                zzapVar.zzc(13006, parcelZza);
                                    } catch (SecurityException unused) {
/* 42 */                                jb1.m5743I(taskCompletionSource);
                                    }
                                }
                            };
/* 16 */                    tm2VarBuilder.f17188d = 6710;
/* 22 */                    return or0Var.doRead(tm2VarBuilder.m8812a());
                        }
                    });
                }

                public final Task<String> getCurrentPlayerId() {
/* 5 */             return this.zza.zzb(new zzaq() { // from class: com.google.android.gms.internal.games_v2.zzdu
                        @Override // com.google.android.gms.internal.games_v2.zzaq
                        public final Task zza(or0 or0Var) {
/* 1 */                     tm2 tm2VarBuilder = um2.builder();
/* 7 */                     tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.games_v2.zzec
                                @Override // p000.c32
                                public final void accept(Object obj, Object obj2) throws RemoteException {
/* 9 */                             com.google.android.gms.games.internal.zzap zzapVar = (com.google.android.gms.games.internal.zzap) ((nd3) obj).getService();
/* 17 */                            Parcel parcelZzb = zzapVar.zzb(5012, zzapVar.zza());
/* 21 */                            String string = parcelZzb.readString();
/* 25 */                            parcelZzb.recycle();
/* 28 */                            ((TaskCompletionSource) obj2).setResult(string);
                                }
                            };
/* 11 */                    tm2VarBuilder.f17188d = 6709;
/* 17 */                    return or0Var.doRead(tm2VarBuilder.m8812a());
                        }
                    });
                }

                public final Task<Intent> getPlayerSearchIntent() {
/* 5 */             return this.zza.zzb(new zzaq() { // from class: com.google.android.gms.internal.games_v2.zzdv
                        @Override // com.google.android.gms.internal.games_v2.zzaq
                        public final Task zza(or0 or0Var) {
/* 1 */                     tm2 tm2VarBuilder = um2.builder();
/* 7 */                     tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.games_v2.zzed
                                @Override // p000.c32
                                public final void accept(Object obj, Object obj2) throws RemoteException {
/* 9 */                             com.google.android.gms.games.internal.zzap zzapVar = (com.google.android.gms.games.internal.zzap) ((nd3) obj).getService();
/* 17 */                            Parcel parcelZzb = zzapVar.zzb(9010, zzapVar.zza());
/* 27 */                            Intent intent = (Intent) zzc.zza(parcelZzb, Intent.CREATOR);
/* 29 */                            parcelZzb.recycle();
/* 32 */                            ((TaskCompletionSource) obj2).setResult(intent);
                                }
                            };
/* 11 */                    tm2VarBuilder.f17188d = 6714;
/* 17 */                    return or0Var.doRead(tm2VarBuilder.m8812a());
                        }
                    });
                }

                public final Task<C0828d1> loadFriends(int i, boolean z) {
/* 3 */             return zzb("friends_all", i, z);
                }

                public final Task<C0828d1> loadMoreFriends(int i) {
/* 3 */             return zza("friends_all", i);
                }

                public final Task<C0828d1> loadMoreRecentlyPlayedWithPlayers(int i) {
/* 3 */             return zza("played_with", i);
                }

                public final Task<C0828d1> loadPlayer(String str) {
/* 9 */             return this.zza.zzb(new zzdr(str, false));
                }

                public final Task<C0828d1> loadRecentlyPlayedWithPlayers(int i, boolean z) {
/* 3 */             return zzb("played_with", i, z);
                }

/* 12 */        public final Task<Player> getCurrentPlayer() {
/* 13 */            return this.zza.zzb(new zzaq() { // from class: com.google.android.gms.internal.games_v2.zzdt
                        @Override // com.google.android.gms.internal.games_v2.zzaq
                        public final Task zza(or0 or0Var) {
/* 1 */                     tm2 tm2VarBuilder = um2.builder();
/* 7 */                     tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.games_v2.zzeb
                                @Override // p000.c32
                                public final void accept(Object obj, Object obj2) {
                                    int i;
/* 1 */                             nd3 nd3Var = (nd3) obj;
/* 3 */                             TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
/* 5 */                             nd3Var.checkConnected();
                                    synchronized (nd3Var) {
                                        try {
/* 11 */                                    if (nd3Var.f14196c == null) {
/* 17 */                                        com.google.android.gms.games.internal.zzap zzapVar = (com.google.android.gms.games.internal.zzap) nd3Var.getService();
/* 25 */                                        Parcel parcelZzb = zzapVar.zzb(5013, zzapVar.zza());
/* 35 */                                        DataHolder dataHolder = (DataHolder) zzc.zza(parcelZzb, DataHolder.CREATOR);
/* 37 */                                        parcelZzb.recycle();
/* 41 */                                        if (dataHolder == null) {
/* 43 */                                            i = 0;
                                                } else {
                                                    try {
/* 45 */                                                i = dataHolder.f3470v;
                                                    } catch (Throwable th) {
/* 72 */                                                if (dataHolder != null) {
/* 74 */                                                    dataHolder.close();
                                                        }
/* 77 */                                                throw th;
                                                    }
                                                }
/* 47 */                                        if (i > 0) {
/* 59 */                                            nd3Var.f14196c = new PlayerEntity(new PlayerRef(dataHolder, 0));
                                                }
/* 64 */                                        if (dataHolder != null) {
/* 66 */                                            dataHolder.close();
                                                }
                                            }
                                        } catch (Throwable th2) {
/* 86 */                                    throw th2;
                                        }
                                    }
/* 81 */                            taskCompletionSource.setResult(nd3Var.f14196c);
                                }
                            };
/* 11 */                    tm2VarBuilder.f17188d = 6710;
/* 17 */                    return or0Var.doRead(tm2VarBuilder.m8812a());
                        }
                    });
                }

/* 13 */        public final Task<Intent> getCompareProfileIntent(final Player player) {
/* 14 */            return this.zza.zzb(new zzaq() { // from class: com.google.android.gms.internal.games_v2.zzee
                        @Override // com.google.android.gms.internal.games_v2.zzaq
                        public final Task zza(or0 or0Var) {
/* 1 */                     final Player player2 = player;
/* 3 */                     tm2 tm2VarBuilder = um2.builder();
/* 12 */                    tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.games_v2.zzdn
                                @Override // p000.c32
                                public final void accept(Object obj, Object obj2) throws RemoteException {
/* 9 */                             PlayerEntity playerEntity = new PlayerEntity(player2);
/* 16 */                            com.google.android.gms.games.internal.zzap zzapVar = (com.google.android.gms.games.internal.zzap) ((nd3) obj).getService();
/* 18 */                            Parcel parcelZza = zzapVar.zza();
/* 22 */                            zzc.zzd(parcelZza, playerEntity);
/* 27 */                            Parcel parcelZzb = zzapVar.zzb(15503, parcelZza);
/* 37 */                            Intent intent = (Intent) zzc.zza(parcelZzb, Intent.CREATOR);
/* 39 */                            parcelZzb.recycle();
/* 48 */                            intent.setExtrasClassLoader(PlayerEntity.class.getClassLoader());
/* 51 */                            ((TaskCompletionSource) obj2).setResult(intent);
                                }
                            };
/* 16 */                    tm2VarBuilder.f17188d = 6713;
/* 22 */                    return or0Var.doRead(tm2VarBuilder.m8812a());
                        }
                    });
                }

/* 13 */        public final Task<C0828d1> loadPlayer(String str, boolean z) {
/* 14 */            return this.zza.zzb(new zzdr(str, z));
                }
            }
