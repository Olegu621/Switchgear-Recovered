            package com.google.android.gms.drive.events;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import com.google.android.gms.internal.drive.zzh;
            import java.util.Arrays;
            import p000.de3;
            import p000.dr3;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzr extends AbstractSafeParcelable implements DriveEvent {
                public static final Parcelable.Creator<zzr> CREATOR = new dr3(3);

                /* JADX INFO: renamed from: a */
                public final zzh f3673a;

                public zzr(zzh zzhVar) {
/* 4 */             this.f3673a = zzhVar;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == null || obj.getClass() != zzr.class) {
/* 27 */                return false;
                    }
/* 12 */            if (obj == this) {
/* 14 */                return true;
                    }
/* 22 */            return de3.m3029k(this.f3673a, ((zzr) obj).f3673a);
                }

                @Override // com.google.android.gms.drive.events.DriveEvent
                public final int getType() {
/* 1 */             return 8;
                }

                public final int hashCode() {
/* 7 */             return Arrays.hashCode(new Object[]{this.f3673a});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 2, this.f3673a, i, false);
/* 14 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
