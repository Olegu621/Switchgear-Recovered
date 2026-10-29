            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import com.google.android.gms.drive.DriveId;
            import java.util.Arrays;
            import p000.de3;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzh extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzh> CREATOR = new zzi();
                final int status;
                final int zzct;
                final long zzcw;
                final long zzcx;
                final DriveId zzk;

                public zzh(int i, DriveId driveId, int i2, long j, long j2) {
/* 4 */             this.zzct = i;
/* 6 */             this.zzk = driveId;
/* 8 */             this.status = i2;
/* 10 */            this.zzcw = j;
/* 12 */            this.zzcx = j2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj != null && obj.getClass() == zzh.class) {
/* 14 */                if (obj == this) {
/* 13 */                    return true;
                        }
/* 17 */                zzh zzhVar = (zzh) obj;
/* 23 */                if (this.zzct == zzhVar.zzct && de3.m3029k(this.zzk, zzhVar.zzk) && this.status == zzhVar.status && this.zzcw == zzhVar.zzcw && this.zzcx == zzhVar.zzcx) {
/* 13 */                    return true;
                        }
                    }
/* 1 */             return false;
                }

                public final int hashCode() {
/* 31 */            return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzct), this.zzk, Integer.valueOf(this.status), Long.valueOf(this.zzcw), Long.valueOf(this.zzcx)});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 7 */             int i2 = this.zzct;
/* 11 */            w11.m9420b0(parcel, 2, 4);
/* 14 */            parcel.writeInt(i2);
/* 21 */            w11.m9409S(parcel, 3, this.zzk, i, false);
/* 24 */            int i3 = this.status;
/* 26 */            w11.m9420b0(parcel, 4, 4);
/* 29 */            parcel.writeInt(i3);
/* 32 */            long j = this.zzcw;
/* 37 */            w11.m9420b0(parcel, 5, 8);
/* 40 */            parcel.writeLong(j);
/* 43 */            long j2 = this.zzcx;
/* 46 */            w11.m9420b0(parcel, 6, 8);
/* 49 */            parcel.writeLong(j2);
/* 52 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
