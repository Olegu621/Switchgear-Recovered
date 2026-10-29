            package com.google.android.gms.games.snapshot;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.games.internal.zzh;
            import java.util.Arrays;
            import p000.de3;
            import p000.md3;
            import p000.w11;
            import p000.wc0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class SnapshotEntity extends zzh implements Snapshot {
                public static final Parcelable.Creator<SnapshotEntity> CREATOR = new md3(19);

                /* JADX INFO: renamed from: a */
                public final SnapshotMetadataEntity f4042a;

                /* JADX INFO: renamed from: b */
                public final SnapshotContentsEntity f4043b;

                public SnapshotEntity(SnapshotMetadataEntity snapshotMetadataEntity, SnapshotContentsEntity snapshotContentsEntity) {
/* 9 */             this.f4042a = new SnapshotMetadataEntity(snapshotMetadataEntity);
/* 11 */            this.f4043b = snapshotContentsEntity;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof Snapshot)) {
/* 40 */                return false;
                    }
/* 6 */             if (this == obj) {
/* 38 */                return true;
                    }
/* 9 */             Snapshot snapshot = (Snapshot) obj;
                    return de3.m3029k(snapshot.getMetadata(), this.f4042a) && de3.m3029k(snapshot.mo2126v1(), mo2126v1());
                }

                @Override // com.google.android.gms.games.snapshot.Snapshot
                public final SnapshotMetadataEntity getMetadata() {
/* 1 */             return this.f4042a;
                }

                public final int hashCode() {
/* 11 */            return Arrays.hashCode(new Object[]{this.f4042a, mo2126v1()});
                }

                public final String toString() {
/* 3 */             wc0 wc0Var = new wc0(this);
/* 10 */            wc0Var.m9529d(this.f4042a, "Metadata");
/* 28 */            wc0Var.m9529d(Boolean.valueOf(mo2126v1() != null), "HasContents");
/* 31 */            return wc0Var.toString();
                }

                @Override // com.google.android.gms.games.snapshot.Snapshot
                /* JADX INFO: renamed from: v1 */
                public final SnapshotContentsEntity mo2126v1() {
/* 1 */             SnapshotContentsEntity snapshotContentsEntity = this.f4043b;
/* 7 */             if (snapshotContentsEntity.isClosed()) {
/* 9 */                 return null;
                    }
/* 10 */            return snapshotContentsEntity;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 1, this.f4042a, i, false);
/* 19 */            w11.m9409S(parcel, 3, mo2126v1(), i, false);
/* 22 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
