            package com.google.android.gms.dynamic;

            import android.os.IBinder;
            import android.os.IInterface;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface IObjectWrapper extends IInterface {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements IObjectWrapper {
                    /* JADX INFO: renamed from: a */
                    public static IObjectWrapper m2044a(IBinder iBinder) {
/* 1 */                 if (iBinder == null) {
/* 3 */                     return null;
                        }
/* 7 */                 IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                        return iInterfaceQueryLocalInterface instanceof IObjectWrapper ? (IObjectWrapper) iInterfaceQueryLocalInterface : new zzb(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
                    }
                }
            }
