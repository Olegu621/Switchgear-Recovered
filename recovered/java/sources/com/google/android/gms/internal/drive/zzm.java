            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import com.google.android.gms.drive.Contents;
            import com.google.android.gms.drive.DriveId;
            import com.google.android.gms.drive.metadata.internal.MetadataBundle;
            import p000.gn3;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 21 */    public final class zzm extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzm> CREATOR = new zzn();
                private final String zzan;
                private final boolean zzao;
                private final boolean zzat;
                private final DriveId zzdd;
                private final MetadataBundle zzde;
                private final Contents zzdf;
                private final int zzdg;
                private final int zzdh;
                private final boolean zzdi;

                public zzm(DriveId driveId, MetadataBundle metadataBundle, Contents contents, boolean z, String str, int i, int i2, boolean z2, boolean z3) {
/* 4 */             this.zzdd = driveId;
/* 6 */             this.zzde = metadataBundle;
/* 8 */             this.zzdf = contents;
/* 10 */            this.zzao = z;
/* 12 */            this.zzan = str;
/* 14 */            this.zzdg = i;
/* 16 */            this.zzdh = i2;
/* 18 */            this.zzdi = z2;
/* 20 */            this.zzat = z3;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 2, this.zzdd, i, false);
/* 17 */            w11.m9409S(parcel, 3, this.zzde, i, false);
/* 23 */            w11.m9409S(parcel, 4, this.zzdf, i, false);
/* 26 */            boolean z = this.zzao;
/* 29 */            w11.m9420b0(parcel, 5, 4);
/* 32 */            parcel.writeInt(z ? 1 : 0);
/* 38 */            w11.m9410T(parcel, 6, this.zzan, false);
/* 41 */            int i2 = this.zzdg;
/* 44 */            w11.m9420b0(parcel, 7, 4);
/* 47 */            parcel.writeInt(i2);
/* 50 */            int i3 = this.zzdh;
/* 54 */            w11.m9420b0(parcel, 8, 4);
/* 57 */            parcel.writeInt(i3);
/* 60 */            boolean z2 = this.zzdi;
/* 64 */            w11.m9420b0(parcel, 9, 4);
/* 67 */            parcel.writeInt(z2 ? 1 : 0);
/* 70 */            boolean z3 = this.zzat;
/* 74 */            w11.m9420b0(parcel, 10, 4);
/* 77 */            parcel.writeInt(z3 ? 1 : 0);
/* 80 */            w11.m9428f0(iM9422c0, parcel);
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 22 */        public zzm(DriveId driveId, MetadataBundle metadataBundle, int i, boolean z, gn3 gn3Var) {
/* 25 */            this(driveId, metadataBundle, null, false, null, 0, i, z, gn3Var.f8753a);
/* 23 */            gn3Var.getClass();
                }
            }
