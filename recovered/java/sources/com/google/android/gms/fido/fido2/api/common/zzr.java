            package com.google.android.gms.fido.fido2.api.common;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.Arrays;
            import p000.dr3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzr extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzr> CREATOR = new dr3(5);

                /* JADX INFO: renamed from: a */
                public final boolean f3854a;

                public zzr(boolean z) {
/* 12 */            this.f3854a = Boolean.valueOf(z).booleanValue();
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof zzr) && this.f3854a == ((zzr) obj).f3854a;
                }

                public final int hashCode() {
/* 11 */            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f3854a)});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f3854a ? 1 : 0);
/* 17 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
