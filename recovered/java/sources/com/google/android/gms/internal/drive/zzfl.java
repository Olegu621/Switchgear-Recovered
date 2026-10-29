            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.Collections;
            import java.util.List;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzfl extends AbstractSafeParcelable {
                private final int status;
                final long zzhy;
                final long zzhz;
                private final List<com.google.android.gms.drive.zzh> zzia;
                private static final List<com.google.android.gms.drive.zzh> zzhx = Collections.EMPTY_LIST;
                public static final Parcelable.Creator<zzfl> CREATOR = new zzfm();

                public zzfl(long j, long j2, int i, List<com.google.android.gms.drive.zzh> list) {
/* 4 */             this.zzhy = j;
/* 6 */             this.zzhz = j2;
/* 8 */             this.status = i;
/* 10 */            this.zzia = list;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 7 */             long j = this.zzhy;
/* 12 */            w11.m9420b0(parcel, 2, 8);
/* 15 */            parcel.writeLong(j);
/* 18 */            long j2 = this.zzhz;
/* 21 */            w11.m9420b0(parcel, 3, 8);
/* 24 */            parcel.writeLong(j2);
/* 27 */            int i2 = this.status;
/* 30 */            w11.m9420b0(parcel, 4, 4);
/* 33 */            parcel.writeInt(i2);
/* 40 */            w11.m9414X(parcel, 5, this.zzia, false);
/* 43 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
