            package com.google.android.gms.location;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.Arrays;
            import p000.cl3;
            import p000.kb1;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ActivityTransition extends AbstractSafeParcelable {
                public static final Parcelable.Creator<ActivityTransition> CREATOR = new cl3(6);

                /* JADX INFO: renamed from: a */
                public final int f4100a;

                /* JADX INFO: renamed from: b */
                public final int f4101b;

                public ActivityTransition(int i, int i2) {
/* 4 */             this.f4100a = i;
/* 6 */             this.f4101b = i2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof ActivityTransition)) {
/* 7 */                 return false;
                    }
/* 11 */            ActivityTransition activityTransition = (ActivityTransition) obj;
                    return this.f4100a == activityTransition.f4100a && this.f4101b == activityTransition.f4101b;
                }

                public final int hashCode() {
/* 17 */            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4100a), Integer.valueOf(this.f4101b)});
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder(75);
/* 10 */            sb.append("ActivityTransition [mActivityType=");
/* 15 */            sb.append(this.f4100a);
/* 20 */            sb.append(", mTransitionType=");
/* 25 */            sb.append(this.f4101b);
/* 30 */            sb.append(']');
/* 33 */            return sb.toString();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             kb1.m6061n(parcel);
/* 6 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 12 */            w11.m9420b0(parcel, 1, 4);
/* 17 */            parcel.writeInt(this.f4100a);
/* 21 */            w11.m9420b0(parcel, 2, 4);
/* 26 */            parcel.writeInt(this.f4101b);
/* 29 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
