            package com.google.android.gms.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import android.text.TextUtils;
            import com.google.android.gms.common.internal.ReflectedParcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.Collections;
            import java.util.regex.Pattern;
            import p000.C1827kd;
            import p000.cl3;
            import p000.kb1;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class DriveSpace extends AbstractSafeParcelable implements ReflectedParcelable {
                public static final Parcelable.Creator<DriveSpace> CREATOR = new cl3(10);

                /* JADX INFO: renamed from: b */
                public static final DriveSpace f3642b;

                /* JADX INFO: renamed from: c */
                public static final DriveSpace f3643c;

                /* JADX INFO: renamed from: d */
                public static final DriveSpace f3644d;

                /* JADX INFO: renamed from: a */
                public final String f3645a;

                static {
/* 14 */            DriveSpace driveSpace = new DriveSpace("DRIVE");
/* 17 */            f3642b = driveSpace;
/* 23 */            DriveSpace driveSpace2 = new DriveSpace("APP_DATA_FOLDER");
/* 26 */            f3643c = driveSpace2;
/* 32 */            DriveSpace driveSpace3 = new DriveSpace("PHOTOS");
/* 35 */            f3644d = driveSpace3;
/* 40 */            C1827kd c1827kd = new C1827kd(3);
/* 43 */            c1827kd.add(driveSpace);
/* 46 */            c1827kd.add(driveSpace2);
/* 49 */            c1827kd.add(driveSpace3);
/* 62 */            TextUtils.join(",", Collections.unmodifiableSet(c1827kd).toArray());
/* 67 */            Pattern.compile("[A-Z0-9_]*");
                }

                public DriveSpace(String str) {
/* 4 */             kb1.m6061n(str);
/* 7 */             this.f3645a = str;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == null || obj.getClass() != DriveSpace.class) {
/* 23 */                return false;
                    }
/* 18 */            return this.f3645a.equals(((DriveSpace) obj).f3645a);
                }

                public final int hashCode() {
/* 10 */            return this.f3645a.hashCode() ^ 1247068382;
                }

                public final String toString() {
/* 1 */             return this.f3645a;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9410T(parcel, 2, this.f3645a, false);
/* 14 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
