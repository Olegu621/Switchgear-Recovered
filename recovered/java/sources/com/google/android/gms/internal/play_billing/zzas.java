            package com.google.android.gms.internal.play_billing;

            import android.os.BadParcelableException;
            import android.os.Parcel;
            import android.os.Parcelable;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzas {
                public static final /* synthetic */ int zza = 0;

                static {
/* 3 */             zzas.class.getClassLoader();
                }

                private zzas() {
                }

                public static Parcelable zza(Parcel parcel, Parcelable.Creator creator) {
/* 5 */             if (parcel.readInt() == 0) {
/* 7 */                 return null;
                    }
/* 13 */            return (Parcelable) creator.createFromParcel(parcel);
                }

                public static void zzb(Parcel parcel) {
/* 1 */             int iDataAvail = parcel.dataAvail();
/* 5 */             if (iDataAvail > 0) {
/* 19 */                throw new BadParcelableException(fm0.m3781g(iDataAvail, "Parcel data not fully consumed, unread size: "));
                    }
                }

                public static void zzc(Parcel parcel, Parcelable parcelable) {
/* 2 */             parcel.writeInt(1);
/* 6 */             parcelable.writeToParcel(parcel, 0);
                }
            }
