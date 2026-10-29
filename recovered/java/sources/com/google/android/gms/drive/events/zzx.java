            package com.google.android.gms.drive.events;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.List;
            import java.util.Locale;
            import p000.de3;
            import p000.dr3;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzx extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzx> CREATOR = new dr3(22);

                /* JADX INFO: renamed from: a */
                public final List f3676a;

                public zzx(ArrayList arrayList) {
/* 4 */             this.f3676a = arrayList;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == null || obj.getClass() != zzx.class) {
/* 27 */                return false;
                    }
/* 12 */            if (obj == this) {
/* 14 */                return true;
                    }
/* 22 */            return de3.m3029k(this.f3676a, ((zzx) obj).f3676a);
                }

                public final int hashCode() {
/* 7 */             return Arrays.hashCode(new Object[]{this.f3676a});
                }

                public final String toString() {
/* 11 */            return String.format(Locale.US, "TransferStateOptions[Spaces=%s]", this.f3676a);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9414X(parcel, 2, this.f3676a, false);
/* 14 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
