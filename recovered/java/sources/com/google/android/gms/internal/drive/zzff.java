            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.data.DataHolder;
            import com.google.android.gms.drive.DriveId;
            import java.util.List;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzff extends com.google.android.gms.drive.zzu {
                public static final Parcelable.Creator<zzff> CREATOR = new zzfg();
                private final DataHolder zzhr;
                private final List<DriveId> zzhs;
                private final com.google.android.gms.drive.zza zzht;
                private final boolean zzhu;

                public zzff(DataHolder dataHolder, List<DriveId> list, com.google.android.gms.drive.zza zzaVar, boolean z) {
/* 4 */             this.zzhr = dataHolder;
/* 6 */             this.zzhs = list;
/* 8 */             this.zzht = zzaVar;
/* 10 */            this.zzhu = z;
                }

                @Override // com.google.android.gms.drive.zzu
                public final void zza(Parcel parcel, int i) {
/* 1 */             int i2 = i | 1;
/* 5 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 13 */            w11.m9409S(parcel, 2, this.zzhr, i2, false);
/* 19 */            w11.m9414X(parcel, 3, this.zzhs, false);
/* 25 */            w11.m9409S(parcel, 4, this.zzht, i2, false);
/* 28 */            boolean z = this.zzhu;
/* 31 */            w11.m9420b0(parcel, 5, 4);
/* 34 */            parcel.writeInt(z ? 1 : 0);
/* 37 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
