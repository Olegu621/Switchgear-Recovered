            package com.google.android.gms.internal.drive;

            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.Parcelable;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 14 */    public class zzc {
                private static final ClassLoader zzd = zzc.class.getClassLoader();

                private zzc() {
                }

                public static void writeBoolean(Parcel parcel, boolean z) {
/* 1 */             parcel.writeInt(z ? 1 : 0);
                }

                public static <T extends Parcelable> T zza(Parcel parcel, Parcelable.Creator<T> creator) {
/* 5 */             if (parcel.readInt() == 0) {
/* 7 */                 return null;
                    }
/* 9 */             return creator.createFromParcel(parcel);
                }

/* 15 */        public static boolean zza(Parcel parcel) {
                    return parcel.readInt() != 0;
                }

/* 16 */        public static void zza(Parcel parcel, Parcelable parcelable) {
                    if (parcelable == null) {
/* 17 */                parcel.writeInt(0);
                    } else {
/* 18 */                parcel.writeInt(1);
/* 19 */                parcelable.writeToParcel(parcel, 0);
                    }
                }

/* 19 */        public static void zza(Parcel parcel, IInterface iInterface) {
                    if (iInterface == null) {
/* 20 */                parcel.writeStrongBinder(null);
                    } else {
/* 21 */                parcel.writeStrongBinder(iInterface.asBinder());
                    }
                }
            }
