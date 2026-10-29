            package com.google.android.gms.fido.fido2.api.common;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.Arrays;
            import p000.dr3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzy extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzy> CREATOR = new dr3(25);

                /* JADX INFO: renamed from: a */
                public final long f3856a;

                public zzy(long j) {
/* 12 */            this.f3856a = Long.valueOf(j).longValue();
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof zzy) && this.f3856a == ((zzy) obj).f3856a;
                }

                public final int hashCode() {
/* 11 */            return Arrays.hashCode(new Object[]{Long.valueOf(this.f3856a)});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 10 */            w11.m9420b0(parcel, 1, 8);
/* 15 */            parcel.writeLong(this.f3856a);
/* 18 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
