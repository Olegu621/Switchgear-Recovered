            package com.google.android.gms.drive.query.internal;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.dr3;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzx extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzx> CREATOR = new dr3(23);

                /* JADX INFO: renamed from: b */
                public static final zzx f3725b = new zzx("and");

                /* JADX INFO: renamed from: a */
                public final String f3726a;

                public zzx(String str) {
/* 4 */             this.f3726a = str;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj == null || zzx.class != obj.getClass()) {
/* 5 */                 return false;
                    }
/* 19 */            String str = ((zzx) obj).f3726a;
/* 21 */            String str2 = this.f3726a;
/* 23 */            if (str2 == null) {
/* 25 */                if (str != null) {
/* 5 */                     return false;
                        }
                    } else if (!str2.equals(str)) {
/* 5 */                 return false;
                    }
/* 1 */             return true;
                }

                public final int hashCode() {
/* 1 */             String str = this.f3726a;
/* 11 */            return (str == null ? 0 : str.hashCode()) + 31;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9410T(parcel, 1, this.f3726a, false);
/* 14 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
