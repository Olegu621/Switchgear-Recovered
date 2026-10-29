            package com.google.android.gms.games.snapshot;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.drive.Contents;
            import com.google.android.gms.games.internal.zzh;
            import p000.tc3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class SnapshotContentsEntity extends zzh implements SnapshotContents {
                public static final Parcelable.Creator<SnapshotContentsEntity> CREATOR = new tc3(9);

                /* JADX INFO: renamed from: a */
                public Contents f4041a;

                public SnapshotContentsEntity(Contents contents) {
/* 4 */             this.f4041a = contents;
                }

                @Override // com.google.android.gms.games.snapshot.SnapshotContents
                public final boolean isClosed() {
                    return this.f4041a == null;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 1, this.f4041a, i, false);
/* 14 */            w11.m9428f0(iM9422c0, parcel);
                }

                @Override // com.google.android.gms.games.snapshot.SnapshotContents
                public final Contents zza() {
/* 1 */             return this.f4041a;
                }

                @Override // com.google.android.gms.games.snapshot.SnapshotContents
                public final void zzb() {
/* 2 */             this.f4041a = null;
                }
            }
