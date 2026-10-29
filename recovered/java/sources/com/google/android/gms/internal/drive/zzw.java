            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import com.google.android.gms.drive.Contents;
            import com.google.android.gms.drive.DriveId;
            import com.google.android.gms.drive.metadata.internal.MetadataBundle;
            import p000.C1951n4;
            import p000.kb1;
            import p000.kf0;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 59 */    public final class zzw extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzw> CREATOR = new zzx();
                private final String zzan;
                private final Contents zzdf;
                private final MetadataBundle zzdn;
                private final Integer zzdo;
                private final DriveId zzdp;
                private final boolean zzdq;
                private final int zzdr;
                private final int zzds;

                public zzw(DriveId driveId, MetadataBundle metadataBundle, Contents contents, int i, boolean z, String str, int i2, int i3) {
/* 4 */             if (contents != null && i3 != 0) {
/* 17 */                kb1.m6053f("inconsistent contents reference", contents.f3632b == i3);
                    }
/* 20 */            if (i == 0 && contents == null && i3 == 0) {
/* 29 */                C1951n4.m6859j("Need a valid contents");
/* 33 */                throw null;
                    }
/* 34 */            kb1.m6061n(driveId);
/* 37 */            this.zzdp = driveId;
/* 39 */            kb1.m6061n(metadataBundle);
/* 42 */            this.zzdn = metadataBundle;
/* 44 */            this.zzdf = contents;
/* 50 */            this.zzdo = Integer.valueOf(i);
/* 52 */            this.zzan = str;
/* 54 */            this.zzdr = i2;
/* 56 */            this.zzdq = z;
/* 58 */            this.zzds = i3;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 2, this.zzdp, i, false);
/* 17 */            w11.m9409S(parcel, 3, this.zzdn, i, false);
/* 23 */            w11.m9409S(parcel, 4, this.zzdf, i, false);
/* 29 */            w11.m9407Q(parcel, 5, this.zzdo);
/* 32 */            boolean z = this.zzdq;
/* 35 */            w11.m9420b0(parcel, 6, 4);
/* 38 */            parcel.writeInt(z ? 1 : 0);
/* 44 */            w11.m9410T(parcel, 7, this.zzan, false);
/* 47 */            int i2 = this.zzdr;
/* 51 */            w11.m9420b0(parcel, 8, 4);
/* 54 */            parcel.writeInt(i2);
/* 57 */            int i3 = this.zzds;
/* 61 */            w11.m9420b0(parcel, 9, 4);
/* 64 */            parcel.writeInt(i3);
/* 67 */            w11.m9428f0(iM9422c0, parcel);
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 60 */        public zzw(DriveId driveId, MetadataBundle metadataBundle, int i, int i2, kf0 kf0Var) {
/* 62 */            this(driveId, metadataBundle, null, i2, false, null, 0, i);
/* 61 */            kf0Var.getClass();
                }
            }
