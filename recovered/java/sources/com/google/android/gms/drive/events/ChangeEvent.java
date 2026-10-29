            package com.google.android.gms.drive.events;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import com.google.android.gms.drive.DriveId;
            import java.util.Locale;
            import p000.ub3;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ChangeEvent extends AbstractSafeParcelable implements ResourceEvent {
                public static final Parcelable.Creator<ChangeEvent> CREATOR = new ub3(29);

                /* JADX INFO: renamed from: a */
                public final DriveId f3651a;

                /* JADX INFO: renamed from: b */
                public final int f3652b;

                public ChangeEvent(DriveId driveId, int i) {
/* 4 */             this.f3651a = driveId;
/* 6 */             this.f3652b = i;
                }

                @Override // com.google.android.gms.drive.events.DriveEvent
                public final int getType() {
/* 1 */             return 1;
                }

                public final String toString() {
/* 17 */            return String.format(Locale.US, "ChangeEvent [id=%s,changeFlags=%x]", this.f3651a, Integer.valueOf(this.f3652b));
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 2, this.f3651a, i, false);
/* 16 */            w11.m9420b0(parcel, 3, 4);
/* 21 */            parcel.writeInt(this.f3652b);
/* 24 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
