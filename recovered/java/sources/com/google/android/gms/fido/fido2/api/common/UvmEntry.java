            package com.google.android.gms.fido.fido2.api.common;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.Arrays;
            import p000.md3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class UvmEntry extends AbstractSafeParcelable {
                public static final Parcelable.Creator<UvmEntry> CREATOR = new md3(11);

                /* JADX INFO: renamed from: a */
                public int f3840a;

                /* JADX INFO: renamed from: b */
                public short f3841b;

                /* JADX INFO: renamed from: c */
                public short f3842c;

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof UvmEntry)) {
/* 3 */                 return false;
                    }
/* 7 */             UvmEntry uvmEntry = (UvmEntry) obj;
                    return this.f3840a == uvmEntry.f3840a && this.f3841b == uvmEntry.f3841b && this.f3842c == uvmEntry.f3842c;
                }

                public final int hashCode() {
/* 23 */            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3840a), Short.valueOf(this.f3841b), Short.valueOf(this.f3842c)});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 7 */             int i2 = this.f3840a;
/* 11 */            w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(i2);
/* 17 */            short s = this.f3841b;
/* 20 */            w11.m9420b0(parcel, 2, 4);
/* 23 */            parcel.writeInt(s);
/* 26 */            short s2 = this.f3842c;
/* 29 */            w11.m9420b0(parcel, 3, 4);
/* 32 */            parcel.writeInt(s2);
/* 35 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
