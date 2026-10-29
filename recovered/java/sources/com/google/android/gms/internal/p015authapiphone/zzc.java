            package com.google.android.gms.internal.p015authapiphone;

            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.Parcelable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzc {
                private static final ClassLoader zza = zzc.class.getClassLoader();

                private zzc() {
                }

                public static <T extends Parcelable> T zza(Parcel parcel, Parcelable.Creator<T> creator) {
/* 5 */             if (parcel.readInt() == 0) {
/* 7 */                 return null;
                    }
/* 9 */             return creator.createFromParcel(parcel);
                }

                public static void zzb(Parcel parcel, IInterface iInterface) {
/* 1 */             if (iInterface == null) {
/* 4 */                 parcel.writeStrongBinder(null);
                    } else {
/* 12 */                parcel.writeStrongBinder(iInterface.asBinder());
                    }
                }

                public static boolean zzc(Parcel parcel) {
                    return parcel.readInt() != 0;
                }
            }
