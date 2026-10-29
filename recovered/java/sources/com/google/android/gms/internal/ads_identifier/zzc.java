            package com.google.android.gms.internal.ads_identifier;

            import android.os.Parcel;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzc {
                private static final ClassLoader zza = zzc.class.getClassLoader();

                private zzc() {
                }

                public static void zza(Parcel parcel, boolean z) {
/* 2 */             parcel.writeInt(1);
                }

                public static boolean zzb(Parcel parcel) {
                    return parcel.readInt() != 0;
                }
            }
