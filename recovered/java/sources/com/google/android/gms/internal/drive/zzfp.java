            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import com.google.android.gms.drive.events.ChangeEvent;
            import com.google.android.gms.drive.events.CompletionEvent;
            import com.google.android.gms.drive.events.DriveEvent;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzfp extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzfp> CREATOR = new zzfq();
                private final int zzda;
                private final ChangeEvent zzib;
                private final CompletionEvent zzic;
                private final com.google.android.gms.drive.events.zzo zzid;
                private final com.google.android.gms.drive.events.zzb zzie;
                private final com.google.android.gms.drive.events.zzv zzif;
                private final com.google.android.gms.drive.events.zzr zzig;

                public zzfp(int i, ChangeEvent changeEvent, CompletionEvent completionEvent, com.google.android.gms.drive.events.zzo zzoVar, com.google.android.gms.drive.events.zzb zzbVar, com.google.android.gms.drive.events.zzv zzvVar, com.google.android.gms.drive.events.zzr zzrVar) {
/* 4 */             this.zzda = i;
/* 6 */             this.zzib = changeEvent;
/* 8 */             this.zzic = completionEvent;
/* 10 */            this.zzid = zzoVar;
/* 12 */            this.zzie = zzbVar;
/* 14 */            this.zzif = zzvVar;
/* 16 */            this.zzig = zzrVar;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 7 */             int i2 = this.zzda;
/* 11 */            w11.m9420b0(parcel, 2, 4);
/* 14 */            parcel.writeInt(i2);
/* 21 */            w11.m9409S(parcel, 3, this.zzib, i, false);
/* 27 */            w11.m9409S(parcel, 5, this.zzic, i, false);
/* 33 */            w11.m9409S(parcel, 6, this.zzid, i, false);
/* 39 */            w11.m9409S(parcel, 7, this.zzie, i, false);
/* 46 */            w11.m9409S(parcel, 9, this.zzif, i, false);
/* 53 */            w11.m9409S(parcel, 10, this.zzig, i, false);
/* 56 */            w11.m9428f0(iM9422c0, parcel);
                }

                public final DriveEvent zzat() {
/* 1 */             int i = this.zzda;
/* 4 */             if (i == 1) {
/* 62 */                return this.zzib;
                    }
/* 7 */             if (i == 2) {
/* 59 */                return this.zzic;
                    }
/* 10 */            if (i == 3) {
/* 56 */                return this.zzid;
                    }
/* 13 */            if (i == 4) {
/* 53 */                return this.zzie;
                    }
/* 16 */            if (i == 7) {
/* 50 */                return this.zzif;
                    }
/* 20 */            if (i == 8) {
/* 22 */                return this.zzig;
                    }
/* 31 */            StringBuilder sb = new StringBuilder(33);
/* 36 */            sb.append("Unexpected event type ");
/* 39 */            sb.append(i);
/* 49 */            throw new IllegalStateException(sb.toString());
                }
            }
