            package com.google.android.gms.fido.fido2.api.common;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.HashSet;
            import java.util.List;
            import p000.cl3;
            import p000.kb1;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzp extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzp> CREATOR = new cl3(26);

                /* JADX INFO: renamed from: a */
                public final List f3853a;

                public zzp(ArrayList arrayList) {
/* 4 */             kb1.m6061n(arrayList);
/* 7 */             this.f3853a = arrayList;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof zzp)) {
/* 3 */                 return false;
                    }
/* 9 */             List list = ((zzp) obj).f3853a;
/* 11 */            List list2 = this.f3853a;
                    return list2.containsAll(list) && list.containsAll(list2);
                }

                public final int hashCode() {
/* 12 */            return Arrays.hashCode(new Object[]{new HashSet(this.f3853a)});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9414X(parcel, 1, this.f3853a, false);
/* 14 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
