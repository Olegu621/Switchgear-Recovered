            package com.google.android.gms.internal.drive;

            import android.os.IBinder;
            import android.os.IInterface;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzev extends zzb implements zzeu {
                public static zzeu zza(IBinder iBinder) {
/* 1 */             if (iBinder == null) {
/* 3 */                 return null;
                    }
/* 7 */             IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.internal.IEventReleaseCallback");
                    return iInterfaceQueryLocalInterface instanceof zzeu ? (zzeu) iInterfaceQueryLocalInterface : new zzew(iBinder);
                }
            }
