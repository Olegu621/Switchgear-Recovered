            package com.google.android.gms.fido.u2f.api.common;

            import android.os.Parcel;
            import android.os.Parcelable;
            import android.util.Base64;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.List;
            import p000.C1951n4;
            import p000.fm0;
            import p000.hz1;
            import p000.tf3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Deprecated
            public class KeyHandle extends AbstractSafeParcelable {
                public static final Parcelable.Creator<KeyHandle> CREATOR = new tf3(6);

                /* JADX INFO: renamed from: a */
                public final int f3875a;

                /* JADX INFO: renamed from: b */
                public final byte[] f3876b;

                /* JADX INFO: renamed from: c */
                public final ProtocolVersion f3877c;

                /* JADX INFO: renamed from: d */
                public final List f3878d;

                public KeyHandle(int i, byte[] bArr, String str, ArrayList arrayList) {
/* 4 */             this.f3875a = i;
/* 6 */             this.f3876b = bArr;
                    try {
/* 12 */                this.f3877c = ProtocolVersion.m2061a(str);
/* 14 */                this.f3878d = arrayList;
                    } catch (hz1 e) {
/* 18 */                C1951n4.m6863n(e);
/* 22 */                throw null;
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof KeyHandle)) {
/* 7 */                 return false;
                    }
/* 11 */            KeyHandle keyHandle = (KeyHandle) obj;
/* 13 */            List list = keyHandle.f3878d;
/* 23 */            if (!Arrays.equals(this.f3876b, keyHandle.f3876b) || !this.f3877c.equals(keyHandle.f3877c)) {
/* 7 */                 return false;
                    }
/* 37 */            List list2 = this.f3878d;
/* 39 */            if (list2 == null && list == null) {
/* 1 */                 return true;
                    }
                    return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
                }

                public final int hashCode() {
/* 19 */            return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f3876b)), this.f3877c, this.f3878d});
                }

                public final String toString() {
/* 1 */             List list = this.f3878d;
/* 8 */             String string = list == null ? "null" : list.toString();
/* 12 */            byte[] bArr = this.f3876b;
/* 19 */            String strEncodeToString = bArr == null ? null : Base64.encodeToString(bArr, 0);
/* 27 */            StringBuilder sb = new StringBuilder("{keyHandle: ");
/* 30 */            sb.append(strEncodeToString);
/* 35 */            sb.append(", version: ");
/* 40 */            sb.append(this.f3877c);
/* 45 */            sb.append(", transports: ");
/* 50 */            return fm0.m3789o(sb, string, "}");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f3875a);
/* 21 */            w11.m9403M(parcel, 2, this.f3876b, false);
/* 29 */            w11.m9410T(parcel, 3, this.f3877c.f3881a, false);
/* 34 */            w11.m9414X(parcel, 4, this.f3878d, false);
/* 37 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
