            package com.google.android.gms.recaptchabase;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.Arrays;
            import p000.de3;
            import p000.re3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ExecuteResult extends AbstractSafeParcelable {
                public static final Parcelable.Creator<ExecuteResult> CREATOR = new re3(27);

                /* JADX INFO: renamed from: a */
                public String f4268a;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof ExecuteResult) {
/* 15 */                return de3.m3029k(this.f4268a, ((ExecuteResult) obj).f4268a);
                    }
/* 20 */            return false;
                }

                public final int hashCode() {
/* 7 */             return Arrays.hashCode(new Object[]{this.f4268a});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9410T(parcel, 1, this.f4268a, false);
/* 14 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
