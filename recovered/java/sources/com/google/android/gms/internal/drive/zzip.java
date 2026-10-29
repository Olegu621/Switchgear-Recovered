            package com.google.android.gms.internal.drive;

            import android.os.IBinder;
            import android.os.IInterface;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzip extends zzb implements zzio {
                public static zzio zzb(IBinder iBinder) {
/* 1 */             if (iBinder == null) {
/* 3 */                 return null;
                    }
/* 7 */             IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                    return iInterfaceQueryLocalInterface instanceof zzio ? (zzio) iInterfaceQueryLocalInterface : new zziq(iBinder);
                }
            }
