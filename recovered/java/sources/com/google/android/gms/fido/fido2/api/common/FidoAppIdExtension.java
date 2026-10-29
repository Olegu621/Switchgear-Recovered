            package com.google.android.gms.fido.fido2.api.common;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.Arrays;
            import p000.dr3;
            import p000.kb1;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class FidoAppIdExtension extends AbstractSafeParcelable {
                public static final Parcelable.Creator<FidoAppIdExtension> CREATOR = new dr3(14);

                /* JADX INFO: renamed from: a */
                public final String f3783a;

                public FidoAppIdExtension(String str) {
/* 4 */             kb1.m6061n(str);
/* 7 */             this.f3783a = str;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof FidoAppIdExtension) {
/* 13 */                return this.f3783a.equals(((FidoAppIdExtension) obj).f3783a);
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 7 */             return Arrays.hashCode(new Object[]{this.f3783a});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9410T(parcel, 2, this.f3783a, false);
/* 14 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
