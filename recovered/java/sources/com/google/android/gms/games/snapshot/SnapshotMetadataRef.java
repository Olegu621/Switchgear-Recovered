            package com.google.android.gms.games.snapshot;

            import android.net.Uri;
            import android.os.Parcel;
            import com.google.android.gms.common.data.DataHolder;
            import com.google.android.gms.games.Game;
            import com.google.android.gms.games.GameRef;
            import com.google.android.gms.games.Player;
            import com.google.android.gms.games.PlayerRef;
            import p000.z30;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class SnapshotMetadataRef extends z30 implements SnapshotMetadata {

                /* JADX INFO: renamed from: d */
                public final GameRef f4063d;

                /* JADX INFO: renamed from: e */
                public final PlayerRef f4064e;

                public SnapshotMetadataRef(DataHolder dataHolder, int i) {
/* 1 */             super(dataHolder, i);
/* 9 */             this.f4063d = new GameRef(dataHolder, i);
/* 16 */            this.f4064e = new PlayerRef(dataHolder, i);
                }

                @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
                /* JADX INFO: renamed from: A0 */
                public final Uri mo2127A0() {
/* 3 */             return m10273w("cover_icon_image_uri");
                }

                @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
                /* JADX INFO: renamed from: C1 */
                public final Game mo2128C1() {
/* 1 */             return this.f4063d;
                }

                @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
                /* JADX INFO: renamed from: G */
                public final long mo2129G() {
/* 3 */             return m10269e("last_modified_timestamp");
                }

                @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
                /* JADX INFO: renamed from: I0 */
                public final Player mo2130I0() {
/* 1 */             return this.f4064e;
                }

                @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
                /* JADX INFO: renamed from: O0 */
                public final boolean mo2131O0() {
                    return m10268d("pending_change_count") > 0;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override // p000.z30
                public final boolean equals(Object obj) {
/* 1 */             return SnapshotMetadataEntity.m2140F1(this, obj);
                }

                @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
                /* JADX INFO: renamed from: g0 */
                public final long mo2132g0() {
/* 3 */             return m10269e("progress_value");
                }

                @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
                public final String getCoverImageUrl() {
/* 3 */             return m10270j("cover_icon_image_url");
                }

                @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
                public final String getDescription() {
/* 3 */             return m10270j("description");
                }

                @Override // p000.z30
                public final int hashCode() {
/* 1 */             return SnapshotMetadataEntity.m2138D1(this);
                }

                @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
                /* JADX INFO: renamed from: o0 */
                public final String mo2133o0() {
/* 3 */             return m10270j("device_name");
                }

                @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
                /* JADX INFO: renamed from: p1 */
                public final float mo2134p1() {
/* 3 */             float fM10267b = m10267b("cover_icon_image_height");
/* 9 */             float fM10267b2 = m10267b("cover_icon_image_width");
/* 16 */            if (fM10267b == 0.0f) {
/* 13 */                return 0.0f;
                    }
/* 19 */            return fM10267b2 / fM10267b;
                }

                public final String toString() {
/* 1 */             return SnapshotMetadataEntity.m2139E1(this);
                }

                @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
                /* JADX INFO: renamed from: u1 */
                public final String mo2135u1() {
/* 3 */             return m10270j("unique_name");
                }

                @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
                /* JADX INFO: renamed from: v */
                public final long mo2136v() {
/* 3 */             return m10269e("duration");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 6 */             new SnapshotMetadataEntity(this).writeToParcel(parcel, i);
                }

                @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
                /* JADX INFO: renamed from: z1 */
                public final String mo2137z1() {
/* 3 */             return m10270j("external_snapshot_id");
                }

                @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
                public final String zza() {
/* 3 */             return m10270j("title");
                }
            }
