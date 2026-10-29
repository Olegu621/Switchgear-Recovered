            package com.google.android.gms.fido.u2f.api.common;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.Arrays;
            import p000.C1951n4;
            import p000.hz1;
            import p000.tf3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Deprecated
            public class RegisterRequest extends AbstractSafeParcelable {
                public static final Parcelable.Creator<RegisterRequest> CREATOR = new tf3(17);

                /* JADX INFO: renamed from: a */
                public final int f3882a;

                /* JADX INFO: renamed from: b */
                public final ProtocolVersion f3883b;

                /* JADX INFO: renamed from: c */
                public final byte[] f3884c;

                /* JADX INFO: renamed from: d */
                public final String f3885d;

                public RegisterRequest(int i, String str, byte[] bArr, String str2) {
/* 4 */             this.f3882a = i;
                    try {
/* 10 */                this.f3883b = ProtocolVersion.m2061a(str);
/* 12 */                this.f3884c = bArr;
/* 14 */                this.f3885d = str2;
                    } catch (hz1 e) {
/* 18 */                C1951n4.m6863n(e);
/* 22 */                throw null;
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof RegisterRequest)) {
/* 7 */                 return false;
                    }
/* 11 */            RegisterRequest registerRequest = (RegisterRequest) obj;
/* 21 */            if (!Arrays.equals(this.f3884c, registerRequest.f3884c) || this.f3883b != registerRequest.f3883b) {
/* 7 */                 return false;
                    }
/* 31 */            String str = registerRequest.f3885d;
/* 33 */            String str2 = this.f3885d;
/* 35 */            if (str2 == null) {
/* 37 */                if (str != null) {
/* 7 */                     return false;
                        }
                    } else if (!str2.equals(str)) {
/* 7 */                 return false;
                    }
/* 1 */             return true;
                }

                public final int hashCode() {
/* 17 */            int iHashCode = ((Arrays.hashCode(this.f3884c) + 31) * 31) + this.f3883b.hashCode();
/* 18 */            String str = this.f3885d;
/* 30 */            return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f3882a);
/* 23 */            w11.m9410T(parcel, 2, this.f3883b.f3881a, false);
/* 29 */            w11.m9403M(parcel, 3, this.f3884c, false);
/* 34 */            w11.m9410T(parcel, 4, this.f3885d, false);
/* 37 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
