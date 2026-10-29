            package com.google.android.gms.location;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.List;
            import p000.de3;
            import p000.kb1;
            import p000.re3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class SleepSegmentRequest extends AbstractSafeParcelable {
                public static final Parcelable.Creator<SleepSegmentRequest> CREATOR = new re3(10);

                /* JADX INFO: renamed from: a */
                public final List f4160a;

                /* JADX INFO: renamed from: b */
                public final int f4161b;

                public SleepSegmentRequest(int i, ArrayList arrayList) {
/* 4 */             this.f4160a = arrayList;
/* 6 */             this.f4161b = i;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof SleepSegmentRequest)) {
/* 7 */                 return false;
                    }
/* 11 */            SleepSegmentRequest sleepSegmentRequest = (SleepSegmentRequest) obj;
                    return de3.m3029k(this.f4160a, sleepSegmentRequest.f4160a) && this.f4161b == sleepSegmentRequest.f4161b;
                }

                public final int hashCode() {
/* 13 */            return Arrays.hashCode(new Object[]{this.f4160a, Integer.valueOf(this.f4161b)});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             kb1.m6061n(parcel);
/* 6 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 14 */            w11.m9414X(parcel, 1, this.f4160a, false);
/* 19 */            w11.m9420b0(parcel, 2, 4);
/* 24 */            parcel.writeInt(this.f4161b);
/* 27 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
