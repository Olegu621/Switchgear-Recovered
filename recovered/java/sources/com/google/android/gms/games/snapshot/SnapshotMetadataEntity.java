            package com.google.android.gms.games.snapshot;

            import android.net.Uri;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.games.Game;
            import com.google.android.gms.games.GameEntity;
            import com.google.android.gms.games.Player;
            import com.google.android.gms.games.PlayerEntity;
            import com.google.android.gms.games.internal.zzh;
            import java.util.Arrays;
            import p000.de3;
            import p000.re3;
            import p000.w11;
            import p000.wc0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 97 */    public final class SnapshotMetadataEntity extends zzh implements SnapshotMetadata {
                public static final Parcelable.Creator<SnapshotMetadataEntity> CREATOR = new re3(26);

                /* JADX INFO: renamed from: U */
                public final float f4049U;

                /* JADX INFO: renamed from: V */
                public final String f4050V;

                /* JADX INFO: renamed from: W */
                public final boolean f4051W;

                /* JADX INFO: renamed from: X */
                public final long f4052X;

                /* JADX INFO: renamed from: Y */
                public final String f4053Y;

                /* JADX INFO: renamed from: a */
                public final GameEntity f4054a;

                /* JADX INFO: renamed from: b */
                public final PlayerEntity f4055b;

                /* JADX INFO: renamed from: c */
                public final String f4056c;

                /* JADX INFO: renamed from: d */
                public final Uri f4057d;

                /* JADX INFO: renamed from: e */
                public final String f4058e;

                /* JADX INFO: renamed from: f */
                public final String f4059f;

                /* JADX INFO: renamed from: i */
                public final String f4060i;

                /* JADX INFO: renamed from: v */
                public final long f4061v;

                /* JADX INFO: renamed from: w */
                public final long f4062w;

                public SnapshotMetadataEntity(SnapshotMetadata snapshotMetadata) {
/* 7 */             PlayerEntity playerEntity = new PlayerEntity(snapshotMetadata.mo2130I0());
/* 22 */            this.f4054a = new GameEntity(snapshotMetadata.mo2128C1());
/* 24 */            this.f4055b = playerEntity;
/* 30 */            this.f4056c = snapshotMetadata.mo2137z1();
/* 36 */            this.f4057d = snapshotMetadata.mo2127A0();
/* 42 */            this.f4058e = snapshotMetadata.getCoverImageUrl();
/* 48 */            this.f4049U = snapshotMetadata.mo2134p1();
/* 54 */            this.f4059f = snapshotMetadata.zza();
/* 60 */            this.f4060i = snapshotMetadata.getDescription();
/* 66 */            this.f4061v = snapshotMetadata.mo2129G();
/* 72 */            this.f4062w = snapshotMetadata.mo2136v();
/* 78 */            this.f4050V = snapshotMetadata.mo2135u1();
/* 84 */            this.f4051W = snapshotMetadata.mo2131O0();
/* 90 */            this.f4052X = snapshotMetadata.mo2132g0();
/* 96 */            this.f4053Y = snapshotMetadata.mo2133o0();
                }

                /* JADX INFO: renamed from: D1 */
                public static int m2138D1(SnapshotMetadata snapshotMetadata) {
/* 77 */            return Arrays.hashCode(new Object[]{snapshotMetadata.mo2128C1(), snapshotMetadata.mo2130I0(), snapshotMetadata.mo2137z1(), snapshotMetadata.mo2127A0(), Float.valueOf(snapshotMetadata.mo2134p1()), snapshotMetadata.zza(), snapshotMetadata.getDescription(), Long.valueOf(snapshotMetadata.mo2129G()), Long.valueOf(snapshotMetadata.mo2136v()), snapshotMetadata.mo2135u1(), Boolean.valueOf(snapshotMetadata.mo2131O0()), Long.valueOf(snapshotMetadata.mo2132g0()), snapshotMetadata.mo2133o0()});
                }

                /* JADX INFO: renamed from: E1 */
                public static String m2139E1(SnapshotMetadata snapshotMetadata) {
/* 3 */             wc0 wc0Var = new wc0(snapshotMetadata);
/* 12 */            wc0Var.m9529d(snapshotMetadata.mo2128C1(), "Game");
/* 21 */            wc0Var.m9529d(snapshotMetadata.mo2130I0(), "Owner");
/* 30 */            wc0Var.m9529d(snapshotMetadata.mo2137z1(), "SnapshotId");
/* 39 */            wc0Var.m9529d(snapshotMetadata.mo2127A0(), "CoverImageUri");
/* 48 */            wc0Var.m9529d(snapshotMetadata.getCoverImageUrl(), "CoverImageUrl");
/* 61 */            wc0Var.m9529d(Float.valueOf(snapshotMetadata.mo2134p1()), "CoverImageAspectRatio");
/* 70 */            wc0Var.m9529d(snapshotMetadata.getDescription(), "Description");
/* 83 */            wc0Var.m9529d(Long.valueOf(snapshotMetadata.mo2129G()), "LastModifiedTimestamp");
/* 96 */            wc0Var.m9529d(Long.valueOf(snapshotMetadata.mo2136v()), "PlayedTime");
/* 105 */           wc0Var.m9529d(snapshotMetadata.mo2135u1(), "UniqueName");
/* 118 */           wc0Var.m9529d(Boolean.valueOf(snapshotMetadata.mo2131O0()), "ChangePending");
/* 131 */           wc0Var.m9529d(Long.valueOf(snapshotMetadata.mo2132g0()), "ProgressValue");
/* 140 */           wc0Var.m9529d(snapshotMetadata.mo2133o0(), "DeviceName");
/* 143 */           return wc0Var.toString();
                }

                /* JADX INFO: renamed from: F1 */
                public static boolean m2140F1(SnapshotMetadata snapshotMetadata, Object obj) {
/* 3 */             if (!(obj instanceof SnapshotMetadata)) {
/* 237 */               return false;
                    }
/* 7 */             if (snapshotMetadata == obj) {
/* 235 */               return true;
                    }
/* 11 */            SnapshotMetadata snapshotMetadata2 = (SnapshotMetadata) obj;
                    return de3.m3029k(snapshotMetadata2.mo2128C1(), snapshotMetadata.mo2128C1()) && de3.m3029k(snapshotMetadata2.mo2130I0(), snapshotMetadata.mo2130I0()) && de3.m3029k(snapshotMetadata2.mo2137z1(), snapshotMetadata.mo2137z1()) && de3.m3029k(snapshotMetadata2.mo2127A0(), snapshotMetadata.mo2127A0()) && de3.m3029k(Float.valueOf(snapshotMetadata2.mo2134p1()), Float.valueOf(snapshotMetadata.mo2134p1())) && de3.m3029k(snapshotMetadata2.zza(), snapshotMetadata.zza()) && de3.m3029k(snapshotMetadata2.getDescription(), snapshotMetadata.getDescription()) && de3.m3029k(Long.valueOf(snapshotMetadata2.mo2129G()), Long.valueOf(snapshotMetadata.mo2129G())) && de3.m3029k(Long.valueOf(snapshotMetadata2.mo2136v()), Long.valueOf(snapshotMetadata.mo2136v())) && de3.m3029k(snapshotMetadata2.mo2135u1(), snapshotMetadata.mo2135u1()) && de3.m3029k(Boolean.valueOf(snapshotMetadata2.mo2131O0()), Boolean.valueOf(snapshotMetadata.mo2131O0())) && de3.m3029k(Long.valueOf(snapshotMetadata2.mo2132g0()), Long.valueOf(snapshotMetadata.mo2132g0())) && de3.m3029k(snapshotMetadata2.mo2133o0(), snapshotMetadata.mo2133o0());
                }

                @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
                /* JADX INFO: renamed from: A0 */
                public final Uri mo2127A0() {
/* 1 */             return this.f4057d;
                }

                @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
                /* JADX INFO: renamed from: C1 */
                public final Game mo2128C1() {
/* 1 */             return this.f4054a;
                }

                @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
                /* JADX INFO: renamed from: G */
                public final long mo2129G() {
/* 1 */             return this.f4061v;
                }

                @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
                /* JADX INFO: renamed from: I0 */
                public final Player mo2130I0() {
/* 1 */             return this.f4055b;
                }

                @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
                /* JADX INFO: renamed from: O0 */
                public final boolean mo2131O0() {
/* 1 */             return this.f4051W;
                }

                public final boolean equals(Object obj) {
/* 1 */             return m2140F1(this, obj);
                }

                @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
                /* JADX INFO: renamed from: g0 */
                public final long mo2132g0() {
/* 1 */             return this.f4052X;
                }

                @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
                public final String getCoverImageUrl() {
/* 1 */             return this.f4058e;
                }

                @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
                public final String getDescription() {
/* 1 */             return this.f4060i;
                }

                public final int hashCode() {
/* 1 */             return m2138D1(this);
                }

                @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
                /* JADX INFO: renamed from: o0 */
                public final String mo2133o0() {
/* 1 */             return this.f4053Y;
                }

                @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
                /* JADX INFO: renamed from: p1 */
                public final float mo2134p1() {
/* 1 */             return this.f4049U;
                }

                public final String toString() {
/* 1 */             return m2139E1(this);
                }

                @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
                /* JADX INFO: renamed from: u1 */
                public final String mo2135u1() {
/* 1 */             return this.f4050V;
                }

                @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
                /* JADX INFO: renamed from: v */
                public final long mo2136v() {
/* 1 */             return this.f4062w;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 1, this.f4054a, i, false);
/* 17 */            w11.m9409S(parcel, 2, this.f4055b, i, false);
/* 23 */            w11.m9410T(parcel, 3, this.f4056c, false);
/* 29 */            w11.m9409S(parcel, 5, this.f4057d, i, false);
/* 35 */            w11.m9410T(parcel, 6, this.f4058e, false);
/* 41 */            w11.m9410T(parcel, 7, this.f4059f, false);
/* 48 */            w11.m9410T(parcel, 8, this.f4060i, false);
/* 53 */            w11.m9420b0(parcel, 9, 8);
/* 58 */            parcel.writeLong(this.f4061v);
/* 63 */            w11.m9420b0(parcel, 10, 8);
/* 68 */            parcel.writeLong(this.f4062w);
/* 74 */            w11.m9420b0(parcel, 11, 4);
/* 79 */            parcel.writeFloat(this.f4049U);
/* 86 */            w11.m9410T(parcel, 12, this.f4050V, false);
/* 91 */            w11.m9420b0(parcel, 13, 4);
/* 96 */            parcel.writeInt(this.f4051W ? 1 : 0);
/* 101 */           w11.m9420b0(parcel, 14, 8);
/* 106 */           parcel.writeLong(this.f4052X);
/* 113 */           w11.m9410T(parcel, 15, this.f4053Y, false);
/* 116 */           w11.m9428f0(iM9422c0, parcel);
                }

                @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
                /* JADX INFO: renamed from: z1 */
                public final String mo2137z1() {
/* 1 */             return this.f4056c;
                }

                @Override // com.google.android.gms.games.snapshot.SnapshotMetadata
                public final String zza() {
/* 1 */             return this.f4059f;
                }

/* 98 */        public SnapshotMetadataEntity(GameEntity gameEntity, PlayerEntity playerEntity, String str, Uri uri, String str2, String str3, String str4, long j, long j2, float f, String str5, boolean z, long j3, String str6) {
/* 100 */           this.f4054a = gameEntity;
                    this.f4055b = playerEntity;
                    this.f4056c = str;
                    this.f4057d = uri;
                    this.f4058e = str2;
                    this.f4049U = f;
                    this.f4059f = str3;
                    this.f4060i = str4;
                    this.f4061v = j;
                    this.f4062w = j2;
                    this.f4050V = str5;
                    this.f4051W = z;
                    this.f4052X = j3;
                    this.f4053Y = str6;
                }
            }
