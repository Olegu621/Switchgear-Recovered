            package com.google.android.gms.common.api;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.Arrays;
            import p000.re3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ComplianceOptions extends AbstractSafeParcelable {
                public static final Parcelable.Creator<ComplianceOptions> CREATOR = new re3(16);

                /* JADX INFO: renamed from: a */
                public final int f3432a;

                /* JADX INFO: renamed from: b */
                public final int f3433b;

                /* JADX INFO: renamed from: c */
                public final int f3434c;

                /* JADX INFO: renamed from: d */
                public final boolean f3435d;

                public ComplianceOptions(int i, int i2, int i3, boolean z) {
/* 4 */             this.f3432a = i;
/* 6 */             this.f3433b = i2;
/* 8 */             this.f3434c = i3;
/* 10 */            this.f3435d = z;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof ComplianceOptions)) {
/* 3 */                 return false;
                    }
/* 7 */             ComplianceOptions complianceOptions = (ComplianceOptions) obj;
                    return this.f3432a == complianceOptions.f3432a && this.f3433b == complianceOptions.f3433b && this.f3434c == complianceOptions.f3434c && this.f3435d == complianceOptions.f3435d;
                }

                public final int hashCode() {
/* 29 */            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3432a), Integer.valueOf(this.f3433b), Integer.valueOf(this.f3434c), Boolean.valueOf(this.f3435d)});
                }

                public final String toString() {
/* 1 */             int i = this.f3432a;
/* 7 */             int length = String.valueOf(i).length();
/* 11 */            int i2 = this.f3433b;
/* 17 */            int length2 = String.valueOf(i2).length();
/* 21 */            int i3 = this.f3434c;
/* 27 */            int length3 = String.valueOf(i3).length();
/* 31 */            boolean z = this.f3435d;
/* 54 */            StringBuilder sb = new StringBuilder(length + 55 + length2 + 19 + length3 + 13 + String.valueOf(z).length() + 1);
/* 59 */            sb.append("ComplianceOptions{callerProductId=");
/* 62 */            sb.append(i);
/* 67 */            sb.append(", dataOwnerProductId=");
/* 70 */            sb.append(i2);
/* 75 */            sb.append(", processingReason=");
/* 78 */            sb.append(i3);
/* 83 */            sb.append(", isUserData=");
/* 86 */            sb.append(z);
/* 91 */            sb.append("}");
/* 94 */            return sb.toString();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f3432a);
/* 18 */            w11.m9420b0(parcel, 2, 4);
/* 23 */            parcel.writeInt(this.f3433b);
/* 27 */            w11.m9420b0(parcel, 3, 4);
/* 32 */            parcel.writeInt(this.f3434c);
/* 35 */            w11.m9420b0(parcel, 4, 4);
/* 40 */            parcel.writeInt(this.f3435d ? 1 : 0);
/* 43 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
