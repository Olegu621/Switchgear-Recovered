            package com.google.android.gms.fido.fido2.api.common;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.Arrays;
            import p000.kb1;
            import p000.tc3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzad extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzad> CREATOR = new tc3(21);

                /* JADX INFO: renamed from: a */
                public final String f3844a;

                public zzad(String str) {
/* 4 */             kb1.m6061n(str);
/* 7 */             this.f3844a = str;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof zzad) {
/* 13 */                return this.f3844a.equals(((zzad) obj).f3844a);
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 7 */             return Arrays.hashCode(new Object[]{this.f3844a});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9410T(parcel, 1, this.f3844a, false);
/* 14 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
