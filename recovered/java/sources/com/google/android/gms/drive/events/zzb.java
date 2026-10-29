            package com.google.android.gms.drive.events;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.Arrays;
            import java.util.Locale;
            import p000.de3;
            import p000.re3;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzb extends AbstractSafeParcelable implements DriveEvent {
                public static final Parcelable.Creator<zzb> CREATOR = new re3(18);

                /* JADX INFO: renamed from: a */
                public final zze f3666a;

                public zzb(zze zzeVar) {
/* 4 */             this.f3666a = zzeVar;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == null || obj.getClass() != zzb.class) {
/* 27 */                return false;
                    }
/* 12 */            if (obj == this) {
/* 14 */                return true;
                    }
/* 22 */            return de3.m3029k(this.f3666a, ((zzb) obj).f3666a);
                }

                @Override // com.google.android.gms.drive.events.DriveEvent
                public final int getType() {
/* 1 */             return 4;
                }

                public final int hashCode() {
/* 7 */             return Arrays.hashCode(new Object[]{this.f3666a});
                }

                public final String toString() {
/* 1 */             Locale locale = Locale.US;
/* 20 */            return "ChangesAvailableEvent [changesAvailableOptions=" + this.f3666a + "]";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 3, this.f3666a, i, false);
/* 14 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
