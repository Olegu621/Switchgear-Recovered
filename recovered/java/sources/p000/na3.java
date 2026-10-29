            package p000;

            import android.os.BadParcelableException;
            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class na3 {

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ int f14174a = 0;

                static {
/* 3 */             na3.class.getClassLoader();
                }

                /* JADX INFO: renamed from: a */
                public static Parcelable m6955a(Parcel parcel) {
/* 1 */             Parcelable.Creator creator = Bundle.CREATOR;
/* 7 */             if (parcel.readInt() == 0) {
/* 9 */                 return null;
                    }
/* 15 */            return (Parcelable) creator.createFromParcel(parcel);
                }

                /* JADX INFO: renamed from: b */
                public static void m6956b(Parcel parcel) {
/* 1 */             int iDataAvail = parcel.dataAvail();
/* 5 */             if (iDataAvail > 0) {
/* 19 */                throw new BadParcelableException(fm0.m3781g(iDataAvail, "Parcel data not fully consumed, unread size: "));
                    }
                }
            }
