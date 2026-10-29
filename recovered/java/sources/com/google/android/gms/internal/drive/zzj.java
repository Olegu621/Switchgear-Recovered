            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import com.google.android.gms.drive.DriveId;
            import p000.kb1;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 13 */    public final class zzj extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzj> CREATOR = new zzk();
                private final com.google.android.gms.drive.events.zze zzbv;
                final int zzda;
                private final com.google.android.gms.drive.events.zzx zzdb;
                private final com.google.android.gms.drive.events.zzt zzdc;
                final DriveId zzk;

                public zzj(DriveId driveId, int i, com.google.android.gms.drive.events.zze zzeVar, com.google.android.gms.drive.events.zzx zzxVar, com.google.android.gms.drive.events.zzt zztVar) {
/* 4 */             this.zzk = driveId;
/* 6 */             this.zzda = i;
/* 8 */             this.zzbv = zzeVar;
/* 10 */            this.zzdb = zzxVar;
/* 12 */            this.zzdc = zztVar;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 2, this.zzk, i, false);
/* 14 */            int i2 = this.zzda;
/* 18 */            w11.m9420b0(parcel, 3, 4);
/* 21 */            parcel.writeInt(i2);
/* 26 */            w11.m9409S(parcel, 4, this.zzbv, i, false);
/* 32 */            w11.m9409S(parcel, 5, this.zzdb, i, false);
/* 38 */            w11.m9409S(parcel, 6, this.zzdc, i, false);
/* 41 */            w11.m9428f0(iM9422c0, parcel);
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 14 */        public zzj(int i, DriveId driveId) {
/* 16 */            this(driveId, 1, null, null, null);
/* 15 */            kb1.m6061n(driveId);
                }
            }
