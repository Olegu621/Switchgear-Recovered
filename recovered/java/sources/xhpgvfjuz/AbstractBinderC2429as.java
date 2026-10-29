            package xhpgvfjuz;

            import android.os.Binder;
            import android.os.IBinder;
            import android.os.Parcel;
            
            /* JADX INFO: renamed from: xhpgvfjuz.as */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract class AbstractBinderC2429as extends Binder implements InterfaceC2422al {

                /* JADX INFO: renamed from: b */
                private static final String f19152b = InterfaceC2422al.class.getName();

                public AbstractBinderC2429as() {
                    attachInterface(this, f19152b);
                }

                /* JADX INFO: renamed from: a */
                public static native InterfaceC2422al m9905a(IBinder iBinder);

                /* JADX INFO: renamed from: a */
                public boolean m9906a(int i, Parcel parcel, Parcel parcel2, int i2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }

                @Override // android.os.IInterface
                public IBinder asBinder() {
                    return this;
                }

                @Override // android.os.Binder
                public native boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2);
            }
