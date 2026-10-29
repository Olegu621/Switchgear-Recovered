            package com.google.android.gms.cloudmessaging;

            import android.os.IBinder;
            import android.os.Messenger;
            import android.os.Parcel;
            import android.os.Parcelable;
            import p000.md3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzd implements Parcelable {
                public static final Parcelable.Creator<zzd> CREATOR = new md3(24);

                /* JADX INFO: renamed from: a */
                public final Messenger f3413a;

                public zzd(IBinder iBinder) {
/* 9 */             this.f3413a = new Messenger(iBinder);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == null) {
/* 29 */                return false;
                    }
                    try {
/* 4 */                 Messenger messenger = this.f3413a;
/* 6 */                 messenger.getClass();
/* 9 */                 IBinder binder = messenger.getBinder();
/* 15 */                Messenger messenger2 = ((zzd) obj).f3413a;
/* 17 */                messenger2.getClass();
/* 24 */                return binder.equals(messenger2.getBinder());
                    } catch (ClassCastException unused) {
/* 29 */                return false;
                    }
                }

                public final int hashCode() {
/* 1 */             Messenger messenger = this.f3413a;
/* 3 */             messenger.getClass();
/* 10 */            return messenger.getBinder().hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             Messenger messenger = this.f3413a;
/* 3 */             messenger.getClass();
/* 10 */            parcel.writeStrongBinder(messenger.getBinder());
                }
            }
