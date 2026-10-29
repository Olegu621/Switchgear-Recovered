            package com.google.android.gms.internal.games_v2;

            import android.content.Intent;
            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.android.gms.drive.Contents;
            import com.google.android.gms.games.snapshot.Snapshot;
            import com.google.android.gms.games.snapshot.SnapshotContents;
            import com.google.android.gms.games.snapshot.SnapshotContentsEntity;
            import com.google.android.gms.games.snapshot.SnapshotMetadata;
            import com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity;
            import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;
            import com.google.android.gms.tasks.Task;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.C0828d1;
            import p000.C1951n4;
            import p000.c32;
            import p000.dd3;
            import p000.jb1;
            import p000.kb1;
            import p000.mf2;
            import p000.nd3;
            import p000.or0;
            import p000.q62;
            import p000.tm2;
            import p000.um2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 11 */    public final class zzey {
                private final zzar zza;

                public zzey(zzar zzarVar) {
/* 4 */             this.zza = zzarVar;
                }

                public final Task<SnapshotMetadata> commitAndClose(final Snapshot snapshot, final mf2 mf2Var) {
/* 8 */             return this.zza.zzb(new zzaq() { // from class: com.google.android.gms.internal.games_v2.zzeh
                        @Override // com.google.android.gms.internal.games_v2.zzaq
                        public final Task zza(or0 or0Var) {
/* 1 */                     final Snapshot snapshot2 = snapshot;
/* 3 */                     final mf2 mf2Var2 = mf2Var;
/* 5 */                     tm2 tm2VarBuilder = um2.builder();
/* 14 */                    tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.games_v2.zzep
                                @Override // p000.c32
                                public final void accept(Object obj, Object obj2) throws RemoteException {
/* 1 */                             Snapshot snapshot3 = snapshot2;
/* 3 */                             mf2 mf2Var3 = mf2Var2;
/* 5 */                             nd3 nd3Var = (nd3) obj;
/* 7 */                             TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
/* 9 */                             nd3Var.getClass();
/* 12 */                            SnapshotContentsEntity snapshotContentsEntityMo2126v1 = snapshot3.mo2126v1();
/* 24 */                            kb1.m6063p("Snapshot already closed", !snapshotContentsEntityMo2126v1.isClosed());
/* 32 */                            if (((SnapshotMetadataChangeEntity) mf2Var3).f4047d != null && nd3Var.getContext().getCacheDir() == null) {
/* 47 */                                C1951n4.m6868s("Cannot set null temp directory");
/* 50 */                                return;
                                    }
/* 51 */                            Contents contents = snapshotContentsEntityMo2126v1.f4041a;
/* 54 */                            snapshotContentsEntityMo2126v1.f4041a = null;
                                    try {
/* 60 */                                com.google.android.gms.games.internal.zzap zzapVar = (com.google.android.gms.games.internal.zzap) nd3Var.getService();
/* 66 */                                dd3 dd3Var = new dd3(taskCompletionSource, 9);
/* 73 */                                String str = snapshot3.getMetadata().f4056c;
/* 77 */                                Parcel parcelZza = zzapVar.zza();
/* 81 */                                zzc.zzf(parcelZza, dd3Var);
/* 84 */                                parcelZza.writeString(str);
/* 87 */                                zzc.zzd(parcelZza, (SnapshotMetadataChangeEntity) mf2Var3);
/* 90 */                                zzc.zzd(parcelZza, contents);
/* 95 */                                zzapVar.zzc(12007, parcelZza);
                                    } catch (SecurityException unused) {
/* 99 */                                jb1.m5743I(taskCompletionSource);
                                    }
                                }
                            };
/* 18 */                    tm2VarBuilder.f17188d = 6722;
/* 24 */                    return or0Var.doWrite(tm2VarBuilder.m8812a());
                        }
                    });
                }

                public final Task<String> delete(final SnapshotMetadata snapshotMetadata) {
/* 8 */             return this.zza.zzb(new zzaq() { // from class: com.google.android.gms.internal.games_v2.zzei
                        @Override // com.google.android.gms.internal.games_v2.zzaq
                        public final Task zza(or0 or0Var) {
/* 1 */                     final SnapshotMetadata snapshotMetadata2 = snapshotMetadata;
/* 3 */                     tm2 tm2VarBuilder = um2.builder();
/* 12 */                    tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.games_v2.zzeq
                                @Override // p000.c32
                                public final void accept(Object obj, Object obj2) throws RemoteException {
/* 3 */                             nd3 nd3Var = (nd3) obj;
/* 5 */                             TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
/* 7 */                             String strMo2137z1 = snapshotMetadata2.mo2137z1();
/* 11 */                            nd3Var.getClass();
                                    try {
/* 18 */                                com.google.android.gms.games.internal.zzap zzapVar = (com.google.android.gms.games.internal.zzap) nd3Var.getService();
/* 24 */                                dd3 dd3Var = new dd3(taskCompletionSource, 10);
/* 27 */                                Parcel parcelZza = zzapVar.zza();
/* 31 */                                zzc.zzf(parcelZza, dd3Var);
/* 34 */                                parcelZza.writeString(strMo2137z1);
/* 39 */                                zzapVar.zzc(12020, parcelZza);
                                    } catch (SecurityException unused) {
/* 43 */                                jb1.m5743I(taskCompletionSource);
                                    }
                                }
                            };
/* 16 */                    tm2VarBuilder.f17188d = 6724;
/* 22 */                    return or0Var.doWrite(tm2VarBuilder.m8812a());
                        }
                    });
                }

                public final Task<Void> discardAndClose(final Snapshot snapshot) {
/* 8 */             return this.zza.zzb(new zzaq() { // from class: com.google.android.gms.internal.games_v2.zzex
                        @Override // com.google.android.gms.internal.games_v2.zzaq
                        public final Task zza(or0 or0Var) {
/* 1 */                     final Snapshot snapshot2 = snapshot;
/* 3 */                     tm2 tm2VarBuilder = um2.builder();
/* 12 */                    tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.games_v2.zzeg
                                @Override // p000.c32
                                public final void accept(Object obj, Object obj2) throws RemoteException {
/* 7 */                             SnapshotContentsEntity snapshotContentsEntityMo2126v1 = snapshot2.mo2126v1();
/* 19 */                            kb1.m6063p("Snapshot already closed", !snapshotContentsEntityMo2126v1.isClosed());
/* 22 */                            Contents contents = snapshotContentsEntityMo2126v1.f4041a;
/* 25 */                            snapshotContentsEntityMo2126v1.f4041a = null;
/* 31 */                            com.google.android.gms.games.internal.zzap zzapVar = (com.google.android.gms.games.internal.zzap) ((nd3) obj).getService();
/* 33 */                            Parcel parcelZza = zzapVar.zza();
/* 37 */                            zzc.zzd(parcelZza, contents);
/* 42 */                            zzapVar.zzc(12019, parcelZza);
/* 45 */                            ((TaskCompletionSource) obj2).setResult(null);
                                }
                            };
/* 16 */                    tm2VarBuilder.f17188d = 6723;
/* 22 */                    return or0Var.doWrite(tm2VarBuilder.m8812a());
                        }
                    });
                }

                public final Task<Integer> getMaxCoverImageSize() {
/* 5 */             return this.zza.zzb(new zzaq() { // from class: com.google.android.gms.internal.games_v2.zzen
                        @Override // com.google.android.gms.internal.games_v2.zzaq
                        public final Task zza(or0 or0Var) {
/* 1 */                     tm2 tm2VarBuilder = um2.builder();
/* 7 */                     tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.games_v2.zzev
                                @Override // p000.c32
                                public final void accept(Object obj, Object obj2) throws RemoteException {
/* 9 */                             com.google.android.gms.games.internal.zzap zzapVar = (com.google.android.gms.games.internal.zzap) ((nd3) obj).getService();
/* 17 */                            Parcel parcelZzb = zzapVar.zzb(12036, zzapVar.zza());
/* 21 */                            int i = parcelZzb.readInt();
/* 25 */                            parcelZzb.recycle();
/* 32 */                            ((TaskCompletionSource) obj2).setResult(Integer.valueOf(i));
                                }
                            };
/* 11 */                    tm2VarBuilder.f17188d = 6718;
/* 17 */                    return or0Var.doRead(tm2VarBuilder.m8812a());
                        }
                    });
                }

                public final Task<Integer> getMaxDataSize() {
/* 5 */             return this.zza.zzb(new zzaq() { // from class: com.google.android.gms.internal.games_v2.zzeo
                        @Override // com.google.android.gms.internal.games_v2.zzaq
                        public final Task zza(or0 or0Var) {
/* 1 */                     tm2 tm2VarBuilder = um2.builder();
/* 7 */                     tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.games_v2.zzew
                                @Override // p000.c32
                                public final void accept(Object obj, Object obj2) throws RemoteException {
/* 9 */                             com.google.android.gms.games.internal.zzap zzapVar = (com.google.android.gms.games.internal.zzap) ((nd3) obj).getService();
/* 17 */                            Parcel parcelZzb = zzapVar.zzb(12035, zzapVar.zza());
/* 21 */                            int i = parcelZzb.readInt();
/* 25 */                            parcelZzb.recycle();
/* 32 */                            ((TaskCompletionSource) obj2).setResult(Integer.valueOf(i));
                                }
                            };
/* 11 */                    tm2VarBuilder.f17188d = 6717;
/* 17 */                    return or0Var.doRead(tm2VarBuilder.m8812a());
                        }
                    });
                }

                public final Task<Intent> getSelectSnapshotIntent(final String str, final boolean z, final boolean z2, final int i) {
/* 8 */             return this.zza.zzb(new zzaq() { // from class: com.google.android.gms.internal.games_v2.zzel
                        @Override // com.google.android.gms.internal.games_v2.zzaq
                        public final Task zza(or0 or0Var) {
/* 1 */                     final String str2 = str;
/* 3 */                     final boolean z3 = z;
/* 5 */                     final boolean z4 = z2;
/* 7 */                     final int i2 = i;
/* 9 */                     tm2 tm2VarBuilder = um2.builder();
/* 18 */                    tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.games_v2.zzet
                                @Override // p000.c32
                                public final void accept(Object obj, Object obj2) throws RemoteException {
/* 1 */                             String str3 = str2;
/* 3 */                             boolean z5 = z3;
/* 5 */                             boolean z6 = z4;
/* 7 */                             int i3 = i2;
/* 17 */                            com.google.android.gms.games.internal.zzap zzapVar = (com.google.android.gms.games.internal.zzap) ((nd3) obj).getService();
/* 19 */                            Parcel parcelZza = zzapVar.zza();
/* 23 */                            parcelZza.writeString(str3);
/* 26 */                            zzc.zzc(parcelZza, z5);
/* 29 */                            zzc.zzc(parcelZza, z6);
/* 32 */                            parcelZza.writeInt(i3);
/* 37 */                            Parcel parcelZzb = zzapVar.zzb(12001, parcelZza);
/* 47 */                            Intent intent = (Intent) zzc.zza(parcelZzb, Intent.CREATOR);
/* 49 */                            parcelZzb.recycle();
/* 52 */                            ((TaskCompletionSource) obj2).setResult(intent);
                                }
                            };
/* 22 */                    tm2VarBuilder.f17188d = 6719;
/* 28 */                    return or0Var.doRead(tm2VarBuilder.m8812a());
                        }
                    });
                }

                public final Task<C0828d1> load(final boolean z) {
/* 8 */             return this.zza.zzb(new zzaq() { // from class: com.google.android.gms.internal.games_v2.zzem
                        @Override // com.google.android.gms.internal.games_v2.zzaq
                        public final Task zza(or0 or0Var) {
/* 1 */                     final boolean z2 = z;
/* 3 */                     tm2 tm2VarBuilder = um2.builder();
/* 12 */                    tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.games_v2.zzeu
                                @Override // p000.c32
                                public final void accept(Object obj, Object obj2) throws RemoteException {
/* 1 */                             boolean z3 = z2;
/* 3 */                             nd3 nd3Var = (nd3) obj;
/* 5 */                             TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
/* 7 */                             nd3Var.getClass();
                                    try {
/* 14 */                                com.google.android.gms.games.internal.zzap zzapVar = (com.google.android.gms.games.internal.zzap) nd3Var.getService();
/* 19 */                                dd3 dd3Var = new dd3(taskCompletionSource, 1);
/* 22 */                                Parcel parcelZza = zzapVar.zza();
/* 26 */                                zzc.zzf(parcelZza, dd3Var);
/* 29 */                                zzc.zzc(parcelZza, z3);
/* 34 */                                zzapVar.zzc(12002, parcelZza);
                                    } catch (SecurityException unused) {
/* 38 */                                jb1.m5743I(taskCompletionSource);
                                    }
                                }
                            };
/* 16 */                    tm2VarBuilder.f17188d = 6720;
/* 22 */                    return or0Var.doRead(tm2VarBuilder.m8812a());
                        }
                    });
                }

                public final Task<q62> open(final String str, final boolean z, final int i) {
/* 8 */             return this.zza.zzb(new zzaq() { // from class: com.google.android.gms.internal.games_v2.zzek
                        @Override // com.google.android.gms.internal.games_v2.zzaq
                        public final Task zza(or0 or0Var) {
/* 1 */                     final String str2 = str;
/* 3 */                     final boolean z2 = z;
/* 5 */                     final int i2 = i;
/* 7 */                     tm2 tm2VarBuilder = um2.builder();
/* 16 */                    tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.games_v2.zzes
                                @Override // p000.c32
                                public final void accept(Object obj, Object obj2) throws RemoteException {
/* 1 */                             String str3 = str2;
/* 3 */                             boolean z3 = z2;
/* 5 */                             int i3 = i2;
/* 7 */                             nd3 nd3Var = (nd3) obj;
/* 9 */                             TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
/* 11 */                            nd3Var.getClass();
                                    try {
/* 18 */                                com.google.android.gms.games.internal.zzap zzapVar = (com.google.android.gms.games.internal.zzap) nd3Var.getService();
/* 23 */                                dd3 dd3Var = new dd3(taskCompletionSource, 5);
/* 26 */                                Parcel parcelZza = zzapVar.zza();
/* 30 */                                zzc.zzf(parcelZza, dd3Var);
/* 33 */                                parcelZza.writeString(str3);
/* 36 */                                zzc.zzc(parcelZza, z3);
/* 39 */                                parcelZza.writeInt(i3);
/* 44 */                                zzapVar.zzc(15001, parcelZza);
                                    } catch (SecurityException unused) {
/* 48 */                                jb1.m5743I(taskCompletionSource);
                                    }
                                }
                            };
/* 20 */                    tm2VarBuilder.f17188d = 6721;
/* 26 */                    return or0Var.doWrite(tm2VarBuilder.m8812a());
                        }
                    });
                }

                public final Task<q62> resolveConflict(String str, Snapshot snapshot) {
/* 1 */             SnapshotMetadataEntity metadata = snapshot.getMetadata();
/* 5 */             String str2 = metadata.f4060i;
/* 7 */             long j = metadata.f4062w;
/* 9 */             Long lValueOf = Long.valueOf(j);
/* 15 */            Long lValueOf2 = Long.valueOf(metadata.f4052X);
/* 23 */            if (j == -1) {
/* 25 */                lValueOf = null;
                    }
/* 32 */            SnapshotMetadataChangeEntity snapshotMetadataChangeEntity = new SnapshotMetadataChangeEntity(str2, lValueOf, null, metadata.f4057d, lValueOf2);
/* 48 */            return this.zza.zzb(new zzej(str, metadata.f4056c, snapshotMetadataChangeEntity, snapshot.mo2126v1()));
                }

/* 12 */        public final Task<q62> open(SnapshotMetadata snapshotMetadata, int i) {
/* 13 */            return open(snapshotMetadata.mo2135u1(), false, i);
                }

/* 13 */        public final Task<q62> open(String str, boolean z) {
/* 14 */            return open(str, z, -1);
                }

/* 14 */        public final Task<q62> open(SnapshotMetadata snapshotMetadata) {
/* 15 */            return open(snapshotMetadata.mo2135u1(), false, -1);
                }

/* 52 */        public final Task<q62> resolveConflict(String str, String str2, mf2 mf2Var, SnapshotContents snapshotContents) {
/* 53 */            return this.zza.zzb(new zzej(str, str2, mf2Var, snapshotContents));
                }
            }
