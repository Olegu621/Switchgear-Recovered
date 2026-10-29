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
            public class ActivityTransitionEvent extends AbstractSafeParcelable {
                public static final Parcelable.Creator<ActivityTransitionEvent> CREATOR = new cl3(7);

                /* JADX INFO: renamed from: a */
                public final int f4102a;

                /* JADX INFO: renamed from: b */
                public final int f4103b;

                /* JADX INFO: renamed from: c */
                public final long f4104c;

                public ActivityTransitionEvent(long j, int i, int i2) {
/* 4 */             boolean z = false;
/* 5 */             if (i2 >= 0 && i2 <= 1) {
/* 10 */                z = true;
                    }
/* 15 */            StringBuilder sb = new StringBuilder(41);
/* 20 */            sb.append("Transition type ");
/* 23 */            sb.append(i2);
/* 28 */            sb.append(" is not valid.");
/* 35 */            kb1.m6053f(sb.toString(), z);
/* 38 */            this.f4102a = i;
/* 40 */            this.f4103b = i2;
/* 42 */            this.f4104c = j;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof ActivityTransitionEvent)) {
/* 7 */                 return false;
                    }
/* 11 */            ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) obj;
                    return this.f4102a == activityTransitionEvent.f4102a && this.f4103b == activityTransitionEvent.f4103b && this.f4104c == activityTransitionEvent.f4104c;
                }

                public final int hashCode() {
/* 23 */            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4102a), Integer.valueOf(this.f4103b), Long.valueOf(this.f4104c)});
                }

                public final String toString() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 10 */            StringBuilder sb2 = new StringBuilder(24);
/* 15 */            sb2.append("ActivityType ");
/* 20 */            sb2.append(this.f4102a);
/* 27 */            sb.append(sb2.toString());
/* 32 */            sb.append(" ");
/* 39 */            StringBuilder sb3 = new StringBuilder(26);
/* 44 */            sb3.append("TransitionType ");
/* 49 */            sb3.append(this.f4103b);
/* 56 */            sb.append(sb3.toString());
/* 59 */            sb.append(" ");
/* 66 */            StringBuilder sb4 = new StringBuilder(41);
/* 71 */            sb4.append("ElapsedRealTimeNanos ");
/* 76 */            sb4.append(this.f4104c);
/* 83 */            sb.append(sb4.toString());
/* 86 */            return sb.toString();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             kb1.m6061n(parcel);
/* 6 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 12 */            w11.m9420b0(parcel, 1, 4);
/* 17 */            parcel.writeInt(this.f4102a);
/* 21 */            w11.m9420b0(parcel, 2, 4);
/* 26 */            parcel.writeInt(this.f4103b);
/* 32 */            w11.m9420b0(parcel, 3, 8);
/* 37 */            parcel.writeLong(this.f4104c);
/* 40 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
