            package androidx.core.app.unusedapprestrictions;

            import android.os.Binder;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface IUnusedAppRestrictionsBackportCallback extends IInterface {

                /* JADX INFO: renamed from: g */
                public static final String f1243g = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportCallback".replace('$', '.');

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class Default implements IUnusedAppRestrictionsBackportCallback {
                    @Override // android.os.IInterface
                    public final IBinder asBinder() {
/* 1 */                 return null;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static abstract class Stub extends Binder implements IUnusedAppRestrictionsBackportCallback {
                    @Override // android.os.IInterface
                    public final IBinder asBinder() {
/* 1 */                 return this;
                    }

                    @Override // android.os.Binder
                    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
/* 1 */                 String str = IUnusedAppRestrictionsBackportCallback.f1243g;
/* 4 */                 if (i >= 1 && i <= 16777215) {
/* 11 */                    parcel.enforceInterface(str);
                        }
/* 17 */                if (i == 1598968902) {
/* 19 */                    parcel2.writeString(str);
/* 3 */                     return true;
                        }
/* 23 */                if (i != 1) {
/* 25 */                    return super.onTransact(i, parcel, parcel2, i2);
                        }
/* 30 */                parcel.readInt();
/* 33 */                parcel.readInt();
/* 36 */                m583o();
/* 3 */                 return true;
                    }
                }

                /* JADX INFO: renamed from: o */
                void m583o();
            }
