            package com.google.android.gms.drive.metadata;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.regex.Pattern;
            import p000.kb1;
            import p000.re3;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class CustomPropertyKey extends AbstractSafeParcelable {
                public static final Parcelable.Creator<CustomPropertyKey> CREATOR = new re3(19);

                /* JADX INFO: renamed from: c */
                public static final Pattern f3677c = Pattern.compile("[\\w.!@$%^&*()/-]+");

                /* JADX INFO: renamed from: a */
                public final String f3678a;

                /* JADX INFO: renamed from: b */
                public final int f3679b;

                public CustomPropertyKey(String str, int i) {
/* 6 */             kb1.m6062o(str, "key");
/* 21 */            kb1.m6053f("key name characters must be alphanumeric or one of .!@$%^&*()-_/", f3677c.matcher(str).matches());
/* 24 */            boolean z = true;
/* 25 */            if (i != 0 && i != 1) {
/* 30 */                z = false;
                    }
/* 33 */            kb1.m6053f("visibility must be either PUBLIC or PRIVATE", z);
/* 36 */            this.f3678a = str;
/* 38 */            this.f3679b = i;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && obj.getClass() == getClass()) {
/* 19 */                CustomPropertyKey customPropertyKey = (CustomPropertyKey) obj;
/* 29 */                if (customPropertyKey.f3678a.equals(this.f3678a) && customPropertyKey.f3679b == this.f3679b) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 1 */             String str = this.f3678a;
/* 15 */            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11);
/* 18 */            sb.append(str);
/* 23 */            sb.append(this.f3679b);
/* 30 */            return sb.toString().hashCode();
                }

                public final String toString() {
/* 1 */             String str = this.f3678a;
/* 15 */            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 31);
/* 20 */            sb.append("CustomPropertyKey(");
/* 23 */            sb.append(str);
/* 28 */            sb.append(",");
/* 33 */            sb.append(this.f3679b);
/* 38 */            sb.append(")");
/* 41 */            return sb.toString();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9410T(parcel, 2, this.f3678a, false);
/* 16 */            w11.m9420b0(parcel, 3, 4);
/* 21 */            parcel.writeInt(this.f3679b);
/* 24 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
