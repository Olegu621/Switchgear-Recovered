            package com.google.android.gms.internal.games_v2;

            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.android.gms.drive.Contents;
            import com.google.android.gms.games.snapshot.SnapshotContents;
            import com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity;
            import com.google.android.gms.tasks.Task;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import p000.C1951n4;
            import p000.c32;
            import p000.dd3;
            import p000.jb1;
            import p000.kb1;
            import p000.mf2;
            import p000.nd3;
            import p000.or0;
            import p000.tm2;
            import p000.um2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class zzej implements zzaq {
                public final /* synthetic */ String zza;
                public final /* synthetic */ String zzb;
                public final /* synthetic */ mf2 zzc;
                public final /* synthetic */ SnapshotContents zzd;

                public /* synthetic */ zzej(String str, String str2, mf2 mf2Var, SnapshotContents snapshotContents) {
/* 4 */             this.zza = str;
/* 6 */             this.zzb = str2;
/* 8 */             this.zzc = mf2Var;
/* 10 */            this.zzd = snapshotContents;
                }

                @Override // com.google.android.gms.internal.games_v2.zzaq
                public final Task zza(or0 or0Var) {
/* 1 */             final String str = this.zza;
/* 3 */             final String str2 = this.zzb;
/* 5 */             final mf2 mf2Var = this.zzc;
/* 7 */             final SnapshotContents snapshotContents = this.zzd;
/* 9 */             tm2 tm2VarBuilder = um2.builder();
/* 18 */            tm2VarBuilder.f17185a = new c32() { // from class: com.google.android.gms.internal.games_v2.zzer
                        @Override // p000.c32
                        public final void accept(Object obj, Object obj2) throws RemoteException {
/* 1 */                     String str3 = str;
/* 3 */                     String str4 = str2;
/* 5 */                     mf2 mf2Var2 = mf2Var;
/* 7 */                     SnapshotContents snapshotContents2 = snapshotContents;
/* 9 */                     nd3 nd3Var = (nd3) obj;
/* 11 */                    TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
/* 13 */                    nd3Var.getClass();
/* 24 */                    kb1.m6063p("SnapshotContents already closed", !snapshotContents2.isClosed());
/* 32 */                    if (((SnapshotMetadataChangeEntity) mf2Var2).f4047d != null && nd3Var.getContext().getCacheDir() == null) {
/* 47 */                        C1951n4.m6868s("Cannot set null temp directory");
/* 50 */                        return;
                            }
/* 51 */                    Contents contentsZza = snapshotContents2.zza();
/* 55 */                    snapshotContents2.zzb();
                            try {
/* 62 */                        com.google.android.gms.games.internal.zzap zzapVar = (com.google.android.gms.games.internal.zzap) nd3Var.getService();
/* 67 */                        dd3 dd3Var = new dd3(taskCompletionSource, 5);
/* 72 */                        Parcel parcelZza = zzapVar.zza();
/* 76 */                        zzc.zzf(parcelZza, dd3Var);
/* 79 */                        parcelZza.writeString(str3);
/* 82 */                        parcelZza.writeString(str4);
/* 85 */                        zzc.zzd(parcelZza, (SnapshotMetadataChangeEntity) mf2Var2);
/* 88 */                        zzc.zzd(parcelZza, contentsZza);
/* 93 */                        zzapVar.zzc(12033, parcelZza);
                            } catch (SecurityException unused) {
/* 97 */                        jb1.m5743I(taskCompletionSource);
                            }
                        }
                    };
/* 22 */            tm2VarBuilder.f17188d = 6725;
/* 28 */            return or0Var.doWrite(tm2VarBuilder.m8812a());
                }
            }
